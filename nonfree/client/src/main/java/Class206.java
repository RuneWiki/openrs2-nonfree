import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class206 {

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!vr;")
	private Class33 aClass33_26;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
	private int anInt5765;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	private int anInt5764 = -1;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "[Lclient!ui;")
	private final Class350[] aClass350Array1;

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
	private final int anInt5771;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	private final int anInt5760;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	private final int anInt5759;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
	private final int anInt5766;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "[Lclient!ui;")
	private final Class350[] aClass350Array2;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!ui;")
	private final Class350 aClass350_1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I[Lclient!ui;IIII)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) Class350[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass350Array1 = arg1;
		this.anInt5771 = arg0;
		this.anInt5760 = arg5;
		this.anInt5759 = arg3;
		this.anInt5766 = arg4;
		if (arg1 == null) {
			this.aClass350Array2 = null;
			this.aClass350_1 = null;
		} else {
			this.aClass350Array2 = new Class350[arg1.length];
			this.aClass350_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!ha;I)Z")
	public boolean method5244(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt5764) {
			this.anInt5764 = arg1;
			@Pc(16) int local16 = Static677.method9371(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt5769 != local16) {
				this.aClass33_26 = null;
				this.anInt5769 = local16;
			}
			if (this.aClass350Array1 != null) {
				this.anInt5765 = 0;
				@Pc(52) int[] local52 = new int[this.aClass350Array1.length];
				for (@Pc(54) int local54 = 0; local54 < this.aClass350Array1.length; local54++) {
					@Pc(61) Class350 local61 = this.aClass350Array1[local54];
					if (local61.method8556(this.anInt5759, this.anInt5766, this.anInt5760, this.anInt5764)) {
						local52[this.anInt5765] = local61.anInt9733;
						this.aClass350Array2[this.anInt5765++] = local61;
					}
				}
				Static77.method1433(local52, 0, this.aClass350Array2, this.anInt5765 - 1);
			}
			this.aBoolean418 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean418) {
			this.aBoolean418 = false;
			for (@Pc(135) int local135 = this.anInt5765 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass350Array2[local135].method8563(arg0, this.aClass350_1);
				local124 |= local146;
				this.aBoolean418 |= !local146;
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public void method5247() {
		if (this.aClass350Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass350Array1.length; local14++) {
				this.aClass350Array1[local14].method8565();
			}
		}
		this.aClass33_26 = null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!ha;IIIIIII)V")
	public void method5248(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg4 + arg2 & 0x3FFF;
		if (this.anInt5771 == -1 || this.anInt5769 == 0) {
			arg1.aa(arg3, arg6, arg5, arg7, arg8, 0);
		} else {
			@Pc(41) Class119 local41 = Static189.anInterface4_9.method4673(this.anInt5771);
			if (this.aClass33_26 == null && Static189.anInterface4_9.method4672(this.anInt5771)) {
				@Pc(78) int[] local78 = local41.anInt3894 == 2 ? Static189.anInterface4_9.method4677(this.anInt5769, this.anInt5771, 0.7F, this.anInt5769) : Static189.anInterface4_9.method4676(this.anInt5769, false, this.anInt5769, 0.7F, this.anInt5771);
				this.aClass33_26 = arg1.method8479(this.anInt5769, local78, this.anInt5769, this.anInt5769);
			}
			if (local41.anInt3894 == 2) {
				arg1.aa(arg3, arg6, arg5, arg7, arg8, 0);
			}
			if (this.aClass33_26 != null) {
				@Pc(116) int local116 = local41.anInt3894 == 2 ? 1 : 0;
				@Pc(122) int local122 = arg0 * arg7 / -4096;
				@Pc(135) int local135;
				for (local135 = (arg5 - arg7) / 2 + arg7 * local15 / 4096; local135 > arg7; local135 -= arg7) {
				}
				while (local135 < 0) {
					local135 += arg7;
				}
				while (arg7 < local122) {
					local122 -= arg7;
				}
				while (local122 < 0) {
					local122 += arg7;
				}
				for (@Pc(182) int local182 = local135 - arg7; local182 < arg5; local182 += arg7) {
					for (@Pc(189) int local189 = local122 - arg7; local189 < arg7; local189 += arg7) {
						this.aClass33_26.method7656(local182 + arg3, arg6 + local189, arg7, arg7, 1, 0, local116);
					}
				}
			}
		}
		for (@Pc(229) int local229 = this.anInt5765 - 1; local229 >= 0; local229--) {
			this.aClass350Array2[local229].method8557(arg1, arg3, arg6, arg5, arg7, arg0, local15);
		}
	}
}

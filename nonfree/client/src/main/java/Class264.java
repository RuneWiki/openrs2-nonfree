import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class264 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!pga;")
	private Class32 aClass32_31;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private int anInt8030;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	private int anInt8034;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	private int anInt8027 = -1;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
	private boolean aBoolean547 = true;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private final int anInt8032;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	private final int anInt8036;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "[Lclient!rc;")
	private final Class282[] aClass282Array2;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private final int anInt8033;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	private final int anInt8035;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[Lclient!rc;")
	private final Class282[] aClass282Array1;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Lclient!rc;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I[Lclient!rc;IIII)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) Class282[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8032 = arg3;
		this.anInt8036 = arg0;
		this.aClass282Array2 = arg1;
		this.anInt8033 = arg5;
		this.anInt8035 = arg4;
		if (arg1 == null) {
			this.aClass282Array1 = null;
			this.aClass282_1 = null;
		} else {
			this.aClass282Array1 = new Class282[arg1.length];
			this.aClass282_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!ha;IIIII)V")
	public void method6925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg8 + arg6 & 0x3FFF;
		if (this.anInt8036 == -1 || this.anInt8034 == 0) {
			arg4.aa(arg5, arg1, arg3, arg7, arg2, 0);
		} else {
			@Pc(37) Class325 local37 = Static199.anInterface4_6.method895(this.anInt8036);
			if (this.aClass32_31 == null && Static199.anInterface4_6.method892(this.anInt8036)) {
				@Pc(74) int[] local74 = local37.anInt9371 == 2 ? Static199.anInterface4_6.method897(this.anInt8036, 0.7F, this.anInt8034, this.anInt8034) : Static199.anInterface4_6.method894(0.7F, false, this.anInt8036, this.anInt8034, this.anInt8034);
				this.aClass32_31 = arg4.method8847(this.anInt8034, this.anInt8034, local74, this.anInt8034);
			}
			if (local37.anInt9371 == 2) {
				arg4.aa(arg5, arg1, arg3, arg7, arg2, 0);
			}
			if (this.aClass32_31 != null) {
				@Pc(110) int local110 = local37.anInt9371 == 2 ? 1 : 0;
				@Pc(116) int local116 = arg0 * arg7 / -4096;
				@Pc(129) int local129;
				for (local129 = arg7 * local7 / 4096 + (arg3 - arg7) / 2; local129 > arg7; local129 -= arg7) {
				}
				while (local129 < 0) {
					local129 += arg7;
				}
				while (arg7 < local116) {
					local116 -= arg7;
				}
				while (local116 < 0) {
					local116 += arg7;
				}
				for (@Pc(171) int local171 = local129 - arg7; local171 < arg3; local171 += arg7) {
					for (@Pc(178) int local178 = local116 - arg7; local178 < arg7; local178 += arg7) {
						this.aClass32_31.method5076(local171 + arg5, arg1 + local178, arg7, arg7, 1, 0, local110);
					}
				}
			}
		}
		for (@Pc(222) int local222 = this.anInt8030 - 1; local222 >= 0; local222--) {
			this.aClass282Array1[local222].method7206(arg4, arg5, arg1, arg3, arg7, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public void method6928() {
		if (this.aClass282Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass282Array2.length; local6++) {
				this.aClass282Array2[local6].method7211();
			}
		}
		this.aClass32_31 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ha;II)Z")
	public boolean method6929(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8027 != arg1) {
			this.anInt8027 = arg1;
			@Pc(28) int local28 = Static600.method8449(arg1);
			if (local28 > 512) {
				local28 = 512;
			}
			if (local28 <= 0) {
				local28 = 1;
			}
			if (this.anInt8034 != local28) {
				this.anInt8034 = local28;
				this.aClass32_31 = null;
			}
			if (this.aClass282Array2 != null) {
				this.anInt8030 = 0;
				@Pc(61) int[] local61 = new int[this.aClass282Array2.length];
				for (@Pc(63) int local63 = 0; local63 < this.aClass282Array2.length; local63++) {
					@Pc(70) Class282 local70 = this.aClass282Array2[local63];
					if (local70.method7203(this.anInt8032, this.anInt8035, this.anInt8033, this.anInt8027)) {
						local61[this.anInt8030] = local70.anInt8344;
						this.aClass282Array1[this.anInt8030++] = local70;
					}
				}
				Static635.method8384(0, this.anInt8030 - 1, this.aClass282Array1, local61);
			}
			this.aBoolean547 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean547) {
			this.aBoolean547 = false;
			for (@Pc(130) int local130 = this.anInt8030 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass282Array1[local130].method7209(arg0, this.aClass282_1);
				local119 |= local141;
				this.aBoolean547 |= !local141;
			}
		}
		return local119;
	}
}

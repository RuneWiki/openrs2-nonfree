import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class20 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Lclient!pu;")
	private Class50 aClass50_2;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	private int anInt314 = -1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[Lclient!dw;")
	private final Class92[] aClass92Array2;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	private final int anInt312;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	private final int anInt311;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	private final int anInt321;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	private final int anInt316;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!dw;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[Lclient!dw;")
	private final Class92[] aClass92Array1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I[Lclient!dw;IIII)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) Class92[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass92Array2 = arg1;
		this.anInt312 = arg0;
		this.anInt311 = arg5;
		this.anInt321 = arg3;
		this.anInt316 = arg4;
		if (arg1 == null) {
			this.aClass92_1 = null;
			this.aClass92Array1 = null;
		} else {
			this.aClass92Array1 = new Class92[arg1.length];
			this.aClass92_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BILclient!ha;IIIIIII)V")
	public void method283(@OriginalArg(1) int arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg8 & 0x3FFF;
		if (this.anInt312 == -1 || this.anInt320 == 0) {
			arg1.aa(arg4, arg3, arg6, arg5, arg0, 0);
		} else {
			@Pc(37) Class136 local37 = Static176.anInterface4_5.method358(this.anInt312);
			if (this.aClass50_2 == null && Static176.anInterface4_5.method359(this.anInt312)) {
				@Pc(76) int[] local76 = local37.anInt3869 == 2 ? Static176.anInterface4_5.method360(this.anInt320, this.anInt320, this.anInt312, 0.7F) : Static176.anInterface4_5.method363(this.anInt312, this.anInt320, 0.7F, false, this.anInt320);
				this.aClass50_2 = arg1.method6952(this.anInt320, this.anInt320, local76, this.anInt320);
			}
			if (local37.anInt3869 == 2) {
				arg1.aa(arg4, arg3, arg6, arg5, arg0, 0);
			}
			if (this.aClass50_2 != null) {
				@Pc(116) int local116 = local37.anInt3869 == 2 ? 1 : 0;
				@Pc(122) int local122 = arg5 * arg2 / -4096;
				@Pc(136) int local136;
				for (local136 = (arg6 - arg5) / 2 + arg5 * local11 / 4096; local136 > arg5; local136 -= arg5) {
				}
				while (local136 < 0) {
					local136 += arg5;
				}
				while (arg5 < local122) {
					local122 -= arg5;
				}
				while (local122 < 0) {
					local122 += arg5;
				}
				for (@Pc(177) int local177 = local136 - arg5; local177 < arg6; local177 += arg5) {
					for (@Pc(184) int local184 = local122 - arg5; local184 < arg5; local184 += arg5) {
						this.aClass50_2.method5991(arg4 + local177, local184 + arg3, arg5, arg5, 1, 0, local116);
					}
				}
			}
		}
		for (@Pc(223) int local223 = this.anInt310 - 1; local223 >= 0; local223--) {
			this.aClass92Array1[local223].method2251(arg1, arg4, arg3, arg6, arg5, arg2, local11);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLclient!ha;)Z")
	public boolean method284(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		if (this.anInt314 != arg0) {
			this.anInt314 = arg0;
			@Pc(16) int local16 = Static180.method2993(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt320 != local16) {
				this.anInt320 = local16;
				this.aClass50_2 = null;
			}
			if (this.aClass92Array2 != null) {
				this.anInt310 = 0;
				@Pc(49) int[] local49 = new int[this.aClass92Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass92Array2.length; local51++) {
					@Pc(58) Class92 local58 = this.aClass92Array2[local51];
					if (local58.method2245(this.anInt321, this.anInt316, this.anInt311, this.anInt314)) {
						local49[this.anInt310] = local58.anInt2513;
						this.aClass92Array1[this.anInt310++] = local58;
					}
				}
				Static131.method2369(this.aClass92Array1, 0, this.anInt310 - 1, local49);
			}
			this.aBoolean20 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean20) {
			this.aBoolean20 = false;
			for (@Pc(132) int local132 = this.anInt310 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass92Array1[local132].method2252(arg1, this.aClass92_1);
				this.aBoolean20 |= !local143;
				local121 |= local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public void method285() {
		if (this.aClass92Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass92Array2.length; local10++) {
				this.aClass92Array2[local10].method2253();
			}
		}
		this.aClass50_2 = null;
	}
}

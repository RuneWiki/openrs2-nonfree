import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class153 {

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "Lclient!jd;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
	private int anInt4285;

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
	private int anInt4289;

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "Z")
	private boolean aBoolean300 = true;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
	private int anInt4279 = -1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "[Lclient!ija;")
	private final Class164[] aClass164Array1;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
	private final int anInt4278;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
	private final int anInt4286;

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
	private final int anInt4287;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
	private final int anInt4280;

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "[Lclient!ija;")
	private final Class164[] aClass164Array2;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!ija;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(I[Lclient!ija;IIII)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) Class164[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass164Array1 = arg1;
		this.anInt4278 = arg3;
		this.anInt4286 = arg5;
		this.anInt4287 = arg4;
		this.anInt4280 = arg0;
		if (arg1 == null) {
			this.aClass164Array2 = null;
			this.aClass164_1 = null;
		} else {
			this.aClass164Array2 = new Class164[arg1.length];
			this.aClass164_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBILclient!ha;IIIIII)V")
	public void method3545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg7 + arg4 & 0x3FFF;
		if (this.anInt4280 == -1 || this.anInt4285 == 0) {
			arg2.aa(arg5, arg8, arg0, arg6, arg3, 0);
		} else {
			@Pc(28) Class224 local28 = Static132.anInterface3_1.method6177(this.anInt4280);
			if (this.aClass20_6 == null && Static132.anInterface3_1.method6181(this.anInt4280)) {
				@Pc(67) int[] local67 = local28.anInt6492 == 2 ? Static132.anInterface3_1.method6176(this.anInt4280, this.anInt4285, this.anInt4285, 0.7F) : Static132.anInterface3_1.method6180(this.anInt4285, this.anInt4285, false, this.anInt4280, 0.7F);
				this.aClass20_6 = arg2.method7885(this.anInt4285, this.anInt4285, local67, this.anInt4285);
			}
			if (local28.anInt6492 == 2) {
				arg2.aa(arg5, arg8, arg0, arg6, arg3, 0);
			}
			if (this.aClass20_6 != null) {
				@Pc(107) int local107 = local28.anInt6492 == 2 ? 1 : 0;
				@Pc(113) int local113 = arg6 * arg1 / -4096;
				@Pc(126) int local126;
				for (local126 = local12 * arg6 / 4096 + (arg0 - arg6) / 2; local126 > arg6; local126 -= arg6) {
				}
				while (local113 > arg6) {
					local113 -= arg6;
				}
				while (local126 < 0) {
					local126 += arg6;
				}
				while (local113 < 0) {
					local113 += arg6;
				}
				for (@Pc(172) int local172 = local126 - arg6; local172 < arg0; local172 += arg6) {
					for (@Pc(179) int local179 = local113 - arg6; local179 < arg6; local179 += arg6) {
						this.aClass20_6.method7398(local172 + arg5, arg8 + local179, arg6, arg6, 1, 0, local107);
					}
				}
			}
		}
		for (@Pc(229) int local229 = this.anInt4289 - 1; local229 >= 0; local229--) {
			this.aClass164Array2[local229].method3668(arg2, arg5, arg8, arg0, arg6, arg1, local12);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method3547(@OriginalArg(1) int arg0, @OriginalArg(2) Class137 arg1) {
		if (arg0 != this.anInt4279) {
			this.anInt4279 = arg0;
			@Pc(12) int local12 = Static133.method2141(arg0);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (local12 != this.anInt4285) {
				this.aClass20_6 = null;
				this.anInt4285 = local12;
			}
			if (this.aClass164Array1 != null) {
				this.anInt4289 = 0;
				@Pc(46) int[] local46 = new int[this.aClass164Array1.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass164Array1.length; local48++) {
					@Pc(55) Class164 local55 = this.aClass164Array1[local48];
					if (local55.method3670(this.anInt4278, this.anInt4287, this.anInt4286, this.anInt4279)) {
						local46[this.anInt4289] = local55.anInt4439;
						this.aClass164Array2[this.anInt4289++] = local55;
					}
				}
				Static298.method4394(this.aClass164Array2, local46, this.anInt4289 - 1, 0);
			}
			this.aBoolean300 = true;
		}
		@Pc(112) boolean local112 = false;
		if (this.aBoolean300) {
			this.aBoolean300 = false;
			for (@Pc(123) int local123 = this.anInt4289 - 1; local123 >= 0; local123--) {
				@Pc(134) boolean local134 = this.aClass164Array2[local123].method3665(arg1, this.aClass164_1);
				local112 |= local134;
				this.aBoolean300 |= !local134;
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)V")
	public void method3548() {
		if (this.aClass164Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass164Array1.length; local10++) {
				this.aClass164Array1[local10].method3664();
			}
		}
		this.aClass20_6 = null;
	}
}

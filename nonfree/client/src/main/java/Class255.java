import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class255 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!xa;")
	private Class13 aClass13_22;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "I")
	private int anInt6821;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	private int anInt6828;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Z")
	private boolean aBoolean507 = true;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private int anInt6829 = -1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private final int anInt6825;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "[Lclient!tda;")
	private final Class311[] aClass311Array2;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	private final int anInt6822;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	private final int anInt6819;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "I")
	private final int anInt6823;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!tda;")
	private final Class311 aClass311_1;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "[Lclient!tda;")
	private final Class311[] aClass311Array1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I[Lclient!tda;IIII)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) Class311[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6825 = arg0;
		this.aClass311Array2 = arg1;
		this.anInt6822 = arg4;
		this.anInt6819 = arg3;
		this.anInt6823 = arg5;
		if (arg1 == null) {
			this.aClass311_1 = null;
			this.aClass311Array1 = null;
		} else {
			this.aClass311Array1 = new Class311[arg1.length];
			this.aClass311_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!oa;B)Z")
	public boolean method5704(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		if (this.anInt6829 != arg0) {
			this.anInt6829 = arg0;
			@Pc(20) int local20 = Static337.method5028(arg0);
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 <= 0) {
				local20 = 1;
			}
			if (this.anInt6821 != local20) {
				this.aClass13_22 = null;
				this.anInt6821 = local20;
			}
			if (this.aClass311Array2 != null) {
				this.anInt6828 = 0;
				@Pc(55) int[] local55 = new int[this.aClass311Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass311Array2.length; local57++) {
					@Pc(64) Class311 local64 = this.aClass311Array2[local57];
					if (local64.method7128(this.anInt6819, this.anInt6822, this.anInt6823, this.anInt6829)) {
						local55[this.anInt6828] = local64.anInt8675;
						this.aClass311Array1[this.anInt6828++] = local64;
					}
				}
				Static148.method5907(local55, 0, this.anInt6828 - 1, this.aClass311Array1);
			}
			this.aBoolean507 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean507) {
			this.aBoolean507 = false;
			for (@Pc(135) int local135 = this.anInt6828 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass311Array1[local135].method7133(arg1, this.aClass311_1);
				local124 |= local146;
				this.aBoolean507 |= !local146;
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!oa;IIIIIIII)V")
	public void method5706(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg2 + arg5 & 0x3FFF;
		if (this.anInt6825 == -1) {
			arg1.C(arg0, arg4, arg8, arg3, arg6, 0);
		} else {
			@Pc(32) Class271 local32 = Static288.anInterface3_9.method7249(this.anInt6825);
			if (this.aClass13_22 == null && Static288.anInterface3_9.method7248(this.anInt6825)) {
				@Pc(70) int[] local70 = local32.aBoolean515 ? Static288.anInterface3_9.method7251(0.7F, this.anInt6821, this.anInt6825, this.anInt6821) : Static288.anInterface3_9.method7250(this.anInt6821, false, this.anInt6825, 0.7F, this.anInt6821);
				this.aClass13_22 = arg1.method6843(local70, this.anInt6821, this.anInt6821, this.anInt6821);
			}
			if (local32.aBoolean515) {
				arg1.C(arg0, arg4, arg8, arg3, arg6, 0);
			}
			if (this.aClass13_22 != null) {
				@Pc(103) int local103 = local32.aBoolean515 ? 1 : 0;
				@Pc(109) int local109 = arg3 * arg7 / -4096;
				@Pc(123) int local123;
				for (local123 = (arg8 - arg3) / 2 + arg3 * local7 / 4096; local123 > arg3; local123 -= arg3) {
				}
				while (local123 < 0) {
					local123 += arg3;
				}
				while (arg3 < local109) {
					local109 -= arg3;
				}
				while (local109 < 0) {
					local109 += arg3;
				}
				for (@Pc(168) int local168 = local123 - arg3; local168 < arg8; local168 += arg3) {
					for (@Pc(175) int local175 = local109 - arg3; local175 < arg3; local175 += arg3) {
						this.aClass13_22.KA(local168 + arg0, arg4 + local175, arg3, arg3, 1, 0, local103);
					}
				}
			}
		}
		for (@Pc(211) int local211 = this.anInt6828 - 1; local211 >= 0; local211--) {
			this.aClass311Array1[local211].method7135(arg1, arg0, arg4, arg8, arg3, arg7, local7);
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method5707() {
		if (this.aClass311Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass311Array2.length; local10++) {
				this.aClass311Array2[local10].method7130();
			}
		}
		this.aClass13_22 = null;
	}
}

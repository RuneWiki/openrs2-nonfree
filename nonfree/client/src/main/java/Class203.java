import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class203 {

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!hu;")
	private Class21 aClass21_25;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt6607;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	private int anInt6612;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
	private boolean aBoolean456 = true;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
	private int anInt6614 = -1;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	private final int anInt6602;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private final int anInt6605;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[Lclient!fm;")
	private final Class105[] aClass105Array2;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	private final int anInt6608;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	private final int anInt6606;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!fm;")
	private final Class105 aClass105_1;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lclient!fm;")
	private final Class105[] aClass105Array1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[Lclient!fm;IIII)V")
	public Class203(@OriginalArg(0) int arg0, @OriginalArg(1) Class105[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6602 = arg5;
		this.anInt6605 = arg4;
		this.aClass105Array2 = arg1;
		this.anInt6608 = arg0;
		this.anInt6606 = arg3;
		if (arg1 == null) {
			this.aClass105_1 = null;
			this.aClass105Array1 = null;
		} else {
			this.aClass105Array1 = new Class105[arg1.length];
			this.aClass105_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIZILclient!ha;II)V")
	public void method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg5 + arg2 & 0x3FFF;
		if (this.anInt6608 == -1 || this.anInt6607 == 0) {
			arg6.aa(arg7, arg8, arg0, arg3, arg1, 0);
		} else {
			@Pc(28) Class218 local28 = Static602.anInterface2_14.method4027(this.anInt6608);
			if (this.aClass21_25 == null && Static602.anInterface2_14.method4025(this.anInt6608)) {
				@Pc(67) int[] local67 = local28.anInt6842 == 2 ? Static602.anInterface2_14.method4028(0.7F, this.anInt6607, this.anInt6608, this.anInt6607) : Static602.anInterface2_14.method4026(false, this.anInt6607, this.anInt6608, 0.7F, this.anInt6607);
				this.aClass21_25 = arg6.method6132(this.anInt6607, local67, this.anInt6607, this.anInt6607);
			}
			if (local28.anInt6842 == 2) {
				arg6.aa(arg7, arg8, arg0, arg3, arg1, 0);
			}
			if (this.aClass21_25 != null) {
				@Pc(105) int local105 = local28.anInt6842 == 2 ? 1 : 0;
				@Pc(111) int local111 = arg3 * arg4 / -4096;
				@Pc(124) int local124;
				for (local124 = (arg0 - arg3) / 2 + local7 * arg3 / 4096; local124 > arg3; local124 -= arg3) {
				}
				while (local124 < 0) {
					local124 += arg3;
				}
				while (local111 > arg3) {
					local111 -= arg3;
				}
				while (local111 < 0) {
					local111 += arg3;
				}
				for (@Pc(169) int local169 = local124 - arg3; local169 < arg0; local169 += arg3) {
					for (@Pc(175) int local175 = local111 - arg3; local175 < arg3; local175 += arg3) {
						this.aClass21_25.method5788(local169 + arg7, local175 - -arg8, arg3, arg3, 1, 0, local105);
					}
				}
			}
		}
		for (@Pc(225) int local225 = this.anInt6612 - 1; local225 >= 0; local225--) {
			this.aClass105Array1[local225].method3184(arg6, arg7, arg8, arg0, arg3, arg4, local7);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method5424(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		if (this.anInt6614 != arg0) {
			this.anInt6614 = arg0;
			@Pc(16) int local16 = Static258.method4554(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt6607 != local16) {
				this.aClass21_25 = null;
				this.anInt6607 = local16;
			}
			if (this.aClass105Array2 != null) {
				this.anInt6612 = 0;
				@Pc(55) int[] local55 = new int[this.aClass105Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass105Array2.length; local57++) {
					@Pc(64) Class105 local64 = this.aClass105Array2[local57];
					if (local64.method3181(this.anInt6606, this.anInt6605, this.anInt6602, this.anInt6614)) {
						local55[this.anInt6612] = local64.anInt3946;
						this.aClass105Array1[this.anInt6612++] = local64;
					}
				}
				Static185.method3524(this.anInt6612 - 1, this.aClass105Array1, local55, 0);
			}
			this.aBoolean456 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean456) {
			this.aBoolean456 = false;
			for (@Pc(132) int local132 = this.anInt6612 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass105Array1[local132].method3179(arg1, this.aClass105_1);
				local121 |= local143;
				this.aBoolean456 |= !local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public void method5426() {
		if (this.aClass105Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass105Array2.length; local6++) {
				this.aClass105Array2[local6].method3183();
			}
		}
		this.aClass21_25 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class38 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	private int anInt1242;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "Lclient!xa;")
	private Class66 aClass66_8;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
	private int anInt1250 = -1;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	private final int anInt1244;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private final int anInt1249;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	private final int anInt1246;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[Lclient!oc;")
	private final Class233[] aClass233Array1;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	private final int anInt1243;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "[Lclient!oc;")
	private final Class233[] aClass233Array2;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Lclient!oc;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I[Lclient!oc;IIII)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) Class233[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1244 = arg0;
		this.anInt1249 = arg3;
		this.anInt1246 = arg5;
		this.aClass233Array1 = arg1;
		this.anInt1243 = arg4;
		if (arg1 == null) {
			this.aClass233Array2 = null;
			this.aClass233_1 = null;
		} else {
			this.aClass233Array2 = new Class233[arg1.length];
			this.aClass233_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!oa;)Z")
	public boolean method1129(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		if (this.anInt1250 != arg0) {
			this.anInt1250 = arg0;
			@Pc(16) int local16 = Static479.method7316(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt1242) {
				this.anInt1242 = local16;
				this.aClass66_8 = null;
			}
			if (this.aClass233Array1 != null) {
				this.anInt1251 = 0;
				@Pc(55) int[] local55 = new int[this.aClass233Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass233Array1.length; local57++) {
					@Pc(64) Class233 local64 = this.aClass233Array1[local57];
					if (local64.method5821(this.anInt1249, this.anInt1243, this.anInt1246, this.anInt1250)) {
						local55[this.anInt1251] = local64.anInt6907;
						this.aClass233Array2[this.anInt1251++] = local64;
					}
				}
				Static573.method8082(local55, this.aClass233Array2, this.anInt1251 - 1, 0);
			}
			this.aBoolean145 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean145) {
			this.aBoolean145 = false;
			for (@Pc(137) int local137 = this.anInt1251 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass233Array2[local137].method5827(arg1, this.aClass233_1);
				this.aBoolean145 |= !local148;
				local126 |= local148;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public void method1131() {
		if (this.aClass233Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass233Array1.length; local6++) {
				this.aClass233Array1[local6].method5819();
			}
		}
		this.aClass66_8 = null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIILclient!oa;II)V")
	public void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg2 + arg8 & 0x3FFF;
		if (this.anInt1244 == -1) {
			arg6.C(arg1, arg0, arg4, arg7, arg5, 0);
		} else {
			@Pc(21) Class296 local21 = Static523.anInterface2_14.method3585(this.anInt1244);
			if (this.aClass66_8 == null && Static523.anInterface2_14.method3583(this.anInt1244)) {
				@Pc(57) int[] local57 = local21.aBoolean659 ? Static523.anInterface2_14.method3581(this.anInt1244, 0.7F, this.anInt1242, this.anInt1242) : Static523.anInterface2_14.method3582(0.7F, false, this.anInt1242, this.anInt1244, this.anInt1242);
				this.aClass66_8 = arg6.method5423(local57, this.anInt1242, this.anInt1242, this.anInt1242);
			}
			if (local21.aBoolean659) {
				arg6.C(arg1, arg0, arg4, arg7, arg5, 0);
			}
			if (this.aClass66_8 != null) {
				@Pc(90) int local90 = local21.aBoolean659 ? 1 : 0;
				@Pc(96) int local96 = arg3 * arg7 / -4096;
				@Pc(109) int local109;
				for (local109 = local7 * arg7 / 4096 + (arg4 - arg7) / 2; local109 > arg7; local109 -= arg7) {
				}
				while (arg7 < local96) {
					local96 -= arg7;
				}
				while (local109 < 0) {
					local109 += arg7;
				}
				while (local96 < 0) {
					local96 += arg7;
				}
				for (@Pc(155) int local155 = local109 - arg7; local155 < arg4; local155 += arg7) {
					for (@Pc(161) int local161 = local96 - arg7; local161 < arg7; local161 += arg7) {
						this.aClass66_8.KA(local155 + arg1, local161 - -arg0, arg7, arg7, 1, 0, local90);
					}
				}
			}
		}
		for (@Pc(211) int local211 = this.anInt1251 - 1; local211 >= 0; local211--) {
			this.aClass233Array2[local211].method5825(arg6, arg1, arg0, arg4, arg7, arg3, local7);
		}
	}
}

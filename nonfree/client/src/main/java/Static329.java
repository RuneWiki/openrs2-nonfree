import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!fo;")
	public static Class82 aClass82_75;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method4419(@OriginalArg(1) Class25_Sub5_Sub1_Sub1 arg0) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static361.aClass227_37.method4967(); local10 != null; local10 = (Class1_Sub10) Static361.aClass227_37.method4973()) {
			if (local10.aClass25_Sub5_Sub1_Sub1_1 == arg0) {
				if (local10.aClass1_Sub6_Sub3_1 != null) {
					Static355.aClass1_Sub6_Sub4_2.method5179(local10.aClass1_Sub6_Sub3_1);
					local10.aClass1_Sub6_Sub3_1 = null;
				}
				local10.method5915();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public static void method4421() {
		Static284.aClass102_36.method2271();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[Lclient!jk;I)V")
	public static void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) Class124[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class124 local9 = arg1[local3];
			if (local9 != null && local9.anInt3344 == arg0 && !Static55.method966(local9)) {
				if (local9.anInt3417 == 0) {
					method4426(local9.anInt3348, arg1);
					if (local9.aClass124Array1 != null) {
						method4426(local9.anInt3348, local9.aClass124Array1);
					}
					@Pc(50) Class1_Sub14 local50 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local9.anInt3348);
					if (local50 != null) {
						Static150.method5309(local50.anInt1425);
					}
				}
				if (local9.anInt3417 == 6 && local9.anInt3429 != -1) {
					@Pc(75) Class177 local75 = Static174.aClass254_1.method5670(local9.anInt3429);
					if (local75 != null) {
						local9.anInt3365 += Static341.anInt5831;
						while (local9.anInt3365 > local75.anIntArray327[local9.anInt3358]) {
							local9.anInt3365 -= local75.anIntArray327[local9.anInt3358];
							local9.anInt3358++;
							if (local9.anInt3358 >= local75.anIntArray326.length) {
								local9.anInt3358 -= local75.anInt5041;
								if (local9.anInt3358 < 0 || local9.anInt3358 >= local75.anIntArray326.length) {
									local9.anInt3358 = 0;
								}
							}
							local9.anInt3359 = local9.anInt3358 + 1;
							if (local75.anIntArray326.length <= local9.anInt3359) {
								local9.anInt3359 -= local75.anInt5041;
								if (local9.anInt3359 < 0 || local9.anInt3359 >= local75.anIntArray326.length) {
									local9.anInt3359 = -1;
								}
							}
							Static160.method2323(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method4428() {
		Static67.method1088();
		Static111.method1777();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!rg;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Lclient!re;")
	public static final Class175 aClass175_1 = new Class175();

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	public static int anInt1004 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!qj;I)Lclient!kf;")
	public static Class1_Sub20 method1032(@OriginalArg(1) Class165 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = arg0.method4492(arg1);
		return local15 == null ? null : new Class1_Sub20(local15);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!qj;ILclient!aa;)V")
	public static void method1034(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class2 arg1) {
		if (Static339.aBoolean568) {
			return;
		}
		arg1.method3309(0);
		Static322.aClass90_18 = arg1.method3322(Static363.method3784(arg0, Static311.anInt5989));
		Static322.aClass90_18.method5454((Static11.anInt5389 - Static322.aClass90_18.method5464()) / 2, (Static320.anInt6140 - Static322.aClass90_18.method5467()) / 2);
		Static287.aClass90_16 = arg1.method3322(Static363.method3784(arg0, Static81.anInt1604));
		Static287.aClass90_16.method5454((Static11.anInt5389 - Static287.aClass90_16.method5464()) / 2, 18);
		Static339.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIBLclient!aa;I)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Interface8 local16 = (Interface8) Static264.method4812(arg1, arg7, arg5);
		@Pc(24) Class188 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (local16 != null) {
			local24 = Static126.method2405(local16.method5697());
			local30 = local16.method5701() & 0x3;
			local34 = local16.method5699();
			if (local24.anInt5537 == -1) {
				local41 = arg0;
				if (local24.anInt5546 > 0) {
					local41 = arg2;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg6.method3335(arg4, 4, arg3, local41);
					} else if (local30 == 1) {
						arg6.method3254(local41, arg3, arg4, 4);
					} else if (local30 == 2) {
						arg6.method3335(arg4 + 3, 4, arg3, local41);
					} else if (local30 == 3) {
						arg6.method3254(local41, arg3 + 3, arg4, 4);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg6.method3277(arg3, 1, arg4, local41, 1);
					} else if (local30 == 1) {
						arg6.method3277(arg3, 1, arg4 + 3, local41, 1);
					} else if (local30 == 2) {
						arg6.method3277(arg3 + 3, 1, arg4 + 3, local41, 1);
					} else if (local30 == 3) {
						arg6.method3277(arg3 + 3, 1, arg4, local41, 1);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg6.method3254(local41, arg3, arg4, 4);
					} else if (local30 == 1) {
						arg6.method3335(arg4 + 3, 4, arg3, local41);
					} else if (local30 == 2) {
						arg6.method3254(local41, arg3 + 3, arg4, 4);
					} else if (local30 == 3) {
						arg6.method3335(arg4, 4, arg3, local41);
					}
				}
			} else {
				Static223.method4080(arg3, local30, local24, arg6, arg4);
			}
		}
		local16 = (Interface8) Static66.method1372(arg1, arg7, arg5, tr.class);
		if (local16 != null) {
			local24 = Static126.method2405(local16.method5697());
			local30 = local16.method5701() & 0x3;
			local34 = local16.method5699();
			if (local24.anInt5537 != -1) {
				Static223.method4080(arg3, local30, local24, arg6, arg4);
			} else if (local34 == 9) {
				local41 = -1118482;
				if (local24.anInt5546 > 0) {
					local41 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg6.method3310(arg3, arg3 + 3, arg4, local41, arg4 + 3);
				} else {
					arg6.method3310(arg3 + 3, arg3, arg4, local41, arg4 + 3);
				}
			}
		}
		local16 = (Interface8) Static331.method5551(arg1, arg7, arg5);
		if (local16 == null) {
			return;
		}
		local24 = Static126.method2405(local16.method5697());
		local30 = local16.method5701() & 0x3;
		if (local24.anInt5537 != -1) {
			Static223.method4080(arg3, local30, local24, arg6, arg4);
			return;
		}
	}
}

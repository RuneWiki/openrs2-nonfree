import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!gf;")
	public static final Class85 aClass85_3 = new Class85(128);

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
	public static final int[] anIntArray537 = new int[8];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILclient!za;IIII)V")
	public static void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface2 local11 = (Interface2) Static113.method1718(arg6, arg2, arg7);
		@Pc(20) Class192 local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local11 != null) {
			local20 = Static50.aClass190_1.method4218(local11.method5292());
			local26 = local11.method5298() & 0x3;
			local32 = local11.method5296();
			if (local20.anInt5328 == -1) {
				local39 = arg1;
				if (local20.anInt5357 > 0) {
					local39 = arg3;
				}
				if (local32 == 0 || local32 == 2) {
					if (local26 == 0) {
						arg4.method5558(arg0, arg5, local39, 4);
					} else if (local26 == 1) {
						arg4.method5543(4, local39, arg5, arg0);
					} else if (local26 == 2) {
						arg4.method5558(arg0 + 3, arg5, local39, 4);
					} else if (local26 == 3) {
						arg4.method5543(4, local39, arg5 + 3, arg0);
					}
				}
				if (local32 == 3) {
					if (local26 == 0) {
						arg4.method5545(1, local39, 1, arg5, arg0);
					} else if (local26 == 1) {
						arg4.method5545(1, local39, 1, arg5, arg0 + 3);
					} else if (local26 == 2) {
						arg4.method5545(1, local39, 1, arg5 + 3, arg0 + 3);
					} else if (local26 == 3) {
						arg4.method5545(1, local39, 1, arg5 + 3, arg0);
					}
				}
				if (local32 == 2) {
					if (local26 == 0) {
						arg4.method5543(4, local39, arg5, arg0);
					} else if (local26 == 1) {
						arg4.method5558(arg0 + 3, arg5, local39, 4);
					} else if (local26 == 2) {
						arg4.method5543(4, local39, arg5 + 3, arg0);
					} else if (local26 == 3) {
						arg4.method5558(arg0, arg5, local39, 4);
					}
				}
			} else {
				Static31.method461(local20, arg0, local26, arg5, arg4);
			}
		}
		local11 = (Interface2) Static144.method2120(arg6, arg2, arg7, bn.class);
		if (local11 != null) {
			local20 = Static50.aClass190_1.method4218(local11.method5292());
			local26 = local11.method5298() & 0x3;
			local32 = local11.method5296();
			if (local20.anInt5328 != -1) {
				Static31.method461(local20, arg0, local26, arg5, arg4);
			} else if (local32 == 9) {
				local39 = -1118482;
				if (local20.anInt5357 > 0) {
					local39 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method5501(arg0 + 3, arg5 + 3, arg5, arg0, local39);
				} else {
					arg4.method5501(arg0 + 3, arg5, arg5 + 3, arg0, local39);
				}
			}
		}
		local11 = (Interface2) Static350.method4653(arg6, arg2, arg7);
		if (local11 == null) {
			return;
		}
		local20 = Static50.aClass190_1.method4218(local11.method5292());
		local26 = local11.method5298() & 0x3;
		if (local20.anInt5328 != -1) {
			Static31.method461(local20, arg0, local26, arg5, arg4);
			return;
		}
	}
}

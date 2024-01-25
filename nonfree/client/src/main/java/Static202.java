import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Lclient!db;")
	public static Class64 aClass64_165;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!mk;")
	public static final Class4_Sub31 aClass4_Sub31_2 = new Class4_Sub31(0, -1);

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public static int anInt4245 = 0;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[1000][];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIBLclient!oa;I)V")
	public static void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class66 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface17 local11 = (Interface17) Static216.method3734(arg1, arg3, arg7);
		@Pc(20) Class25 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static553.aClass288_4.method6419(local11.method7743());
			local26 = local11.method7744() & 0x3;
			local30 = local11.method7742();
			if (local20.anInt594 == -1) {
				local36 = arg2;
				if (local20.anInt599 > 0) {
					local36 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg6.method6782(local36, arg5, 4, arg0);
					} else if (local26 == 1) {
						arg6.method6817(arg5, local36, arg0, 4);
					} else if (local26 == 2) {
						arg6.method6782(local36, arg5 + 3, 4, arg0);
					} else if (local26 == 3) {
						arg6.method6817(arg5, local36, arg0 + 3, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg6.method6794(1, arg5, 1, arg0, local36);
					} else if (local26 == 1) {
						arg6.method6794(1, arg5 + 3, 1, arg0, local36);
					} else if (local26 == 2) {
						arg6.method6794(1, arg5 + 3, 1, arg0 + 3, local36);
					} else if (local26 == 3) {
						arg6.method6794(1, arg5, 1, arg0 + 3, local36);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg6.method6817(arg5, local36, arg0, 4);
					} else if (local26 == 1) {
						arg6.method6782(local36, arg5 + 3, 4, arg0);
					} else if (local26 == 2) {
						arg6.method6817(arg5, local36, arg0 + 3, 4);
					} else if (local26 == 3) {
						arg6.method6782(local36, arg5, 4, arg0);
					}
				}
			} else {
				Static378.method5646(arg6, local26, local20, arg0, arg5);
			}
		}
		local11 = (Interface17) Static541.method7510(arg1, arg3, arg7, qi.class);
		if (local11 != null) {
			local20 = Static553.aClass288_4.method6419(local11.method7743());
			local26 = local11.method7744() & 0x3;
			local30 = local11.method7742();
			if (local20.anInt594 != -1) {
				Static378.method5646(arg6, local26, local20, arg0, arg5);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt599 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg6.method6777(arg0, arg0 + 3, arg5 + 3, arg5, local36);
				} else {
					arg6.method6777(arg0 + 3, arg0, arg5 + 3, arg5, local36);
				}
			}
		}
		local11 = (Interface17) Static38.method651(arg1, arg3, arg7);
		if (local11 == null) {
			return;
		}
		local20 = Static553.aClass288_4.method6419(local11.method7743());
		local26 = local11.method7744() & 0x3;
		if (local20.anInt594 != -1) {
			Static378.method5646(arg6, local26, local20, arg0, arg5);
			return;
		}
	}
}

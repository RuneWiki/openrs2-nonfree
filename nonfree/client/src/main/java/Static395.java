import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt7316 = -1;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public static int anInt7319 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!oa;IIIBII)V")
	public static void method6020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface15 local11 = (Interface15) Static542.method7740(arg1, arg5, arg0);
		@Pc(20) Class242 local20;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(48) int local48;
		if (local11 != null) {
			local20 = Static454.aClass298_3.method7185(local11.method7758());
			local28 = local11.method7764() & 0x3;
			local32 = local11.method7761();
			if (local20.anInt7188 == -1) {
				local48 = arg7;
				if (local20.anInt7164 > 0) {
					local48 = arg4;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg2.method7476(local48, arg3, arg6, 4);
					} else if (local28 == 1) {
						arg2.method7434(arg3, 4, local48, arg6);
					} else if (local28 == 2) {
						arg2.method7476(local48, arg3 + 3, arg6, 4);
					} else if (local28 == 3) {
						arg2.method7434(arg3, 4, local48, arg6 + 3);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg2.method7459(1, arg6, local48, 1, arg3);
					} else if (local28 == 1) {
						arg2.method7459(1, arg6, local48, 1, arg3 + 3);
					} else if (local28 == 2) {
						arg2.method7459(1, arg6 + 3, local48, 1, arg3 + 3);
					} else if (local28 == 3) {
						arg2.method7459(1, arg6 + 3, local48, 1, arg3);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg2.method7434(arg3, 4, local48, arg6);
					} else if (local28 == 1) {
						arg2.method7476(local48, arg3 + 3, arg6, 4);
					} else if (local28 == 2) {
						arg2.method7434(arg3, 4, local48, arg6 + 3);
					} else if (local28 == 3) {
						arg2.method7476(local48, arg3, arg6, 4);
					}
				}
			} else {
				Static218.method3993(arg2, arg3, local28, arg6, local20);
			}
		}
		local11 = (Interface15) Static420.method6482(arg1, arg5, arg0, qn.class);
		if (local11 != null) {
			local20 = Static454.aClass298_3.method7185(local11.method7758());
			local28 = local11.method7764() & 0x3;
			local32 = local11.method7761();
			if (local20.anInt7188 != -1) {
				Static218.method3993(arg2, arg3, local28, arg6, local20);
			} else if (local32 == 9) {
				local48 = -1118482;
				if (local20.anInt7164 > 0) {
					local48 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg2.method7416(arg6, arg3, arg6 + 3, arg3 + 3, local48);
				} else {
					arg2.method7416(arg6 + 3, arg3, arg6, arg3 + 3, local48);
				}
			}
		}
		local11 = (Interface15) Static72.method1464(arg1, arg5, arg0);
		if (local11 == null) {
			return;
		}
		local20 = Static454.aClass298_3.method7185(local11.method7758());
		local28 = local11.method7764() & 0x3;
		if (local20.anInt7188 != -1) {
			Static218.method3993(arg2, arg3, local28, arg6, local20);
		}
	}
}

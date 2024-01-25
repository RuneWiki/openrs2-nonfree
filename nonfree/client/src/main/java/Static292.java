import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!hg;")
	public static Class152 aClass152_4;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[BI)I")
	public static int method4637(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = -1;
		for (@Pc(16) int local16 = arg0; local16 < arg2; local16++) {
			local14 = Class318.anIntArray478[(local14 ^ arg1[local16]) & 0xFF] ^ local14 >>> 8;
		}
		return ~local14;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V")
	public static void method4638(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class5_Sub1_Sub13 local6 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local6 != null; local6 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
			if (Static161.method2974(local6.anInt6068)) {
				Static13.method205(local6);
			}
		}
		if (arg0 <= -13) {
			;
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)Lclient!sg;")
	public static Class5_Sub49 method4640() {
		if (Static491.aClass20_4 == null || Static175.aClass215_2 == null) {
			return null;
		}
		for (@Pc(25) Class5_Sub49 local25 = (Class5_Sub49) Static175.aClass215_2.method4911(); local25 != null; local25 = (Class5_Sub49) Static175.aClass215_2.method4911()) {
			@Pc(33) Class313 local33 = Static491.aClass327_2.method7413(local25.anInt8675);
			if (local33 != null && local33.aBoolean547 && local33.method7057(Static491.anInterface1_2)) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)I")
	public static int method4641(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = Static181.anInt3401;
		if (local16 == 0) {
			return arg0 ? 0 : Static208.anInt3698;
		} else if (local16 == 1) {
			return Static208.anInt3698;
		} else if (local16 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
	public static void method4642(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static381.anInt6411 != -1) {
				Static397.method5820(Static381.anInt6411);
			}
			for (@Pc(31) Class5_Sub38 local31 = (Class5_Sub38) Static438.aClass306_31.method6941(); local31 != null; local31 = (Class5_Sub38) Static438.aClass306_31.method6940()) {
				if (!local31.method9219()) {
					local31 = (Class5_Sub38) Static438.aClass306_31.method6941();
					if (local31 == null) {
						break;
					}
				}
				Static655.method9010(false, local31, true);
			}
			Static381.anInt6411 = -1;
			Static438.aClass306_31 = new Class306(8);
			Static141.method2586();
			Static381.anInt6411 = Static549.anInt8708;
			Static417.method6129(false);
			Static352.method5188(-71);
			Static247.method3963(Static381.anInt6411);
		}
		Static531.aBoolean573 = true;
	}
}

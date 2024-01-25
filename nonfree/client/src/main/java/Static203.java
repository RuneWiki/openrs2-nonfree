import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_47 = new Class230(13, 15);

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	public static int anInt3942 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method3388() {
		if (Static59.anInt1515 < 0) {
			return;
		}
		@Pc(11) long local11 = Static376.method6088();
		Static59.anInt1515 = (int) ((long) Static59.anInt1515 + Static589.aLong260 - local11);
		if (Static59.anInt1515 <= 0) {
			Static191.aFloat55 = Static491.aClass167_9.aFloat80;
			Static59.anInt1515 = -1;
			Static247.anInt5390 = Static491.aClass167_9.anInt4902;
			Static288.aFloat118 = Static491.aClass167_9.aFloat79;
			Static260.aFloat116 = Static491.aClass167_9.aFloat82;
			Static300.aClass108_6 = Static491.aClass167_9.aClass108_2;
			Static424.aFloat173 = Static491.aClass167_9.aFloat84;
			Static446.anInt8504 = Static491.aClass167_9.anInt4906;
			Static25.aFloat12 = Static491.aClass167_9.aFloat85;
			Static11.aFloat2 = Static491.aClass167_9.aFloat83;
			Static591.anInt10348 = Static491.aClass167_9.anInt4903;
		} else {
			@Pc(64) int local64 = (Static59.anInt1515 << 8) / Static170.anInt9047;
			@Pc(69) int local69 = 255 - local64;
			@Pc(74) float local74 = (float) local64 / 255.0F;
			@Pc(79) float local79 = 1.0F - local74;
			Static446.anInt8504 = (local69 * (Static491.aClass167_9.anInt4906 & 0xFF00) + (Static142.anInt3262 & 0xFF00) * local64 & 0xFF0000) + (local69 * (Static491.aClass167_9.anInt4906 & 0xFF00FF) + local64 * (Static142.anInt3262 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static288.aFloat118 = local79 * (Static491.aClass167_9.aFloat79 - Static10.aFloat1) + Static10.aFloat1;
			Static247.anInt5390 = local64 * Static370.anInt7278 + local69 * Static491.aClass167_9.anInt4902 >> 8;
			Static11.aFloat2 = Static567.aFloat204 + local79 * (Static491.aClass167_9.aFloat83 - Static567.aFloat204);
			Static591.anInt10348 = ((Static536.anInt9712 & 0xFF00) * local64 + (Static491.aClass167_9.anInt4903 & 0xFF00) * local69 & 0xFF0000) + ((Static491.aClass167_9.anInt4903 & 0xFF00FF) * local69 + local64 * (Static536.anInt9712 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static260.aFloat116 = (Static491.aClass167_9.aFloat82 - Static110.aFloat27) * local79 + Static110.aFloat27;
			Static424.aFloat173 = Static23.aFloat179 + local79 * (Static491.aClass167_9.aFloat84 - Static23.aFloat179);
			Static191.aFloat55 = Static17.aFloat120 + local79 * (Static491.aClass167_9.aFloat80 - Static17.aFloat120);
			Static25.aFloat12 = local79 * (Static491.aClass167_9.aFloat85 - Static257.aFloat115) + Static257.aFloat115;
			if (Static491.aClass167_9.aClass108_2 != Static173.aClass108_1) {
				Static300.aClass108_6 = Static322.aClass15_10.method5298(Static173.aClass108_1, Static491.aClass167_9.aClass108_2, local79, Static300.aClass108_6);
			}
		}
		Static589.aLong260 = local11;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)[Lclient!bn;")
	public static Class33[] method3389() {
		return new Class33[] { Static261.aClass33_29, Static261.aClass33_30, Static261.aClass33_31, Static261.aClass33_32, Static261.aClass33_33, Static261.aClass33_34, Static261.aClass33_35, Static261.aClass33_36, Static261.aClass33_37, Static261.aClass33_38, Static261.aClass33_39, Static261.aClass33_40, Static261.aClass33_41, Static261.aClass33_42 };
	}
}

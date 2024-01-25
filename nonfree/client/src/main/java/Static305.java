import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method5220() {
		@Pc(14) int local14 = Static214.aClass4_Sub19_Sub1_1.method2794(Static495.anInt9000);
		if (local14 == 0) {
			Static483.aByteArrayArrayArray18 = null;
			Static497.method7371(0);
		} else if (local14 == 1) {
			Static446.method6888((byte) 0);
			Static497.method7371(512);
			if (Static262.aByteArrayArrayArray16 != null) {
				Static592.method8362();
			}
		} else {
			Static446.method6888((byte) (Static203.anInt3850 - 4 & 0xFF));
			Static497.method7371(2);
		}
		Static481.anInt8820 = Static13.anInt231;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method5221(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static538.aBoolean617) {
			try {
				@Pc(23) Class25 local23 = (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
				local23.method352(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static538.aBoolean617 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)[Lclient!hq;")
	public static Class145[] method5222() {
		return new Class145[] { Static565.aClass145_11, Static465.aClass145_8, Static308.aClass145_6, Static379.aClass145_7, Static204.aClass145_10, Static172.aClass145_3 };
	}
}

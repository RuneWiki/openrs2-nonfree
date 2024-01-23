import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public static int anInt1797 = 0;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!fd;")
	public static Class4_Sub10 method1347() {
		@Pc(13) Class4_Sub10 local13 = new Class4_Sub10(34);
		local13.method4618(11);
		local13.method4618(Static10.anInt185);
		local13.method4618(Static98.aBoolean144 ? 1 : 0);
		local13.method4618(Static141.aBoolean399 ? 1 : 0);
		local13.method4618(Static117.aBoolean159 ? 1 : 0);
		local13.method4618(Static233.aBoolean227 ? 1 : 0);
		local13.method4618(Static82.aBoolean117 ? 1 : 0);
		local13.method4618(Static312.aBoolean422 ? 1 : 0);
		local13.method4618(Static27.aBoolean27 ? 1 : 0);
		local13.method4618(Static66.aBoolean75 ? 1 : 0);
		local13.method4618(Static114.anInt2298);
		local13.method4618(Static56.aBoolean66 ? 1 : 0);
		local13.method4618(Static303.aBoolean394 ? 1 : 0);
		local13.method4618(Static279.aBoolean363 ? 1 : 0);
		local13.method4618(Static21.anInt1051);
		local13.method4618(Static273.aBoolean122 ? 1 : 0);
		local13.method4618(Static171.anInt3315);
		local13.method4618(Static24.anInt344);
		local13.method4618(Static208.anInt4120);
		local13.method4668(Static179.anInt3403);
		local13.method4668(Static137.anInt2627);
		local13.method4618(Static184.method2967());
		local13.method4654(Static203.anInt3909);
		local13.method4618(Static192.anInt3637);
		local13.method4618(Static205.aBoolean278 ? 1 : 0);
		local13.method4618(Static212.aBoolean293 ? 1 : 0);
		local13.method4618(Static222.anInt4292);
		local13.method4618(Static300.aBoolean391 ? 1 : 0);
		local13.method4618(Static61.aBoolean69 ? 1 : 0);
		return local13;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)Z")
	public static boolean method1364(@OriginalArg(1) int arg0) {
		if (Static93.aBooleanArray12[arg0]) {
			return true;
		} else if (Static126.aClass58_56.method1355(arg0)) {
			@Pc(29) int local29 = Static126.aClass58_56.method1371(arg0);
			if (local29 == 0) {
				Static93.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static188.aClass189ArrayArray115[arg0] == null) {
				Static188.aClass189ArrayArray115[arg0] = new Class189[local29];
			}
			for (@Pc(53) int local53 = 0; local53 < local29; local53++) {
				if (Static188.aClass189ArrayArray115[arg0][local53] == null) {
					@Pc(74) byte[] local74 = Static126.aClass58_56.method1372(arg0, local53);
					if (local74 != null) {
						@Pc(88) Class189 local88 = Static188.aClass189ArrayArray115[arg0][local53] = new Class189();
						local88.anInt5918 = (arg0 << 16) + local53;
						if (local74[0] == -1) {
							local88.method4769(new Class4_Sub10(local74));
						} else {
							local88.method4765(new Class4_Sub10(local74));
						}
					}
				}
			}
			Static93.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

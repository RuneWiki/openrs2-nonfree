import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[BII)[B")
	public static byte[] method3182(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static604.method5910(arg0, arg1, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method3183() {
		if (Static493.aBoolean547) {
			return;
		}
		if (Static278.aClass3_Sub13_Sub1_1.lb) {
			Static527.aFloat183 = (int) Static527.aFloat183 - 17 & 0xFFFFFFF0;
		} else {
			Static4.aFloat1 += (-Static4.aFloat1 - 12.0F) / 2.0F;
		}
		Static493.aBoolean547 = true;
		Static350.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method3184(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub3_Sub7 local14 = Static363.method5457(arg0, 10);
		local14.method845();
	}
}

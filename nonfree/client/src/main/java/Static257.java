import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	public static int anInt5147 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	public static void method4354(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static84.aBoolean90 = arg0;
		Static469.aString73 = arg1;
		Static17.aString14 = arg2;
		if (!Static84.aBoolean90 && Static239.anInt4818 != 3 && (Static17.aString14.equals("") || Static469.aString73.equals(""))) {
			Static75.method1357(3);
			return;
		}
		if (Static239.anInt4818 != 1) {
			Static37.anInt891 = -1;
			Static148.anInt3092 = 0;
		}
		Static233.aBoolean269 = false;
		Static75.method1357(-3);
		Static276.anInt5394 = 0;
		Static418.anInt7412 = 0;
		Static118.anInt2542 = 1;
	}
}

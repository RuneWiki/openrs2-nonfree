import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "B")
	public static byte aByte110;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "[Lclient!hr;")
	public static final Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array7 = new Class1_Sub1_Sub6[14];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	public static void method7186(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		Static328.aString55 = arg2;
		Static308.aString52 = arg0;
		Static212.aBoolean290 = arg1;
		if (!Static212.aBoolean290 && Static438.anInt7729 != 3 && (Static328.aString55.equals("") || Static308.aString52.equals(""))) {
			Static375.method5758(3);
			return;
		}
		Static229.aBoolean316 = false;
		if (Static438.anInt7729 != 1) {
			Static5.anInt107 = 0;
			Static427.anInt7473 = -1;
		}
		Static375.method5758(-3);
		Static250.anInt4901 = 1;
		Static387.anInt7025 = 0;
		Static344.anInt6169 = 0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method7187(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(24) int local24 = arg1[local10 + arg2] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(42) char local42 = Static252.aCharArray27[local24 - 128];
					if (local42 == '\u0000') {
						local42 = '?';
					}
					local24 = local42;
				}
				local6[local8++] = (char) local24;
			}
		}
		return new String(local6, 0, local8);
	}
}

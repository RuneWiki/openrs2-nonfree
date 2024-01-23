import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "[Lclient!en;")
	public static Class50[] aClass50Array2;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	public static int anInt4778;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public static int anInt4769 = -1;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt4770 = 0;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString166 = "Loading fonts - ";

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "[I")
	public static int[] anIntArray356 = new int[100];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3590(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static266.aClass47_1);
		arg0.removeFocusListener(Static266.aClass47_1);
		Static51.anInt1122 = -1;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lclient!aj;I)Lclient!gk;")
	public static Class3_Sub1 method3592(@OriginalArg(0) Class8_Sub2 arg0) {
		return new Class3_Sub1(arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2323(), arg0.method2323(), arg0.method2334());
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3593(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local13 == 0) {
				local22 = Character.toLowerCase(local22);
			} else if (local13 == 2 || Character.isUpperCase(local22)) {
				local22 = Static63.method981(local22);
			}
			if (Character.isLetter(local22)) {
				local13 = 0;
			} else if (local22 == '.' || local22 == '?' || local22 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local22)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local22;
		}
		return new String(local11);
	}
}

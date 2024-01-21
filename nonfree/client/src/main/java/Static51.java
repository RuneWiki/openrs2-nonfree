import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_13;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!cd;")
	private static Class10 aClass10_561 = method932("Free world");

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!cd;")
	public static Class10 aClass10_560 = aClass10_561;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_562 = method932("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_563 = method932("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
	public static int[] anIntArray142 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "[I")
	public static int[] anIntArray143 = new int[2000];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!cd;")
	public static Class10 method932(@OriginalArg(0) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(14) int local14 = local2.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class10 local20 = new Class10();
		local20.aByteArray7 = new byte[local14];
		while (local14 > local16) {
			@Pc(32) int local32 = local2[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local16) {
					break;
				}
				@Pc(56) int local56 = local2[local16++] & 0xFF;
				local20.aByteArray7[local20.anInt513++] = (byte) (local56 + local32 * 43 - 1768);
			} else if (local32 != 0) {
				local20.aByteArray7[local20.anInt513++] = (byte) local32;
			}
		}
		local20.method356();
		return local20.method349();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method937(@OriginalArg(0) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	public static void method945() {
		aClass10_561 = null;
		anIntArray143 = null;
		aClass2_Sub1_Sub4_Sub2_13 = null;
		anIntArray142 = null;
		aClass10_563 = null;
		aClass10_562 = null;
		aClass10_560 = null;
	}
}

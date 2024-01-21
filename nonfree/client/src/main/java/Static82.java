import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "Lclient!eh;")
	private static Class28 aClass28_754 = Static170.method3101("Loaded interfaces");

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_753 = aClass28_754;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "Lclient!pa;")
	public static Class63 aClass63_14 = new Class63(5);

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt2391 = 0;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "Lclient!eh;")
	private static Class28 aClass28_757 = Static170.method3101("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!eh;")
	public static Class28 aClass28_755 = aClass28_757;

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "Lclient!eh;")
	public static Class28 aClass28_756 = Static170.method3101("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
	public static int anInt2401 = -1;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
	public static int anInt2402 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static void method1880() {
		Static95.anIntArray452 = null;
		Static173.anIntArray690 = null;
		Static55.anIntArray272 = null;
		Static83.anIntArray394 = null;
		Static59.anIntArray293 = null;
		Static59.aByteArrayArray41 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!hd;)V")
	public static void method1882(@OriginalArg(1) Class3_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static110.aClass19_3 != null) {
			@Pc(12) int local12;
			try {
				local12 = 0;
				Static110.aClass19_3.method754(0L);
				Static110.aClass19_3.method758(local8);
				while (local12 < 24 && local8[local12] == 0) {
					local12++;
				}
				if (local12 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local12 = 0; local12 < 24; local12++) {
					local8[local12] = -1;
				}
			}
		}
		arg0.method1512(local8, 24);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public static void method1883() {
		aClass28_753 = null;
		aClass28_755 = null;
		aClass28_756 = null;
		aClass63_14 = null;
		aClass28_754 = null;
		aClass28_757 = null;
	}
}

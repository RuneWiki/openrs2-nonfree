import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!l;")
	public static Interface8 anInterface8_21;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public static int anInt888;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt889;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "S")
	public static short aShort13 = 256;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method782() {
		for (@Pc(6) Class88_Sub5 local6 = (Class88_Sub5) Static381.aClass107_8.method2323(); local6 != null; local6 = (Class88_Sub5) Static381.aClass107_8.method2323()) {
			Static79.method1163(local6);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static216.aClass1_Sub1_1.method3587(Static146.anInt2644)) {
			local36 = 0;
			local35 = 3;
		} else {
			local35 = Static123.anInt2187;
			local36 = Static123.anInt2187;
		}
		Static55.method894();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static55.method893();
			Static55.method886(local45);
			Static55.method895(local45);
		}
		Static55.method880();
		Static55.method883();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method783() {
		@Pc(1) Class44 local1 = Static200.aClass44_32;
		synchronized (Static200.aClass44_32) {
			Static200.aClass44_32.method1025(5);
		}
		local1 = Static335.aClass44_55;
		synchronized (Static335.aClass44_55) {
			Static335.aClass44_55.method1025(5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method784() {
		Static18.anInt395 = 0;
		Static122.aClass177_13.method3614();
		Static272.aBoolean283 = false;
	}
}

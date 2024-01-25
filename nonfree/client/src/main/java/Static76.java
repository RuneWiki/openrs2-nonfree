import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "Lclient!ja;")
	public static Interface2 anInterface2_6;

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "Lclient!b;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "Lclient!nq;")
	public static Class144 aClass144_90;

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "Lclient!js;")
	public static final Class11_Sub25_Sub1 aClass11_Sub25_Sub1_4 = new Class11_Sub25_Sub1(5000);

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_96 = new Class117("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)V")
	public static void method4698() {
		@Pc(10) int local10 = Static33.method465();
		if (local10 == 0) {
			Static247.aByteArrayArrayArray9 = null;
			Static144.method2190(0);
		} else if (local10 == 1) {
			Static166.method2691((byte) 0);
			Static144.method2190(512);
			if (Static1.aByteArrayArrayArray1 != null) {
				Static272.method4442();
			}
		} else {
			Static166.method2691((byte) (Static347.anInt6633 - 4 & 0xFF));
			Static144.method2190(2);
		}
		Static257.anInt5200 = Static322.anInt6250;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Lclient!co;")
	public static Class11_Sub8 method4700() {
		if (Static271.aClass16_37 == null || Static33.aClass41_1 == null) {
			return null;
		}
		Static33.aClass41_1.method651(Static271.aClass16_37);
		@Pc(23) Class11_Sub8 local23 = (Class11_Sub8) Static33.aClass41_1.method655();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class23 local32 = Static212.method3827(local23.anInt863);
			return local32 != null && local32.aBoolean18 && local32.method250() ? local23 : Static49.method710();
		}
	}
}

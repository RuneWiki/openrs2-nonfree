import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "Lclient!sea;")
	public static Class308 aClass308_53;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
	public static int anInt2648;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!em;")
	public static final Class83 aClass83_57 = new Class83(97, 1);

	@OriginalMember(owner = "client!fca", name = "L", descriptor = "Lclient!sba;")
	public static Class306 aClass306_1 = new Class306(8);

	@OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
	public static int anInt2655 = -1;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(Z)Z")
	public static boolean method2324() {
		@Pc(7) boolean local7 = true;
		if (Static449.aClass282_3 == null) {
			if (Static121.aClass308_48.method6538(Static186.anInt3684)) {
				Static449.aClass282_3 = Static604.method6022(Static121.aClass308_48, Static186.anInt3684);
			} else {
				local7 = false;
			}
		}
		if (Static303.aClass282_1 == null) {
			if (Static121.aClass308_48.method6538(Static547.anInt9146)) {
				Static303.aClass282_1 = Static604.method6022(Static121.aClass308_48, Static547.anInt9146);
			} else {
				local7 = false;
			}
		}
		if (Static444.aClass282_4 == null) {
			if (Static121.aClass308_48.method6538(Static298.anInt5493)) {
				Static444.aClass282_4 = Static604.method6022(Static121.aClass308_48, Static298.anInt5493);
			} else {
				local7 = false;
			}
		}
		if (Static286.aClass352_17 == null) {
			if (Static77.aClass308_183.method6538(Static400.anInt7182)) {
				Static286.aClass352_17 = Static342.method5100(Static400.anInt7182, Static77.aClass308_183);
			} else {
				local7 = false;
			}
		}
		if (Static457.aClass282Array1 == null) {
			if (Static121.aClass308_48.method6538(Static400.anInt7182)) {
				Static457.aClass282Array1 = Static604.method6024(Static121.aClass308_48, Static400.anInt7182);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lclient!km;")
	public static Class43 method2325(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class43_Sub1(arg0, 7500);
	}
}

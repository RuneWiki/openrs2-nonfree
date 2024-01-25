import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
	public static int anInt8748;

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "Lclient!km;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_12 = new Class295(0, 8);

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "Lclient!em;")
	public static final Class83 aClass83_185 = new Class83(33, 6);

	@OriginalMember(owner = "client!tfa", name = "k", descriptor = "S")
	public static short aShort108 = 205;

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
	public static int anInt8747 = 0;

	@OriginalMember(owner = "client!tfa", name = "o", descriptor = "[Lclient!li;")
	public static final Class1_Sub33[] aClass1_Sub33Array1 = new Class1_Sub33[1024];

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	public static void method7054(@OriginalArg(1) int arg0) {
		if (Static133.anInt2648 == 1) {
			Static548.anInt9157 = arg0;
		} else if (Static133.anInt2648 == 2 || Static133.anInt2648 == 3) {
			Static591.anInt9713 = arg0;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7055(@OriginalArg(0) String arg0) {
		if (!Static500.aClass198_4.aBoolean401) {
			return -1;
		} else if (Static122.aHashtable3.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static180.method7716(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(41) String local41 = Static461.aString90 + local20;
			if (!Static102.aClass308_40.method6536(local41, "")) {
				return -1;
			} else if (Static102.aClass308_40.method6540(local41)) {
				@Pc(65) byte[] local65 = Static102.aClass308_40.method6557("", local41);
				@Pc(71) File local71;
				try {
					local71 = Static212.method3209(local20);
				} catch (@Pc(73) RuntimeException local73) {
					return -1;
				}
				if (local65 == null || local71 == null) {
					return -1;
				}
				@Pc(81) boolean local81 = true;
				@Pc(85) byte[] local85 = Static250.method3664(local71);
				if (local85 != null && local65.length == local85.length) {
					for (@Pc(102) int local102 = 0; local102 < local85.length; local102++) {
						if (local85[local102] != local65[local102]) {
							local81 = false;
							break;
						}
					}
				} else {
					local81 = false;
				}
				try {
					if (!local81) {
						Static500.aClass198_4.method4294(local71, local65);
					}
				} catch (@Pc(134) Throwable local134) {
					return -1;
				}
				Static190.method5363(local71, arg0);
				return 100;
			} else {
				return Static102.aClass308_40.method6553(local41);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
	public static void method7056() {
		if (Static276.anInt5043 <= 0) {
			Static366.aString75 = "";
			return;
		}
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < Static425.aStringArray26.length; local8++) {
			if (Static425.aStringArray26[local8].indexOf("--> ") != -1) {
				local6++;
				if (local6 == Static276.anInt5043) {
					Static366.aString75 = Static425.aStringArray26[local8].substring(Static425.aStringArray26[local8].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	public static void method7058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg1, 5);
		local10.method4833();
		local10.anInt5968 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_63 = new Class269(84, -1);

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_104 = new Class274(89, 10);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!eq;I)V")
	public static void method5550(@OriginalArg(0) Class97 arg0) {
		Static142.anInt3153 = arg0.method2574("hitmarks");
		Static628.anInt10133 = arg0.method2574("hitbar_default");
		Static166.anInt3700 = arg0.method2574("timerbar_default");
		Static109.anInt2153 = arg0.method2574("headicons_pk");
		Static196.anInt4206 = arg0.method2574("headicons_prayer");
		Static505.anInt8506 = arg0.method2574("hint_headicons");
		Static295.anInt5539 = arg0.method2574("hint_mapmarkers");
		Static244.anInt4843 = arg0.method2574("mapflag");
		Static625.anInt10104 = arg0.method2574("cross");
		Static542.anInt9035 = arg0.method2574("mapdots");
		Static75.anInt1665 = arg0.method2574("scrollbar");
		Static633.anInt10164 = arg0.method2574("name_icons");
		Static614.anInt9988 = arg0.method2574("floorshadows");
		Static75.anInt1673 = arg0.method2574("compass");
		Static71.anInt1571 = arg0.method2574("otherlevel");
		Static208.anInt4360 = arg0.method2574("hint_mapedge");
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
	public static void method5552(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static440.aClass217ArrayArrayArray3 = Static204.aClass217ArrayArrayArray2;
			Static331.aClass112Array3 = Static164.aClass112Array1;
		} else {
			Static440.aClass217ArrayArrayArray3 = Static142.aClass217ArrayArrayArray1;
			Static331.aClass112Array3 = Static178.aClass112Array2;
		}
		Static330.anInt4381 = Static440.aClass217ArrayArrayArray3.length;
	}
}

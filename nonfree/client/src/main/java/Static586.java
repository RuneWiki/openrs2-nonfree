import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_94 = new Class305(32, -1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8060(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static478.aStringArray48.length; local15++) {
			if (Static478.aStringArray48[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	public static void method8062(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static330.aClass5_Sub3_Sub16_2 != null) {
			Static11.anInt201 = Static330.aClass5_Sub3_Sub16_2.anInt8383;
		} else {
			Static11.anInt201 = -1;
		}
		Static500.anInt8324 = 0;
		Static38.aClass114_4 = null;
		Static330.aClass5_Sub3_Sub16_2 = null;
		Static378.aClass345_9 = null;
		Static330.method675();
		Static330.aClass114_6.method2808();
		Static293.anInt5675 = -1;
		Static255.aClass127_4 = null;
		Static161.aClass50_25 = null;
		Static593.aClass127_9 = null;
		Static596.anInt3354 = -1;
		Static614.aClass127_12 = null;
		Static449.aClass127_8 = null;
		Static330.aClass116_2 = null;
		Static418.aClass127_7 = null;
		Static1.aClass127_11 = null;
		Static32.aClass127_2 = null;
		Static603.aClass127_10 = null;
		if (Static330.aClass93_3 != null) {
			Static330.aClass93_3.method2281();
			Static330.aClass93_3.method2279(128, 64);
		}
		if (Static330.aClass365_2 != null) {
			Static330.aClass365_2.method8480(64, 64);
		}
		if (Static330.aClass315_2 != null) {
			Static330.aClass315_2.method7506(64);
		}
		Static545.aClass171_1.method4157(64);
	}
}

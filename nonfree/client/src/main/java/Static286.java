import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kp", name = "eb", descriptor = "[I")
	public static final int[] anIntArray351 = new int[1];

	@OriginalMember(owner = "client!kp", name = "fb", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_138 = new Class363(22, 8);

	@OriginalMember(owner = "client!kp", name = "Yc", descriptor = "Lclient!rca;")
	public static final Class280 aClass280_3 = new Class280();

	@OriginalMember(owner = "client!kp", name = "id", descriptor = "[Lclient!oda;")
	public static final Class239[] aClass239Array1 = new Class239[6];

	@OriginalMember(owner = "client!kp", name = "ld", descriptor = "Ljava/lang/String;")
	public static String aString44 = "";

	@OriginalMember(owner = "client!kp", name = "pd", descriptor = "I")
	public static int anInt5169 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)V")
	public static void method4237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static521.aByteArrayArrayArray45 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public static void method4247() {
		Static77.aStringArray189 = new String[500];
		Static539.anInt8821 = Static355.aClass294_8.anInt8124 + Static355.aClass294_8.anInt8114 + 2;
		Static124.anInt2403 = Static83.aClass294_6.anInt8124 + Static83.aClass294_6.anInt8114 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static77.aStringArray189.length; local26++) {
			Static77.aStringArray189[local26] = "";
		}
		Static212.method3438(Static290.aClass198_3.method4365(Static52.anInt1264));
	}
}

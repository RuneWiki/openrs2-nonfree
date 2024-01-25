import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[Lclient!lq;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!ij;")
	public static Class93 aClass93_64;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_75 = new Class85("glow3:", "", "", "");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "S")
	public static short aShort26 = 320;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString20 = "";

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public static int anInt3233 = 0;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public static int anInt3234 = 0;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt3237 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIZILclient!ij;)V")
	public static void method2867(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) Class93 arg2) {
		Static56.aClass93_22 = arg2;
		Static297.anInt5809 = arg0;
		Static249.aBoolean518 = false;
		Static250.anInt4969 = 1;
		Static5.anInt95 = 2;
		Static115.anInt2139 = 0;
		Static51.anInt966 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method2869(@OriginalArg(1) Class55 arg0) {
		if (Static101.anInt1914 != Static239.anInt4811 && (Static178.aClass174ArrayArrayArray3 != null && Static177.method3176(Static239.anInt4811, arg0))) {
			Static101.anInt1914 = Static239.anInt4811;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method2870() {
		Static185.aClass10_1.method3939();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static343.aLongArray8[local8] = 0L;
		}
		for (@Pc(23) int local23 = 0; local23 < 32; local23++) {
			Static131.aLongArray2[local23] = 0L;
		}
		Static88.anInt1650 = 0;
	}
}

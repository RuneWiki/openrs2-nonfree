import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public static int anInt7584 = 0;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[8];

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
	public static int[] anIntArray515 = new int[2];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6590(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg0.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local13 += local17;
				local24++;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local13);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local48.append(arg1);
			local50 = local55 + 1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!bt;)V")
	public static void method6593(@OriginalArg(1) Class34 arg0) {
		Static625.anInt9801 = arg0.method1252("p11_full");
		Static371.anInt5580 = arg0.method1252("p12_full");
		Static138.anInt2559 = arg0.method1252("b12_full");
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lclient!bj;")
	public static Class4_Sub5_Sub3 method6594() {
		return Static154.aClass4_Sub5_Sub3_2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZBIZI)V")
	public static void method6597(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static91.method1803(0, Static382.aClass22_Sub1Array1.length - 1, arg3, arg2, arg1, arg0);
		Static72.aClass4_Sub14_1 = null;
		Static614.anInt9420 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
	public static boolean method6598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}

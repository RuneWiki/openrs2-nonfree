import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_28;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!vc;")
	public static Class98 aClass98_3;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_215 = Static81.method1507(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_217 = Static81.method1507("::autoshadow off");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[[II)V")
	public static void method625(@OriginalArg(3) int[][][] arg0) {
		Static143.anInt3201 = 4;
		Static60.anInt3602 = 104;
		Static18.anInt3874 = 104;
		Static29.aClass1_Sub8ArrayArrayArray1 = new Class1_Sub8[4][104][104];
		Static148.anIntArrayArrayArray9 = new int[4][105][105];
		Static181.anIntArrayArrayArray10 = arg0;
		Static172.method2978();
		Static54.anInt3872 = 25;
		Static142.aBooleanArrayArray1 = new boolean[Static54.anInt3872 + Static54.anInt3872 + 1][Static54.anInt3872 + Static54.anInt3872 + 1];
		Static178.aBooleanArrayArray2 = new boolean[Static54.anInt3872 + Static54.anInt3872 + 2][Static54.anInt3872 + Static54.anInt3872 + 2];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)Lclient!dj;")
	public static Class24 method626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return Static198.aClass24_1269;
		} else if (local3 < -6) {
			return Static91.aClass24_629;
		} else if (local3 < -3) {
			return Static190.aClass24_1220;
		} else if (local3 < 0) {
			return Static10.aClass24_406;
		} else if (local3 > 9) {
			return Static158.aClass24_1020;
		} else if (local3 > 6) {
			return Static208.aClass24_1309;
		} else if (local3 > 3) {
			return Static82.aClass24_586;
		} else if (local3 > 0) {
			return Static53.aClass24_373;
		} else {
			return Static27.aClass24_189;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method627(@OriginalArg(1) Class69 arg0) {
		Static92.aClass69_22 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public static void method629() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static156.anInt3437 - 1; local18++) {
				if (Static98.aShortArray28[local18] < 1000 && Static98.aShortArray28[local18 + 1] > 1000) {
					@Pc(40) Class24 local40 = Static66.aClass24Array11[local18];
					Static66.aClass24Array11[local18] = Static66.aClass24Array11[local18 + 1];
					local12 = false;
					Static66.aClass24Array11[local18 + 1] = local40;
					@Pc(60) Class24 local60 = Static27.aClass24Array4[local18];
					Static27.aClass24Array4[local18] = Static27.aClass24Array4[local18 + 1];
					Static27.aClass24Array4[local18 + 1] = local60;
					@Pc(78) int local78 = Static210.anIntArray412[local18];
					Static210.anIntArray412[local18] = Static210.anIntArray412[local18 + 1];
					Static210.anIntArray412[local18 + 1] = local78;
					@Pc(96) int local96 = Static17.anIntArray38[local18];
					Static17.anIntArray38[local18] = Static17.anIntArray38[local18 + 1];
					Static17.anIntArray38[local18 + 1] = local96;
					@Pc(114) short local114 = Static98.aShortArray28[local18];
					Static98.aShortArray28[local18] = Static98.aShortArray28[local18 + 1];
					Static98.aShortArray28[local18 + 1] = local114;
					@Pc(132) long local132 = Static197.aLongArray36[local18];
					Static197.aLongArray36[local18] = Static197.aLongArray36[local18 + 1];
					Static197.aLongArray36[local18 + 1] = local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dj;B)Z")
	public static boolean method630(@OriginalArg(0) Class24 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static34.anInt921; local14++) {
			if (arg0.method771(Static137.aClass24Array19[local14])) {
				return true;
			}
		}
		return false;
	}
}

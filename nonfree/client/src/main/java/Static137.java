import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!of", name = "V", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
	public static int anInt3098;

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	public static int anInt3092 = -1;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_919 = Static81.method1507("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!of", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_920 = Static81.method1507("settings");

	@OriginalMember(owner = "client!of", name = "X", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array19 = new Class24[100];

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_921 = Static81.method1507("red:");

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_922 = aClass24_921;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_923 = aClass24_919;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Lclient!dj;")
	public static Class24 aClass24_924 = aClass24_921;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
	public static int anInt3101 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	public static void method2407() {
		for (@Pc(3) int local3 = -1; local3 < Static82.anInt1956; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static41.anIntArray115[local3];
			}
			@Pc(21) Class5_Sub2_Sub1 local21 = Static110.aClass5_Sub2_Sub1Array1[local13];
			if (local21 != null && local21.anInt2483 > 0) {
				local21.anInt2483--;
				if (local21.anInt2483 == 0) {
					local21.aClass24_736 = null;
				}
			}
		}
		for (@Pc(59) int local59 = 0; local59 < Static138.anInt3107; local59++) {
			@Pc(65) int local65 = Static138.anIntArray254[local59];
			@Pc(69) Class5_Sub2_Sub2 local69 = Static148.aClass5_Sub2_Sub2Array1[local65];
			if (local69 != null && local69.anInt2483 > 0) {
				local69.anInt2483--;
				if (local69.anInt2483 == 0) {
					local69.aClass24_736 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public static void method2408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static176.aClass1_Sub7_Sub1_34.method2808(32);
		Static176.aClass1_Sub7_Sub1_34.method2787(arg0);
		Static176.aClass1_Sub7_Sub1_34.method2758(arg1);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	public static void method2410() {
		@Pc(12) int local12 = Static2.anInt111 - (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
		@Pc(21) int local21 = (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11) + Static2.anInt111;
		@Pc(31) int local31 = Static3.anInt118 - (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		@Pc(40) int local40 = Static3.anInt118 + (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		if (local12 < 0) {
			Static2.anInt111 = (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
			Static49.anInt1247 = -1;
			Static70.anInt3208 = -1;
		}
		if (Static146.anInt3124 < local21) {
			Static49.anInt1247 = -1;
			Static2.anInt111 = Static146.anInt3124 - (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
			Static70.anInt3208 = -1;
		}
		if (local31 < 0) {
			Static49.anInt1247 = -1;
			Static70.anInt3208 = -1;
			Static3.anInt118 = (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		}
		if (local40 > Static189.anInt4212) {
			Static70.anInt3208 = -1;
			Static49.anInt1247 = -1;
			Static3.anInt118 = Static189.anInt4212 - (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		}
	}
}

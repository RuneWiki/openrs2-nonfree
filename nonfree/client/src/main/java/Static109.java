import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Lclient!wd;")
	public static Class82 aClass82_10;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1305 = Static59.method1195("Enter name of player to delete from list");

	@OriginalMember(owner = "client!se", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1304 = aClass60_1305;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "I")
	public static int anInt3080 = 0;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	public static int anInt3083 = 0;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray65 = new boolean[112];

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1306 = Static59.method1195("mapfunction");

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
	public static int anInt3095 = 0;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	public static void method2053(@OriginalArg(0) int arg0) {
		if (!Static21.method563(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub15[] local14 = Static120.aClass3_Sub15ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local14.length; local24++) {
			@Pc(30) Class3_Sub15 local30 = local14[local24];
			if (local30 != null) {
				local30.anInt2263 = 0;
				local30.anInt2277 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Lclient!nf;")
	public static Class3_Sub1_Sub14 method2054(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub14 local15 = (Class3_Sub1_Sub14) Static114.aClass17_52.method643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static59.aClass25_15.method931(arg0, 12);
		local15 = new Class3_Sub1_Sub14();
		if (local25 != null) {
			local15.method1599(new Class3_Sub12(local25));
		}
		local15.method1593();
		Static114.aClass17_52.method644((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)Lclient!qf;")
	public static Class60 method2055(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static65.method1341(arg0) : Static10.aClass60_138;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public static void method2056() {
		@Pc(19) int local19;
		for (@Pc(11) int local11 = -1; local11 < Static53.anInt1744; local11++) {
			if (local11 == -1) {
				local19 = 2047;
			} else {
				local19 = Static14.anIntArray56[local11];
			}
			@Pc(29) Class3_Sub1_Sub1_Sub3_Sub1 local29 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local19];
			if (local29 != null && local29.anInt1527 > 0) {
				local29.anInt1527--;
				if (local29.anInt1527 == 0) {
					local29.aClass60_656 = null;
				}
			}
		}
		for (local19 = 0; local19 < Static20.anInt829; local19++) {
			@Pc(61) int local61 = Static128.anIntArray390[local19];
			@Pc(65) Class3_Sub1_Sub1_Sub3_Sub2 local65 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local61];
			if (local65 != null && local65.anInt1527 > 0) {
				local65.anInt1527--;
				if (local65.anInt1527 == 0) {
					local65.aClass60_656 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method2057() {
		aClass82_10 = null;
		aBooleanArray65 = null;
		aClass60_1305 = null;
		aClass60_1306 = null;
		aClass60_1304 = null;
	}
}

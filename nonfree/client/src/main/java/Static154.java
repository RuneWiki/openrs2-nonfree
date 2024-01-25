import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Ljava/lang/String;")
	public static final String aString120 = "white:";

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[S")
	public static final short[] aShortArray44 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public static void method2923() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static138.aBooleanArray9[local11] = false;
		}
		Static311.anInt5990 = Static5.anInt99;
		Static347.anInt4344 = Static194.anInt3958;
		Static81.anInt1609 = 5;
		Static32.anInt788 = Static107.anInt2183;
		Static112.anInt4021 = -1;
		Static57.anInt1266 = Static164.anInt3425;
		Static304.anInt5854 = -1;
		Static182.anInt3766 = Static221.anInt4363;
		Static17.anInt380 = 0;
		Static116.anInt2307 = Static215.anInt4246;
		Static147.anInt2898 = 0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method2924(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg2; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local34);
			for (@Pc(73) int local73 = arg2; local73 < local32; local73++) {
				@Pc(79) String local79 = arg0[local73];
				if (local79 == null) {
					local65.append("null");
				} else {
					local65.append(local79);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method2925() {
		Static248.aClass1_Sub7_Sub1_2.method728(241);
		Static248.aClass1_Sub7_Sub1_2.method3108(Static295.method5063());
		Static248.aClass1_Sub7_Sub1_2.method3128(Static11.anInt5389);
		Static248.aClass1_Sub7_Sub1_2.method3128(Static320.anInt6140);
		Static248.aClass1_Sub7_Sub1_2.method3108(Static123.anInt2389);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)Z")
	public static boolean method2926() {
		@Pc(8) Class1_Sub41 local8 = (Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248;
		if (local8 == null || Static175.aClass195_36.aClass1_207 == local8) {
			return false;
		} else {
			if (local8.anInt6339 >= 2000) {
				local8.anInt6339 -= 2000;
			}
			return local8.anInt6339 == 1001;
		}
	}
}

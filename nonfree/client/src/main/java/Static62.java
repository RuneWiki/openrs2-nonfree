import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!df;")
	public static Class16 aClass16_47;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!qf;")
	private static Class60 aClass60_855 = Static59.method1195("Connection timed out)3");

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_856 = Static59.method1195("Loading )2 please wait)3");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_857 = aClass60_856;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_858 = Static59.method1195("Welcome to RuneScape");

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_859 = Static59.method1195("redstone1");

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_860 = Static59.method1195("runes");

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_861 = aClass60_858;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!qf;")
	private static Class60 aClass60_866 = Static59.method1195("yellow:");

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_862 = aClass60_866;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_863 = aClass60_866;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_864 = aClass60_855;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_865 = Static59.method1195("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] method1252() {
		@Pc(8) Class3_Sub1_Sub2_Sub3[] local8 = new Class3_Sub1_Sub2_Sub3[Static119.anInt3239];
		for (@Pc(10) int local10 = 0; local10 < Static119.anInt3239; local10++) {
			@Pc(20) Class3_Sub1_Sub2_Sub3 local20 = local8[local10] = new Class3_Sub1_Sub2_Sub3();
			local20.anInt2192 = Static111.anInt3100;
			local20.anInt2190 = Static81.anInt2533;
			local20.anInt2189 = Static97.anIntArray302[local10];
			local20.anInt2188 = Static32.anIntArray133[local10];
			local20.anInt2187 = Static15.anIntArray74[local10];
			local20.anInt2191 = Static33.anIntArray138[local10];
			@Pc(50) byte[] local50 = Static2.aByteArrayArray3[local10];
			@Pc(56) int local56 = local20.anInt2187 * local20.anInt2191;
			local20.anIntArray222 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray222[local62] = Static123.anIntArray378[local50[local62] & 0xFF];
			}
		}
		Static60.method1206();
		return local8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class60 method1254(@OriginalArg(1) int arg0) {
		return Static60.method1211(new Class60[] { Static65.method1341(arg0 >> 24 & 0xFF), Static23.aClass60_1126, Static65.method1341(arg0 >> 16 & 0xFF), Static23.aClass60_1126, Static65.method1341(arg0 >> 8 & 0xFF), Static23.aClass60_1126, Static65.method1341(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1255() {
		aClass60_864 = null;
		aClass60_865 = null;
		aClass60_858 = null;
		aClass3_Sub1_Sub2_Sub3_2 = null;
		aClass60_863 = null;
		aClass16_47 = null;
		aClass60_857 = null;
		aClass60_866 = null;
		aClass60_860 = null;
		aClass3_Sub1_Sub2_Sub4_4 = null;
		aClass60_856 = null;
		aClass60_861 = null;
		aClass60_859 = null;
		aClass60_855 = null;
		aClass60_862 = null;
	}
}

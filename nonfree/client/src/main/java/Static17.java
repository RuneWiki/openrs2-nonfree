import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aja", name = "M", descriptor = "I")
	public static int anInt229;

	@OriginalMember(owner = "client!aja", name = "L", descriptor = "[[Lclient!mj;")
	public static Class238[][] aClass238ArrayArray1;

	@OriginalMember(owner = "client!aja", name = "Z", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!aja", name = "Y", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_4 = new Class156(45, 12);

	@OriginalMember(owner = "client!aja", name = "U", descriptor = "I")
	public static final int anInt234 = 50;

	@OriginalMember(owner = "client!aja", name = "G", descriptor = "[I")
	public static final int[] anIntArray21 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "bb", descriptor = "[I")
	public static final int[] anIntArray22 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "R", descriptor = "F")
	public static float aFloat14 = 1.0F;

	@OriginalMember(owner = "client!aja", name = "O", descriptor = "[I")
	public static final int[] anIntArray23 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "X", descriptor = "[I")
	public static final int[] anIntArray24 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "P", descriptor = "[I")
	public static final int[] anIntArray25 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "W", descriptor = "[I")
	public static final int[] anIntArray26 = new int[anInt234];

	@OriginalMember(owner = "client!aja", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[anInt234];

	@OriginalMember(owner = "client!aja", name = "S", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_2 = new Class306(16);

	@OriginalMember(owner = "client!aja", name = "H", descriptor = "[I")
	public static final int[] anIntArray27 = new int[5];

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method268(@OriginalArg(0) String arg0) {
		@Pc(6) Class5_Sub41 local6 = Static338.method5082();
		local6.aClass5_Sub36_Sub2_1.method7324(Static115.aClass157_11.anInt3847);
		local6.aClass5_Sub36_Sub2_1.method7296(0);
		@Pc(21) int local21 = local6.aClass5_Sub36_Sub2_1.anInt8456;
		local6.aClass5_Sub36_Sub2_1.method7296(656);
		@Pc(32) int[] local32 = Static194.method8973(90, local6);
		@Pc(36) int local36 = local6.aClass5_Sub36_Sub2_1.anInt8456;
		local6.aClass5_Sub36_Sub2_1.method7327(arg0);
		local6.aClass5_Sub36_Sub2_1.method7324(Static375.anInt7800);
		local6.aClass5_Sub36_Sub2_1.anInt8456 += 7;
		local6.aClass5_Sub36_Sub2_1.method7325(local32, local36, local6.aClass5_Sub36_Sub2_1.anInt8456);
		local6.aClass5_Sub36_Sub2_1.method7308(local6.aClass5_Sub36_Sub2_1.anInt8456 - local21);
		Static4.aClass389_16.method9079(local6);
		Static405.anInt10910 = 0;
		Static659.anInt10733 = 0;
		Static78.anInt1382 = 1;
		Static447.anInt7320 = -3;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(BII)Z")
	public static boolean method270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(22) Class354 local22 = Static528.aClass243_3.method5556(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local22.method8028(arg0);
	}
}

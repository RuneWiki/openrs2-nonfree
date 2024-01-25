import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aja", name = "o", descriptor = "Lclient!k;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!aja", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!aja", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!aja", name = "l", descriptor = "Lclient!qt;")
	public static final Class294 aClass294_1 = new Class294();

	@OriginalMember(owner = "client!aja", name = "p", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
	public static int anInt423 = 0;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZIII)V")
	public static void method446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == Static129.anInt6333 && Static4.anInt33 == arg0 && arg2 == Static363.anInt6417) {
			return;
		}
		Static4.anInt33 = arg0;
		Static363.anInt6417 = arg2;
		Static367.aBoolean541 = true;
		Static129.anInt6333 = arg1;
		@Pc(39) double local39 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static488.aDouble24 = local52;
		Static115.aDouble2 = local58;
		Static548.aDouble32 = local61;
		Static475.aDouble31 = 0.0D;
		Static102.aDouble1 = local58 * local52;
		Static514.aDouble29 = local55;
		Static543.aDouble35 = local58 * -local55;
		Static272.aDouble16 = local55 * local61;
		Static570.aDouble33 = local61 * -local52;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V")
	public static void method449() {
		if (Static469.anInt7883 == 7) {
			Static268.method4076(false);
		} else {
			Static196.aClass30_1 = Static487.aClass30_2;
			Static487.aClass30_2 = null;
			Static214.method3254(13);
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLclient!vfa;Lclient!vfa;)V")
	public static void method450(@OriginalArg(1) Class357 arg0, @OriginalArg(2) Class357 arg1) {
		@Pc(12) Class5_Sub40 local12 = Static25.method507(Static98.aClass208_2, Static231.aClass181_35);
		local12.aClass5_Sub12_Sub2_2.method8622(arg0.anInt9804);
		local12.aClass5_Sub12_Sub2_2.method8604(arg0.anInt9871);
		local12.aClass5_Sub12_Sub2_2.method8622(arg1.anInt9804);
		local12.aClass5_Sub12_Sub2_2.method8605(arg0.anInt9846);
		local12.aClass5_Sub12_Sub2_2.method8605(arg1.anInt9846);
		local12.aClass5_Sub12_Sub2_2.method8605(arg1.anInt9871);
		Static612.method8496(local12);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Lclient!vg;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Lclient!rl;")
	public static Class256 aClass256_6;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	public static int anInt5878;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "F")
	public static float aFloat253;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_85 = new Class40("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_139 = new Class150(53, 8);

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_41 = new Class288(50);

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_140 = new Class150(18, 7);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4880(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static86.method1503(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static59.anInt1208; local30++) {
			@Pc(36) String local36 = Static23.aStringArray7[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static86.method1503(local36);
			if (local36 != null && local36.equals(local25)) {
				Static59.anInt1208--;
				for (@Pc(60) int local60 = local30; local60 < Static59.anInt1208; local60++) {
					Static23.aStringArray7[local60] = Static23.aStringArray7[local60 + 1];
					Static386.aStringArray18[local60] = Static386.aStringArray18[local60 + 1];
					Static361.anIntArray507[local60] = Static361.anIntArray507[local60 + 1];
					Static506.aStringArray37[local60] = Static506.aStringArray37[local60 + 1];
					Static534.anIntArray686[local60] = Static534.anIntArray686[local60 + 1];
					Static506.aBooleanArray36[local60] = Static506.aBooleanArray36[local60 + 1];
				}
				Static49.anInt1093 = Static356.anInt6716;
				Static415.method5995(Static83.aClass236_9);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg0));
				Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
				return;
			}
		}
	}
}

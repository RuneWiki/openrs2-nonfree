import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Lclient!kea;")
	public static Class161 aClass161_90;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public static int anInt7395;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public static int anInt7396;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public static int anInt7398;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray34 = new boolean[5];

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_49 = new Class125(8);

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "[Lclient!pb;")
	public static final Class113_Sub1[] aClass113_Sub1Array2 = new Class113_Sub1[32];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6094(@OriginalArg(0) Class5 arg0) {
		if (Static346.aBoolean416) {
			Static256.method4357(arg0);
		} else {
			Static357.method5610(arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!qf;B)V")
	public static void method6095(@OriginalArg(0) Class245 arg0) {
		if (Static340.anInt6419 != arg0.anInt7273) {
			return;
		}
		if (Static111.aClass6_Sub1_Sub2_Sub1_3.aString27 == null) {
			arg0.anInt7299 = 0;
			arg0.anInt7244 = 0;
			return;
		}
		arg0.anInt7282 = 150;
		arg0.anInt7258 = (int) (Math.sin((double) Static223.anInt4829 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7254 = 5;
		arg0.anInt7244 = Static342.anInt6448;
		arg0.anInt7299 = Static239.method4180(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27);
		arg0.anInt7291 = 0;
		arg0.anInt7250 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8551;
		arg0.anInt7245 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8534;
		arg0.anInt7233 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8556;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
	public static void method6097() {
		if (Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091) || Static420.anInt7829 == Static445.anInt8174) {
			Static307.method4067(Static121.aClass5_7);
			if (Static420.anInt7829 != Static41.anInt1006) {
				Static444.method6747();
			}
		} else {
			Static49.method1038(Static34.anInt888, Static429.anInt7899, 10, false);
		}
	}
}

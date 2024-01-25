import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!t;")
	public static Class227 aClass227_3;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_109 = new Class267("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ts;I)V")
	public static void method6409(@OriginalArg(0) Class239 arg0) {
		if (arg0.anInt6911 != Static404.anInt7256) {
			return;
		}
		if (Static302.aClass3_Sub2_Sub1_Sub2_2.aString54 == null) {
			arg0.anInt6930 = 0;
			arg0.anInt6910 = 0;
			return;
		}
		arg0.anInt6885 = 150;
		arg0.anInt6935 = (int) (Math.sin((double) Static66.anInt1741 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6910 = Static4.anInt7923;
		arg0.anInt6886 = 5;
		arg0.anInt6930 = Static38.method943(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54);
		arg0.anInt6929 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6576;
		arg0.anInt6924 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6597;
		arg0.anInt6932 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6594;
		arg0.anInt6934 = 0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!md;I)V")
	public static void method6411(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub1 arg1) {
		Static210.aBoolean260 = false;
		Static438.anInt7768 = 0;
		Static118.method2053(arg1);
		Static296.method4392(arg1);
		if (Static210.aBoolean260) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt7898) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7898 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I")
	public static int method6419(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

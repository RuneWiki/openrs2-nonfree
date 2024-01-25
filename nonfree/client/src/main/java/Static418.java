import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static418 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_107 = new Class306("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public static int anInt7355 = -1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLclient!jq;)V")
	public static void method6141(@OriginalArg(1) Class156 arg0) {
		if (arg0.anInt4729 != Static37.anInt823) {
			return;
		}
		if (Static63.aClass49_Sub2_Sub2_Sub1_1.aString16 == null) {
			arg0.anInt4660 = 0;
			arg0.anInt4657 = 0;
			return;
		}
		arg0.anInt4733 = 150;
		arg0.anInt4716 = (int) (Math.sin((double) Static436.anInt6850 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4718 = 5;
		arg0.anInt4657 = Static198.anInt3873;
		arg0.anInt4660 = Static305.method4808(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16);
		arg0.anInt4680 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt4305;
		arg0.anInt4670 = 0;
		arg0.anInt4652 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt4286;
		arg0.anInt4693 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt4282;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)I")
	public static int method6144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static498.anIntArray763[arg0 & 0x3] : 256;
	}
}

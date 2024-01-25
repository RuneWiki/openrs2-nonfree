import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
	public static int anInt3979;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public static int anInt3972 = 0;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "Lclient!s;")
	public static final Class217 aClass217_88 = new Class217(19, -2);

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "Lclient!os;")
	public static final Class182 aClass182_135 = new Class182("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lclient!md;")
	public static Class10_Sub1_Sub11 method3150(@OriginalArg(1) int arg0) {
		@Pc(10) Class10_Sub1_Sub11 local10 = (Class10_Sub1_Sub11) Static99.aClass52_1.method1350((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static157.aClass187_63.method4300(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static363.method4870(local25);
			Static99.aClass52_1.method1347((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	public static int method3156() {
		return 16;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	public static void method3157() {
		@Pc(1) Class267 local1 = Static412.aClass267_77;
		synchronized (Static412.aClass267_77) {
			Static412.aClass267_77.method6007(5);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ig;II)V")
	public static void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) Class24_Sub3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt6211 == arg0 && arg0 != -1) {
			@Pc(88) Class137 local88 = Static281.aClass98_3.method2405(arg0);
			@Pc(91) int local91 = local88.anInt4039;
			if (local91 == 1) {
				arg1.anInt6250 = arg2;
				arg1.anInt6271 = 1;
				arg1.anInt6264 = 0;
				arg1.anInt6222 = 0;
				arg1.anInt6231 = 0;
				Static302.method4200(local88, arg1.anInt7092, arg1.anInt7094, arg1.aByte98, arg1.anInt6231, false);
			}
			if (local91 == 2) {
				arg1.anInt6264 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt6211 == -1 || Static281.aClass98_3.method2405(arg0).anInt4040 >= Static281.aClass98_3.method2405(arg1.anInt6211).anInt4040) {
			arg1.anInt6264 = 0;
			arg1.anInt6231 = 0;
			arg1.anInt6222 = 0;
			arg1.anInt6250 = arg2;
			arg1.anInt6291 = arg1.anInt6288;
			arg1.anInt6271 = 1;
			arg1.anInt6211 = arg0;
			if (arg1.anInt6211 != -1) {
				Static302.method4200(Static281.aClass98_3.method2405(arg1.anInt6211), arg1.anInt7092, arg1.anInt7094, arg1.aByte98, arg1.anInt6231, false);
				return;
			}
		} else {
			return;
		}
	}
}

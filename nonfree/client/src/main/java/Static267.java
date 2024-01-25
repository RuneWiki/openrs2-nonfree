import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Lclient!ci;")
	public static Class38 aClass38_55;

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public static int anInt5069;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "[Lclient!o;")
	public static Class14[] aClass14Array2;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_101 = new Class266(9, 0, 4, 1);

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_74 = new Class21("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_17 = new Class49(10, 7);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[SI)[S")
	public static short[] method4287(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static474.method3331(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method4288() {
		Static405.anIntArray575 = null;
		Static416.anIntArray588 = null;
		Static39.aBoolean63 = false;
		Static113.anIntArray206 = null;
		Static266.anIntArray388 = null;
		Static123.anIntArray223 = null;
	}
}

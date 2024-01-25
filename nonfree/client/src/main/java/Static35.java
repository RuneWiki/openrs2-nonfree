import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!o;")
	public static Class49 aClass49_17;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_91 = new Class220(8, 0, 4, 1);

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_92 = new Class220(14, 0, 4, 1);

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public static int anInt4182 = 0;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static int anInt4183 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!fi;BLclient!za;)V")
	public static void method3332(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(38) boolean local38 = Static306.aClass67_3.method1446(arg0.anInt2057, arg0.anInt2056 | 0xFF000000, arg0.anInt2125, arg0.aBoolean154 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null, arg1, arg0.lb, arg0.anInt2086) == null;
		if (local38) {
			Static345.aClass177_32.method3615(new Class5_Sub32(arg0.anInt2057, arg0.anInt2125, arg0.lb, arg0.anInt2056 | 0xFF000000, arg0.anInt2086, arg0.aBoolean154));
			Static53.method833(arg0);
		}
	}
}

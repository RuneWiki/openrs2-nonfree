import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_17 = new Class267(200);

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!s;")
	public static final Class217 aClass217_46 = new Class217(13, 0);

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
	public static final int[] anIntArray188 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static final int[] anIntArray189 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static final int anInt2138 = 0;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method1864() {
		if (Static358.anInt6086 == 6) {
			Static172.method2923(false);
		} else if (Static146.anInt3027 > 0) {
			Static172.method2923(Static258.aBoolean308);
		} else {
			Static59.aClass253_1 = Static160.aClass253_3;
			Static160.aClass253_3 = null;
			Static458.method6071(12);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!an;")
	public static Class13 method1865(@OriginalArg(0) Component arg0) {
		return new Class13_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!qi;")
	public static Class24_Sub3 method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class1 local14 = local7.aClass1_3; local14 != null; local14 = local14.aClass1_1) {
			@Pc(18) Class24_Sub3 local18 = local14.aClass24_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort107 == arg1 && local18.aShort105 == arg2) {
				return local18;
			}
		}
		return null;
	}
}

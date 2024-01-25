import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!f;")
	public static Class88 aClass88_15;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "[I")
	public static final int[] anIntArray274 = new int[13];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BIZ)V")
	public static void method3892(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static251.aClass4_Sub13_6 == null) {
			Static251.aClass4_Sub13_6 = new Class4_Sub13(20000);
		}
		Static251.aClass4_Sub13_6.method7030(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static478.method6939(Static251.aClass4_Sub13_6.aByteArray88);
		Static353.aClass222_Sub1Array1 = new Class222_Sub1[Static112.anInt2568];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = anInt5018; local33 <= Static403.anInt7841; local33++) {
			@Pc(39) Class222_Sub1 local39 = Static442.method6524(local33);
			if (local39 != null) {
				Static353.aClass222_Sub1Array1[local31++] = local39;
			}
		}
		Static105.aBoolean623 = false;
		Static532.aLong275 = Static112.method2047();
		Static251.aClass4_Sub13_6 = null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)I")
	public static int method3894() {
		return 46;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!fh;Lclient!fh;Z)V")
	public static void method3895(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1) {
		if (arg0.aClass21_68 != null) {
			arg0.method8246();
		}
		arg0.aClass21_67 = arg1;
		arg0.aClass21_68 = arg1.aClass21_68;
		arg0.aClass21_68.aClass21_67 = arg0;
		arg0.aClass21_67.aClass21_68 = arg0;
	}
}

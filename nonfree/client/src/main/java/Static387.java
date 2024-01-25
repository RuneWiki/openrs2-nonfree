import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!os", name = "t", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_10 = new Class278("", 10);

	@OriginalMember(owner = "client!os", name = "x", descriptor = "I")
	public static int anInt7430 = -1;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[4];

	@OriginalMember(owner = "client!os", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString90 = "";

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
	public static boolean method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)Z")
	public static boolean method6201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!tc;I)V")
	public static void method6202(@OriginalArg(0) Class305 arg0) {
		if (arg0.anInt9218 != Static300.anInt7260) {
			return;
		}
		if (Static443.aClass2_Sub2_Sub1_Sub1_2.aString23 == null) {
			arg0.anInt9192 = 0;
			arg0.anInt9219 = 0;
			return;
		}
		arg0.anInt9194 = 150;
		arg0.anInt9227 = (int) (Math.sin((double) Static129.anInt10429 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9219 = Static381.anInt1560;
		arg0.anInt9217 = 5;
		arg0.anInt9192 = Static491.method6680(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23);
		arg0.anInt9189 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt7655;
		arg0.anInt9186 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt7617;
		arg0.anInt9183 = 0;
		arg0.anInt9204 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt7586;
		@Pc(71) Class174 local71 = arg0.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(arg0.anInt9189);
		if (local71 != null) {
			Static499.method7540(local71, arg0.anInt9204);
		}
	}
}

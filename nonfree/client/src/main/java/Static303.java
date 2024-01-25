import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!lc;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt5715;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_135 = new Class263(71, 2);

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!vi;")
	public static final Class256 aClass256_7 = new Class256("RC", 1);

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static175.method2965(arg0, arg1) | (arg1 & 0x40000) != 0 || Static427.method5765(arg0, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public static boolean method4391(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ia;)V")
	public static void method4392(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.method1168();
		Static239.aClass193Array1 = new Class193[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static239.aClass193Array1[local14] = new Class193();
			Static239.aClass193Array1[local14].anInt5710 = arg0.method1168();
			Static239.aClass193Array1[local14].aString51 = arg0.method1178();
		}
		Static452.anInt7921 = arg0.method1168();
		Static461.anInt7756 = arg0.method1168();
		Static286.anInt5429 = arg0.method1168();
		Static361.aClass103_Sub1Array4 = new Class103_Sub1[Static461.anInt7756 + 1 - Static452.anInt7921];
		for (@Pc(68) int local68 = 0; local68 < Static286.anInt5429; local68++) {
			@Pc(74) int local74 = arg0.method1168();
			@Pc(82) Class103_Sub1 local82 = Static361.aClass103_Sub1Array4[local74] = new Class103_Sub1();
			local82.anInt3188 = arg0.method1171();
			local82.anInt3184 = arg0.method1188();
			local82.anInt3201 = Static452.anInt7921 + local74;
			local82.aString29 = arg0.method1178();
			local82.aString28 = arg0.method1178();
		}
		Static352.anInt6562 = arg0.method1188();
		Static418.aBoolean477 = true;
	}
}

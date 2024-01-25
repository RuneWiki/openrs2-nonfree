import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qu", name = "N", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array13;

	@OriginalMember(owner = "client!qu", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "[Lclient!df;")
	public static Class8_Sub1[] aClass8_Sub1Array3;

	@OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
	public static int anInt8259;

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "S")
	public static short aShort99 = 320;

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "Z")
	public static volatile boolean aBoolean619 = true;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
	public static void method7117(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static260.aClass174ArrayArrayArray2 = Static422.aClass174ArrayArrayArray3;
			Static242.aClass22Array3 = Static134.aClass22Array1;
		} else {
			Static260.aClass174ArrayArrayArray2 = Static253.aClass174ArrayArrayArray1;
			Static242.aClass22Array3 = Static220.aClass22Array2;
		}
		Static490.anInt9715 = Static260.aClass174ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBLclient!la;)Lclient!lq;")
	public static Class224 method7119(@OriginalArg(1) int arg0, @OriginalArg(3) Class208 arg1) {
		@Pc(16) byte[] local16 = arg1.method4991(arg0, 0, -123);
		return local16 == null ? null : new Class224(local16);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!tia;)V")
	public static void method7120(@OriginalArg(1) Class5_Sub50 arg0) {
		Static345.aClass102_42.method1921(arg0);
		arg0.anInt9621 = arg0.aClass5_Sub23_Sub2_2.anInt9869;
		Static206.anInt3369 += arg0.anInt9621;
		arg0.aClass5_Sub23_Sub2_2.anInt9869 = 0;
	}
}

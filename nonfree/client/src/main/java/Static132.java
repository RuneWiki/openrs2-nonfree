import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!en", name = "B", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!en", name = "E", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_41 = new Class156(94, 0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V")
	public static void method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 11);
		local9.method7441();
		local9.anInt8632 = arg1;
		local9.anInt8635 = arg2;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method1952() {
		for (@Pc(12) int local12 = 0; local12 < Static438.anInt7239; local12++) {
			@Pc(18) int local18 = Static558.anIntArray500[local12];
			@Pc(25) Class5_Sub9 local25 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local18);
			if (local25 != null) {
				@Pc(30) Class4_Sub1_Sub1_Sub2_Sub2 local30 = local25.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				Static146.method2738(local30.aClass105_1.anInt2811, local30);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!sja;B)V")
	public static void method1957(@OriginalArg(0) Class5_Sub50 arg0) {
		if (Static283.aClass128ArrayArrayArray1 == null) {
			return;
		}
		@Pc(17) Interface9 local17 = null;
		if (arg0.anInt8717 == 0) {
			local17 = (Interface9) Static142.method6599(arg0.anInt8725, arg0.anInt8721, arg0.anInt8723);
		}
		if (arg0.anInt8717 == 1) {
			local17 = (Interface9) Static427.method6188(arg0.anInt8725, arg0.anInt8721, arg0.anInt8723);
		}
		if (arg0.anInt8717 == 2) {
			local17 = (Interface9) Static367.method5340(arg0.anInt8725, arg0.anInt8721, arg0.anInt8723, aClass10 == null ? (aClass10 = Class5_Sub14_Sub1.a("dp")) : aClass10);
		}
		if (arg0.anInt8717 == 3) {
			local17 = (Interface9) Static254.method4181(arg0.anInt8725, arg0.anInt8721, arg0.anInt8723);
		}
		if (local17 == null) {
			arg0.anInt8719 = 0;
			arg0.anInt8728 = -1;
			arg0.anInt8718 = 0;
		} else {
			arg0.anInt8728 = local17.method8364();
			arg0.anInt8718 = local17.method8366();
			arg0.anInt8719 = local17.method8367();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)V")
	public static void method1958(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg0, 14);
		local14.method7444();
	}
}

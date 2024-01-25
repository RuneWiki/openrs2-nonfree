import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "[Lclient!bs;")
	public static Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_15 = new Class245(7, 0, 1, 1);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!bf;)V")
	public static void method4354(@OriginalArg(1) Class8_Sub3_Sub1 arg0) {
		if (arg0 instanceof Class8_Sub3_Sub1_Sub2) {
			@Pc(28) Class8_Sub3_Sub1_Sub2 local28 = (Class8_Sub3_Sub1_Sub2) arg0;
			if (local28.aClass78_1 != null) {
				Static350.method4632(local28.aByte99 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, local28);
			}
		} else if (arg0 instanceof Class8_Sub3_Sub1_Sub1) {
			@Pc(8) Class8_Sub3_Sub1_Sub1 local8 = (Class8_Sub3_Sub1_Sub1) arg0;
			Static281.method3697(local8, local8.aByte99 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public static void method4358() {
		@Pc(7) Class248[] local7 = Class4_Sub2_Sub11.aClass248Array1;
		synchronized (Class4_Sub2_Sub11.aClass248Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class4_Sub2_Sub11.aClass248Array1.length; local11++) {
				Class4_Sub2_Sub11.aClass248Array1[local11] = new Class248();
				Static353.anIntArray465[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII)V")
	public static void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static413.aClass49_Sub1_1.anInt3199 != 0 && arg2 != 0 && Static418.anInt7061 < 50 && arg1 != -1) {
			Static246.aClass46Array1[Static418.anInt7061++] = new Class46((byte) 1, arg1, arg2, arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;B)Lclient!ag;")
	public static Class7 method4374(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(12) Class7 local12 = new Class7();
		local12.anInt123 = arg0.method5028();
		local12.aClass4_Sub2_Sub18_1 = Static350.aClass66_1.method1411(local12.anInt123);
		return local12;
	}
}

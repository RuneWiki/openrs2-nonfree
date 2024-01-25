import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!ie;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!vh;")
	public static Class250 aClass250_13;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
	public static int anInt1263 = 0;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_18 = new Class237(13, -1);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()V")
	public static void method1070() {
		for (@Pc(1) int local1 = 0; local1 < Static22.anInt3913; local1++) {
			@Pc(6) Class26_Sub2 local6 = Static455.aClass26_Sub2Array5[local1];
			Static269.method3931(local6);
			Static455.aClass26_Sub2Array5[local1] = null;
		}
		Static22.anInt3913 = 0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V")
	public static void method1071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class1_Sub29 local14 = (Class1_Sub29) Static205.aClass266_32.method6000(); local14 != null; local14 = (Class1_Sub29) Static205.aClass266_32.method5994()) {
			Static92.method1485(arg1, arg2, arg3, local14, arg0);
		}
		for (@Pc(35) Class1_Sub29 local35 = (Class1_Sub29) Static14.aClass266_3.method6000(); local35 != null; local35 = (Class1_Sub29) Static14.aClass266_3.method5994()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class164 local44 = local35.aClass26_Sub2_Sub2_Sub2_1.method5533();
			if (local35.aClass26_Sub2_Sub2_Sub2_1.aBoolean458) {
				local39 = 0;
			} else if (local44.anInt4695 == local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 || local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 == local44.anInt4680 || local44.anInt4676 == local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 || local44.anInt4698 == local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122) {
				local39 = 2;
			} else if (local44.anInt4697 == local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 || local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 == local44.anInt4701 || local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122 == local44.anInt4669 || local44.anInt4666 == local35.aClass26_Sub2_Sub2_Sub2_1.anInt7122) {
				local39 = 3;
			}
			if (local35.anInt4379 != local39) {
				@Pc(133) int local133 = Static204.method3120(local35.aClass26_Sub2_Sub2_Sub2_1);
				if (local35.anInt4372 != local133) {
					if (local35.aClass1_Sub7_Sub4_3 != null) {
						Static38.aClass1_Sub7_Sub1_1.method3979(local35.aClass1_Sub7_Sub4_3);
						local35.aClass1_Sub7_Sub4_3 = null;
					}
					local35.anInt4372 = local133;
				}
				local35.anInt4379 = local39;
			}
			local35.anInt4373 = local35.aClass26_Sub2_Sub2_Sub2_1.anInt7068;
			local35.anInt4381 = local35.aClass26_Sub2_Sub2_Sub2_1.anInt7068 + (local35.aClass26_Sub2_Sub2_Sub2_1.method5535() << 6);
			local35.anInt4374 = local35.aClass26_Sub2_Sub2_Sub2_1.anInt7065;
			local35.anInt4378 = local35.aClass26_Sub2_Sub2_Sub2_1.anInt7065 + (local35.aClass26_Sub2_Sub2_Sub2_1.method5535() << 6);
			Static92.method1485(arg1, arg2, arg3, local35, arg0);
		}
		for (@Pc(217) Class1_Sub29 local217 = (Class1_Sub29) Static51.aClass27_9.method555(); local217 != null; local217 = (Class1_Sub29) Static51.aClass27_9.method563()) {
			@Pc(221) byte local221 = 1;
			@Pc(226) Class164 local226 = local217.aClass26_Sub2_Sub2_Sub1_2.method5533();
			if (local217.aClass26_Sub2_Sub2_Sub1_2.aBoolean458) {
				local221 = 0;
			} else if (local226.anInt4695 == local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 || local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 == local226.anInt4680 || local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 == local226.anInt4676 || local226.anInt4698 == local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122) {
				local221 = 2;
			} else if (local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 == local226.anInt4697 || local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 == local226.anInt4701 || local226.anInt4669 == local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 || local217.aClass26_Sub2_Sub2_Sub1_2.anInt7122 == local226.anInt4666) {
				local221 = 3;
			}
			if (local217.anInt4379 != local221) {
				@Pc(309) int local309 = Static195.method2960(local217.aClass26_Sub2_Sub2_Sub1_2);
				if (local217.anInt4372 != local309) {
					if (local217.aClass1_Sub7_Sub4_3 != null) {
						Static38.aClass1_Sub7_Sub1_1.method3979(local217.aClass1_Sub7_Sub4_3);
						local217.aClass1_Sub7_Sub4_3 = null;
					}
					local217.anInt4372 = local309;
				}
				local217.anInt4379 = local221;
			}
			local217.anInt4373 = local217.aClass26_Sub2_Sub2_Sub1_2.anInt7068;
			local217.anInt4381 = local217.aClass26_Sub2_Sub2_Sub1_2.anInt7068 + (local217.aClass26_Sub2_Sub2_Sub1_2.method5535() << 6);
			local217.anInt4374 = local217.aClass26_Sub2_Sub2_Sub1_2.anInt7065;
			local217.anInt4378 = local217.aClass26_Sub2_Sub2_Sub1_2.anInt7065 + (local217.aClass26_Sub2_Sub2_Sub1_2.method5535() << 6);
			Static92.method1485(arg1, arg2, arg3, local217, arg0);
		}
	}
}

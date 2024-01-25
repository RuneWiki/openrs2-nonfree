import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!m;")
	public static Interface8 anInterface8_5;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "J")
	public static long aLong96 = -1L;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
	public static void method2501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub42 local10 = (Class1_Sub42) Static335.aClass254_40.method5437(); local10 != null; local10 = (Class1_Sub42) Static335.aClass254_40.method5433()) {
			Static236.method3111(arg2, arg1, arg0, arg3, local10);
		}
		for (@Pc(31) Class1_Sub42 local31 = (Class1_Sub42) Static24.aClass254_3.method5437(); local31 != null; local31 = (Class1_Sub42) Static24.aClass254_3.method5433()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class51 local40 = local31.aClass20_Sub3_Sub3_Sub2_1.method4676();
			if (local31.aClass20_Sub3_Sub3_Sub2_1.aBoolean502) {
				local35 = 0;
			} else if (local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 == local40.anInt1321 || local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 == local40.anInt1322 || local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 == local40.anInt1310 || local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 == local40.anInt1294) {
				local35 = 2;
			} else if (local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 == local40.anInt1317 || local40.anInt1303 == local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 || local40.anInt1291 == local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037 || local40.anInt1300 == local31.aClass20_Sub3_Sub3_Sub2_1.anInt6037) {
				local35 = 3;
			}
			if (local31.anInt6726 != local35) {
				@Pc(127) int local127 = Static254.method3259(local31.aClass20_Sub3_Sub3_Sub2_1);
				if (local127 != local31.anInt6729) {
					if (local31.aClass1_Sub9_Sub1_3 != null) {
						Static155.aClass1_Sub9_Sub2_1.method1038(local31.aClass1_Sub9_Sub1_3);
						local31.aClass1_Sub9_Sub1_3 = null;
					}
					local31.anInt6729 = local127;
				}
				local31.anInt6726 = local35;
			}
			local31.anInt6733 = local31.aClass20_Sub3_Sub3_Sub2_1.anInt6613;
			local31.anInt6721 = local31.aClass20_Sub3_Sub3_Sub2_1.anInt6613 + (local31.aClass20_Sub3_Sub3_Sub2_1.method4678() << 6);
			local31.anInt6732 = local31.aClass20_Sub3_Sub3_Sub2_1.anInt6616;
			local31.anInt6728 = local31.aClass20_Sub3_Sub3_Sub2_1.anInt6616 + (local31.aClass20_Sub3_Sub3_Sub2_1.method4678() << 6);
			Static236.method3111(arg2, arg1, arg0, arg3, local31);
		}
		for (@Pc(205) Class1_Sub42 local205 = (Class1_Sub42) Static374.aClass257_29.method5506(); local205 != null; local205 = (Class1_Sub42) Static374.aClass257_29.method5501()) {
			@Pc(217) byte local217 = 1;
			@Pc(222) Class51 local222 = local205.aClass20_Sub3_Sub3_Sub1_2.method4676();
			if (local205.aClass20_Sub3_Sub3_Sub1_2.aBoolean502) {
				local217 = 0;
			} else if (local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1321 || local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1322 || local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1310 || local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1294) {
				local217 = 2;
			} else if (local222.anInt1317 == local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 || local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1303 || local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037 == local222.anInt1291 || local222.anInt1300 == local205.aClass20_Sub3_Sub3_Sub1_2.anInt6037) {
				local217 = 3;
			}
			if (local217 != local205.anInt6726) {
				@Pc(309) int local309 = Static117.method1606(local205.aClass20_Sub3_Sub3_Sub1_2);
				if (local205.anInt6729 != local309) {
					if (local205.aClass1_Sub9_Sub1_3 != null) {
						Static155.aClass1_Sub9_Sub2_1.method1038(local205.aClass1_Sub9_Sub1_3);
						local205.aClass1_Sub9_Sub1_3 = null;
					}
					local205.anInt6729 = local309;
				}
				local205.anInt6726 = local217;
			}
			local205.anInt6733 = local205.aClass20_Sub3_Sub3_Sub1_2.anInt6613;
			local205.anInt6721 = local205.aClass20_Sub3_Sub3_Sub1_2.anInt6613 + (local205.aClass20_Sub3_Sub3_Sub1_2.method4678() << 6);
			local205.anInt6732 = local205.aClass20_Sub3_Sub3_Sub1_2.anInt6616;
			local205.anInt6728 = local205.aClass20_Sub3_Sub3_Sub1_2.anInt6616 + (local205.aClass20_Sub3_Sub3_Sub1_2.method4678() << 6);
			Static236.method3111(arg2, arg1, arg0, arg3, local205);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method2503(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(29) int local29 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(37) int local37 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}

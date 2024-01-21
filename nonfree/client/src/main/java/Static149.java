import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array6;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt3355 = 0;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static final int anInt3356 = 50;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1973 = Static107.method1838("<col=ffb000>");

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static final int anInt3357 = 4;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
	public static int[] anIntArray316 = new int[anInt3357];

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt3360 = 0;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[[Lclient!nd;")
	public static Class54[][] aClass54ArrayArray1 = new Class54[anInt3357][500];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIB)V")
	public static void method2324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == Static142.anInt3243 && Static127.anInt3016 == arg0 && (arg4 == Static142.anInt3246 || !Static177.aBoolean170)) {
			return;
		}
		Static142.anInt3243 = arg3;
		Static127.anInt3016 = arg0;
		Static142.anInt3246 = arg4;
		if (!Static177.aBoolean170) {
			Static142.anInt3246 = 0;
		}
		Static110.method1877(25);
		Static59.method1061(true, Static11.aClass28_367);
		@Pc(40) int local40 = Static39.anInt1055;
		@Pc(42) int local42 = Static3.anInt2434;
		Static3.anInt2434 = arg3 * 8 - 48;
		Static39.anInt1055 = (arg0 - 6) * 8;
		@Pc(58) int local58 = Static39.anInt1055 - local40;
		@Pc(65) int local65 = Static3.anInt2434 - local42;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(75) Class2_Sub4_Sub1_Sub1_Sub1 local75 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < 10; local79++) {
					local75.anIntArray139[local79] -= local65;
					local75.anIntArray142[local79] -= local58;
				}
				local75.anInt1633 -= local65 * 128;
				local75.anInt1635 -= local58 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(131) Class2_Sub4_Sub1_Sub1_Sub2 local131 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local125];
			if (local131 != null) {
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					local131.anIntArray139[local135] -= local65;
					local131.anIntArray142[local135] -= local58;
				}
				local131.anInt1635 -= local58 * 128;
				local131.anInt1633 -= local65 * 128;
			}
		}
		Static103.anInt2568 = arg4;
		Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1101(arg2, false, arg1);
		@Pc(187) byte local187 = 0;
		@Pc(189) byte local189 = 1;
		@Pc(191) byte local191 = 104;
		@Pc(193) byte local193 = 0;
		if (local65 < 0) {
			local189 = -1;
			local187 = 103;
			local191 = -1;
		}
		@Pc(206) byte local206 = 104;
		@Pc(208) byte local208 = 1;
		if (local58 < 0) {
			local193 = 103;
			local206 = -1;
			local208 = -1;
		}
		for (@Pc(221) int local221 = local187; local221 != local191; local221 += local189) {
			for (@Pc(225) int local225 = local193; local225 != local206; local225 += local208) {
				@Pc(231) int local231 = local221 + local65;
				@Pc(235) int local235 = local225 + local58;
				for (@Pc(237) int local237 = 0; local237 < 4; local237++) {
					if (local231 >= 0 && local235 >= 0 && local231 < 104 && local235 < 104) {
						Static147.aClass65ArrayArrayArray1[local237][local221][local225] = Static147.aClass65ArrayArrayArray1[local237][local231][local235];
					} else {
						Static147.aClass65ArrayArrayArray1[local237][local221][local225] = null;
					}
				}
			}
		}
		for (@Pc(309) Class2_Sub19 local309 = (Class2_Sub19) Static29.aClass65_2.method2115(); local309 != null; local309 = (Class2_Sub19) Static29.aClass65_2.method2117()) {
			local309.anInt2708 -= local65;
			local309.anInt2723 -= local58;
			if (local309.anInt2708 < 0 || local309.anInt2723 < 0 || local309.anInt2708 >= 104 || local309.anInt2723 >= 104) {
				local309.method2888();
			}
		}
		Static145.anInt3283 = 0;
		Static79.aBoolean99 = false;
		if (Static98.anInt2452 != 0) {
			Static98.anInt2452 -= local65;
			Static109.anInt2643 -= local58;
		}
		Static23.anInt750 = -1;
		Static38.aClass65_3.method2113();
		Static100.aClass65_9.method2113();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method2325() {
		anIntArray316 = null;
		aClass54ArrayArray1 = null;
		aClass2_Sub4_Sub3_Sub3Array6 = null;
		aClass28_1973 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	public static int method2326(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(24) int local24 = local10 | local10 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2327(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static173.aClass44_1);
		arg0.addMouseMotionListener(Static173.aClass44_1);
		arg0.addFocusListener(Static173.aClass44_1);
	}
}

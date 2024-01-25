import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!qa;Lclient!se;III)V")
	public static void method7145(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class262 local12;
		if (arg3 < Static515.anInt3809) {
			local12 = Static399.aClass262ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method7671()) {
				arg1.method7672(0, arg0, 0, true, local12.aClass1_Sub4_1, Static136.anInt2574);
			}
		}
		if (arg4 < Static515.anInt3809) {
			local12 = Static399.aClass262ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method7671()) {
				arg1.method7672(Static136.anInt2574, arg0, 0, true, local12.aClass1_Sub4_1, 0);
			}
		}
		if (arg3 < Static515.anInt3809 && arg4 < Static315.anInt5693) {
			local12 = Static399.aClass262ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method7671()) {
				arg1.method7672(Static136.anInt2574, arg0, 0, true, local12.aClass1_Sub4_1, Static136.anInt2574);
			}
		}
		if (arg3 < Static515.anInt3809 && arg4 > 0) {
			local12 = Static399.aClass262ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method7671()) {
				arg1.method7672(-Static136.anInt2574, arg0, 0, true, local12.aClass1_Sub4_1, Static136.anInt2574);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIZ)V")
	public static void method7146(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static328.aClass2_Sub29_6 == null) {
			Static328.aClass2_Sub29_6 = new Class2_Sub29(20000);
		}
		Static328.aClass2_Sub29_6.method5221(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static440.method6717(Static328.aClass2_Sub29_6.aByteArray96);
		Static386.aClass178_Sub1Array2 = new Class178_Sub1[Static12.anInt263];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static75.anInt1566; local38 <= Static155.anInt2819; local38++) {
			@Pc(44) Class178_Sub1 local44 = Static71.method1449(local38);
			if (local44 != null) {
				Static386.aClass178_Sub1Array2[local36++] = local44;
			}
		}
		Static521.aBoolean646 = false;
		Static431.aLong188 = Static143.method2502();
		Static328.aClass2_Sub29_6 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Lclient!ql;")
	public static Class237[] method7147() {
		if (Static291.aClass237Array1 == null) {
			@Pc(13) Class237[] local13 = Static254.method3979(Static531.aClass283_6);
			@Pc(17) Class237[] local17 = new Class237[local13.length];
			@Pc(19) int local19 = 0;
			@Pc(66) int local66;
			@Pc(72) Class237 local72;
			label63: for (@Pc(21) int local21 = 0; local21 < local13.length; local21++) {
				@Pc(27) Class237 local27 = local13[local21];
				if ((local27.anInt7573 <= 0 || local27.anInt7573 >= 24) && local27.anInt7570 >= 800 && local27.anInt7571 >= 600 && (Static78.anInt1651 >= 96 || Static266.anInt4923 != 0 || local27.anInt7570 <= 1024 && local27.anInt7571 <= 768)) {
					for (local66 = 0; local66 < local19; local66++) {
						local72 = local17[local66];
						if (local27.anInt7570 == local72.anInt7570 && local72.anInt7571 == local27.anInt7571) {
							if (local27.anInt7573 > local72.anInt7573) {
								local17[local66] = local27;
							}
							continue label63;
						}
					}
					local17[local19] = local27;
					local19++;
				}
			}
			Static291.aClass237Array1 = new Class237[local19];
			Static553.method3372(local17, 0, Static291.aClass237Array1, 0, local19);
			@Pc(124) int[] local124 = new int[Static291.aClass237Array1.length];
			for (local66 = 0; local66 < Static291.aClass237Array1.length; local66++) {
				local72 = Static291.aClass237Array1[local66];
				local124[local66] = local72.anInt7571 * local72.anInt7570;
			}
			Static49.method874(local124, Static291.aClass237Array1);
		}
		return Static291.aClass237Array1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public static int method7148(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}

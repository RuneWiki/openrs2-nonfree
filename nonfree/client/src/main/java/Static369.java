import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_90 = new Class242("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
	public static final int[] anIntArray572 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "S")
	public static short aShort87 = 320;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public static void method5081(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub1_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class146 local8 = Static422.aClass146Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static241.anInt4414; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static301.anInt5434; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static372.anInt7558;
							@Pc(32) int local32 = local12 << Static372.anInt7558;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class146 local41 = Static422.aClass146Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)Lclient!dl;")
	public static Class49 method5082(@OriginalArg(0) int arg0) {
		@Pc(13) Class49[] local13 = Static13.method319();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class49 local21 = local13[local15];
			if (local21.anInt1823 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5083(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static402.method1650(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static22.anInt6850; local29++) {
			@Pc(35) String local35 = Static291.aStringArray33[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static402.method1650(local35);
			if (local35 != null && local35.equals(local24)) {
				Static22.anInt6850--;
				for (@Pc(59) int local59 = local29; local59 < Static22.anInt6850; local59++) {
					Static291.aStringArray33[local59] = Static291.aStringArray33[local59 + 1];
					Static58.aStringArray28[local59] = Static58.aStringArray28[local59 + 1];
					Static265.anIntArray275[local59] = Static265.anIntArray275[local59 + 1];
					Static10.aStringArray1[local59] = Static10.aStringArray1[local59 + 1];
					Static90.anIntArray122[local59] = Static90.anIntArray122[local59 + 1];
					Static6.aBooleanArray1[local59] = Static6.aBooleanArray1[local59 + 1];
				}
				Static35.anInt830 = Static190.anInt3670;
				Static209.method2982(Static4.aClass36_2);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg0));
				Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public static void method5084() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static126.anInt2569; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static190.anInt3697; local13++) {
				if (Static124.method1882(true, local7, local9, Static40.aClass53ArrayArrayArray2, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}

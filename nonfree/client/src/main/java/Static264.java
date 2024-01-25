import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_46 = new Class137(5);

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public static int anInt4365 = 0;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public static int anInt4366 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method3486() {
		for (@Pc(7) int local7 = 0; local7 < Static148.anInt2692; local7++) {
			@Pc(13) int local13 = Static106.anIntArray150[local7];
			@Pc(17) Class8_Sub3_Sub1_Sub2 local17 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static148.method2077(local17.aClass78_1.anInt1885, local17);
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Z")
	public static boolean method3487(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static322.anInt5236; local1 < Static320.anInt5205; local1++) {
			@Pc(6) Class75[][] local6 = Static432.aClass75ArrayArrayArray6[local1];
			for (@Pc(9) int local9 = -Static387.anInt6326; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static32.anInt531 + local9;
				@Pc(18) int local18 = Static32.anInt531 - local9;
				if (local14 >= Static288.anInt4749 || local18 < Static333.anInt5438) {
					for (@Pc(27) int local27 = -Static387.anInt6326; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static150.anInt2733 + local27;
						@Pc(36) int local36 = Static150.anInt2733 - local27;
						@Pc(48) Class75 local48;
						if (local14 >= Static288.anInt4749) {
							if (local32 >= Static431.anInt7346) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean129) {
									Static96.aBoolean121 = arg0;
									Static146.aClass28_1.method4501(local48);
									Static146.aClass28_1.method4503();
								}
							}
							if (local36 < Static217.anInt7222) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean129) {
									Static96.aBoolean121 = arg0;
									Static146.aClass28_1.method4501(local48);
									Static146.aClass28_1.method4503();
								}
							}
						}
						if (local18 < Static333.anInt5438) {
							if (local32 >= Static431.anInt7346) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean129) {
									Static96.aBoolean121 = arg0;
									Static146.aClass28_1.method4501(local48);
									Static146.aClass28_1.method4503();
								}
							}
							if (local36 < Static217.anInt7222) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean129) {
									Static96.aBoolean121 = arg0;
									Static146.aClass28_1.method4501(local48);
									Static146.aClass28_1.method4503();
								}
							}
						}
						if (Static191.anInt3500 == 0) {
							if (Static299.aBoolean357) {
								Static146.aClass28_1.method4499(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}

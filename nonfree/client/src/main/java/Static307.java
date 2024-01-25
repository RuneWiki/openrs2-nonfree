import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BC)I")
	public static int method4790(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class148.anIntArray184.length > arg0 ? Class148.anIntArray184[arg0] : -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ha;IIIII)V")
	public static void method4793(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.KA(arg3, arg4, arg2 + arg3, arg1 + arg4);
		arg0.method8644(arg4, -16777216, arg2, arg3, arg1);
		if (Static455.anInt7370 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static491.anInt619 / (float) Static491.anInt624;
		@Pc(38) int local38 = arg2;
		@Pc(40) int local40 = arg1;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg2);
		} else {
			local38 = (int) ((float) arg1 / local36);
		}
		@Pc(67) int local67 = arg3 + (arg2 - local38) / 2;
		@Pc(75) int local75 = arg4 + (arg1 - local40) / 2;
		if (Static425.aClass155_23 == null || arg2 != Static425.aClass155_23.method7213() || arg1 != Static425.aClass155_23.method7198()) {
			Static491.method675(Static491.anInt622, Static491.anInt617 + Static491.anInt619, Static491.anInt622 + Static491.anInt624, Static491.anInt617, local67, local75, local38 + local67, local75 + local40);
			Static491.method658(arg0);
			Static425.aClass155_23 = arg0.method8643(local67, local75, local38, local40, false);
		}
		Static425.aClass155_23.method7202(local67, local75);
		@Pc(132) int local132 = local38 * Static181.anInt3402 / Static491.anInt624;
		@Pc(143) int local143 = local40 * Static98.anInt1632 / Static491.anInt619;
		@Pc(151) int local151 = local38 * Static455.anInt7375 / Static491.anInt624 + local67;
		@Pc(165) int local165 = local40 + local75 - local143 - local40 * Static137.anInt2730 / Static491.anInt619;
		@Pc(167) int local167 = -1996554240;
		if (Static536.aClass290_6 == Static532.aClass290_5) {
			local167 = -1996488705;
		}
		arg0.aa(local151, local165, local132, local143, local167, 1);
		arg0.method8607(local151, local165, local132, local143, local167, 0);
		if (Static396.anInt6671 <= 0) {
			return;
		}
		@Pc(204) int local204;
		if (Static81.anInt1432 <= 50) {
			local204 = Static81.anInt1432 * 5;
		} else {
			local204 = (100 - Static81.anInt1432) * 5;
		}
		for (@Pc(218) Class5_Sub49 local218 = (Class5_Sub49) Static491.aClass20_4.method378(); local218 != null; local218 = (Class5_Sub49) Static491.aClass20_4.method366()) {
			@Pc(226) Class313 local226 = Static491.aClass327_2.method7413(local218.anInt8675);
			if (Static95.method1507(local226)) {
				@Pc(261) int local261;
				@Pc(273) int local273;
				if (Static557.anInt8788 == local218.anInt8675) {
					local261 = local218.anInt8671 * local38 / Static491.anInt624 + local67;
					local273 = (Static491.anInt619 - local218.anInt8670) * local40 / Static491.anInt619 + local75;
					arg0.method8644(local273 - 2, local204 << 24 | 0xFFFF00, 4, local261 - 2, 4);
				} else if (Static284.anInt5035 != -1 && Static284.anInt5035 == local226.anInt8176) {
					local261 = local38 * local218.anInt8671 / Static491.anInt624 + local67;
					local273 = local40 * (Static491.anInt619 - local218.anInt8670) / Static491.anInt619 + local75;
					arg0.method8644(local273 - 2, local204 << 24 | 0xFFFF00, 4, local261 - 2, 4);
				}
			}
		}
	}
}

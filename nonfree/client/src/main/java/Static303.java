import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt6144;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public static int anInt6146;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[Lclient!pw;")
	public static final Class6_Sub42[] aClass6_Sub42Array1 = new Class6_Sub42[1024];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5139(@OriginalArg(1) Class5 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static238.aBoolean425) {
			local7 = Static352.method5739();
			local9 = Static573.method7997();
		}
		@Pc(21) int local21 = Static76.anInt2536 + local7;
		@Pc(25) int local25 = local9 + Static189.anInt4113;
		@Pc(27) int local27 = Static498.anInt8705;
		@Pc(31) int local31 = Static30.anInt820 - 3;
		Static39.method1339(arg0, Static498.anInt8705, Static30.anInt820, Static76.anInt2536 + local7, Static189.anInt4113 + local9, Static536.aClass316_26.method7577(Static638.anInt10709));
		@Pc(64) int local64 = local7 + Static6.aClass96_1.method8026();
		@Pc(71) int local71 = Static6.aClass96_1.method8019() + local9;
		@Pc(75) int local75;
		@Pc(80) Class6_Sub5_Sub9 local80;
		@Pc(98) int local98;
		@Pc(291) int local291;
		@Pc(172) Class6_Sub5_Sub11 local172;
		@Pc(278) Class6_Sub5_Sub9 local278;
		if (Static437.aBoolean633) {
			local75 = 0;
			for (local172 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local172 != null; local172 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
				local98 = local25 + local75 * 16 + 33;
				local75++;
				if (local64 > local7 + Static76.anInt2536 && local7 + Static76.anInt2536 + Static498.anInt8705 > local64 && local71 > local98 - 13 && local71 < local98 + 4 && (local172.anInt3423 > 1 || ((Class6_Sub5_Sub9) local172.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66).aBoolean253)) {
					arg0.aa(Static76.anInt2536 + local7, local98 + -12, Static498.anInt8705, 16, 255 - Static466.anInt8301 << 24 | Static215.anInt4640, 1);
				}
			}
			if (Static535.aClass6_Sub5_Sub11_1 != null) {
				Static39.method1339(arg0, Static9.anInt525, Static626.anInt10528, Static497.anInt8646, anInt6146, Static535.aClass6_Sub5_Sub11_1.aString28);
				local75 = 0;
				for (local278 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6055(); local278 != null; local278 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6050()) {
					local291 = local75 * 16 + anInt6146 + 13 + 20;
					if (local64 > Static497.anInt8646 && local64 < Static497.anInt8646 + Static9.anInt525 && local291 - 13 < local71 && local71 < local291 + 4 && local278.aBoolean253) {
						arg0.aa(Static497.anInt8646, local291 - 12, Static9.anInt525, 16, Static215.anInt4640 | 255 - Static466.anInt8301 << 24, 1);
					}
					local75++;
				}
				Static438.method6716(Static9.anInt525, arg0, anInt6146, Static497.anInt8646, Static626.anInt10528);
			}
		} else {
			local75 = 0;
			for (local80 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local80 != null; local80 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				local98 = (Static611.anInt10324 - local75 - 1) * 16 + local25 + 13 + 20;
				if (Static76.anInt2536 + local7 < local64 && local64 < local7 + Static76.anInt2536 + Static498.anInt8705 && local98 - 13 < local71 && local98 + 4 > local71 && local80.aBoolean253) {
					arg0.aa(local7 + Static76.anInt2536, local98 - 12, Static498.anInt8705, 16, Static215.anInt4640 | 255 - Static466.anInt8301 << 24, 1);
				}
				local75++;
			}
		}
		Static438.method6716(Static498.anInt8705, arg0, Static189.anInt4113 + local9, Static76.anInt2536 - -local7, Static30.anInt820);
		if (Static437.aBoolean633) {
			local75 = 0;
			for (local172 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local172 != null; local172 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
				local98 = Static189.anInt4113 + local9 + local75 * 16 + 20 + 13;
				if (local172.anInt3423 == 1) {
					Static240.method4375(Static30.anInt820, (Class6_Sub5_Sub9) local172.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66, Static434.anInt10353 | 0xFF000000, Static498.anInt8705, local98, Static189.anInt4113 + local9, local64, arg0, local71, Static285.anInt5954 | 0xFF000000, local7 + Static76.anInt2536);
				} else {
					Static553.method7738(local172, Static285.anInt5954 | 0xFF000000, local64, Static30.anInt820, local71, Static76.anInt2536 + local7, arg0, local98, Static434.anInt10353 | 0xFF000000, Static498.anInt8705, local9 + Static189.anInt4113);
				}
				local75++;
			}
			if (Static535.aClass6_Sub5_Sub11_1 != null) {
				local75 = 0;
				for (local278 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6055(); local278 != null; local278 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6050()) {
					local291 = local75 * 16 + anInt6146 + 33;
					local75++;
					Static240.method4375(Static626.anInt10528, local278, Static434.anInt10353 | 0xFF000000, Static9.anInt525, local291, anInt6146, local64, arg0, local71, Static285.anInt5954 | 0xFF000000, Static497.anInt8646);
				}
				Static602.method8319(Static626.anInt10528, Static497.anInt8646, Static9.anInt525, anInt6146);
			}
		} else {
			local75 = 0;
			for (local80 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local80 != null; local80 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				local98 = (Static611.anInt10324 - local75 - 1) * 16 + local25 + 20 + 13;
				Static240.method4375(local31, local80, Static434.anInt10353 | 0xFF000000, local27, local98, local25, local64, arg0, local71, Static285.anInt5954 | 0xFF000000, local21);
				local75++;
			}
		}
		Static602.method8319(Static30.anInt820, Static76.anInt2536 + local7, Static498.anInt8705, Static189.anInt4113 + local9);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)I")
	public static int method5140(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}

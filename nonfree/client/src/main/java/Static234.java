import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!f;")
	public static Class78 aClass78_7;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_95 = new Class362(8, 8);

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public static void method3763() {
		if (Static191.aBoolean294) {
			return;
		}
		Static191.aBoolean294 = true;
		Static65.aBoolean51 = true;
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static201.aFloat128 = (int) Static201.aFloat128 - 65 & 0xFFFFFF80;
		} else {
			Static429.aFloat208 += (-24.0F - Static429.aFloat208) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!rda;Lclient!dc;I)V")
	public static void method3772(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub4_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) Class4_Sub11_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) byte local16 = -1;
		if ((arg3 & 0x400) != 0) {
			local16 = arg2.method4952();
		}
		@Pc(37) int local37;
		if ((arg3 & 0x40) != 0) {
			local37 = arg2.method4947();
			@Pc(40) byte[] local40 = new byte[local37];
			@Pc(45) Class4_Sub11 local45 = new Class4_Sub11(local40);
			arg2.method4894(local40, local37);
			Static275.aClass4_Sub11Array1[arg0] = local45;
			arg1.method6945(local45);
		}
		if ((arg3 & 0x1) != 0) {
			Static278.aByteArray67[arg0] = arg2.method4925();
		}
		if ((arg3 & 0x10) != 0) {
			arg1.anInt8461 = arg2.method4950();
			if (arg1.anInt8447 == 0) {
				arg1.method6936(arg1.anInt8461);
				arg1.anInt8461 = -1;
			}
		}
		if ((arg3 & 0x2000) != 0) {
			arg1.anInt8382 = arg2.method4925();
			arg1.anInt8423 = arg2.method4952();
			arg1.anInt8408 = arg2.method4952();
			arg1.lb = arg2.method4952();
			arg1.anInt8426 = arg2.method4936() + Static106.anInt2418;
			arg1.anInt8413 = arg2.method4936() + Static106.anInt2418;
			arg1.anInt8400 = arg2.method4938();
			if (arg1.aBoolean595) {
				arg1.anInt8382 += arg1.anInt8455;
				arg1.anInt8447 = 0;
				arg1.anInt8423 += arg1.anInt8450;
				arg1.anInt8408 += arg1.anInt8455;
				arg1.lb += arg1.anInt8450;
			} else {
				arg1.anInt8408 += arg1.anIntArray463[0];
				arg1.anInt8447 = 1;
				arg1.anInt8382 += arg1.anIntArray463[0];
				arg1.lb += arg1.anIntArray462[0];
				arg1.anInt8423 += arg1.anIntArray462[0];
			}
			arg1.anInt8445 = 0;
		}
		@Pc(229) int local229;
		@Pc(256) int local256;
		if ((arg3 & 0x4) != 0) {
			@Pc(227) int[] local227 = new int[4];
			for (local229 = 0; local229 < 4; local229++) {
				local227[local229] = arg2.method4955();
				if (local227[local229] == 65535) {
					local227[local229] = -1;
				}
			}
			local256 = arg2.method4916();
			Static354.method5727(local256, arg1, local227);
		}
		@Pc(283) int local283;
		@Pc(292) int local292;
		@Pc(272) int[] local272;
		@Pc(275) int[] local275;
		if ((arg3 & 0x10000) != 0) {
			local37 = arg2.method4947();
			local272 = new int[local37];
			local275 = new int[local37];
			for (@Pc(277) int local277 = 0; local277 < local37; local277++) {
				local283 = arg2.method4950();
				if ((local283 & 0xC000) == 49152) {
					local292 = arg2.method4923();
					local272[local277] = local283 << 16 | local292;
				} else {
					local272[local277] = local283;
				}
				local275[local277] = arg2.method4936();
			}
			arg1.method6929(local275, local272);
		}
		if ((arg3 & 0x20) != 0) {
			local37 = arg2.method4950();
			if (local37 == 65535) {
				local37 = -1;
			}
			arg1.anInt8405 = local37;
		}
		if ((arg3 & 0x8000) != 0) {
			arg1.aBoolean594 = arg2.method4947() == 1;
		}
		if ((arg3 & 0x100) != 0) {
			local37 = arg2.method4905();
			local272 = new int[local37];
			local275 = new int[local37];
			@Pc(377) int[] local377 = new int[local37];
			for (local283 = 0; local283 < local37; local283++) {
				local292 = arg2.method4950();
				if (local292 == 65535) {
					local292 = -1;
				}
				local272[local283] = local292;
				local275[local283] = arg2.method4947();
				local377[local283] = arg2.method4950();
			}
			Static418.method6555(arg1, local377, local272, local275);
		}
		if ((arg3 & 0x200) != 0) {
			local37 = arg2.method4923();
			arg1.anInt8410 = arg2.method4905();
			arg1.anInt8443 = arg2.method4916();
			arg1.anInt8370 = local37 & 0x7FFF;
			arg1.aBoolean591 = (local37 & 0x8000) != 0;
			arg1.anInt8439 = arg1.anInt8410 + Static106.anInt2418 + arg1.anInt8370;
		}
		if ((arg3 & 0x800) != 0) {
			arg1.aString76 = arg2.method4920();
			if (arg1.aString76.charAt(0) == '~') {
				arg1.aString76 = arg1.aString76.substring(1);
				Static574.method8209(arg1.aString77, arg1.aString76, arg1.method6949(), arg1.method6939(), 2, 0);
			} else if (arg1 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1) {
				Static574.method8209(arg1.aString77, arg1.aString76, arg1.method6949(), arg1.method6939(), 2, 0);
			}
			arg1.anInt8399 = 150;
			arg1.anInt8362 = 0;
			arg1.anInt8430 = 0;
		}
		if ((arg3 & 0x2) != 0) {
			local37 = arg2.method4942();
			local229 = arg2.method4905();
			arg1.method6931(Static106.anInt2418, local229, local37);
			arg1.anInt8444 = Static106.anInt2418 + 300;
			arg1.anInt8385 = arg2.method4916();
		}
		if ((arg3 & 0x1000) != 0) {
			local37 = arg2.method4923();
			local229 = arg2.method4931();
			if (local37 == 65535) {
				local37 = -1;
			}
			local256 = arg2.method4938();
			arg1.method6928(local229, local37, local256, true);
		}
		if ((arg3 & 0x8) != 0) {
			local37 = arg2.method4936();
			if (local37 == 65535) {
				local37 = -1;
			}
			local229 = arg2.method4931();
			local256 = arg2.method4916();
			arg1.method6928(local229, local37, local256, false);
		}
		if ((arg3 & 0x40000) != 0) {
			arg1.aByte105 = arg2.method4925();
			arg1.aByte106 = arg2.method4953();
			arg1.aByte107 = arg2.method4953();
			arg1.aByte104 = (byte) arg2.method4916();
			arg1.anInt8377 = Static106.anInt2418 + arg2.method4950();
			arg1.anInt8418 = Static106.anInt2418 + arg2.method4955();
		}
		if ((arg3 & 0x20000) != 0) {
			local37 = Static106.anInt2418;
			local229 = arg2.method4942();
			local256 = arg2.method4938();
			arg1.method6931(local37, local256, local229);
		}
		if (!arg1.aBoolean595) {
			return;
		}
		if (local16 == 127) {
			arg1.method6943(arg1.anInt8450, arg1.anInt8455);
			return;
		}
		@Pc(714) byte local714;
		if (local16 == -1) {
			local714 = Static278.aByteArray67[arg0];
		} else {
			local714 = local16;
		}
		arg1.method6944(arg1.anInt8450, arg1.anInt8455, local714);
	}
}

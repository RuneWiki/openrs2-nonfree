import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_66 = new Class218(60, 4);

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
	public static int anInt5580 = 0;

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
	public static int anInt5581 = 2;

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "[S")
	public static short[] aShortArray78 = new short[256];

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
	public static final int anInt5587 = 1400;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!lea;BILclient!dfa;)V")
	public static void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub15_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg0 & 0x200) != 0) {
			local7 = arg3.method8443();
		}
		if ((arg0 & 0x8000) != 0) {
			arg1.aBoolean540 = arg3.method8447() == 1;
		}
		if ((arg0 & 0x80) != 0) {
			Static584.aByteArray98[arg2] = arg3.method8432();
		}
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(72) int local72;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if ((arg0 & 0x8) != 0) {
			local53 = arg3.method8424();
			if (local53 > 0) {
				for (local60 = 0; local60 < local53; local60++) {
					local64 = -1;
					local66 = -1;
					local68 = -1;
					local72 = arg3.method8465();
					if (local72 == 32767) {
						local72 = arg3.method8465();
						local66 = arg3.method8465();
						local64 = arg3.method8465();
						local68 = arg3.method8465();
					} else if (local72 == 32766) {
						local72 = -1;
					} else {
						local66 = arg3.method8465();
					}
					@Pc(110) int local110 = arg3.method8465();
					@Pc(114) int local114 = arg3.method8424();
					arg1.method5311(local66, anInt5580, local110, local72, local68, local114, local64);
				}
			}
		}
		@Pc(139) int[] local139;
		@Pc(142) int[] local142;
		if ((arg0 & 0x400) != 0) {
			local53 = arg3.method8401();
			local139 = new int[local53];
			local142 = new int[local53];
			@Pc(145) int[] local145 = new int[local53];
			for (local66 = 0; local66 < local53; local66++) {
				local68 = arg3.method8460();
				if (local68 == 65535) {
					local68 = -1;
				}
				local139[local66] = local68;
				local142[local66] = arg3.method8424();
				local145[local66] = arg3.method8460();
			}
			Static559.method7899(local145, local142, arg1, local139);
		}
		if ((arg0 & 0x100) != 0) {
			local53 = arg3.method8414();
			arg1.anInt6338 = arg3.method8461();
			arg1.anInt6286 = arg3.method8424();
			arg1.aBoolean532 = (local53 & 0x8000) != 0;
			arg1.anInt6334 = local53 & 0x7FFF;
			arg1.anInt6320 = arg1.anInt6334 + anInt5580 + arg1.anInt6338;
		}
		if ((arg0 & 0x10) != 0) {
			local53 = arg3.method8429();
			local60 = arg3.method8418();
			if (local53 == 65535) {
				local53 = -1;
			}
			local72 = arg3.method8401();
			local64 = local72 & 0x7;
			local66 = local72 >> 3 & 0xF;
			if (local66 == 15) {
				local66 = -1;
			}
			arg1.method5315(local60, local66, false, local53, local64);
		}
		if ((arg0 & 0x4000) != 0) {
			arg1.aString66 = arg3.method8413();
			if (arg1.aString66.charAt(0) == '~') {
				arg1.aString66 = arg1.aString66.substring(1);
				Static97.method2492(arg1.aString67, arg1.method5331(), 2, arg1.method5327(), 0, arg1.aString66);
			} else if (arg1 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2) {
				Static97.method2492(arg1.aString67, arg1.method5331(), 2, arg1.method5327(), 0, arg1.aString66);
			}
			arg1.anInt6282 = 150;
			arg1.anInt6291 = 0;
			arg1.anInt6332 = 0;
		}
		if ((arg0 & 0x2) != 0) {
			local53 = arg3.method8424();
			@Pc(370) byte[] local370 = new byte[local53];
			@Pc(375) Class3_Sub15 local375 = new Class3_Sub15(local370);
			arg3.method8404(local370, local53);
			Static122.aClass3_Sub15Array1[arg2] = local375;
			arg1.method5324(local375);
		}
		if ((arg0 & 0x4) != 0) {
			local53 = arg3.method8460();
			if (local53 == 65535) {
				local53 = -1;
			}
			arg1.anInt6331 = local53;
		}
		if ((arg0 & 0x2000) != 0) {
			arg1.anInt6330 = arg3.method8443();
			arg1.anInt6298 = arg3.method8440();
			arg1.anInt6280 = arg3.method8443();
			arg1.lb = arg3.method8438();
			arg1.anInt6278 = arg3.method8414() + anInt5580;
			arg1.anInt6290 = arg3.method8414() + anInt5580;
			arg1.anInt6271 = arg3.method8461();
			arg1.anInt6346 = 0;
			if (arg1.aBoolean539) {
				arg1.anInt6298 += arg1.anInt6359;
				arg1.lb += arg1.anInt6359;
				arg1.anInt6330 += arg1.anInt6376;
				arg1.anInt6343 = 0;
				arg1.anInt6280 += arg1.anInt6376;
			} else {
				arg1.anInt6330 += arg1.anIntArray378[0];
				arg1.anInt6343 = 1;
				arg1.lb += arg1.anIntArray377[0];
				arg1.anInt6298 += arg1.anIntArray377[0];
				arg1.anInt6280 += arg1.anIntArray378[0];
			}
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt6384 = arg3.method8460();
			if (arg1.anInt6343 == 0) {
				arg1.method5319(arg1.anInt6384);
				arg1.anInt6384 = -1;
			}
		}
		if ((arg0 & 0x40000) != 0) {
			local53 = arg3.method8401();
			local139 = new int[local53];
			local142 = new int[local53];
			for (local64 = 0; local64 < local53; local64++) {
				local66 = arg3.method8414();
				if ((local66 & 0xC000) == 49152) {
					local68 = arg3.method8429();
					local139[local64] = local68 | local66 << 16;
				} else {
					local139[local64] = local66;
				}
				local142[local64] = arg3.method8414();
			}
			arg1.method5310(local142, local139);
		}
		if ((arg0 & 0x800) != 0) {
			local53 = arg3.method8429();
			local60 = arg3.method8451();
			if (local53 == 65535) {
				local53 = -1;
			}
			local72 = arg3.method8424();
			local64 = local72 & 0x7;
			local66 = local72 >> 3 & 0xF;
			if (local66 == 15) {
				local66 = -1;
			}
			arg1.method5315(local60, local66, true, local53, local64);
		}
		if ((arg0 & 0x1) != 0) {
			@Pc(669) int[] local669 = new int[4];
			for (local60 = 0; local60 < 4; local60++) {
				local669[local60] = arg3.method8460();
				if (local669[local60] == 65535) {
					local669[local60] = -1;
				}
			}
			local72 = arg3.method8401();
			Static63.method1344(local669, arg1, local72);
		}
		if ((arg0 & 0x10000) != 0) {
			arg1.aByte79 = arg3.method8440();
			arg1.aByte82 = arg3.method8432();
			arg1.aByte78 = arg3.method8432();
			arg1.aByte80 = (byte) arg3.method8401();
			arg1.anInt6274 = anInt5580 + arg3.method8414();
			arg1.anInt6268 = anInt5580 + arg3.method8426();
		}
		if (!arg1.aBoolean539) {
			return;
		}
		if (local7 == 127) {
			arg1.method5329(arg1.anInt6359, arg1.anInt6376);
			return;
		}
		@Pc(768) byte local768;
		if (local7 == -1) {
			local768 = Static584.aByteArray98[arg2];
		} else {
			local768 = local7;
		}
		Static321.method4756(local768, arg1);
		arg1.method5323(arg1.anInt6359, local768, arg1.anInt6376);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CB)C")
	public static char method4759(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I")
	public static int method4760() {
		return Static477.anInt8517++;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIB)V")
	public static void method4761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static457.anInt8300; local7++) {
			@Pc(13) Rectangle local13 = Class160.aRectangleArray2[local7];
			if (local13.width + local13.x > arg3 && arg0 + arg3 > local13.x && local13.height + local13.y > arg1 && local13.y < arg1 + arg2) {
				Static178.aBooleanArray12[local7] = true;
			}
		}
		Static241.method4616(arg1 + arg2, arg1, arg0 + arg3, arg3);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class33 method4762(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new Class33_Sub2(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)V")
	public static void method4763() {
		Static582.method8047();
		Static433.aBoolean672 = false;
		method4761(Static582.anInt9731, Static434.anInt7939, Static554.anInt9455, Static326.anInt6543);
	}
}

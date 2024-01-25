import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
	public static int anInt7119;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_95 = new Class61(42, 3);

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([IZII[Ljava/lang/Object;)V")
	public static void method5907(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg2) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg2; local62++) {
			if ((local60 & local62) + local29 > arg0[local62]) {
				@Pc(81) int local81 = arg0[local62];
				arg0[local62] = arg0[local25];
				arg0[local25] = local81;
				@Pc(95) Object local95 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25++] = local95;
			}
		}
		arg0[arg2] = arg0[local25];
		arg0[local25] = local29;
		arg3[arg2] = arg3[local25];
		arg3[local25] = local43;
		method5907(arg0, arg1, local25 - 1, arg3);
		method5907(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!st;Lclient!cea;III)V")
	public static void method5909(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) Class4_Sub9_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		@Pc(43) int local43;
		if ((arg2 & 0x1) != 0) {
			@Pc(12) int[] local12 = new int[4];
			for (local14 = 0; local14 < 4; local14++) {
				local12[local14] = arg1.method5977();
				if (local12[local14] == 65535) {
					local12[local14] = -1;
				}
			}
			local43 = arg1.method6009();
			Static311.method4788(arg0, local43, local12);
		}
		@Pc(55) byte local55 = -1;
		@Pc(64) int local64;
		if ((arg2 & 0x20000) != 0) {
			local64 = Static237.anInt7561;
			local14 = arg1.method5978();
			local43 = arg1.method6014();
			arg0.method7036(local64, local14, local43);
		}
		if ((arg2 & 0x4) != 0) {
			local64 = arg1.method5978();
			local14 = arg1.method6015();
			arg0.method7036(Static237.anInt7561, local64, local14);
			arg0.anInt8505 = Static237.anInt7561 + 300;
			arg0.anInt8534 = arg1.method6014();
		}
		if ((arg2 & 0x800) != 0) {
			local64 = arg1.method5977();
			arg0.anInt8524 = arg1.method6014();
			arg0.anInt8523 = arg1.method6027();
			arg0.aBoolean593 = (local64 & 0x8000) != 0;
			arg0.anInt8492 = local64 & 0x7FFF;
			arg0.anInt8464 = Static237.anInt7561 + arg0.anInt8492 + arg0.anInt8524;
		}
		if ((arg2 & 0x2000) != 0) {
			arg0.aBoolean598 = arg1.method6009() == 1;
		}
		if ((arg2 & 0x400) != 0) {
			arg0.aString91 = arg1.method6010();
			if (arg0.aString91.charAt(0) == '~') {
				arg0.aString91 = arg0.aString91.substring(1);
				Static410.method5899(arg0.method7047(), arg0.aString92, arg0.aString91, 2, arg0.method7042(), 0);
			} else if (Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0) {
				Static410.method5899(arg0.method7047(), arg0.aString92, arg0.aString91, 2, arg0.method7042(), 0);
			}
			arg0.anInt8501 = 150;
			arg0.anInt8499 = 0;
			arg0.anInt8471 = 0;
		}
		if ((arg2 & 0x10000) != 0) {
			arg0.aByte93 = arg1.method6025();
			arg0.aByte92 = arg1.method5981();
			arg0.aByte94 = arg1.method5981();
			arg0.aByte91 = (byte) arg1.method6009();
			arg0.anInt8490 = Static237.anInt7561 + arg1.method5982();
			arg0.anInt8463 = Static237.anInt7561 + arg1.method5994();
		}
		if ((arg2 & 0x1000) != 0) {
			arg0.anInt8495 = arg1.method6004();
			arg0.anInt8485 = arg1.method6004();
			arg0.anInt8530 = arg1.method6025();
			arg0.anInt8503 = arg1.method6021();
			arg0.anInt8462 = arg1.method5994() + Static237.anInt7561;
			arg0.anInt8509 = arg1.method5982() + Static237.anInt7561;
			arg0.anInt8525 = arg1.method6015();
			arg0.anInt8536 = 0;
			if (arg0.aBoolean596) {
				arg0.anInt8495 += arg0.anInt8555;
				arg0.anInt8503 += arg0.anInt8567;
				arg0.anInt8485 += arg0.anInt8567;
				arg0.anInt8530 += arg0.anInt8555;
				arg0.anInt8537 = 0;
			} else {
				arg0.anInt8503 += arg0.anIntArray654[0];
				arg0.anInt8495 += arg0.anIntArray653[0];
				arg0.anInt8537 = 1;
				arg0.anInt8485 += arg0.anIntArray654[0];
				arg0.anInt8530 += arg0.anIntArray653[0];
			}
		}
		if ((arg2 & 0x4000) != 0) {
			local64 = arg1.method6027();
			@Pc(433) int[] local433 = new int[local64];
			@Pc(436) int[] local436 = new int[local64];
			@Pc(439) int[] local439 = new int[local64];
			for (@Pc(441) int local441 = 0; local441 < local64; local441++) {
				@Pc(447) int local447 = arg1.method6005();
				if (local447 == 65535) {
					local447 = -1;
				}
				local433[local441] = local447;
				local436[local441] = arg1.method6015();
				local439[local441] = arg1.method5994();
			}
			Static153.method3080(local436, local439, arg0, local433);
		}
		if ((arg2 & 0x100) != 0) {
			local64 = arg1.method6005();
			if (local64 == 65535) {
				local64 = -1;
			}
			local14 = arg1.method5973();
			local43 = arg1.method6009();
			arg0.method7024(local14, local64, local43, true);
		}
		if ((arg2 & 0x200) != 0) {
			local55 = arg1.method6025();
		}
		if ((arg2 & 0x2) != 0) {
			local64 = arg1.method6027();
			@Pc(544) byte[] local544 = new byte[local64];
			@Pc(549) Class4_Sub9 local549 = new Class4_Sub9(local544);
			arg1.method5986(local64, local544);
			Static590.aClass4_Sub9Array1[arg3] = local549;
			arg0.method7048(local549);
		}
		if ((arg2 & 0x10) != 0) {
			local64 = arg1.method5994();
			if (local64 == 65535) {
				local64 = -1;
			}
			arg0.anInt8465 = local64;
		}
		if ((arg2 & 0x80) != 0) {
			arg0.anInt8547 = arg1.method5977();
			if (arg0.anInt8537 == 0) {
				arg0.method7034(arg0.anInt8547);
				arg0.anInt8547 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local64 = arg1.method6005();
			local14 = arg1.method6026();
			if (local64 == 65535) {
				local64 = -1;
			}
			local43 = arg1.method6015();
			arg0.method7024(local14, local64, local43, false);
		}
		if ((arg2 & 0x40) != 0) {
			Static178.aByteArray43[arg3] = arg1.method5981();
		}
		if (!arg0.aBoolean596) {
			return;
		}
		if (local55 == 127) {
			arg0.method7045(arg0.anInt8567, arg0.anInt8555);
			return;
		}
		@Pc(658) byte local658;
		if (local55 == -1) {
			local658 = Static178.aByteArray43[arg3];
		} else {
			local658 = local55;
		}
		arg0.method7046(arg0.anInt8555, local658, arg0.anInt8567);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)B")
	public static byte method5911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_26 = new Class151(12, -1);

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[I")
	public static final int[] anIntArray85 = new int[1000];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public static void method1322(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static106.anInt2134 == 1) {
			Static340.aClass33_9.method8141(arg0, arg1, Static658.anInt10391, Static426.anInt6744);
		} else {
			Static340.aClass33_9.method8141(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)I")
	public static int method1324(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(67) char local67;
			if (local17 == '\u0000') {
				local67 = arg1.charAt(local13++);
			} else {
				local67 = local17;
			}
			@Pc(80) char local80;
			if (local19 == '\u0000') {
				local80 = arg2.charAt(local15++);
			} else {
				local80 = local19;
			}
			local17 = Static358.method4778(local67);
			local19 = Static358.method4778(local80);
			local67 = Static629.method8440(local67, arg0);
			local80 = Static629.method8440(local80, arg0);
			if (local80 != local67 && Character.toUpperCase(local67) != Character.toUpperCase(local80)) {
				local67 = Character.toLowerCase(local67);
				local80 = Character.toLowerCase(local80);
				if (local80 != local67) {
					return Static610.method7997(local67, arg0) - Static610.method7997(local80, arg0);
				}
			}
		}
		@Pc(142) int local142 = Math.min(local8, local11);
		for (@Pc(149) int local149 = 0; local149 < local142; local149++) {
			if (arg0 == 2) {
				local13 = local8 - local149 - 1;
				local15 = local11 - local149 - 1;
			} else {
				local15 = local149;
				local13 = local149;
			}
			@Pc(180) char local180 = arg1.charAt(local13);
			@Pc(184) char local184 = arg2.charAt(local15);
			if (local180 != local184 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local180 != local184) {
					return Static610.method7997(local180, arg0) - Static610.method7997(local184, arg0);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(230) int local230 = 0; local230 < local142; local230++) {
			@Pc(236) char local236 = arg1.charAt(local230);
			@Pc(240) char local240 = arg2.charAt(local230);
			if (local240 != local236) {
				return Static610.method7997(local236, arg0) - Static610.method7997(local240, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!iaa;BLclient!bn;II)V")
	public static void method1325(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) Class4_Sub11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if ((arg2 & 0x8) != 0) {
			local15 = arg1.method8862();
			if (local15 > 0) {
				for (local19 = 0; local19 < local15; local19++) {
					local23 = -1;
					local25 = -1;
					local27 = -1;
					local31 = arg1.method8823();
					if (local31 == 32767) {
						local31 = arg1.method8823();
						local25 = arg1.method8823();
						local23 = arg1.method8823();
						local27 = arg1.method8823();
					} else if (local31 == 32766) {
						local31 = -1;
					} else {
						local25 = arg1.method8823();
					}
					@Pc(69) int local69 = arg1.method8823();
					@Pc(73) int local73 = arg1.method8855();
					arg0.method8511(local27, local23, local25, Static177.anInt3088, local31, local73, local69);
				}
			}
		}
		if ((arg2 & 0x40) != 0) {
			local15 = arg1.method8862();
			@Pc(98) byte[] local98 = new byte[local15];
			@Pc(103) Class4_Sub11 local103 = new Class4_Sub11(local98);
			arg1.method8833(local15, local98);
			Static57.aClass4_Sub11Array1[arg3] = local103;
			arg0.method3537(local103);
		}
		@Pc(131) int[] local131;
		@Pc(134) int[] local134;
		if ((arg2 & 0x40000) != 0) {
			local15 = arg1.method8865();
			local131 = new int[local15];
			local134 = new int[local15];
			for (local23 = 0; local23 < local15; local23++) {
				local25 = arg1.method8859();
				if ((local25 & 0xC000) == 49152) {
					local27 = arg1.method8890();
					local131[local23] = local25 << 16 | local27;
				} else {
					local131[local23] = local25;
				}
				local134[local23] = arg1.method8883();
			}
			arg0.method8528(local134, local131);
		}
		if ((arg2 & 0x1000) != 0) {
			arg0.aBoolean292 = arg1.method8843() == 1;
		}
		if ((arg2 & 0x4) != 0) {
			local15 = arg1.method8859();
			if (local15 == 65535) {
				local15 = -1;
			}
			arg0.anInt9947 = local15;
		}
		if ((arg2 & 0x80000) != 0) {
			local15 = arg1.method8871();
			local19 = arg1.method8850();
			if (local15 == 65535) {
				local15 = -1;
			}
			local31 = arg1.method8843();
			local23 = local31 & 0x7;
			local25 = local31 >> 3 & 0xF;
			if (local25 == 15) {
				local25 = -1;
			}
			arg0.method8530(2, local15, local25, local23, local19);
		}
		if ((arg2 & 0x10) != 0) {
			local15 = arg1.method8859();
			local19 = arg1.method8837();
			if (local15 == 65535) {
				local15 = -1;
			}
			local31 = arg1.method8855();
			local23 = local31 & 0x7;
			local25 = local31 >> 3 & 0xF;
			if (local25 == 15) {
				local25 = -1;
			}
			arg0.method8530(0, local15, local25, local23, local19);
		}
		if ((arg2 & 0x4000) != 0) {
			local7 = arg1.method8875();
		}
		if ((arg2 & 0x100) != 0) {
			local15 = arg1.method8871();
			if (local15 == 65535) {
				local15 = -1;
			}
			local19 = arg1.method8826();
			local31 = arg1.method8855();
			local23 = local31 & 0x7;
			local25 = local31 >> 3 & 0xF;
			if (local25 == 15) {
				local25 = -1;
			}
			arg0.method8530(1, local15, local25, local23, local19);
		}
		if ((arg2 & 0x2) != 0) {
			Static175.aByteArray38[arg3] = arg1.method8882();
		}
		if ((arg2 & 0x80) != 0) {
			@Pc(402) int[] local402 = new int[4];
			for (local19 = 0; local19 < 4; local19++) {
				local402[local19] = arg1.method8871();
				if (local402[local19] == 65535) {
					local402[local19] = -1;
				}
			}
			local31 = arg1.method8865();
			Static209.method3124(local31, local402, arg0);
		}
		if ((arg2 & 0x2000) != 0) {
			arg0.aString119 = arg1.method8853();
			if (arg0.aString119.charAt(0) == '~') {
				arg0.aString119 = arg0.aString119.substring(1);
				Static388.method5002(arg0.aString36, arg0.aString119, arg0.method3532(), arg0.method3531(), 2, 0);
			} else if (arg0 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4) {
				Static388.method5002(arg0.aString36, arg0.aString119, arg0.method3532(), arg0.method3531(), 2, 0);
			}
			arg0.anInt9993 = 150;
			arg0.anInt9990 = 0;
			arg0.anInt9953 = 0;
		}
		if ((arg2 & 0x10000) != 0) {
			arg0.aBoolean291 = arg1.method8862() == 1;
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt3955 = arg1.method8859();
			if (arg0.anInt10003 == 0) {
				arg0.method8524(arg0.anInt3955);
				arg0.anInt3955 = -1;
			}
		}
		if ((arg2 & 0x20000) != 0) {
			arg0.aByte145 = arg1.method8831();
			arg0.aByte144 = arg1.method8875();
			arg0.aByte146 = arg1.method8882();
			arg0.aByte147 = (byte) arg1.method8862();
			arg0.anInt9956 = Static177.anInt3088 + arg1.method8859();
			arg0.anInt9994 = Static177.anInt3088 + arg1.method8883();
		}
		if ((arg2 & 0x8000) != 0) {
			arg0.anInt9952 = arg1.method8861();
			arg0.anInt9969 = arg1.method8875();
			arg0.anInt9933 = arg1.method8875();
			arg0.anInt9966 = arg1.method8875();
			arg0.anInt9945 = arg1.method8871() + Static177.anInt3088;
			arg0.anInt9987 = arg1.method8890() + Static177.anInt3088;
			arg0.anInt9979 = arg1.method8865();
			if (arg0.aBoolean290) {
				arg0.anInt9966 += arg0.anInt3938;
				arg0.anInt9952 += arg0.anInt3931;
				arg0.anInt10003 = 0;
				arg0.anInt9969 += arg0.anInt3938;
				arg0.anInt9933 += arg0.anInt3931;
			} else {
				arg0.anInt9969 += arg0.anIntArray694[0];
				arg0.anInt9933 += arg0.anIntArray693[0];
				arg0.anInt9966 += arg0.anIntArray694[0];
				arg0.anInt10003 = 1;
				arg0.anInt9952 += arg0.anIntArray693[0];
			}
			arg0.anInt10001 = 0;
		}
		if ((arg2 & 0x400) != 0) {
			local15 = arg1.method8862();
			local131 = new int[local15];
			local134 = new int[local15];
			@Pc(734) int[] local734 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				local27 = arg1.method8859();
				if (local27 == 65535) {
					local27 = -1;
				}
				local131[local25] = local27;
				local134[local25] = arg1.method8843();
				local734[local25] = arg1.method8871();
			}
			Static397.method5090(arg0, local134, local734, local131);
		}
		if ((arg2 & 0x800) != 0) {
			local15 = arg1.method8883();
			arg0.anInt9975 = arg1.method8855();
			arg0.anInt9995 = arg1.method8862();
			arg0.anInt9937 = local15 & 0x7FFF;
			arg0.aBoolean774 = (local15 & 0x8000) != 0;
			arg0.anInt9949 = arg0.anInt9975 + Static177.anInt3088 + arg0.anInt9937;
		}
		if (!arg0.aBoolean290) {
			return;
		}
		if (local7 == 127) {
			arg0.method3534(arg0.anInt3931, arg0.anInt3938);
			return;
		}
		@Pc(842) byte local842;
		if (local7 == -1) {
			local842 = Static175.aByteArray38[arg3];
		} else {
			local842 = local7;
		}
		Static384.method4983(local842, arg0);
		arg0.method3530(arg0.anInt3931, arg0.anInt3938, local842);
	}
}

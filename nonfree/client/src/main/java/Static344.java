import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[4];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5903(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local12) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(73) int local73;
				if (local25 >= '0' && local25 <= '9') {
					local73 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local73 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local73 = local25 - 55;
				}
				local25 = arg0.charAt(local19 + 2);
				local73 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local73 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local73 += local25 + 10 - 'a';
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local73 += local25 + '\n' - 65;
				}
				if (local73 != 0 && Static252.method4681((byte) local73)) {
					local9.append(Static172.method3629((byte) local73));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!kda;)V")
	public static void method5905(@OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static407.anInt7704 == arg0.anInt6091 || arg0.anInt6079 == -1 || arg0.anInt6029 != 0) {
			local5 = true;
		} else {
			@Pc(28) Class130 local28 = Static195.aClass193_1.method5573(arg0.anInt6079);
			if (local28.aBoolean346 || arg0.anInt6037 + 1 > local28.anIntArray242[arg0.anInt6063]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(60) int local60 = arg0.anInt6091 - arg0.anInt6042;
			@Pc(66) int local66 = Static407.anInt7704 - arg0.anInt6042;
			@Pc(77) int local77 = arg0.anInt6085 * 512 + arg0.method5214() * 256;
			@Pc(89) int local89 = arg0.anInt6101 * 512 + arg0.method5214() * 256;
			@Pc(100) int local100 = arg0.anInt6044 * 512 + arg0.method5214() * 256;
			@Pc(112) int local112 = arg0.anInt6081 * 512 + arg0.method5214() * 256;
			arg0.anInt10303 = (local100 * local66 + (local60 - local66) * local77) / local60;
			arg0.anInt10310 = (local89 * (local60 - local66) + local66 * local112) / local60;
		}
		arg0.anInt6105 = 0;
		if (arg0.anInt6036 == 0) {
			arg0.method5213(8192, false);
		}
		if (arg0.anInt6036 == 1) {
			arg0.method5213(12288, false);
		}
		if (arg0.anInt6036 == 2) {
			arg0.method5213(0, false);
		}
		if (arg0.anInt6036 == 3) {
			arg0.method5213(4096, false);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public static void method5906() {
		Static13.anInt197 = 0;
		Static515.anInt9427 = 0;
		Static319.anInt6496 = 0;
		Static440.anInt8154 = 0;
	}
}

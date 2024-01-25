import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_38 = new Class26(260);

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public static int anInt4002 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIIIZI)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static252.anInt5973 = arg5;
		Static33.anInt592 = arg3;
		Static344.anInt6592 = arg0;
		Static145.anInt2656 = arg1;
		Static25.anInt6259 = arg2;
		if (arg4 && Static252.anInt5973 >= 100) {
			Static190.anInt3870 = Static25.anInt6259 * 128 + 64;
			Static316.anInt6169 = Static145.anInt2656 * 128 + 64;
			Static86.anInt1541 = Static168.method2721(Static190.anInt3870, Static322.anInt6250, Static316.anInt6169) - Static33.anInt592;
		}
		Static81.anInt1498 = 2;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3564() {
		Static313.aClass11_Sub25_Sub1_5.method2454(200);
		Static313.aClass11_Sub25_Sub1_5.method5186(0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method3567(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg1[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg0 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(69) int local69 = arg2; local69 < local29; local69++) {
				@Pc(75) String local75 = arg1[local69];
				if (local75 == null) {
					local62.append("null");
				} else {
					local62.append(local75);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method3568() {
		if (Static160.anInt6123 < 0) {
			return;
		}
		@Pc(7) long local7 = Static268.method4627();
		Static160.anInt6123 = (int) ((long) Static160.anInt6123 + Static247.aLong146 - local7);
		if (Static160.anInt6123 <= 0) {
			Static262.anInt5357 = Static216.aClass214_3.anInt6700;
			Static86.aFloat12 = Static216.aClass214_3.aFloat78;
			Static112.aFloat14 = Static216.aClass214_3.aFloat80;
			Static106.anInt1978 = Static216.aClass214_3.anInt6692;
			Static160.anInt6123 = -1;
			Static202.aFloat31 = Static216.aClass214_3.aFloat76;
			Static79.anInt5258 = Static216.aClass214_3.anInt6691;
			Static294.aClass132_2 = Static216.aClass214_3.aClass132_4;
			Static148.aFloat20 = Static216.aClass214_3.aFloat79;
			Static7.aFloat1 = Static216.aClass214_3.aFloat81;
			Static76.aFloat52 = Static216.aClass214_3.aFloat77;
		} else {
			@Pc(61) int local61 = (Static160.anInt6123 << 8) / Static59.anInt1129;
			@Pc(66) int local66 = 255 - local61;
			@Pc(71) float local71 = (float) local61 / 255.0F;
			@Pc(75) float local75 = 1.0F - local71;
			Static262.anInt5357 = ((Static216.aClass214_3.anInt6700 & 0xFF00FF) * local66 + local61 * (Static211.anInt4305 & 0xFF00FF) & 0xFF00FF00) + (local61 * (Static211.anInt4305 & 0xFF00) + ((Static216.aClass214_3.anInt6700 & 0xFF00) * local66) & 0xFF0000) >>> 8;
			Static202.aFloat31 = Static140.aFloat16 + local75 * (Static216.aClass214_3.aFloat76 - Static140.aFloat16);
			Static86.aFloat12 = (Static216.aClass214_3.aFloat78 - Static34.aFloat6) * local75 + Static34.aFloat6;
			Static76.aFloat52 = local75 * (Static216.aClass214_3.aFloat77 - Static52.aFloat50) + Static52.aFloat50;
			Static112.aFloat14 = Static81.aFloat11 + local75 * (Static216.aClass214_3.aFloat80 - Static81.aFloat11);
			Static7.aFloat1 = (Static216.aClass214_3.aFloat81 - Static299.aFloat75) * local75 + Static299.aFloat75;
			Static148.aFloat20 = (Static216.aClass214_3.aFloat79 - Static180.aFloat49) * local75 + Static180.aFloat49;
			Static106.anInt1978 = ((Static150.anInt2719 & 0xFF00FF) * local61 + local66 * (Static216.aClass214_3.anInt6692 & 0xFF00FF) & 0xFF00FF00) + (local61 * (Static150.anInt2719 & 0xFF00) + (local66 * (Static216.aClass214_3.anInt6692 & 0xFF00)) & 0xFF0000) >>> 8;
			Static79.anInt5258 = Static235.anInt4736 * local61 + local66 * Static216.aClass214_3.anInt6691 >> 8;
			if (Static216.aClass214_3.aClass132_4 != Static305.aClass132_3) {
				Static294.aClass132_2 = Static85.aClass129_2.method4965(Static305.aClass132_3, Static216.aClass214_3.aClass132_4, local75, Static294.aClass132_2);
			}
		}
		Static247.aLong146 = local7;
	}
}

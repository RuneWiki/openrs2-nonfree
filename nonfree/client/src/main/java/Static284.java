import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!ic;")
	public static Class113 aClass113_88;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method3698() {
		Static38.aClass128_9.ua(Static85.aFloat74 * ((float) Static336.aClass106_Sub1_1.anInt5698 * 0.1F + 0.7F));
		Static38.aClass128_9.XA(Static308.anInt5126, Static84.aFloat24, Static453.aFloat102, (float) (Static195.anInt3124 << 0), (float) (Static337.anInt1768 << 0), (float) (Static20.anInt438 << 0));
		Static38.aClass128_9.method3576(Static252.aClass9_3);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3699(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString66 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(63) String local63 = local53.readLine();
		while (true) {
			@Pc(66) String local66 = local53.readLine();
			if (local66 == null) {
				return local10 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(87) String local87;
			if (local72 == -1) {
				local87 = local66;
			} else {
				local87 = local66.substring(0, local72);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local10 = local10 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(131) int local131 = local66.indexOf(".java:", local72);
				if (local131 >= 0) {
					local10 = local10 + local66.substring(local131 + 5, local79);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!qa;Lclient!er;IIIII)V")
	public static void method3701(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static97.anInt1709) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static362.anInt6113) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static195.anInt3127 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class82 local62 = Static159.aClass82ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static202.aClass163Array2[local17].I(local23, local32) + Static202.aClass163Array2[local17].I(local23 + 1, local32) + Static202.aClass163Array2[local17].I(local23, local32 + 1) + Static202.aClass163Array2[local17].I(local23 + 1, local32 + 1)) / 4 - (Static202.aClass163Array2[arg2].I(arg3, arg4) + Static202.aClass163Array2[arg2].I(arg3 + 1, arg4) + Static202.aClass163Array2[arg2].I(arg3, arg4 + 1) + Static202.aClass163Array2[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class20_Sub1 local143 = local62.aClass20_Sub1_2;
									@Pc(146) Class20_Sub1 local146 = local62.aClass20_Sub1_3;
									if (local143 != null && local143.method5110()) {
										arg1.method5116(local1, (local23 - arg3) * Static329.anInt5395 + (1 - arg5) * Static188.anInt3025, local140, local143, arg0, (local32 - arg4) * Static329.anInt5395 + (1 - arg6) * Static188.anInt3025);
									}
									if (local146 != null && local146.method5110()) {
										arg1.method5116(local1, (local23 - arg3) * Static329.anInt5395 + (1 - arg5) * Static188.anInt3025, local140, local146, arg0, (local32 - arg4) * Static329.anInt5395 + (1 - arg6) * Static188.anInt3025);
									}
									for (@Pc(219) Class146 local219 = local62.aClass146_1; local219 != null; local219 = local219.aClass146_3) {
										@Pc(223) Class20_Sub3 local223 = local219.aClass20_Sub3_1;
										if (local223 != null && local223.method5110() && (local23 == local223.aShort85 || local23 == local3) && (local32 == local223.aShort88 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort87 + 1 - local223.aShort85;
											@Pc(260) int local260 = local223.aShort86 + 1 - local223.aShort88;
											arg1.method5116(local1, (local223.aShort85 - arg3) * Static329.anInt5395 + (local252 - arg5) * Static188.anInt3025, local140, local223, arg0, (local223.aShort88 - arg4) * Static329.anInt5395 + (local260 - arg6) * Static188.anInt3025);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZII)I")
	public static int method3702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static57.anIntArray49[arg1 & 0x3] : Static39.anIntArray490[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	public static void method3703() {
		@Pc(1) Class167 local1 = Static416.aClass167_95;
		synchronized (Static416.aClass167_95) {
			Static416.aClass167_95.method3384(5);
		}
		local1 = Static43.aClass167_74;
		synchronized (Static43.aClass167_74) {
			Static43.aClass167_74.method3384(5);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!td;B[[B)V")
	public static void method3704(@OriginalArg(0) Class148_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt6342; local7++) {
			Static15.method239();
			for (@Pc(13) int local13 = 0; local13 < Static425.anInt6922 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static251.anInt4072 >> 3; local17++) {
					@Pc(27) int local27 = Static303.anIntArrayArrayArray13[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean521 || local37 == 0) {
							@Pc(51) int local51 = local27 >> 1 & 0x3;
							@Pc(57) int local57 = local27 >> 14 & 0x3FF;
							@Pc(63) int local63 = local27 >> 3 & 0x7FF;
							@Pc(73) int local73 = (local57 / 8 << 8) + local63 / 8;
							for (@Pc(75) int local75 = 0; local75 < Static334.anIntArray331.length; local75++) {
								if (local73 == Static334.anIntArray331[local75] && arg1[local75] != null) {
									arg0.method4890(local51, Static383.aClass247Array1, arg1[local75], local7, local13 * 8, (local63 & 0x7) * 8, Static213.aClass128_22, local17 * 8, local37, (local57 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!ic;)I")
	public static int method3705(@OriginalArg(1) Class113 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2253(Static101.anInt6649)) {
			local5++;
		}
		if (arg0.method2253(Static108.anInt1919)) {
			local5++;
		}
		if (arg0.method2253(Static234.anInt3783)) {
			local5++;
		}
		if (arg0.method2253(Static404.anInt6535)) {
			local5++;
		}
		if (arg0.method2253(Static333.anInt5454)) {
			local5++;
		}
		if (arg0.method2253(Static1.anInt47)) {
			local5++;
		}
		if (arg0.method2253(Static448.anInt6651)) {
			local5++;
		}
		if (arg0.method2253(Static203.anInt3324)) {
			local5++;
		}
		if (arg0.method2253(Static139.anInt2346)) {
			local5++;
		}
		if (arg0.method2253(Static339.anInt5508)) {
			local5++;
		}
		if (arg0.method2253(Static256.anInt4099)) {
			local5++;
		}
		if (arg0.method2253(Static38.anInt740)) {
			local5++;
		}
		if (arg0.method2253(Static212.anInt3416)) {
			local5++;
		}
		if (arg0.method2253(Static425.anInt6923)) {
			local5++;
		}
		if (arg0.method2253(Static127.anInt2215)) {
			local5++;
		}
		if (arg0.method2253(Static365.anInt6180)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!qa;Lclient!ic;)V")
	public static void method3706(@OriginalArg(1) Class128 arg0, @OriginalArg(2) Class113 arg1) {
		if (Static121.aBoolean154) {
			return;
		}
		arg0.M(0);
		Static57.aClass49_4 = arg0.method3540(Static458.method1924(arg1, Static260.anInt5793));
		Static57.aClass49_4.method5636((Static126.anInt2202 - Static57.aClass49_4.ja()) / 2, (Static92.anInt1618 - Static57.aClass49_4.JA()) / 2);
		Static301.aClass49_17 = arg0.method3540(Static458.method1924(arg1, Static334.anInt5485));
		Static301.aClass49_17.method5636((Static126.anInt2202 - Static301.aClass49_17.ja()) / 2, 18);
		Static121.aBoolean154 = true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
	public static int anInt1190;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLjava/lang/String;IZ)I")
	public static int method1007(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local73) {
				throw new NumberFormatException();
			}
			if (local26) {
				local73 = -local73;
			}
			@Pc(115) int local115 = local73 + local35 * arg1;
			if (local115 / arg1 != local35) {
				throw new NumberFormatException();
			}
			local35 = local115;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public static void method1008() {
		Static288.aClass45_9.ra(((float) Static405.aClass3_Sub3_Sub1_1.anInt7552 * 0.1F + 0.7F) * 1.1523438F);
		Static288.aClass45_9.VA(Static525.anInt8428, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static288.aClass45_9.pa(Static443.anInt7208, -1, 0);
		Static288.aClass45_9.method7415(Static565.aClass12_4);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIII)V")
	public static void method1009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static384.method5687(arg1);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg1 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg1;
		@Pc(23) int local23 = -arg1;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static158.anIntArrayArray66[arg0];
		@Pc(41) int local41 = arg4 - local14;
		@Pc(46) int local46 = arg4 + local14;
		Static583.method7816(local36, arg2, arg4 - arg1, local41);
		Static583.method7816(local36, arg5, local41, local46);
		Static583.method7816(local36, arg2, local46, arg1 + arg4);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				Static11.anIntArray13[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(136) int[] local136;
			@Pc(142) int[] local142;
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(160) int local160;
			@Pc(165) int local165;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local20 < local14) {
					local136 = Static158.anIntArrayArray66[local20 + arg0];
					local142 = Static158.anIntArrayArray66[arg0 - local20];
					local146 = Static11.anIntArray13[local20];
					local151 = arg4 + local10;
					local156 = arg4 - local10;
					local160 = arg4 + local146;
					local165 = arg4 - local146;
					Static583.method7816(local136, arg2, local156, local165);
					Static583.method7816(local136, arg5, local165, local160);
					Static583.method7816(local136, arg2, local160, local151);
					Static583.method7816(local142, arg2, local156, local165);
					Static583.method7816(local142, arg5, local165, local160);
					Static583.method7816(local142, arg2, local160, local151);
				} else {
					local136 = Static158.anIntArrayArray66[local20 + arg0];
					local142 = Static158.anIntArrayArray66[arg0 - local20];
					local146 = arg4 + local10;
					local151 = arg4 - local10;
					Static583.method7816(local136, arg2, local151, local146);
					Static583.method7816(local142, arg2, local151, local146);
				}
			}
			local136 = Static158.anIntArrayArray66[local10 + arg0];
			local142 = Static158.anIntArrayArray66[arg0 - local10];
			local146 = arg4 + local20;
			local151 = arg4 - local20;
			if (local10 >= local14) {
				Static583.method7816(local136, arg2, local151, local146);
				Static583.method7816(local142, arg2, local151, local146);
			} else {
				local156 = local10 <= local25 ? local25 : Static11.anIntArray13[local10];
				local160 = arg4 + local156;
				local165 = arg4 - local156;
				Static583.method7816(local136, arg2, local151, local165);
				Static583.method7816(local136, arg5, local165, local160);
				Static583.method7816(local136, arg2, local160, local146);
				Static583.method7816(local142, arg2, local151, local165);
				Static583.method7816(local142, arg5, local165, local160);
				Static583.method7816(local142, arg2, local160, local146);
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([Lclient!rb;II)V")
	public static void method1010(@OriginalArg(0) Class41_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class41_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9439;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9439 < local27 + (local29 & 0x1)) {
				@Pc(44) Class41_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method1010(arg0, arg1, local10 - 1);
		method1010(arg0, local10 + 1, arg2);
	}
}

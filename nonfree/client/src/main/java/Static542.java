import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public static int anInt9214 = 104;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7950(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static630.aClass393Array3[Static207.anInt3630++] = new Class393(4, arg2, arg5, arg4, arg4, arg5, arg0, arg1, arg1, arg0, arg3, arg3, arg6, arg6);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!jc;BLclient!pf;)Lclient!km;")
	public static Class206 method7951(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) Class284 arg1) {
		@Pc(8) Class206 local8 = new Class206(arg1);
		@Pc(14) int local14 = arg0.method7695(116);
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(39) boolean local39 = (local14 & 0x2) != 0;
		@Pc(48) boolean local48 = (local14 & 0x4) != 0;
		@Pc(60) boolean local60 = (local14 & 0x8) != 0;
		if (local23) {
			local8.anIntArray314[0] = arg0.method7704();
			local8.anIntArray313[0] = arg0.method7704();
			if (arg1.anInt7742 != -1 || arg1.anInt7768 != -1) {
				local8.anIntArray314[1] = arg0.method7704();
				local8.anIntArray313[1] = arg0.method7704();
			}
			if (arg1.anInt7789 != -1 || arg1.anInt7778 != -1) {
				local8.anIntArray314[2] = arg0.method7704();
				local8.anIntArray313[2] = arg0.method7704();
			}
		}
		if (local39) {
			local8.anIntArray315[0] = arg0.method7704();
			local8.anIntArray316[0] = arg0.method7704();
			if (arg1.anInt7749 != -1 || arg1.anInt7772 != -1) {
				local8.anIntArray315[1] = arg0.method7704();
				local8.anIntArray316[1] = arg0.method7704();
			}
		}
		@Pc(183) int local183;
		@Pc(186) int[] local186;
		@Pc(218) int local218;
		if (local48) {
			local183 = arg0.method7717(-1978450544);
			local186 = new int[] { local183 & 0xF, local183 >> 4 & 0xF, (local183 & 0xF24) >> 8, local183 >> 12 & 0xF };
			for (local218 = 0; local218 < 4; local218++) {
				if (local186[local218] != 15) {
					local8.aShortArray71[local186[local218]] = (short) arg0.method7717(-1978450544);
				}
			}
		}
		if (local60) {
			local183 = arg0.method7695(124);
			local186 = new int[] { local183 & 0xF, local183 >> 4 & 0xF };
			for (local218 = 0; local218 < 2; local218++) {
				if (local186[local218] != 15) {
					local8.aShortArray72[local186[local218]] = (short) arg0.method7717(-1978450544);
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	public static void method7952() {
		@Pc(7) int[] local7 = Static43.anIntArray35;
		for (@Pc(9) int local9 = 0; local9 < Static258.anInt4846; local9++) {
			@Pc(17) Class4_Sub3_Sub3_Sub3_Sub2 local17 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local7[local9]];
			if (local17 != null) {
				local17.method2884();
			}
		}
		for (@Pc(37) int local37 = 0; local37 < Static662.anInt10795; local37++) {
			@Pc(44) long local44 = (long) Static253.anIntArray241[local37];
			@Pc(50) Class14_Sub44 local50 = (Class14_Sub44) Static100.aClass125_9.method2630(local44);
			if (local50 != null) {
				local50.aClass4_Sub3_Sub3_Sub3_Sub1_2.method2884();
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILclient!saa;Lclient!saa;)V")
	public static void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3_Sub5 arg3, @OriginalArg(4) Class4_Sub3_Sub5 arg4) {
		@Pc(4) Class89 local4 = Static289.method4810(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub3_Sub5_1 = arg3;
		local4.aClass4_Sub3_Sub5_2 = arg4;
		@Pc(22) int local22 = Static258.aClass159Array1 == Static346.aClass159Array2 ? 1 : 0;
		if (!arg3.method9489()) {
			arg3.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local22];
			Static170.aClass4_Sub3Array3[local22] = arg3;
		} else if (arg3.method9476()) {
			arg3.aClass4_Sub3_25 = Static111.aClass4_Sub3Array2[local22];
			Static111.aClass4_Sub3Array2[local22] = arg3;
		} else {
			arg3.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local22];
			Static664.aClass4_Sub3Array5[local22] = arg3;
			Static282.aBoolean384 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9489()) {
			if (arg4.method9476()) {
				arg4.aClass4_Sub3_25 = Static111.aClass4_Sub3Array2[local22];
				Static111.aClass4_Sub3Array2[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local22];
			Static664.aClass4_Sub3Array5[local22] = arg4;
			Static282.aBoolean384 = true;
			return;
		}
		arg4.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local22];
		Static170.aClass4_Sub3Array3[local22] = arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lclient!g;")
	public static Class111[] aClass111Array1;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt5513;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt5515;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!fh;IIIIILclient!ha;IIII)V")
	public static void method4527(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub5_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class16 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 > arg6 && arg4 < arg5 + arg6 && arg10 - 13 < arg9 && arg10 + 3 > arg9 && arg1.aBoolean279) {
			arg2 = arg3;
		}
		@Pc(40) int[] local40 = null;
		if (Static529.method7476(arg1.anInt3779)) {
			local40 = Static497.aClass258_21.method6652((int) arg1.aLong93).anIntArray462;
		} else if (arg1.anInt3777 != -1) {
			local40 = Static497.aClass258_21.method6652(arg1.anInt3777).anIntArray462;
		} else if (Static95.method2218(arg1.anInt3779)) {
			@Pc(73) Class8_Sub50 local73 = (Class8_Sub50) Static278.aClass253_20.method6594((long) arg1.aLong93);
			if (local73 != null) {
				@Pc(78) Class15_Sub1_Sub2_Sub2_Sub2 local78 = local73.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(81) Class300 local81 = local78.aClass300_1;
				if (local81.anIntArray498 != null) {
					local81 = local81.method7306(Static420.aClass77_1);
				}
				if (local81 != null) {
					local40 = local81.anIntArray500;
				}
			}
		} else if (Static85.method7007(arg1.anInt3779)) {
			@Pc(117) Class352 local117;
			if (arg1.anInt3779 == 1003) {
				local117 = Static437.aClass199_3.method5342((int) arg1.aLong93);
			} else {
				local117 = Static437.aClass199_3.method5342((int) (arg1.aLong93 >>> 32 & 0x7FFFFFFFL));
			}
			if (local117.anIntArray591 != null) {
				local117 = local117.method8164(Static420.aClass77_1);
			}
			if (local117 != null) {
				local40 = local117.anIntArray590;
			}
		}
		@Pc(159) String local159 = Static452.method6861(arg1);
		if (local40 != null) {
			local159 = local159 + Static32.method1192(local40);
		}
		Static206.aClass27_20.method7004(arg2, Static446.anIntArray421, arg10, local159, arg6 + 3, Static99.aClass21Array5);
		if (arg1.aBoolean277) {
			Static359.aClass21_26.method5796(arg6 + Static469.aClass345_15.method8112(local159) + 5, arg10 - 12);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!oh;ZLjava/lang/String;Z)Lclient!aga;")
	public static Class14 method4528(@OriginalArg(0) Class237 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method6307(arg1);
		if (local10 == -1) {
			return new Class14(0);
		}
		@Pc(29) int[] local29 = arg0.method6303(local10);
		@Pc(35) Class14 local35 = new Class14(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt161 > local37) {
				@Pc(53) Class8_Sub8 local53 = new Class8_Sub8(arg0.method6314(local10, local29[local39++]));
				@Pc(57) int local57 = local53.method8540();
				@Pc(61) int local61 = local53.method8578();
				@Pc(65) int local65 = local53.method8525();
				if (!arg2 && local65 == 1) {
					local35.anInt161--;
				} else {
					local35.anIntArray12[local37] = local57;
					local35.anIntArray11[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}
}

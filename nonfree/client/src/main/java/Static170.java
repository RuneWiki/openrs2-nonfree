import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "Lclient!mk;")
	public static final Class207 aClass207_4 = new Class207();

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
	public static int anInt4134 = 1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIBLjava/lang/String;Ljava/lang/String;)V")
	public static void method3363(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static365.method5688(arg3, null, arg2, arg0, -1, arg1, arg4, arg5);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!bda;Z)V")
	public static void method3365(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		if (arg0.anIntArray430 == null && arg0.anIntArray433 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray430.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray430 != null) {
				local20 = arg0.anIntArray430[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(78) int local78;
				@Pc(91) int local91;
				@Pc(57) int local57;
				if ((-1073741824 & local20) == -1073741824) {
					local57 = local20 & 0xFFFFFFF;
					@Pc(61) int local61 = local57 >> 14;
					@Pc(65) int local65 = local57 & 0x3FFF;
					local78 = arg0.anInt10301 - (local61 - Static628.anInt10493) * 512 - 256;
					local91 = arg0.anInt10298 - (local65 - Static594.anInt10160) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(111) Class8_Sub50 local111 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local20);
					if (local111 == null) {
						arg0.method6698(local16, -1);
						continue;
					}
					@Pc(116) Class15_Sub1_Sub2_Sub2_Sub2 local116 = local111.aClass15_Sub1_Sub2_Sub2_Sub2_2;
					local91 = arg0.anInt10298 - local116.anInt10298;
					local78 = arg0.anInt10301 - local116.anInt10301;
				} else {
					local57 = local20 & 0x7FFF;
					@Pc(152) Class15_Sub1_Sub2_Sub2_Sub1 local152 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local57];
					if (local152 == null) {
						arg0.method6698(local16, -1);
						continue;
					}
					local91 = arg0.anInt10298 - local152.anInt10298;
					local78 = arg0.anInt10301 - local152.anInt10301;
				}
				if (local78 != 0 || local91 != 0) {
					arg0.method6698(local16, (int) (Math.atan2((double) local78, (double) local91) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method6698(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray430 = null;
			arg0.anIntArray433 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int method3366(@OriginalArg(0) Class8_Sub5_Sub7 arg0) {
		@Pc(7) String local7 = Static452.method6861(arg0);
		@Pc(14) int[] local14 = null;
		if (Static529.method7476(arg0.anInt3779)) {
			local14 = Static497.aClass258_21.method6652((int) arg0.aLong93).anIntArray462;
		} else if (arg0.anInt3777 != -1) {
			local14 = Static497.aClass258_21.method6652(arg0.anInt3777).anIntArray462;
		} else if (Static95.method2218(arg0.anInt3779)) {
			@Pc(46) Class8_Sub50 local46 = (Class8_Sub50) Static278.aClass253_20.method6594((long) arg0.aLong93);
			if (local46 != null) {
				@Pc(51) Class15_Sub1_Sub2_Sub2_Sub2 local51 = local46.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(54) Class300 local54 = local51.aClass300_1;
				if (local54.anIntArray498 != null) {
					local54 = local54.method7306(Static420.aClass77_1);
				}
				if (local54 != null) {
					local14 = local54.anIntArray500;
				}
			}
		} else if (Static85.method7007(arg0.anInt3779)) {
			@Pc(86) Class352 local86;
			if (arg0.anInt3779 == 1003) {
				local86 = Static437.aClass199_3.method5342((int) arg0.aLong93);
			} else {
				local86 = Static437.aClass199_3.method5342((int) (arg0.aLong93 >>> 32 & 0x7FFFFFFFL));
			}
			if (local86.anIntArray591 != null) {
				local86 = local86.method8164(Static420.aClass77_1);
			}
			if (local86 != null) {
				local14 = local86.anIntArray590;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static32.method1192(local14);
		}
		@Pc(141) int local141 = Static469.aClass345_15.method8114(local7, Static99.aClass21Array5);
		if (arg0.aBoolean277) {
			local141 += Static359.aClass21_26.method5790() + 4;
		}
		return local141;
	}
}

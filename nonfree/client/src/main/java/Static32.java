import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
	public static int anInt4456;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", line = 5)
	public static void method4201(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static205.method3875(arg1, null, arg2, -1, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I", line = 16)
	public static int method4202() {
		if (Class243.aClass161_14 == null) {
			if (!Class243.aBoolean477 && Class2_Sub3_Sub24.anInt4949 > 0) {
				if (Class105.aBoolean192 && Static163.aClass123_2.method3344(81) && Class2_Sub3_Sub24.anInt4949 > 2) {
					return ((Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244.aClass2_244).anInt1006;
				}
				return ((Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244).anInt1006;
			}
			@Pc(23) int local23 = Static210.aClass119_1.method3305();
			@Pc(27) int local27 = Static210.aClass119_1.method3314();
			@Pc(29) int local29 = Static282.anInt5731;
			@Pc(31) int local31 = Static338.anInt6788;
			@Pc(33) int local33 = Static100.anInt2217;
			if (local29 < local23 && local23 < local33 + local29) {
				@Pc(47) int local47 = -1;
				@Pc(66) int local66;
				for (@Pc(49) int local49 = 0; local49 < Class2_Sub3_Sub24.anInt4949; local49++) {
					if (Class179.aBoolean371) {
						local66 = local31 + (-local49 + Class2_Sub3_Sub24.anInt4949 + -1) * 16 + 33;
						if (local66 - 13 < local27 && local66 + 3 >= local27) {
							local47 = local49;
						}
					} else {
						local66 = local31 + (-local49 + -1 + Class2_Sub3_Sub24.anInt4949) * 16 + 31;
						if (local27 > local66 - 13 && local66 + 3 >= local27) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local66 = 0;
					@Pc(137) Class75 local137 = new Class75(Class92.aClass135_19);
					for (@Pc(142) Class2_Sub5 local142 = (Class2_Sub5) local137.method2183(); local142 != null; local142 = (Class2_Sub5) local137.method2180()) {
						if (local47 == local66++) {
							return local142.anInt1006;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V", line = 106)
	public static void method4203() {
		@Pc(1) Class98 local1 = Class72.aClass98_10;
		synchronized (Class72.aClass98_10) {
			Class72.aClass98_10.method2617(5);
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIII)V", line = 123)
	public static void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static116.anInt2417 = arg2;
		Static219.anInt4302 = arg0;
		Static234.anInt4689 = arg4;
		Static53.anInt1462 = arg1;
		anInt4456 = arg3;
		if (anInt4456 >= 100) {
			@Pc(30) int local30 = Static234.anInt4689 * 128 + 64;
			@Pc(36) int local36 = Static116.anInt2417 * 128 + 64;
			@Pc(44) int local44 = Static360.method6033(local30, local36, Static330.anInt6573) - Static53.anInt1462;
			@Pc(49) int local49 = local30 - Static127.anInt6765;
			@Pc(54) int local54 = local44 - Static95.anInt3588;
			@Pc(59) int local59 = local36 - Static197.anInt3773;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static244.anInt4847 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static4.anInt87 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local59)) & 0x3FFF;
			Static319.anInt5645 = 0;
			if (Static244.anInt4847 < 1024) {
				Static244.anInt4847 = 1024;
			}
			if (Static244.anInt4847 > 3072) {
				Static244.anInt4847 = 3072;
			}
		}
		Static291.anInt5899 = 2;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII)I", line = 184)
	public static int method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg5;
			arg5 = local10;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return 7 + 1 - arg2 - arg3;
		} else if (local18 == 2) {
			return 1 + 7 - arg4 - arg5;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V", line = 240)
	public static void method4208() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Class241.anInt7020; local13++) {
			for (@Pc(17) int local17 = 0; local17 < OutputStream_Sub1.anInt4442; local17++) {
				if (Static77.method3668(Static307.aClass67ArrayArrayArray3, true, local13, local17, local11)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}

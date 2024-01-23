import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public static int anInt4576 = 0;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "S")
	public static short aShort70 = 205;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V")
	public static void method3701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static130.method2394(arg4);
		@Pc(6) int local6 = 0;
		@Pc(14) int local14 = arg4 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg4;
		@Pc(26) int local26 = -local14;
		@Pc(29) int local29 = -arg4;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = local14;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static275.anIntArrayArray37[arg5];
		@Pc(48) int local48 = arg3 - local14;
		@Pc(52) int local52 = arg3 + local14;
		Static25.method486(local44, arg3 - arg4, local48, arg2);
		Static25.method486(local44, local48, local52, arg1);
		Static25.method486(local44, local52, arg4 + arg3, arg2);
		while (local23 > local6) {
			local31 += 2;
			local29 += local31;
			local40 += 2;
			local26 += local40;
			if (local26 >= 0 && local33 >= 1) {
				Static188.anIntArray567[local33] = local6;
				local33--;
				local26 -= local33 << 1;
			}
			local6++;
			@Pc(136) int[] local136;
			@Pc(148) int[] local148;
			@Pc(156) int local156;
			@Pc(152) int local152;
			@Pc(141) int local141;
			@Pc(165) int local165;
			@Pc(161) int local161;
			if (local29 >= 0) {
				local23--;
				local29 -= local23 << 1;
				if (local23 < local14) {
					local136 = Static275.anIntArrayArray37[local23 + arg5];
					local141 = arg3 - local6;
					local148 = Static275.anIntArrayArray37[arg5 - local23];
					local152 = arg3 + local6;
					local156 = Static188.anIntArray567[local23];
					local161 = arg3 - local156;
					local165 = local156 + arg3;
					Static25.method486(local136, local141, local161, arg2);
					Static25.method486(local136, local161, local165, arg1);
					Static25.method486(local136, local165, local152, arg2);
					Static25.method486(local148, local141, local161, arg2);
					Static25.method486(local148, local161, local165, arg1);
					Static25.method486(local148, local165, local152, arg2);
				} else {
					local136 = Static275.anIntArrayArray37[arg5 + local23];
					local156 = arg3 + local6;
					local152 = arg3 - local6;
					local148 = Static275.anIntArrayArray37[arg5 - local23];
					Static25.method486(local136, local152, local156, arg2);
					Static25.method486(local148, local152, local156, arg2);
				}
			}
			local136 = Static275.anIntArrayArray37[local6 + arg5];
			local148 = Static275.anIntArrayArray37[arg5 - local6];
			local156 = local23 + arg3;
			local152 = arg3 - local23;
			if (local6 < local14) {
				local141 = local6 <= local33 ? local33 : Static188.anIntArray567[local6];
				local161 = arg3 - local141;
				Static25.method486(local136, local152, local161, arg2);
				local165 = local141 + arg3;
				Static25.method486(local136, local161, local165, arg1);
				Static25.method486(local136, local165, local156, arg2);
				Static25.method486(local148, local152, local161, arg2);
				Static25.method486(local148, local161, local165, arg1);
				Static25.method486(local148, local165, local156, arg2);
			} else {
				Static25.method486(local136, local152, local156, arg2);
				Static25.method486(local148, local152, local156, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method3702() {
		Static220.aClass157_37.method4034(5);
		Static4.aClass157_3.method4034(5);
		Static301.aClass157_45.method4034(5);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I")
	public static int method3703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class1.anIntArray3[arg1 * 1024 / arg0] >> 1;
		return ((65536 - local15) * arg2 >> 16) + (local15 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;")
	public static String[] method3704(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static231.method3760(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(35) int local35;
			for (local35 = local24; arg0.charAt(local35) != arg1; local35++) {
			}
			local15[local22++] = arg0.substring(local24, local35);
			local24 = local35 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method3705() {
		@Pc(14) int local14 = Static293.method4501();
		if (local14 == 0) {
			Static242.aByteArrayArrayArray19 = null;
			Static24.method480(0);
		} else if (local14 == 1) {
			Static208.method3501((byte) 0);
			Static24.method480(512);
			if (Static13.aByteArrayArrayArray2 != null) {
				Static54.method984();
			}
		} else {
			Static208.method3501((byte) (Static80.anInt1910 - 4 & 0xFF));
			Static24.method480(2);
		}
		Static50.anInt1278 = Static32.anInt876;
	}
}

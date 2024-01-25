import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([BIIIII)V")
	public static void method3298(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(16) int local16 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local16--;
			if (local16 < 0) {
				local16 = arg3 - arg1 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(25) int local25 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg2 = local35 + 1;
			arg0[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
	public static void method3300(@OriginalArg(1) boolean arg0) {
		if (Static182.aClass90_1 == null) {
			Static260.method3981();
		}
		if (arg0) {
			Static182.aClass90_1.method1832();
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
	public static int method3302(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static401.anInt8429 - 1; local3++) {
			if (arg0 < Static466.anIntArray626[local3] + Static613.anIntArray806[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static401.anInt8429 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!ha;IIIII)V")
	public static void method3303(@OriginalArg(1) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static192.aClass44_29 == null || Static540.aClass44_30 == null || Static646.aClass44_38 == null) && Static488.aClass384_112.method8883(Static613.anInt10013) && Static488.aClass384_112.method8883(Static625.anInt10205) && Static488.aClass384_112.method8883(Static453.anInt7633)) {
			@Pc(27) Class176 local27 = Static654.method4046(Static488.aClass384_112, Static625.anInt10205, 0);
			Static540.aClass44_30 = arg0.method6994(local27, true);
			local27.method4056();
			Static87.aClass44_5 = arg0.method6994(local27, true);
			Static192.aClass44_29 = arg0.method6994(Static654.method4046(Static488.aClass384_112, Static613.anInt10013, 0), true);
			@Pc(52) Class176 local52 = Static654.method4046(Static488.aClass384_112, Static453.anInt7633, 0);
			Static646.aClass44_38 = arg0.method6994(local52, true);
			local52.method4056();
			Static146.aClass44_9 = arg0.method6994(local52, true);
		}
		if (Static192.aClass44_29 == null || Static540.aClass44_30 == null || Static646.aClass44_38 == null) {
			return;
		}
		@Pc(84) int local84 = (arg2 - Static646.aClass44_38.method5319() * 2) / Static192.aClass44_29.method5319();
		for (@Pc(86) int local86 = 0; local86 < local84; local86++) {
			Static192.aClass44_29.method5312(Static646.aClass44_38.method5319() + arg4 + Static192.aClass44_29.method5319() * local86, -Static192.aClass44_29.method5320() + arg3 + arg1);
		}
		@Pc(123) int local123 = (arg3 - Static646.aClass44_38.method5320() - 20) / Static540.aClass44_30.method5320();
		for (@Pc(125) int local125 = 0; local125 < local123; local125++) {
			Static540.aClass44_30.method5312(arg4, arg1 + local125 * Static540.aClass44_30.method5320() + 20);
			Static87.aClass44_5.method5312(arg2 + arg4 - Static87.aClass44_5.method5319(), Static540.aClass44_30.method5320() * local125 + arg1 + 20);
		}
		Static646.aClass44_38.method5312(arg4, arg1 + arg3 - Static646.aClass44_38.method5320());
		Static146.aClass44_9.method5312(arg2 + arg4 - Static646.aClass44_38.method5319(), -Static646.aClass44_38.method5320() + (arg1 - -arg3));
	}
}

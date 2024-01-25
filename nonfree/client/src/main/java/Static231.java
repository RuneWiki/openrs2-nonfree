import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
	public static void method4405(@OriginalArg(1) int arg0) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub29_1.method9038() == 0) {
			arg0 = -1;
		}
		if (Static112.anInt3033 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(27) Class310 local27 = Static527.aClass260_31.method6824(arg0);
			@Pc(31) Class296 local31 = local27.method7820();
			if (local31 == null) {
				arg0 = -1;
			} else {
				Static268.aClass370_3.method9073(local31.method7584(), local31.method7578(), new Point(local27.anInt9346, local27.anInt9351), Static639.aCanvas10, local31.method7572());
				Static112.anInt3033 = arg0;
			}
		}
		if (arg0 == -1 && Static112.anInt3033 != -1) {
			Static268.aClass370_3.method9073(-1, null, new Point(), Static639.aCanvas10, -1);
			Static112.anInt3033 = -1;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II[BIII)V")
	public static void method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		arg0 += arg1;
		@Pc(24) int local24 = arg3 - arg1 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg0 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)I")
	public static int method4407(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}

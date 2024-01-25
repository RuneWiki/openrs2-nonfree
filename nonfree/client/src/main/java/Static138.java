import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
	public static int anInt2931;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public static void method2521(@OriginalArg(0) int arg0) {
		if (!Static31.method728(arg0)) {
			return;
		}
		@Pc(12) Class303[] local12 = Static261.aClass303ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			@Pc(24) Class303 local24 = local12[local19];
			if (local24 != null) {
				local24.anInt7913 = 1;
				local24.anInt7990 = 0;
				local24.anInt8005 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I")
	public static int method2523(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public static int anInt5804;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "Lclient!md;")
	public static Class231 aClass231_1;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_60 = new Class387(0, -1);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIBI[BI)V")
	public static void method4952(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(28) int local28 = arg1 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local28--;
			if (local28 < 0) {
				local28 = arg1 - arg0 & 0x3;
				while (true) {
					local28--;
					if (local28 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(37) int local37 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg2[local37] = 1;
			@Pc(47) int local47 = local42 + 1;
			arg2[local42] = 1;
			arg3 = local47 + 1;
			arg2[local47] = 1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
	public static void method4953(@OriginalArg(0) int arg0) {
		if (Static496.anInt8290 == 0) {
			Static28.aClass5_Sub16_Sub4_6.method6384(arg0);
		} else {
			Static609.anInt10105 = arg0;
		}
	}
}

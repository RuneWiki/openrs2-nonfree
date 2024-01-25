import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!nw;)V")
	public static void method8741(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub2 arg0) {
		for (@Pc(18) Class5_Sub22 local18 = (Class5_Sub22) Static509.aClass102_60.method1916(); local18 != null; local18 = (Class5_Sub22) Static509.aClass102_60.method1915()) {
			if (local18.aClass8_Sub1_Sub3_Sub2_Sub2_1 == arg0) {
				if (local18.aClass5_Sub16_Sub3_2 != null) {
					Static91.aClass5_Sub16_Sub1_1.method2554(local18.aClass5_Sub16_Sub3_2);
					local18.aClass5_Sub16_Sub3_2 = null;
				}
				local18.method9327(1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BIII)I")
	public static int method8743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(20) int local20 = 128 - arg0;
		@Pc(34) int local34 = arg0 * (arg1 & 0x7F) + local20 * (arg2 & 0x7F) >> 7;
		@Pc(48) int local48 = arg0 * (arg1 & 0x380) + local20 * (arg2 & 0x380) >> 7;
		@Pc(63) int local63 = (arg2 & 0xFC00) * local20 + arg0 * (arg1 & 0xFC00) >> 7;
		return local48 & 0x380 | local63 & 0xFC00 | local34 & 0x7F;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)[Lclient!ni;")
	public static Class249[] method8745() {
		return new Class249[] { Static443.aClass249_4, Static268.aClass249_3, Static63.aClass249_1 };
	}
}

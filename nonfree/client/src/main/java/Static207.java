import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Lclient!cn;")
	public static Class73 aClass73_13;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIBILclient!rn;)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class309 arg4) {
		@Pc(19) Class5_Sub44 local19 = null;
		for (@Pc(24) Class5_Sub44 local24 = (Class5_Sub44) Static605.aClass102_70.method1916(); local24 != null; local24 = (Class5_Sub44) Static605.aClass102_70.method1915()) {
			if (local24.anInt8144 == arg3 && arg1 == local24.anInt8141 && arg2 == local24.anInt8152 && local24.anInt8143 == arg0) {
				local19 = local24;
				break;
			}
		}
		if (local19 == null) {
			local19 = new Class5_Sub44();
			local19.anInt8152 = arg2;
			local19.anInt8143 = arg0;
			local19.anInt8144 = arg3;
			local19.anInt8141 = arg1;
			Static605.aClass102_70.method1921(local19);
		}
		local19.aClass309_2 = arg4;
		local19.aBoolean609 = false;
		local19.aBoolean608 = true;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!df;III)V")
	public static void method2973(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class174 local12;
		if (arg2 < Static328.anInt5870) {
			local12 = Static260.aClass174ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass8_Sub1_Sub1_1 != null && local12.aClass8_Sub1_Sub1_1.method8899((byte) 94)) {
				arg0.method8901(local12.aClass8_Sub1_Sub1_1, 0, true, Static88.anInt7739, 0, Static205.aClass57_5);
			}
		}
		if (arg3 < Static328.anInt5870) {
			local12 = Static260.aClass174ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub1_Sub1_1 != null && local12.aClass8_Sub1_Sub1_1.method8899((byte) 94)) {
				arg0.method8901(local12.aClass8_Sub1_Sub1_1, Static88.anInt7739, true, 0, 0, Static205.aClass57_5);
			}
		}
		if (arg2 < Static328.anInt5870 && arg3 < Static526.anInt8863) {
			local12 = Static260.aClass174ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass8_Sub1_Sub1_1 != null && local12.aClass8_Sub1_Sub1_1.method8899((byte) 94)) {
				arg0.method8901(local12.aClass8_Sub1_Sub1_1, Static88.anInt7739, true, Static88.anInt7739, 0, Static205.aClass57_5);
			}
		}
		if (arg2 < Static328.anInt5870 && arg3 > 0) {
			local12 = Static260.aClass174ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass8_Sub1_Sub1_1 != null && local12.aClass8_Sub1_Sub1_1.method8899((byte) 94)) {
				arg0.method8901(local12.aClass8_Sub1_Sub1_1, -Static88.anInt7739, true, Static88.anInt7739, 0, Static205.aClass57_5);
			}
		}
	}
}

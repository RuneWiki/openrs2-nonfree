import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_165 = new Class268(12, 8);

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_83 = new Class208(42, -1);

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7957(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static195.aClass199Array1 == Static510.aClass199Array3) {
			return;
		}
		@Pc(10) int local10 = Static228.aClass199Array2[arg1].method8531(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class199 local23 = Static228.aClass199Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8531(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BIILclient!sca;Z)V")
	public static void method7958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class302 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) int local13 = arg2.anInt8801;
		@Pc(16) int local16 = arg2.anInt8814;
		if (arg2.aByte102 == 0) {
			arg2.anInt8801 = arg2.anInt8864;
		} else if (arg2.aByte102 == 1) {
			arg2.anInt8801 = arg0 - arg2.anInt8864;
		} else if (arg2.aByte102 == 2) {
			arg2.anInt8801 = arg0 * arg2.anInt8864 >> 14;
		}
		if (arg2.aByte103 == 0) {
			arg2.anInt8814 = arg2.anInt8862;
		} else if (arg2.aByte103 == 1) {
			arg2.anInt8814 = arg1 - arg2.anInt8862;
		} else if (arg2.aByte103 == 2) {
			arg2.anInt8814 = arg2.anInt8862 * arg1 >> 14;
		}
		if (arg2.aByte102 == 4) {
			arg2.anInt8801 = arg2.anInt8814 * arg2.anInt8852 / arg2.anInt8791;
		}
		if (arg2.aByte103 == 4) {
			arg2.anInt8814 = arg2.anInt8791 * arg2.anInt8801 / arg2.anInt8852;
		}
		if (Static321.aBoolean412 && (Static78.method1364(arg2).anInt9595 != 0 || arg2.anInt8816 == 0)) {
			if (arg2.anInt8814 < 5 && arg2.anInt8801 < 5) {
				arg2.anInt8814 = 5;
				arg2.anInt8801 = 5;
			} else {
				if (arg2.anInt8814 <= 0) {
					arg2.anInt8814 = 5;
				}
				if (arg2.anInt8801 <= 0) {
					arg2.anInt8801 = 5;
				}
			}
		}
		if (arg2.anInt8784 == Static185.anInt3788) {
			Static196.aClass302_28 = arg2;
		}
		if (arg3 && arg2.anObjectArray28 != null && (local13 != arg2.anInt8801 || arg2.anInt8814 != local16)) {
			@Pc(189) Class6_Sub10 local189 = new Class6_Sub10();
			local189.aClass302_14 = arg2;
			local189.anObjectArray1 = arg2.anObjectArray28;
			Static218.aClass8_26.method157(local189);
		}
	}
}

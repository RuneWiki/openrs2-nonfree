import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public static int anInt6091;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "Lclient!la;")
	public static Class208 aClass208_78;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_42 = new Class102();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBI)I")
	public static int method5214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return 7 - arg1;
		} else if (local16 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class5_Sub44 local14 = null;
		for (@Pc(19) Class5_Sub44 local19 = (Class5_Sub44) Static298.aClass102_38.method1916(); local19 != null; local19 = (Class5_Sub44) Static298.aClass102_38.method1915()) {
			if (local19.anInt8144 == arg4 && arg1 == local19.anInt8141 && local19.anInt8152 == arg5 && local19.anInt8143 == arg3) {
				local14 = local19;
				break;
			}
		}
		if (local14 == null) {
			local14 = new Class5_Sub44();
			local14.anInt8144 = arg4;
			local14.anInt8141 = arg1;
			local14.anInt8143 = arg3;
			local14.anInt8152 = arg5;
			if (arg1 >= 0 && arg5 >= 0 && arg1 < Static544.anInt9261 && arg5 < Static282.anInt4887) {
				Static570.method8203(local14);
			}
			Static298.aClass102_38.method1921(local14);
		}
		local14.anInt8146 = arg6;
		local14.anInt8139 = arg0;
		local14.aBoolean608 = true;
		local14.anInt8142 = arg2;
		local14.aBoolean609 = false;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	public static void method5217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static648.anInt9588 != arg1) {
			Static293.anIntArray288 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static293.anIntArray288[local13] = (local13 << 12) / arg1;
			}
			Static116.anInt3312 = arg1 - 1;
			Static8.anInt89 = arg1 * 32;
			Static648.anInt9588 = arg1;
		}
		if (Static269.anInt4686 == arg0) {
			return;
		}
		if (Static648.anInt9588 == arg0) {
			Static23.anIntArray27 = Static293.anIntArray288;
		} else {
			Static23.anIntArray27 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static23.anIntArray27[local13] = (local13 << 12) / arg0;
			}
		}
		Static269.anInt4686 = arg0;
		Static542.anInt9254 = arg0 - 1;
	}
}

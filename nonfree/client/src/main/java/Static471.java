import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "Lclient!qv;")
	public static Class280 aClass280_2;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_55 = new Class43();

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
	public static int method7029(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(34) boolean local34 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg1.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg1.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local34 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(93) int local93;
			if (local49 >= '0' && local49 <= '9') {
				local93 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local93 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local93 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local93 >= arg0) {
				throw new NumberFormatException();
			}
			if (local34) {
				local93 = -local93;
			}
			@Pc(122) int local122 = local38 * arg0 + local93;
			if (local122 / arg0 != local38) {
				throw new NumberFormatException();
			}
			local36 = true;
			local38 = local122;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local38;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BD)V")
	public static void method7030(@OriginalArg(1) double arg0) {
		if (arg0 == Static243.aDouble11) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static85.anIntArray454[local11] = local23 <= 255 ? local23 : 255;
		}
		Static243.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!tp;III)V")
	public static void method7031(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray20 != null) {
			@Pc(13) Class8_Sub40 local13 = new Class8_Sub40();
			local13.anObjectArray2 = arg0.anObjectArray20;
			local13.aClass331_14 = arg0;
			Static273.method4698(local13);
		}
		Static401.anInt7697 = arg0.anInt9578;
		Static328.anInt9771 = arg2;
		Static500.anInt8805 = arg0.anInt9494;
		Static147.aBoolean270 = true;
		Static341.anInt6662 = arg0.anInt9519;
		Static391.anInt7576 = arg0.anInt9535;
		Static230.anInt5229 = arg0.anInt9570;
		Static330.anInt4199 = arg1;
		Static86.method2113(arg0);
	}
}

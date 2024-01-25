import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_61 = new Class12(108, 0);

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
	public static int anInt2335 = 1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
	public static void method2006(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub5_Sub11 local16 = Static188.method2688(arg0, 5);
		local16.method2667();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZB)I")
	public static int method2009(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub43 local14 = Static346.method4702(arg0, false);
		if (local14 == null) {
			return Static8.aClass132_1.method2939(arg0).anInt2045;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray507.length; local34++) {
			if (local14.anIntArray507[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static8.aClass132_1.method2939(arg0).anInt2045 - local14.anIntArray507.length;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
	public static int method2010(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg1.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local24 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local48 >= '0' && local48 <= '9') {
				local84 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local84 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local84 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local84) {
				throw new NumberFormatException();
			}
			if (local24) {
				local84 = -local84;
			}
			@Pc(126) int local126 = local84 + local37 * arg0;
			if (local126 / arg0 != local37) {
				throw new NumberFormatException();
			}
			local37 = local126;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local37;
	}
}

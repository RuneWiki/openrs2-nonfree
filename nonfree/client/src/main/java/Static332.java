import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!cda;")
	public static final Class44 aClass44_4 = new Class44("stellardawn", 1);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLjava/lang/String;Lclient!kea;Z)Lclient!faa;")
	public static Class82 method5276(@OriginalArg(1) String arg0, @OriginalArg(2) Class161 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method4240(arg0);
		if (local10 == -1) {
			return new Class82(0);
		}
		@Pc(23) int[] local23 = arg1.method4242(local10);
		@Pc(34) Class82 local34 = new Class82(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt2616) {
				@Pc(52) Class3_Sub27 local52 = new Class3_Sub27(arg1.method4243(local23[local38++], local10));
				@Pc(56) int local56 = local52.method7549();
				@Pc(60) int local60 = local52.method7591();
				@Pc(64) int local64 = local52.method7548();
				if (!arg2 && local64 == 1) {
					local34.anInt2616--;
				} else {
					local34.anIntArray262[local36] = local56;
					local34.anIntArray263[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)I")
	public static int method5279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static232.aByteArrayArrayArray18[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static232.aByteArrayArrayArray18[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method5280(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) byte[] local15;
		if (arg2 > 0) {
			local15 = new byte[arg0];
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				local15[local17] = arg1[local17 + arg2];
			}
		} else {
			local15 = arg1;
		}
		@Pc(43) Class259 local43 = new Class259();
		local43.method6499();
		local43.method6496((long) (arg0 * 8), local15);
		@Pc(57) byte[] local57 = new byte[64];
		local43.method6502(local57);
		return local57;
	}
}

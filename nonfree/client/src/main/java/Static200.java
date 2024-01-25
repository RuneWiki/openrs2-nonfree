import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt5712 = 0;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public static int anInt5713 = -1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ra;Lclient!ra;)I")
	public static int method5049(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		@Pc(13) int local13 = 0;
		if (arg1.method4568(Static106.anInt2306)) {
			local13++;
		}
		if (arg1.method4568(Static132.anInt2861)) {
			local13++;
		}
		if (arg1.method4568(Static32.anInt862)) {
			local13++;
		}
		if (arg0.method4568(Static106.anInt2306)) {
			local13++;
		}
		if (arg0.method4568(Static132.anInt2861)) {
			local13++;
		}
		if (arg0.method4568(Static32.anInt862)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)[B")
	public static byte[] method5050(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static359.method756(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLjava/lang/String;I)I")
	public static int method5054(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(36) char local36 = arg0.charAt(local31);
			if (local31 == 0) {
				if (local36 == '-') {
					local22 = true;
					continue;
				}
				if (local36 == '+') {
					continue;
				}
			}
			@Pc(68) int local68;
			if (local36 >= '0' && local36 <= '9') {
				local68 = local36 - '0';
			} else if (local36 >= 'A' && local36 <= 'Z') {
				local68 = local36 - '7';
			} else if (local36 >= 'a' && local36 <= 'z') {
				local68 = local36 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local68 >= arg1) {
				throw new NumberFormatException();
			}
			if (local22) {
				local68 = -local68;
			}
			@Pc(110) int local110 = local26 * arg1 + local68;
			if (local26 != local110 / arg1) {
				throw new NumberFormatException();
			}
			local24 = true;
			local26 = local110;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}
}

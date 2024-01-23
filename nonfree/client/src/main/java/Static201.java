import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public static int anInt3890;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
	public static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method3242(@OriginalArg(3) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(42) int local42 = arg0.length();
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(53) char local53 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local53 == '-') {
					local27 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local53 >= '0' && local53 <= '9') {
				local76 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local76 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local76 = local53 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local27) {
				local76 = -local76;
			}
			@Pc(126) int local126 = local76 + local44 * 10;
			if (local126 / 10 != local44) {
				return false;
			}
			local29 = true;
			local44 = local126;
		}
		return local29;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZIZ)Lclient!fh;")
	public static Class58 method3244(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class60 local5 = null;
		if (Static113.aClass193_4 != null) {
			local5 = new Class60(arg2, Static113.aClass193_4, Static152.aClass193Array1[arg2], 1000000);
		}
		Static239.aClass62_Sub1Array2[arg2] = Static39.aClass119_1.method2727(Static40.aClass60_2, local5, arg2);
		if (arg3) {
			Static239.aClass62_Sub1Array2[arg2].method4705();
		}
		return new Class58(Static239.aClass62_Sub1Array2[arg2], arg1, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIFIZ)[[I")
	public static int[][] method3247(@OriginalArg(6) float arg0) {
		@Pc(17) int[][] local17 = new int[256][64];
		@Pc(21) Class4_Sub1_Sub12 local21 = new Class4_Sub1_Sub12();
		local21.anInt2625 = 4;
		local21.anInt2631 = 8;
		local21.anInt2628 = 3;
		local21.anInt2620 = (int) (arg0 * 4096.0F);
		local21.aBoolean181 = false;
		local21.method4737();
		Static33.method524(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local21.method2054(local17[local48], local48);
		}
		return local17;
	}
}

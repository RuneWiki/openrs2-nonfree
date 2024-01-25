import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_46 = new Class186(103, 28);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
	public static int method2663(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(34) boolean local34 = false;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local28 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local47 >= '0' && local47 <= '9') {
				local79 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local79 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local79 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local79) {
				throw new NumberFormatException();
			}
			if (local28) {
				local79 = -local79;
			}
			@Pc(131) int local131 = arg1 * local36 + local79;
			if (local36 != local131 / arg1) {
				throw new NumberFormatException();
			}
			local36 = local131;
			local34 = true;
		}
		if (!local34) {
			throw new NumberFormatException();
		}
		return local36;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method2665(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 3);
		local8.method3043();
		local8.aString32 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ia;II)V")
	public static void method2666(@OriginalArg(0) Class6_Sub15_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static7.anInt156 = 0;
		Static281.aBoolean339 = false;
		Static281.method4248(arg0);
		Static228.method3464(arg0);
		if (Static281.aBoolean339) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt3487 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt3487 + " psize:" + arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "Lclient!ij;")
	public static Class93 aClass93_10;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
	public static int anInt514 = 1;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString6 = "";

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
	public static int anInt519 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)I")
	public static int method477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = 0;
		while (arg0 > 0) {
			local16 = arg1 & 0x1 | local16 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local16;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)Z")
	public static boolean method478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface5 local14 = (Interface5) Static330.method5730(arg0, arg1, arg2);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static123.method2170(local14) & true;
		}
		local14 = (Interface5) Static259.method4533(arg0, arg1, arg2, iq.class);
		if (local14 != null) {
			local16 &= Static123.method2170(local14);
		}
		local14 = (Interface5) Static101.method1810(arg0, arg1, arg2);
		if (local14 != null) {
			local16 &= Static123.method2170(local14);
		}
		return local16;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(CI)Z")
	public static boolean method479(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static42.method646(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static318.aCharArray6;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(23) char local23 = local16[local18];
				if (local23 == arg0) {
					return true;
				}
			}
			@Pc(35) char[] local35 = Static234.aCharArray3;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(42) char local42 = local35[local37];
				if (local42 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}

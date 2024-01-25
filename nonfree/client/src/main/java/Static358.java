import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "Lclient!hj;")
	public static Class1_Sub15 aClass1_Sub15_2;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "Lclient!ui;")
	public static Class230 aClass230_80;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!at;")
	public static final Class17 aClass17_66 = new Class17();

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public static int anInt5787 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I")
	public static int method4952(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z")
	public static boolean method4963(@OriginalArg(0) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(102) int local102;
			if (local48 >= '0' && local48 <= '9') {
				local102 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local102 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local102 = local48 - 'W';
			} else {
				return false;
			}
			if (local102 >= 10) {
				return false;
			}
			if (local33) {
				local102 = -local102;
			}
			@Pc(128) int local128 = local37 * 10 + local102;
			if (local128 / 10 != local37) {
				return false;
			}
			local37 = local128;
			local35 = true;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)B")
	public static byte method4965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	public static void method4971() {
		for (@Pc(8) int local8 = 0; local8 < Static373.aByteArrayArrayArray16.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static373.aByteArrayArrayArray16[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static373.aByteArrayArrayArray16[0][0].length; local16++) {
					Static373.aByteArrayArrayArray16[local8][local12][local16] = 0;
				}
			}
		}
	}
}

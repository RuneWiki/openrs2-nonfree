import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	public static int anInt2561;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt2556 = 99;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString91 = " has logged in.";

	@OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
	public static final int[] anIntArray153 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!in", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!in", name = "y", descriptor = "[Lclient!ul;")
	public static final Class3_Sub7_Sub21[] aClass3_Sub7_Sub21Array4 = new Class3_Sub7_Sub21[14];

	@OriginalMember(owner = "client!in", name = "A", descriptor = "Z")
	public static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;BLclient!ir;Z)Lclient!nr;")
	public static Class146 method2083(@OriginalArg(0) String arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method2304(arg0);
		if (local10 == -1) {
			return new Class146(0);
		}
		@Pc(24) int[] local24 = arg1.method2292(local10);
		@Pc(35) Class146 local35 = new Class146(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt4414 > local37) {
				@Pc(53) Class3_Sub4 local53 = new Class3_Sub4(arg1.method2319(local10, local24[local39++]));
				@Pc(57) int local57 = local53.method3642();
				@Pc(63) int local63 = local53.method3649();
				@Pc(67) int local67 = local53.method3643();
				if (!arg2 && local67 == 1) {
					local35.anInt4414--;
				} else {
					local35.anIntArray357[local37] = local57;
					local35.anIntArray356[local37] = local63;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Lclient!rm;")
	public static Class176 method2084(@OriginalArg(0) int arg0) {
		@Pc(10) Class176 local10 = (Class176) Static296.aClass198_54.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static119.aClass100_55.method2319(31, arg0);
		local10 = new Class176();
		if (local25 != null) {
			local10.method4587(arg0, new Class3_Sub4(local25));
		}
		Static296.aClass198_54.method5231((long) arg0, local10);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	public static int anInt3701;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "Lclient!ir;")
	public static Class100 aClass100_75;

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "S")
	public static short aShort49 = 1;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Members object";

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Please remove ";

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method2912(@OriginalArg(0) Class100 arg0) {
		Static307.aClass100_120 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BZ)C")
	public static char method2913(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static89.aCharArray12[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public static void method2916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub7_Sub11 local16 = Static116.method2029(arg2, 9);
		local16.method2509();
		local16.anInt3053 = arg0;
		local16.anInt3054 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ir;I)Lclient!vn;")
	public static Class209 method2917(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		@Pc(8) byte[] local8 = arg1.method2318(arg0);
		return local8 == null ? null : new Class209(local8);
	}
}

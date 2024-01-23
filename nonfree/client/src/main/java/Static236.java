import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_3;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
	public static int[] anIntArray578 = new int[2500];

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[1000];

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	public static int anInt4920 = 0;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "I")
	public static int anInt4922 = 0;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
	public static int anInt4923 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZII)V")
	public static void method3749(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static228.method3502(arg2)) {
			Static277.method4260(arg3, arg0, arg1, -1, Static86.aClass127ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public static void method3750() {
		Static264.aClass31_20.method850();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3751(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static36.aStringArray24.length; local7++) {
			if (Static36.aStringArray24[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;")
	public static StringBuffer method3752(@OriginalArg(1) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!s;")
	public static Class1_Sub2_Sub17 method3753(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub17 local12 = (Class1_Sub2_Sub17) Static245.aClass64_11.method1471((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static82.aClass7_82.method253(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub17();
		@Pc(37) Class1_Sub18 local37 = new Class1_Sub18(local22);
		local37.anInt3911 = local37.aByteArray71.length - 2;
		@Pc(48) int local48 = local37.method3107();
		@Pc(57) int local57 = local37.aByteArray71.length - local48 - 14;
		local37.anInt3911 = local57;
		@Pc(64) int local64 = local37.method3074();
		local12.anInt4917 = local37.method3107();
		local12.anInt4921 = local37.method3107();
		local12.anInt4919 = local37.method3107();
		local12.anInt4918 = local37.method3107();
		@Pc(92) int local92 = local37.method3122();
		@Pc(104) int local104;
		@Pc(115) int local115;
		if (local92 > 0) {
			local12.aClass22Array1 = new Class22[local92];
			for (local104 = 0; local104 < local92; local104++) {
				local115 = local37.method3107();
				@Pc(122) Class22 local122 = new Class22(Static182.method2762(local115));
				local12.aClass22Array1[local104] = local122;
				while (local115-- > 0) {
					@Pc(135) int local135 = local37.method3074();
					@Pc(139) int local139 = local37.method3074();
					local122.method643((long) local135, new Class1_Sub30(local139));
				}
			}
		}
		local37.anInt3911 = 0;
		local12.aString161 = local37.method3071();
		local12.anIntArray579 = new int[local64];
		local104 = 0;
		local12.anIntArray580 = new int[local64];
		local12.aStringArray26 = new String[local64];
		while (local37.anInt3911 < local57) {
			local115 = local37.method3107();
			if (local115 == 3) {
				local12.aStringArray26[local104] = local37.method3101().intern();
			} else if (local115 >= 100 || local115 == 21 || local115 == 38 || local115 == 39) {
				local12.anIntArray580[local104] = local37.method3122();
			} else {
				local12.anIntArray580[local104] = local37.method3074();
			}
			local12.anIntArray579[local104++] = local115;
		}
		Static245.aClass64_11.method1466(local12, (long) arg0);
		return local12;
	}
}

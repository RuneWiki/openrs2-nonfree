import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!an", name = "q", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array13;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!kb;")
	public static Class83 aClass83_91;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public static int anInt2931 = 127;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!tl;")
	public static Class155 aClass155_26 = new Class155(64);

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	public static int anInt2936 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Lclient!sf;")
	public static Class1_Sub2_Sub18 method2227(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = (Class1_Sub2_Sub18) Static280.aClass125_13.method3669((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static231.aClass83_171.method2306(Static86.method1511(arg0), Static207.method3672(arg0));
		local10 = new Class1_Sub2_Sub18();
		if (local29 != null) {
			local10.method4155(new Class1_Sub16(local29));
		}
		Static280.aClass125_13.method3671(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2231(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static180.anInt4068; local12++) {
			if (arg0.equalsIgnoreCase(Static78.aStringArray6[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2235(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(20) String local20 = arg1[arg0];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(30) int local30 = 0;
			@Pc(34) int local34 = arg0 + arg2;
			for (@Pc(36) int local36 = arg0; local36 < local34; local36++) {
				@Pc(43) String local43 = arg1[local36];
				if (local43 == null) {
					local30 += 4;
				} else {
					local30 += local43.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local30);
			for (@Pc(69) int local69 = arg0; local69 < local34; local69++) {
				@Pc(76) String local76 = arg1[local69];
				if (local76 == null) {
					local67.append("null");
				} else {
					local67.append(local76);
				}
			}
			return local67.toString();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString115;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!hc;")
	public static Class51 aClass51_23;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
	public static int[] anIntArray146 = new int[14];

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[Lclient!gj;")
	public static Class49[] aClass49Array3 = new Class49[14];

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString116 = "flash3:";

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V")
	public static void method1361() {
		Static144.aClass79_19.method2489();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	public static void method1363(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg0, 10);
		local8.method3805();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!hc;ZLclient!hc;II)Lclient!gk;")
	public static Class1_Sub2_Sub8 method1364(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(4) int arg2) {
		@Pc(6) int[] local6 = arg0.method1865(arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method1878(arg2, local6[local14]);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg1.method1878(local44, 0);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub8(arg0, arg1, arg2, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}
}

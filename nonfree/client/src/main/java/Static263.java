import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kba", name = "p", descriptor = "Lclient!e;")
	public static Interface3 anInterface3_14;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_52 = new Class124();

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "[I")
	public static final int[] anIntArray635 = new int[500];

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "Lclient!gj;")
	public static Class124 aClass124_53 = new Class124();

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_109 = new Class61(10, 8);

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
	public static final int[] anIntArray636 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZ)V")
	public static void method6566(@OriginalArg(0) int arg0) {
		if (!Static474.method3731(arg0)) {
			return;
		}
		@Pc(14) Class115[] local14 = Static458.aClass115ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class115 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt3491 = 1;
				local27.anInt3524 = 0;
				local27.anInt3460 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z[BZ)V")
	public static void method6568(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static17.aClass4_Sub9_1 == null) {
			Static17.aClass4_Sub9_1 = new Class4_Sub9(20000);
		}
		Static17.aClass4_Sub9_1.method5985(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static314.method7735(Static17.aClass4_Sub9_1.aByteArray97);
		Static278.aClass7_Sub1Array4 = new Class7_Sub1[Static472.anInt7955];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static333.anInt5925; local37 <= Static359.anInt6234; local37++) {
			@Pc(43) Class7_Sub1 local43 = Static502.method7167(local37);
			if (local43 != null) {
				Static278.aClass7_Sub1Array4[local35++] = local43;
			}
		}
		Static232.aBoolean353 = false;
		Static445.aLong223 = Static184.method3422();
		Static17.aClass4_Sub9_1 = null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6569(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static282.anInt5285; local16++) {
			if (arg0.equalsIgnoreCase(Static300.aStringArray26[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93);
	}
}

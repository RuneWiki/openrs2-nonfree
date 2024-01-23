import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "[Lclient!eb;")
	public static Class31[] aClass31Array2 = new Class31[500];

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "Z")
	public static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!bi", name = "nb", descriptor = "[J")
	public static long[] aLongArray12 = new long[500];

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Lclient!gh;")
	public static Class1_Sub2_Sub6 method3354(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) Static189.aClass123_11.method3640((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(31) byte[] local31 = Static142.aClass70_31.method3509(Static191.method3198(arg0), Static203.method3256(arg0));
		local15 = new Class1_Sub2_Sub6();
		if (local31 != null) {
			local15.method1188(new Class1_Sub16(local31));
		}
		Static189.aClass123_11.method3644(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIB)I")
	public static int method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg0);
		if (local16 == null) {
			return 0;
		} else if (arg1 >= 0 && local16.anIntArray96.length > arg1) {
			return local16.anIntArray96[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)I")
	public static int method3357(@OriginalArg(1) int arg0) {
		if (Static179.anInt3919 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}

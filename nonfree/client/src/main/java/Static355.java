import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!we", name = "t", descriptor = "B")
	public static byte aByte75;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_58 = new Class107(4);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!ug;")
	public static Class202 method5672(@OriginalArg(1) int arg0) {
		@Pc(10) Class202 local10 = (Class202) Static53.aClass107_6.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static338.aClass104_185.method2756(1, arg0);
		local10 = new Class202();
		local10.anInt6353 = arg0;
		if (local25 != null) {
			local10.method5343(new Class2_Sub12(local25));
		}
		local10.method5346();
		if (local10.anInt6348 == 2 && Static218.aClass41_27.method902((long) arg0) == null) {
			Static218.aClass41_27.method901(new Class2_Sub23(Static208.anInt4565), (long) arg0);
			Static16.aClass202Array1[Static208.anInt4565++] = local10;
		}
		Static53.aClass107_6.method3018((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!ef;)Ljava/lang/String;")
	public static String method5673(@OriginalArg(1) Class2_Sub12 arg0) {
		return Static19.method271(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method5675() {
		Static263.aClass107_39.method3015();
		Static362.aClass107_60.method3015();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
	public static void method5679() {
		Static263.aClass107_39.method3012();
		Static362.aClass107_60.method3012();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method5681() {
		Static302.method5085();
		Static128.aClass3_2 = null;
		Static319.aClass3_4 = null;
		Static79.aClass37_2 = null;
		Static57.aClass3_1 = null;
		Static68.aClass191ArrayArray1 = null;
	}
}

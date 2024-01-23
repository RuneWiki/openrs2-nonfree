import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt393;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!ao;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public static int anInt399;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public static int anInt400;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	public static int[] anIntArray24 = new int[5];

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!tl;")
	public static Class155 aClass155_4 = new Class155(64);

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public static int anInt401 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
	public static void method318(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static104.method831(arg0, 1);
		local12.method1189();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method319(@OriginalArg(1) boolean arg0) {
		Static138.aBoolean162 = arg0;
		Static272.aBoolean310 = !Static40.method1450();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Lclient!t;")
	public static Class150 method320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = ((long) arg0 & 0xFFFFL) << 16 | (long) arg3 << 48 & 0xFFFF000000000000L | ((long) arg2 & 0xFFFFL) << 32 | (long) arg1 & 0xFFFFL;
		@Pc(37) Class150 local37 = (Class150) Static285.aClass155_46.method4358(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(44) Class165[] local44 = null;
		@Pc(48) Class32 local48 = Static212.method3734(arg1);
		if (local48.anIntArray106 != null) {
			local44 = new Class165[local48.anIntArray106.length];
			for (@Pc(64) int local64 = 0; local64 < local44.length; local64++) {
				@Pc(75) Class31 local75 = Static59.method1161(local48.anIntArray106[local64]);
				local44[local64] = new Class165(local75.anInt928, local75.anInt925, local75.anInt924, local75.anInt921, local75.anInt923, local75.anInt926, local75.anInt919, local75.aBoolean64);
			}
		}
		local37 = new Class150(local48.anInt1148, local44, local48.anInt1155, arg3, arg2, arg0);
		Static285.aClass155_46.method4360(local31, local37);
		return local37;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public static void method322(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub6 local4 = Static104.method831(arg0, 10);
		local4.method1189();
	}
}

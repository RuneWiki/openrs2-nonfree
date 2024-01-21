import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!kc", name = "wb", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "Lclient!v;")
	private static Class76 aClass76_655 = Static134.method2017("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "Lclient!v;")
	private static Class76 aClass76_658 = Static134.method2017("Choose Option");

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "Lclient!v;")
	public static Class76 aClass76_656 = aClass76_658;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "Lclient!v;")
	public static Class76 aClass76_657 = Static134.method2017("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "Lclient!v;")
	public static Class76 aClass76_659 = aClass76_655;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!ua;")
	public static Class72 aClass72_17 = new Class72(100);

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lclient!v;")
	public static Class76 aClass76_660 = Static134.method2017("AUS");

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
	public static int anInt1571 = 0;

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "[I")
	public static int[] anIntArray201 = new int[2048];

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
	public static int anInt1572 = 0;

	@OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
	public static int anInt1573 = 0;

	@OriginalMember(owner = "client!kc", name = "rb", descriptor = "[I")
	public static int[] anIntArray203 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
	public static int anInt1574 = 1;

	@OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
	public static int anInt1575 = 0;

	@OriginalMember(owner = "client!kc", name = "ub", descriptor = "I")
	public static int anInt1576 = 0;

	@OriginalMember(owner = "client!kc", name = "vb", descriptor = "Lclient!v;")
	public static Class76 aClass76_661 = Static134.method2017("<col=c0ff00>");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)I")
	public static int method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class4_Sub4_Sub5_Sub1.anIntArray119[arg2 * 1024 / arg3] >> 1;
		return ((65536 - local16) * arg1 >> 16) + (local16 * arg0 >> 16);
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
	public static int method1031() {
		return 6;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!la;I)[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] method1034(@OriginalArg(0) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2) {
		return Static1.method3(arg0, arg2, arg1) ? Static105.method1612() : null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZ)V")
	public static void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub21 local12 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg3);
		if (local12 == null) {
			local12 = new Class4_Sub21();
			Static104.aClass28_9.method774((long) arg3, local12);
		}
		if (arg1 >= local12.anIntArray325.length) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray325.length; local45++) {
				local38[local45] = local12.anIntArray325[local45];
				local43[local45] = local12.anIntArray326[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray325.length; local71 < arg1; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local12.anIntArray325 = local38;
			local12.anIntArray326 = local43;
		}
		local12.anIntArray325[arg1] = arg2;
		local12.anIntArray326[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method1038() {
		aClass76_658 = null;
		aClass76_659 = null;
		aClass76_656 = null;
		aClass76_657 = null;
		aClass76_661 = null;
		anIntArray201 = null;
		aClass72_17 = null;
		aClass76_660 = null;
		aClass76_655 = null;
		anIntArray203 = null;
		anIntArray202 = null;
	}
}

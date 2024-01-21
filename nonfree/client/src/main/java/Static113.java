import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!t", name = "X", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!t", name = "jb", descriptor = "Lclient!qd;")
	public static Class63 aClass63_22 = new Class63(200);

	@OriginalMember(owner = "client!t", name = "kb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1370 = Static9.method266("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!t", name = "mb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1371 = Static9.method266("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public static void method1813() {
		aClass34_1371 = null;
		aClass63_22 = null;
		Class1_Sub1_Sub13.anIntArray343 = null;
		aBooleanArray18 = null;
		aClass34_1370 = null;
		anIntArray342 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Lclient!fd;")
	public static Class1_Sub9 method1814(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static41.aClass1_Sub9ArrayArray1[local12] == null || Static41.aClass1_Sub9ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static26.method496(local12);
			if (!local30) {
				return null;
			}
		}
		return Static41.aClass1_Sub9ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
	public static void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub7 local12 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg1);
		if (local12 == null) {
			local12 = new Class1_Sub7();
			Static14.aClass48_2.method1336((long) arg1, local12);
		}
		if (local12.anIntArray79.length <= arg0) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray79.length; local45++) {
				local38[local45] = local12.anIntArray79[local45];
				local43[local45] = local12.anIntArray78[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray79.length; local75 < arg0; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray78 = local43;
			local12.anIntArray79 = local38;
		}
		local12.anIntArray79[arg0] = arg2;
		local12.anIntArray78[arg0] = arg3;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BZI)I")
	public static int method1817(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg0; local12++) {
			local1 = Class71.anIntArray344[(arg1[local12] ^ local1) & 0xFF] ^ local1 >>> 8;
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fd;B)Lclient!fd;")
	public static Class1_Sub9 method1818(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(3) Class1_Sub9 local3 = Static78.method1368(arg0);
		if (local3 == null) {
			local3 = arg0.aClass1_Sub9_7;
		}
		return local3;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ie;IZ)Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 method1819(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2) {
		return Static69.method1193(arg2, arg0, arg1) ? Static90.method2071() : null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "[[[Lclient!dv;")
	public static Class89[][][] aClass89ArrayArrayArray1;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_27 = new Class160(92, 10);

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_1 = new Class162("", 19);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZBIIILclient!rg;IJ)V")
	public static void method1035(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class310 arg2, @OriginalArg(7) long arg3) {
		Static338.anInt5769 = 10000;
		Static485.anInt8392 = arg1;
		Static431.aClass310_93 = arg2;
		Static625.anInt11174 = 1;
		Static556.aClass14_Sub1_Sub3_4 = null;
		Static270.aBoolean372 = false;
		Static184.anInt7568 = 0;
		Static136.aLong92 = arg3;
		Static316.anInt5540 = 0;
		Static210.anInt3677 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Z")
	public static boolean method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static579.method8822(arg1, arg0) | Static86.method1433(arg0, arg1) | Static614.method8657(arg0, arg1)) & Static540.method7939(arg1, arg0);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIB)V")
	public static void method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 1);
		local9.method4004();
		local9.anInt4595 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!rg;)Lclient!tja;")
	public static Class350 method1038(@OriginalArg(0) int arg0, @OriginalArg(2) Class310 arg1) {
		@Pc(10) byte[] local10 = arg1.method7795(arg0);
		return local10 == null ? null : new Class350(local10);
	}
}

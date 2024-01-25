import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_13 = new Class208(71, 4);

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "J")
	public static long aLong22 = 20000000L;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	public static final int anInt661 = 1403;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class160 local8 = Static420.method5959(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.lb != null) {
			@Pc(18) Class1_Sub22 local18 = new Class1_Sub22();
			local18.aString27 = arg3;
			local18.anInt2861 = arg0;
			local18.anObjectArray1 = local8.lb;
			local18.aClass160_10 = local8;
			Static451.method6311(local18);
		}
		if (Static55.anInt1068 != 10 || !Static67.method1098(local8).method572(arg0 - 1)) {
			return;
		}
		@Pc(64) Class1_Sub9 local64;
		if (arg0 == 1) {
			local64 = Static123.method2194(Static469.aClass235_2, Static259.aClass208_60);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 2) {
			local64 = Static123.method2194(Static469.aClass235_2, Static213.aClass208_51);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 3) {
			local64 = Static123.method2194(Static469.aClass235_2, Static271.aClass208_65);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 4) {
			local64 = Static123.method2194(Static469.aClass235_2, Static324.aClass208_71);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 5) {
			local64 = Static123.method2194(Static469.aClass235_2, Static262.aClass208_61);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 6) {
			local64 = Static123.method2194(Static469.aClass235_2, Static415.aClass208_88);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 7) {
			local64 = Static123.method2194(Static469.aClass235_2, Static32.aClass208_14);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 8) {
			local64 = Static123.method2194(Static469.aClass235_2, Static531.aClass208_104);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 9) {
			local64 = Static123.method2194(Static469.aClass235_2, Static425.aClass208_92);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
		if (arg0 == 10) {
			local64 = Static123.method2194(Static469.aClass235_2, Static199.aClass208_45);
			Static105.method6467(arg2, local64, local8.anInt4205, arg1);
			Static42.method746(local64);
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	public static int method578() {
		return Static374.anInt6724++;
	}
}

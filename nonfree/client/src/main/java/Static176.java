import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!re", name = "w", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array11;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "[I")
	public static int[] anIntArray667;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!qe;")
	public static Class78 aClass78_708 = Static199.method3560("(U5");

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!qe;")
	public static Class78 aClass78_709 = Static199.method3560("(U(Y");

	@OriginalMember(owner = "client!re", name = "E", descriptor = "I")
	public static int anInt4068 = 0;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "S")
	public static short aShort24 = 205;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!oe;I)V")
	public static void method3212(@OriginalArg(0) Class72 arg0) {
		Static212.anInt4667 = arg0.method3190(Static57.aClass78_118);
		Static64.anInt1245 = arg0.method3190(Static108.aClass78_512);
		Static27.anInt489 = arg0.method3190(Static161.aClass78_660);
		Static131.anInt2978 = arg0.method3190(Static181.aClass78_730);
		Static64.anInt1249 = arg0.method3190(Static20.aClass78_73);
		Static19.anInt362 = arg0.method3190(Static92.aClass78_450);
		Static154.anInt3543 = arg0.method3190(Static103.aClass78_493);
		Static28.anInt502 = arg0.method3190(Static180.aClass78_727);
		Static48.anInt870 = arg0.method3190(Static72.aClass78_833);
		Static23.anInt420 = arg0.method3190(Static31.aClass78_102);
		Static35.anInt584 = arg0.method3190(Static114.aClass78_533);
		Static213.anInt2030 = arg0.method3190(Static2.aClass78_9);
		Static178.anInt4146 = arg0.method3190(Static170.aClass78_683);
		Static199.anInt4490 = arg0.method3190(Static51.aClass78_180);
		Static226.anInt4897 = arg0.method3190(Static148.aClass78_624);
		Static111.anInt2450 = arg0.method3190(Static95.aClass78_461);
		arg0.method3190(Static177.aClass78_711);
		Static108.anInt2401 = arg0.method3190(Static178.aClass78_717);
		Static116.anInt2728 = arg0.method3190(Static39.aClass78_134);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public static void method3213(@OriginalArg(1) int arg0) {
		Static4.anInt123 = -1;
		Static223.anInt4831 = arg0;
		Static4.anInt123 = -1;
		Static178.method3274();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Lclient!ih;")
	public static Class2_Sub3_Sub15 method3215() {
		@Pc(8) Class2_Sub3_Sub15 local8 = (Class2_Sub3_Sub15) Static103.aClass102_21.method3626();
		if (local8 != null) {
			local8.method3986();
			local8.method3918();
			return local8;
		}
		do {
			local8 = (Class2_Sub3_Sub15) Static127.aClass102_37.method3626();
			if (local8 == null) {
				return null;
			}
			if (local8.method1641() > Static111.method1911()) {
				return null;
			}
			local8.method3986();
			local8.method3918();
		} while ((local8.aLong184 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!oe;Z)V")
	public static void method3216(@OriginalArg(0) Class72 arg0) {
		Static140.aClass72_195 = arg0;
	}
}

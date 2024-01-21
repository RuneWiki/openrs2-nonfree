import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Lclient!of;")
	public static final Class70 aClass70_5 = new Class70();

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_667 = Static120.method1824("");

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_666 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Lclient!rd;")
	public static Class80 aClass80_668 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Lclient!rd;")
	public static Class80 aClass80_669 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	public static int anInt1720 = 10;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "Lclient!rd;")
	public static Class80 aClass80_670 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_671 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lclient!rd;")
	public static Class80 aClass80_672 = aClass80_667;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_673 = Static120.method1824("Standort");

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
	public static int anInt1724 = -1;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_674 = Static120.method1824("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_675 = Static120.method1824(" loggt sich aus)3");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	public static void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static46.method726(arg1 - arg0, arg2, Static96.anIntArrayArray27[arg3], arg1 + arg0);
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = arg0;
		@Pc(28) int local28 = -1;
		while (local26 > local21) {
			local28 += 2;
			local24 += local28;
			local21++;
			if (local24 >= 0) {
				local26--;
				@Pc(55) int[] local55 = Static96.anIntArrayArray27[arg3 + local26];
				@Pc(59) int local59 = arg1 + local21;
				local24 -= local26 << 1;
				@Pc(70) int local70 = arg1 - local21;
				@Pc(77) int[] local77 = Static96.anIntArrayArray27[arg3 - local26];
				Static46.method726(local70, arg2, local55, local59);
				Static46.method726(local70, arg2, local77, local59);
			}
			@Pc(93) int local93 = local26 + arg1;
			@Pc(97) int local97 = arg1 - local26;
			@Pc(104) int[] local104 = Static96.anIntArrayArray27[arg3 - local21];
			@Pc(110) int[] local110 = Static96.anIntArrayArray27[local21 + arg3];
			Static46.method726(local97, arg2, local110, local93);
			Static46.method726(local97, arg2, local104, local93);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!bc;Lclient!bc;)V")
	public static void method1190(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		Static168.aClass1_31 = arg1;
		Static130.aClass1_19 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bf;")
	public static RuntimeException_Sub1 method1192(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[B)Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 method1194(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(25) Class3_Sub1_Sub4_Sub3_Sub1 local25 = new Class3_Sub1_Sub4_Sub3_Sub1(arg0, Static49.anIntArray152, Static17.anIntArray64, Static86.anIntArray220, Static27.anIntArray523, Static101.anIntArray288, Static167.aByteArrayArray10);
			Static164.method2645();
			return local25;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dn", name = "Q", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "Lclient!hi;")
	public static Class3_Sub8_Sub4 aClass3_Sub8_Sub4_1;

	@OriginalMember(owner = "client!dn", name = "X", descriptor = "Lclient!tr;")
	public static Class110 aClass110_2;

	@OriginalMember(owner = "client!dn", name = "Z", descriptor = "[[[Lclient!ct;")
	public static Class48[][][] aClass48ArrayArrayArray1;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
	public static int anInt1370 = -1;

	@OriginalMember(owner = "client!dn", name = "N", descriptor = "Lclient!kb;")
	public static final Class130 aClass130_1 = new Class130();

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!dn", name = "W", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_25 = new Class57("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!dn", name = "Y", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_19 = new Class244(37, 3);

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
	public static void method1179(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub8 local10 = Static275.method4307(1, arg0);
		local10.method3217();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1180(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static197.method3101(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = (Static16.aShort2 - Static316.aShort81) * local7 / 100 + Static316.aShort81;
		@Pc(35) int local35 = arg2 * local29 >> 8;
		@Pc(42) int local42 = 16384 - arg3 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg4 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local35;
		if (local42 != 0) {
			local60 = Class226.anIntArray614[local42] * -local35 >> 15;
			local62 = local35 * Class226.anIntArray613[local42] >> 15;
		}
		if (local49 != 0) {
			local51 = Class226.anIntArray614[local49] * local62 >> 15;
			local62 = Class226.anIntArray613[local49] * local62 >> 15;
		}
		Static243.anInt4289 = arg1 - local60;
		Static145.anInt2716 = arg4;
		Static331.anInt5600 = 0;
		Static206.anInt3639 = arg0 - local51;
		Static339.anInt5726 = arg6 - local62;
		Static327.anInt5556 = arg3;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)V")
	public static void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(7, arg1);
		local13.method3219();
		local13.anInt3670 = arg0;
	}
}

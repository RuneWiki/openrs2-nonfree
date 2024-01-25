import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!un", name = "P", descriptor = "[I")
	public static int[] anIntArray641;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt6339 = -1;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!un", name = "J", descriptor = "Z")
	public static boolean aBoolean523 = false;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!un", name = "S", descriptor = "F")
	public static float aFloat77 = 1024.0F;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)I")
	public static int method5453(@OriginalArg(1) int arg0) {
		@Pc(7) Class22 local7 = Static157.method2796(arg0);
		@Pc(16) int local16 = local7.anInt444;
		@Pc(19) int local19 = local7.anInt435;
		@Pc(22) int local22 = local7.anInt440;
		@Pc(29) int local29 = Class1_Sub5_Sub14.anIntArray329[local22 - local19];
		return local29 & Static81.anIntArray119[local16] >> local19;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ii;Lclient!ps;)V")
	public static void method5454(@OriginalArg(1) Class105 arg0, @OriginalArg(2) Class163 arg1) {
		Static39.method794(0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	public static void method5456(@OriginalArg(0) int arg0) {
		Static284.anInt5720 = 3;
		Static101.anInt1939 = -1;
		Static289.anInt5793 = arg0;
		Static72.anInt1505 = 100;
	}
}

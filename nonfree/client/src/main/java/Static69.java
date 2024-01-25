import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!ct;")
	public static Class30 aClass30_16;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!qm;")
	public static Class174 aClass174_6;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public static int anInt1602 = -1;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_55 = new Class106("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "[Lclient!tp;")
	public static final Class199[] aClass199Array1 = new Class199[14];

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public static void method1567() {
		if (Static184.anInt3735 == 5) {
			Static184.anInt3735 = 6;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class187 local13 = local7.aClass187_2; local13 != null; local13 = local13.aClass187_3) {
			@Pc(17) Class11_Sub2 local17 = local13.aClass11_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort94 == arg1 && local17.aShort93 == arg2) {
				Static311.method5134(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)Z")
	public static boolean method1569(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method2132();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method2132() == 1;
		if (local28) {
			Static273.method4876(local8);
		}
		Static93.method4609(local8);
		return true;
	}
}

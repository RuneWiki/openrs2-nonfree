import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
	public static boolean aBoolean248;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "[Lclient!hu;")
	public static Class51_Sub1[] aClass51_Sub1Array1;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_3 = new Class392(6, 1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Z")
	public static boolean method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Z")
	public static boolean method3179(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)I")
	public static int method3180(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(43) int local43 = local31 | local31 >>> 16;
		return arg0 & ~local43;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method3182(@OriginalArg(1) Class100 arg0) {
		Static510.aClass70_11 = Static306.method4763(Static50.anInt900, arg0, true);
		Static511.aClass196_36 = Static600.method8236(Static50.anInt900, arg0);
		Static414.aClass70_6 = Static306.method4763(Static157.anInt3080, arg0, true);
		Static85.aClass196_38 = Static600.method8236(Static157.anInt3080, arg0);
		Static196.aClass70_3 = Static306.method4763(Static255.anInt6560, arg0, true);
		Static73.aClass196_5 = Static600.method8236(Static255.anInt6560, arg0);
	}
}

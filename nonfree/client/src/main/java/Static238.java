import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!p", name = "Ib", descriptor = "I")
	public static int anInt4785;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_47 = new Class109(10);

	@OriginalMember(owner = "client!p", name = "Gb", descriptor = "I")
	public static int anInt4783 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public static void method4222() {
		Static150.method2709(Static345.anInt6647);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method4229() {
		@Pc(10) Class109 local10 = Static291.aClass109_53;
		synchronized (Static291.aClass109_53) {
			Static291.aClass109_53.method2850();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lclient!ql;")
	public static Class5_Sub1_Sub16 method4230(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub1_Sub16 local15 = (Class5_Sub1_Sub16) Static259.aClass122_10.method3177((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static76.aClass93_27.method2410(arg0, 19);
		local15 = new Class5_Sub1_Sub16();
		if (local25 != null) {
			local15.method4682(new Class5_Sub12(local25));
		}
		Static259.aClass122_10.method3181((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method4238(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static368.method5429(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)V")
	public static void method4239(@OriginalArg(1) int arg0) {
		Static314.anInt6100 = arg0;
		Static143.aClass109_33.method2858();
	}
}

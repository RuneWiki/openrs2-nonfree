import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	public static int anInt1176;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	public static int anInt1178 = -2;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V")
	public static void method1032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(13, arg1);
		local8.method4140();
		local8.anInt4723 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!bk;)Lclient!cc;")
	public static Class29_Sub1 method1034(@OriginalArg(1) Class5_Sub1 arg0) {
		return new Class29_Sub1(arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1843(), arg0.method1832());
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!pn;")
	public static Class5_Sub9_Sub17 method1035(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub9_Sub17 local10 = (Class5_Sub9_Sub17) Static166.aClass215_4.method5683((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static24.aClass170_37.method4584(5, arg0);
		local10 = new Class5_Sub9_Sub17();
		if (local20 != null) {
			local10.method4157(new Class5_Sub1(local20));
		}
		Static166.aClass215_4.method5687(local10, (long) arg0);
		return local10;
	}
}

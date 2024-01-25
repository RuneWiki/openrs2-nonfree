import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_97 = new Class184(27, 8);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!lk;IIZLclient!lk;IZ)I")
	public static int method2225(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class145_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static3.method4778(arg1, arg4, arg0, arg5);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static3.method4778(arg2, arg4, arg0, arg3);
			return arg3 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!fp;")
	public static Class79 method2226(@OriginalArg(0) int arg0) {
		@Pc(15) Class79 local15 = (Class79) Static257.aClass5_42.method104((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static394.aClass56_80.method1384(0, arg0);
		local15 = new Class79();
		if (local25 != null) {
			local15.method2153(new Class3_Sub2(local25), arg0);
		}
		Static257.aClass5_42.method114((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	public static void method2228() {
		@Pc(1) Class5 local1 = Static142.aClass5_26;
		synchronized (Static142.aClass5_26) {
			Static142.aClass5_26.method116();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static161.method2808(true, local35);
	}
}

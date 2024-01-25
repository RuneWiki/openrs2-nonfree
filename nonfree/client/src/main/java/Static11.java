import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_95 = new Class37(4);

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_96 = new Class37(8);

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[Lclient!fd;")
	public static final Class65[] aClass65Array4 = new Class65[8];

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "S")
	public static short aShort89 = 320;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ck;)V")
	public static void method5108(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		Static263.aClass12Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ur;Lclient!ur;IZIZI)I")
	public static int method5109(@OriginalArg(0) Class127_Sub1 arg0, @OriginalArg(1) Class127_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static244.method5352(arg1, arg0, arg4, arg5);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = Static244.method5352(arg1, arg0, arg2, arg3);
			return arg2 ? -local35 : local35;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;BLclient!lm;)V")
	public static void method5110(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class134 arg1) {
		Static159.anInterface2_7 = arg0;
		Static347.aClass134_151 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	public static void method5111(@OriginalArg(0) int arg0) {
		Static295.anInt5948 = arg0;
		@Pc(7) Class37 local7 = Static203.aClass37_65;
		synchronized (Static203.aClass37_65) {
			Static203.aClass37_65.method919();
		}
		local7 = Static50.aClass37_24;
		synchronized (Static50.aClass37_24) {
			Static50.aClass37_24.method919();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5112(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[Lclient!ae;")
	public static final Class6_Sub1[] aClass6_Sub1Array1 = new Class6_Sub1[2048];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)C")
	public static char method2974(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ll;Z)V")
	public static void method2977(@OriginalArg(0) Class6_Sub23 arg0) {
		if (Static409.aClass101ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface10 local8 = null;
		if (arg0.anInt4219 == 0) {
			local8 = (Interface10) Static86.method825(arg0.anInt4211, arg0.anInt4218, arg0.anInt4215);
		}
		if (arg0.anInt4219 == 1) {
			local8 = (Interface10) Static273.method4127(arg0.anInt4211, arg0.anInt4218, arg0.anInt4215);
		}
		if (arg0.anInt4219 == 2) {
			local8 = (Interface10) Static415.method6101(arg0.anInt4211, arg0.anInt4218, arg0.anInt4215, sq.class);
		}
		if (arg0.anInt4219 == 3) {
			local8 = (Interface10) Static109.method4308(arg0.anInt4211, arg0.anInt4218, arg0.anInt4215);
		}
		if (local8 == null) {
			arg0.anInt4220 = 0;
			arg0.anInt4217 = -1;
			arg0.anInt4213 = 0;
		} else {
			arg0.anInt4217 = local8.method5325();
			arg0.anInt4213 = local8.method5327();
			arg0.anInt4220 = local8.method5321();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
	public static void method2978(@OriginalArg(0) int arg0) {
		Static392.anInt5057 = arg0;
		@Pc(7) Class44 local7 = Static415.aClass44_53;
		synchronized (Static415.aClass44_53) {
			Static415.aClass44_53.method1351();
		}
		local7 = Static79.aClass44_6;
		synchronized (Static79.aClass44_6) {
			Static79.aClass44_6.method1351();
		}
	}
}

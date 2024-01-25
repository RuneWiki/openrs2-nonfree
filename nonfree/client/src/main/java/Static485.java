import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!gp;")
	public static Class117 aClass117_211;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!pj;")
	public static Class5_Sub38 aClass5_Sub38_2;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_86 = new Class236(21, -1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZLclient!oh;I)V")
	public static void method6722(@OriginalArg(0) int arg0, @OriginalArg(2) Class220 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class87 local12 = arg1.method5482(Static110.aClass62_15);
		if (local12 == null) {
			return;
		}
		Static110.aClass62_15.N(arg0, arg2, arg0 + arg1.anInt6627, arg1.anInt6681 + arg2);
		if (Static219.anInt4147 < 3) {
			Static343.aClass25_19.method6964((float) arg0 + (float) arg1.anInt6627 / 2.0F, (float) arg2 + (float) arg1.anInt6681 / 2.0F, ((int) -Static476.aFloat339 & 0x3FFF) << 2, local12, arg0, arg2);
		} else {
			Static110.aClass62_15.G(-16777216, local12, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lclient!oh;")
	public static Class220 method6724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class220 local7 = Static352.method5447(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass220Array6 == null || arg0 >= local7.aClass220Array6.length) {
			return null;
		} else {
			return local7.aClass220Array6[arg0];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method6726() {
		Static431.aClass288_56.method6744();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method6727() {
		if (Static164.aClass146_1 != null) {
			Static164.aClass146_1.method5765();
		}
		if (Static301.aClass146_2 != null) {
			Static301.aClass146_2.method5765();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)Z")
	public static boolean method6730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static33.method799(arg0, arg1) || Static404.method5867(arg1, arg0);
	}
}

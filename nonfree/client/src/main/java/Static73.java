import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
	public static int anInt1454;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Lclient!rl;")
	public static Class256 aClass256_3;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public static int anInt1447 = 2;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
	public static int method1330() {
		@Pc(5) Class288 local5 = Static240.aClass288_34;
		synchronized (Static240.aClass288_34) {
			return Static240.aClass288_34.method6731();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!oh;)Lclient!oh;")
	public static Class220 method1344(@OriginalArg(1) Class220 arg0) {
		if (arg0.anInt6605 != -1) {
			return Static352.method5447(arg0.anInt6605);
		}
		@Pc(25) int local25 = arg0.anInt6661 >>> 16;
		@Pc(30) Class258 local30 = new Class258(Static307.aClass42_24);
		for (@Pc(35) Class5_Sub43 local35 = (Class5_Sub43) local30.method6134(); local35 != null; local35 = (Class5_Sub43) local30.method6135()) {
			if (local35.anInt7801 == local25) {
				return Static352.method5447((int) local35.aLong253);
			}
		}
		return null;
	}
}

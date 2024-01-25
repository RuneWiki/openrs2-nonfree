import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jn", name = "N", descriptor = "B")
	public static byte aByte46;

	@OriginalMember(owner = "client!jn", name = "Y", descriptor = "Lclient!iq;")
	public static Class104 aClass104_94;

	@OriginalMember(owner = "client!jn", name = "Z", descriptor = "Lclient!iq;")
	public static Class104 aClass104_95;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	public static void method3214(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(7, arg0);
		local13.method1799();
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)Lclient!ef;")
	public static Class2_Sub12 method3215() {
		@Pc(8) Class2_Sub12 local8 = new Class2_Sub12(38);
		local8.method3147(15);
		local8.method3147(Static333.anInt6458);
		local8.method3147(Static286.aBoolean512 ? 1 : 0);
		local8.method3147(Static346.aBoolean526 ? 1 : 0);
		local8.method3147(Static146.aBoolean287 ? 1 : 0);
		local8.method3147(Static205.aBoolean391 ? 1 : 0);
		local8.method3147(0);
		local8.method3147(Static273.aBoolean494 ? 1 : 0);
		local8.method3147(Static219.aBoolean425 ? 1 : 0);
		local8.method3147(Static39.aBoolean48 ? 1 : 0);
		local8.method3147(Static222.anInt6836);
		local8.method3147(Static309.aBoolean544 ? 1 : 0);
		local8.method3147(Static134.aBoolean271 ? 1 : 0);
		local8.method3147(Static245.aBoolean453 ? 1 : 0);
		local8.method3147(Static207.anInt4534);
		local8.method3147(Static145.aBoolean285 ? 1 : 0);
		local8.method3147(Static17.anInt277);
		local8.method3147(Static241.anInt5136);
		local8.method3147(Static46.anInt752);
		local8.method3158(Static128.anInt2762);
		local8.method3158(Static218.anInt4842);
		local8.method3147(Static292.method4861());
		local8.method3162(Static352.anInt6763);
		local8.method3147(Static313.anInt6146);
		local8.method3147(Static353.aBoolean525 ? 1 : 0);
		local8.method3147(Static311.aBoolean549 ? 1 : 0);
		local8.method3147(Static248.anInt5206);
		local8.method3147(Static363.aBoolean618 ? 1 : 0);
		local8.method3147(Static204.aBoolean384 ? 1 : 0);
		local8.method3147(Static360.anInt6856);
		local8.method3147(Static243.aBoolean451 ? 1 : 0);
		local8.method3147(Static18.anInt304);
		local8.method3147(Static168.anInt3821);
		return local8;
	}

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)V")
	public static void method3216() {
		@Pc(1) Class107 local1 = Static135.aClass107_12;
		synchronized (Static135.aClass107_12) {
			Static135.aClass107_12.method3012();
		}
	}

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "(I)Z")
	public static boolean method3218() {
		if (Static334.aBoolean580) {
			try {
				Static381.method5669(Static62.aClass179_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)I")
	public static int method3221(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}

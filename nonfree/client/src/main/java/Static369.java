import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt6786;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_233 = new Class62("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public static int anInt6788 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	public static void method5878() {
		@Pc(12) int local12 = Static339.method5448();
		if (local12 == 0) {
			Static116.aByteArrayArrayArray2 = null;
			Static47.method611(0);
		} else if (local12 == 1) {
			Static247.method4312((byte) 0);
			Static47.method611(512);
			if (Static329.aByteArrayArrayArray17 != null) {
				Static64.method1181();
			}
		} else {
			Static247.method4312((byte) (Static87.anInt1878 - 4 & 0xFF));
			Static47.method611(2);
		}
		Static165.anInt3408 = Static241.anInt2711;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!cj;)I")
	public static int method5879(@OriginalArg(1) Class1_Sub2_Sub1_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt980;
		@Pc(17) Class227 local17 = arg0.method4799();
		if (arg0.aBoolean394) {
			local13 = arg0.anInt975;
		} else if (arg0.anInt5421 == local17.anInt6455 || local17.anInt6462 == arg0.anInt5421 || arg0.anInt5421 == local17.anInt6459 || arg0.anInt5421 == local17.anInt6435) {
			local13 = arg0.anInt966;
		} else if (arg0.anInt5421 == local17.anInt6437 || local17.anInt6453 == arg0.anInt5421 || arg0.anInt5421 == local17.anInt6431 || arg0.anInt5421 == local17.anInt6457) {
			local13 = arg0.anInt977;
		}
		return local13;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method5880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}

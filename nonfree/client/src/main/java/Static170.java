import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!ok;")
	public static Class147 aClass147_5;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt3773 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Loaded fonts";

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	public static int method3194(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
	public static void method3195(@OriginalArg(1) int arg0) {
		Static118.anInt2544 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!lo;)V")
	public static void method3197(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class2_Sub2_Sub1_Sub2) {
			@Pc(14) Class2_Sub2_Sub1_Sub2 local14 = (Class2_Sub2_Sub1_Sub2) arg0;
			if (local14.aClass34_1 != null) {
				Static350.method5644(local14);
				return;
			}
		} else if (arg0 instanceof Class2_Sub2_Sub1_Sub1) {
			Static352.method5474((Class2_Sub2_Sub1_Sub1) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(II)V")
	public static void method3198() {
		@Pc(1) Class154 local1 = Static202.aClass154_69;
		synchronized (Static202.aClass154_69) {
			Static202.aClass154_69.method4220(5);
		}
		local1 = Static108.aClass154_36;
		synchronized (Static108.aClass154_36) {
			Static108.aClass154_36.method4220(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method3201(@OriginalArg(0) Class11 arg0) {
		Static110.aClass11_49 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method3202() {
		Static270.anInt6606 = -1;
		Static248.aClass60_22 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method3204(@OriginalArg(0) Class11 arg0) {
		Static272.aClass11_121 = arg0;
	}
}

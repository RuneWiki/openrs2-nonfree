import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	public static int anInt4720;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	public static int anInt4694 = -1;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Z")
	public static boolean aBoolean312 = true;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "[Lclient!tm;")
	public static final Class10_Sub3_Sub3_Sub2[] aClass10_Sub3_Sub3_Sub2Array3 = new Class10_Sub3_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public static int anInt4704 = -1;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public static int anInt4705 = -1;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "Lclient!al;")
	public static final Class11 aClass11_105 = new Class11(64);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!sn;I)V")
	public static void method4219(@OriginalArg(0) int arg0, @OriginalArg(1) Class188 arg1) {
		if (Static149.aBoolean209) {
			Static149.aBoolean209 = false;
			arg0 = 0;
		}
		if (Static221.aClass188_1 != null && Static221.aClass188_1.method5071(arg1)) {
			return;
		}
		Static221.aClass188_1 = arg1;
		Static137.aLong87 = Static168.method3300();
		Static323.anInt971 = arg0;
		Static309.anInt5890 = arg0;
		if (Static309.anInt5890 != 0) {
			Static72.anInt1757 = Static236.anInt174;
			Static220.aFloat88 = Static215.aFloat84;
			Static282.aFloat102 = Static28.aFloat13;
			Static308.aFloat90 = Static348.aFloat101;
			Static164.anInt3453 = Static39.anInt977;
			Static71.aFloat106 = Static347.aFloat146;
			Static190.aClass67_3 = Static181.aClass67_2;
			Static312.aFloat137 = Static123.aFloat136;
			Static258.anInt4907 = Static179.anInt3692;
			Static203.aFloat140 = Static206.aFloat147;
			return;
		}
		Static104.method2275();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V")
	public static void method4223(@OriginalArg(0) int arg0) {
		Static46.anInt1179 = arg0;
		Static76.aClass11_40.method213();
	}
}

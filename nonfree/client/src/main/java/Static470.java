import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt7956;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public static final int anInt7952 = 1400;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_108 = new Class160(67, -1);

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt7957 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIILclient!wda;Lclient!wda;)V")
	public static void method6576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29_Sub5 arg3, @OriginalArg(4) Class29_Sub5 arg4) {
		@Pc(4) Class9 local4 = Static157.method2295(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass29_Sub5_1 = arg3;
			local4.aClass29_Sub5_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method6577() {
		Static202.aClass6_Sub48_2 = new Class6_Sub48(Static141.aClass104_3.method2145(anInt7957), "", Static278.anInt6564, 1002, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public static void method6578(@OriginalArg(0) int arg0) {
		if (Static140.anInt2527 == 0) {
			Static143.aClass6_Sub19_Sub4_7.method7739(arg0);
		} else {
			Static192.anInt3325 = arg0;
		}
	}
}

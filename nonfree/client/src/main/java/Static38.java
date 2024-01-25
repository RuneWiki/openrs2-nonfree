import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_23 = new Class56(34, 6);

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public static int anInt726 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZLclient!tf;III)V")
	public static void method622(@OriginalArg(0) int arg0, @OriginalArg(3) Class322 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg2 <= 0) {
			Static434.method6090(arg0, arg1, arg3);
			return;
		}
		Static225.anInt3978 = arg3;
		Static91.anInt1912 = arg0;
		Static361.anInt8636 = 0;
		Static218.aBoolean295 = false;
		Static24.aClass322_5 = arg1;
		Static565.anInt9228 = 1;
		Static417.anInt7075 = Static323.aClass3_Sub4_Sub3_2.method6363() / arg2;
		if (Static417.anInt7075 < 1) {
			Static417.anInt7075 = 1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[J[I)V")
	public static void method624(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static475.method6540(0, arg1, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
	public static int method626() {
		if (Static376.aFrame4 == null) {
			return Static556.aBoolean676 ? 2 : 1;
		} else {
			return 3;
		}
	}
}

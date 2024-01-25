import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!qs;)I")
	public static int method2737(@OriginalArg(1) Class211 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4761(Static410.anInt7334)) {
			local5++;
		}
		if (arg0.method4761(Static87.anInt2076)) {
			local5++;
		}
		if (arg0.method4761(Static9.anInt3078)) {
			local5++;
		}
		if (arg0.method4761(Static129.anInt2884)) {
			local5++;
		}
		if (arg0.method4761(Static310.anInt5824)) {
			local5++;
		}
		if (arg0.method4761(Static100.anInt2370)) {
			local5++;
		}
		if (arg0.method4761(Static247.anInt4761)) {
			local5++;
		}
		if (arg0.method4761(Static93.anInt6566)) {
			local5++;
		}
		if (arg0.method4761(Static64.anInt1736)) {
			local5++;
		}
		if (arg0.method4761(Static332.anInt6407)) {
			local5++;
		}
		if (arg0.method4761(Static2.anInt45)) {
			local5++;
		}
		if (arg0.method4761(Static97.anInt2327)) {
			local5++;
		}
		if (arg0.method4761(Static403.anInt7267)) {
			local5++;
		}
		if (arg0.method4761(Static279.anInt5476)) {
			local5++;
		}
		if (arg0.method4761(Static99.anInt2354)) {
			local5++;
		}
		if (arg0.method4761(Static230.anInt4558)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)V")
	public static void method2738(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static456.anInt1594 != -1) {
				Static222.method3439(Static456.anInt1594);
			}
			for (@Pc(13) Class1_Sub39 local13 = (Class1_Sub39) Static177.aClass38_18.method767(); local13 != null; local13 = (Class1_Sub39) Static177.aClass38_18.method773()) {
				if (!local13.method6175()) {
					local13 = (Class1_Sub39) Static177.aClass38_18.method767();
					if (local13 == null) {
						break;
					}
				}
				Static285.method4176(local13, false, true);
			}
			Static456.anInt1594 = -1;
			Static177.aClass38_18 = new Class38(8);
			Static54.method1005();
			Static456.anInt1594 = Static128.anInt2852;
			Static191.method3101(false);
			Static179.method3014();
			Static178.method2998(Static456.anInt1594);
		}
		Static429.aBoolean496 = true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)[Lclient!jc;")
	public static Class126[] method2739() {
		return new Class126[] { Static292.aClass126_11, Static199.aClass126_7, Static398.aClass126_13, Static57.aClass126_3, Static245.aClass126_10, Static190.aClass126_6, Static393.aClass126_12, Static412.aClass126_16, Static408.aClass126_15, Static223.aClass126_9, Static452.aClass126_17, Static203.aClass126_8, Static405.aClass126_14, Static89.aClass126_18, Static180.aClass126_5 };
	}
}

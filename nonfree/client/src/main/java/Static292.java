import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method4649() {
		if (Static543.aBoolean661) {
			return;
		}
		Static543.aBoolean661 = true;
		Static350.aBoolean631 = true;
		if (Static278.aClass3_Sub13_Sub1_1.lb) {
			Static439.aFloat151 = (int) Static439.aFloat151 + 191 & 0xFFFFFF80;
		} else {
			Static443.aFloat152 += (24.0F - Static443.aFloat152) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!qh;)Lclient!hba;")
	public static Class111_Sub2 method4650(@OriginalArg(1) Class3_Sub11 arg0) {
		return new Class111_Sub2(arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3126(), arg0.method3118());
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!om;I)Lclient!f;")
	public static Class46 method4651(@OriginalArg(1) Class246 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class46 local10 = (Class46) Static275.aClass10_26.method250((long) arg1);
		if (local10 == null) {
			if (Static459.aBoolean595) {
				local10 = Static4.aClass43_1.method7205(Static606.method7597(arg0, arg1), true);
			} else {
				local10 = Static246.method4029(arg0.method5679(arg1));
			}
			Static275.aClass10_26.method254(local10, (long) arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
	public static boolean method4652(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}

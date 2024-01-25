import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZZI)Lclient!bg;")
	public static Class6_Sub6 method3626(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class6_Sub6) Static296.aClass209_21.method5038(local17);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class283 local9 = Static128.aClass283ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static146.anInt4859 = local9.anInt8168;
			Static84.anInt1659 = local9.anInt8167;
			Static155.anInt2583 = local9.anInt8172;
		}
		Static645.method8803();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
	public static void method3628() {
		Static340.aClass10_37.method380();
		Static229.aClass10_18.method380();
		Static217.aClass10_16.method380();
		Static336.aClass10_35.method380();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "Lclient!ok;")
	public static Class178 aClass178_120;

	@OriginalMember(owner = "client!tk", name = "T", descriptor = "Lclient!qs;")
	public static Class96 aClass96_4;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_98 = new Class2(40, 3);

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "[I")
	public static final int[] anIntArray562 = new int[5];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ok;BLclient!ok;)I")
	public static int method4967(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Class178 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3848(Static272.anInt4601)) {
			local5++;
		}
		if (arg0.method3848(Static37.anInt653)) {
			local5++;
		}
		if (arg0.method3848(Static1.anInt1)) {
			local5++;
		}
		if (arg1.method3848(Static272.anInt4601)) {
			local5++;
		}
		if (arg1.method3848(Static37.anInt653)) {
			local5++;
		}
		if (arg1.method3848(Static1.anInt1)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLclient!rc;)V")
	public static void method4968(@OriginalArg(1) Class7_Sub37 arg0) {
		if (Static19.aClass223ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt5473 == 0) {
			local8 = (Interface5) Static184.method2673(arg0.anInt5482, arg0.anInt5481, arg0.anInt5477);
		}
		if (arg0.anInt5473 == 1) {
			local8 = (Interface5) Static178.method2592(arg0.anInt5482, arg0.anInt5481, arg0.anInt5477);
		}
		if (arg0.anInt5473 == 2) {
			local8 = (Interface5) Static14.method152(arg0.anInt5482, arg0.anInt5481, arg0.anInt5477, gf.class);
		}
		if (arg0.anInt5473 == 3) {
			local8 = (Interface5) Static339.method4422(arg0.anInt5482, arg0.anInt5481, arg0.anInt5477);
		}
		if (local8 == null) {
			arg0.anInt5483 = 0;
			arg0.anInt5479 = 0;
			arg0.anInt5485 = -1;
		} else {
			arg0.anInt5485 = local8.method5731();
			arg0.anInt5483 = local8.method5732();
			arg0.anInt5479 = local8.method5729();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZB)V")
	public static void method4970(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static34.anInt597--;
			if (Static34.anInt597 == 0) {
				Static165.anIntArray263 = null;
			}
		}
		if (arg0) {
			Static50.anInt781--;
			if (Static50.anInt781 == 0) {
				Static434.anIntArray609 = null;
			}
		}
	}
}

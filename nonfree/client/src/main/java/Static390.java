import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method5317() {
		Static71.aClass83_61.method1669();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
	public static int method5319() {
		@Pc(7) Class109 local7 = Static276.aClass109_10;
		@Pc(9) boolean local9 = false;
		if (Static285.anInt7839 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static315.method4727(null, 0, local18, 0, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static101.method1557();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method4747();
		}
		@Pc(67) int local67 = (int) (Static101.method1557() - local35);
		local7.method4743(0, -16777216, 0, 100, 100);
		if (local9) {
			local7.method4713();
		}
		return local67;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lclient!ss;I)V")
	public static void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) Class219[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class219 local17 = arg1[local11];
			if (local17 != null && local17.anInt6379 == arg0 && !Static53.method925(local17)) {
				if (local17.anInt6377 == 0) {
					method5320(local17.anInt6422, arg1);
					if (local17.aClass219Array3 != null) {
						method5320(local17.anInt6422, local17.aClass219Array3);
					}
					@Pc(58) Class1_Sub36 local58 = (Class1_Sub36) Static445.aClass27_42.method553((long) local17.anInt6422);
					if (local58 != null) {
						Static192.method2935(local58.anInt5680);
					}
				}
				if (local17.anInt6377 == 6 && local17.anInt6417 != -1) {
					@Pc(81) Class191 local81 = Static191.aClass28_1.method567(local17.anInt6417);
					if (local81 != null) {
						local17.anInt6396 += Static9.anInt248;
						while (local81.anIntArray454[local17.anInt6425] < local17.anInt6396) {
							local17.anInt6396 -= local81.anIntArray454[local17.anInt6425];
							local17.anInt6425++;
							if (local81.anIntArray452.length <= local17.anInt6425) {
								local17.anInt6425 -= local81.anInt5747;
								if (local17.anInt6425 < 0 || local17.anInt6425 >= local81.anIntArray452.length) {
									local17.anInt6425 = 0;
								}
							}
							local17.anInt6420 = local17.anInt6425 + 1;
							if (local17.anInt6420 >= local81.anIntArray452.length) {
								local17.anInt6420 -= local81.anInt5747;
								if (local17.anInt6420 < 0 || local81.anIntArray452.length <= local17.anInt6420) {
									local17.anInt6420 = -1;
								}
							}
							Static355.method4895(local17);
						}
					}
				}
			}
		}
	}
}

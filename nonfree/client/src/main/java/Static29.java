import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
	public static final int[] anIntArray28 = new int[13];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
	public static int method571(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lclient!in;II)V")
	public static void method573(@OriginalArg(0) Class160[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class160 local13 = arg0[local7];
			if (local13 != null && local13.anInt4224 == arg1 && !Static67.method1106(local13)) {
				if (local13.anInt4166 == 0) {
					method573(arg0, local13.anInt4199);
					if (local13.aClass160Array1 != null) {
						method573(local13.aClass160Array1, local13.anInt4199);
					}
					@Pc(50) Class1_Sub38 local50 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13.anInt4199);
					if (local50 != null) {
						Static18.method441(local50.anInt7676);
					}
				}
				if (local13.anInt4166 == 6 && local13.anInt4143 != -1) {
					@Pc(70) Class197 local70 = Static223.aClass245_1.method5312(local13.anInt4143);
					if (local70 != null) {
						local13.anInt4222 += Static175.anInt3258;
						@Pc(81) int local81 = local13.anInt4148;
						while (local70.anIntArray279[local13.anInt4148] < local13.anInt4222) {
							local13.anInt4222 -= local70.anIntArray279[local13.anInt4148];
							local13.anInt4148++;
							if (local13.anInt4148 >= local70.anIntArray284.length) {
								local13.anInt4148 -= local70.anInt5063;
								if (local13.anInt4148 < 0 || local13.anInt4148 >= local70.anIntArray284.length) {
									local13.anInt4148 = 0;
								}
							}
							local13.anInt4154 = local13.anInt4148 + 1;
							if (local13.anInt4154 >= local70.anIntArray284.length) {
								local13.anInt4154 -= local70.anInt5063;
								if (local13.anInt4154 < 0 || local13.anInt4154 >= local70.anIntArray284.length) {
									local13.anInt4154 = -1;
								}
							}
							Static415.method5900(local13);
						}
						if (local13.anInt4148 != local81) {
							Static392.method5630(local70, local13.anInt4148);
						}
					}
				}
			}
		}
	}
}

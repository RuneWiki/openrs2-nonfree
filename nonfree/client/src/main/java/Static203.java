import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_74 = new Class319(3, -1);

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II[Lclient!wv;)V")
	public static void method3496(@OriginalArg(0) int arg0, @OriginalArg(2) Class365[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class365 local17 = arg1[local11];
			if (local17 != null && arg0 == local17.anInt9590 && !Static72.method1562(local17)) {
				if (local17.anInt9595 == 0) {
					method3496(local17.anInt9646, arg1);
					if (local17.aClass365Array2 != null) {
						method3496(local17.anInt9646, local17.aClass365Array2);
					}
					@Pc(55) Class1_Sub16 local55 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local17.anInt9646);
					if (local55 != null) {
						Static81.method1661(local55.anInt2681);
					}
				}
				if (local17.anInt9595 == 6 && local17.anInt9611 != -1) {
					@Pc(75) Class131 local75 = Static594.aClass311_2.method7009(local17.anInt9611);
					if (local75 != null) {
						local17.anInt9643 += Static236.anInt4451;
						@Pc(86) int local86 = local17.anInt9583;
						while (local75.anIntArray204[local17.anInt9583] < local17.anInt9643) {
							local17.anInt9643 -= local75.anIntArray204[local17.anInt9583];
							local17.anInt9583++;
							if (local75.anIntArray202.length <= local17.anInt9583) {
								local17.anInt9583 -= local75.anInt3744;
								if (local17.anInt9583 < 0 || local17.anInt9583 >= local75.anIntArray202.length) {
									local17.anInt9583 = 0;
								}
							}
							local17.anInt9574 = local17.anInt9583 + 1;
							if (local17.anInt9574 >= local75.anIntArray202.length) {
								local17.anInt9574 -= local75.anInt3744;
								if (local17.anInt9574 < 0 || local17.anInt9574 >= local75.anIntArray202.length) {
									local17.anInt9574 = -1;
								}
							}
							Static201.method5537(local17);
						}
						if (local86 != local17.anInt9583) {
							Static416.method5833(local17.anInt9583, local75);
						}
					}
				}
			}
		}
	}
}

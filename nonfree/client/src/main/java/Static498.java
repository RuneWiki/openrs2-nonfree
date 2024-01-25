import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "[I")
	public static final int[] anIntArray573 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
	public static int anInt7911 = 1;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6931(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B[Lclient!ria;I)V")
	public static void method6932(@OriginalArg(1) Class303[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class303 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt7985 && !Static79.method1725(local13)) {
				if (local13.anInt7935 == 0) {
					method6932(arg0, local13.anInt7962);
					if (local13.aClass303Array2 != null) {
						method6932(local13.aClass303Array2, local13.anInt7962);
					}
					@Pc(47) Class2_Sub28 local47 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local13.anInt7962);
					if (local47 != null) {
						Static343.method5202(local47.anInt5454);
					}
				}
				if (local13.anInt7935 == 6 && local13.anInt7931 != -1) {
					@Pc(69) Class228 local69 = Static479.aClass308_2.method7075(local13.anInt7931);
					if (local69 != null) {
						local13.anInt7990 += Static190.anInt3789;
						@Pc(80) int local80 = local13.anInt8005;
						while (local13.anInt7990 > local69.anIntArray404[local13.anInt8005]) {
							local13.anInt7990 -= local69.anIntArray404[local13.anInt8005];
							local13.anInt8005++;
							if (local13.anInt8005 >= local69.anIntArray403.length) {
								local13.anInt8005 -= local69.anInt6231;
								if (local13.anInt8005 < 0 || local69.anIntArray403.length <= local13.anInt8005) {
									local13.anInt8005 = 0;
								}
							}
							local13.anInt7913 = local13.anInt8005 + 1;
							if (local69.anIntArray403.length <= local13.anInt7913) {
								local13.anInt7913 -= local69.anInt6231;
								if (local13.anInt7913 < 0 || local69.anIntArray403.length <= local13.anInt7913) {
									local13.anInt7913 = -1;
								}
							}
							Static514.method7103(local13);
						}
						if (local13.anInt8005 != local80) {
							Static70.method1614(local69, local13.anInt8005);
						}
					}
				}
			}
		}
	}
}

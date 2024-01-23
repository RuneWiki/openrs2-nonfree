import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
	public static int[] anIntArray90 = new int[14];

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString39 = "Select";

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[Lclient!nc;")
	public static Class10_Sub5_Sub1[] aClass10_Sub5_Sub1Array1 = new Class10_Sub5_Sub1[2048];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lclient!kl;")
	public static Class95 method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class95 local14 = local7.aClass95_1;
			local7.aClass95_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method821() {
		Static49.aClass30_5 = new Class30(32);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method824() {
		if (Static165.aBoolean221) {
			return;
		}
		if (Static247.aBoolean348) {
			Static179.aFloat48 = (int) Static179.aFloat48 + 47 & 0xFFFFFFF0;
		} else {
			Static258.aFloat65 += (12.0F - Static258.aFloat65) / 2.0F;
		}
		Static165.aBoolean221 = true;
		Static153.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method829() {
		Static178.aClass98_29.method2572();
		Static252.aClass98_41.method2572();
	}
}

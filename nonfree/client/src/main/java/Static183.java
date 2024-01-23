import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
	public static int anInt3631;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
	public static int anInt3645;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString128 = "flash1:";

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString129 = "red:";

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Face here";

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "[I")
	public static int[] anIntArray422 = new int[5];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ug;B)Lclient!s;")
	public static Class2_Sub4 method3084(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class2_Sub4(arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3899(), arg0.method3899(), arg0.method3915());
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 method3085() {
		@Pc(13) int local13 = Static306.anIntArray618[0] * Static101.anIntArray185[0];
		@Pc(17) byte[] local17 = Static314.aByteArrayArray130[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static299.anIntArray611[local17[local22] & 0xFF];
		}
		@Pc(61) Class3_Sub4_Sub12_Sub2 local61 = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[0], Static35.anIntArray54[0], Static101.anIntArray185[0], Static306.anIntArray618[0], local20);
		Static6.method108();
		return local61;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3087(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (long) arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)Lclient!v;")
	public static Class181 method3088(@OriginalArg(1) int arg0) {
		@Pc(16) Class181 local16 = (Class181) Static156.aClass98_23.method2570((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static6.aClass155_3.method4121(1, arg0);
		local16 = new Class181();
		local16.anInt5759 = arg0;
		if (local28 != null) {
			local16.method4734(new Class3_Sub26(local28));
		}
		local16.method4739();
		if (local16.anInt5756 == 2 && Static196.aClass30_22.method663((long) arg0) == null) {
			Static196.aClass30_22.method668(new Class3_Sub8(Static229.anInt4487), (long) arg0);
			Static184.aClass181Array1[Static229.anInt4487++] = local16;
		}
		Static156.aClass98_23.method2568(local16, (long) arg0);
		return local16;
	}
}

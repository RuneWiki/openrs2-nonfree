import java.awt.Color;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt463;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!ci;")
	public static Class38 aClass38_6;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt464 = -1;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_24 = new Class214(109, -1);

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	public static final int[] anIntArray30 = new int[1000];

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method394(@OriginalArg(0) long arg0) {
		Static176.aCalendar2.setTime(new Date(arg0));
		@Pc(20) int local20 = Static176.aCalendar2.get(7);
		@Pc(24) int local24 = Static176.aCalendar2.get(5);
		@Pc(28) int local28 = Static176.aCalendar2.get(2);
		@Pc(32) int local32 = Static176.aCalendar2.get(1);
		@Pc(36) int local36 = Static176.aCalendar2.get(11);
		@Pc(40) int local40 = Static176.aCalendar2.get(12);
		@Pc(44) int local44 = Static176.aCalendar2.get(13);
		return Static360.aStringArray33[local20 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static266.aStringArray26[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Lclient!lr;")
	public static Class150 method395(@OriginalArg(1) int arg0) {
		@Pc(10) Class150 local10 = (Class150) Static264.aClass83_61.method2338((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static80.aClass38_17.method1039(arg0, 1);
		local10 = new Class150();
		local10.anInt4605 = arg0;
		if (local20 != null) {
			local10.method3930(new Class4_Sub20(local20));
		}
		local10.method3932();
		if (local10.anInt4592 == 2 && Static50.aClass96_4.method2797((long) arg0) == null) {
			Static50.aClass96_4.method2805((long) arg0, new Class4_Sub16(Static17.anInt349));
			Static153.aClass150Array1[Static17.anInt349++] = local10;
		}
		Static264.aClass83_61.method2337(local10, (long) arg0);
		return local10;
	}
}

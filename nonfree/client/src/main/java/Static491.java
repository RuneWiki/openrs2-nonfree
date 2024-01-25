import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
	private static int anInt1763;

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "Z")
	private static boolean aBoolean146;

	@OriginalMember(owner = "client!sr", name = "O", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "I")
	private static int anInt1764;

	@OriginalMember(owner = "client!sr", name = "Q", descriptor = "Z")
	private static boolean aBoolean148;

	@OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
	private static int anInt1765;

	@OriginalMember(owner = "client!sr", name = "S", descriptor = "Z")
	private static boolean aBoolean149;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "I")
	private static int anInt1766;

	@OriginalMember(owner = "client!sr", name = "U", descriptor = "I")
	private static int anInt1767;

	@OriginalMember(owner = "client!sr", name = "V", descriptor = "I")
	private static int anInt1768;

	@OriginalMember(owner = "client!sr", name = "W", descriptor = "I")
	private static int anInt1769;

	@OriginalMember(owner = "client!sr", name = "X", descriptor = "I")
	private static int anInt1770;

	@OriginalMember(owner = "client!sr", name = "Y", descriptor = "I")
	private static int anInt1771;

	@OriginalMember(owner = "client!sr", name = "Z", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_45 = new Class81(91, 3);

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
	public static int anInt1754 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIZLclient!r;)Lclient!re;")
	public static Class281 method1540(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class12 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static501.anIntArray575 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static501.anIntArray575.length; local15++) {
				if (arg0 == Static501.anIntArray575[local15]) {
					return Static371.aClass281Array1[local15];
				}
			}
		}
		@Pc(53) Class281 local53 = (Class281) Static179.aClass326_15.method7238((long) arg0);
		if (local53 != null) {
			if (arg1 && local53.aClass13_12 == null) {
				@Pc(65) Class13 local65 = Static252.method7834(Static559.aClass111_121, arg0);
				if (local65 == null) {
					return null;
				}
				local53.aClass13_12 = local65;
			}
			return local53;
		}
		@Pc(78) Class318[] local78 = Static604.method7069(Static126.aClass111_92, arg0);
		if (local78 == null) {
			return null;
		}
		@Pc(87) Class13 local87 = Static252.method7834(Static559.aClass111_121, arg0);
		if (local87 == null) {
			return null;
		}
		if (arg1) {
			local53 = new Class281(arg2.method6457(local87, local78), local87);
		} else {
			local53 = new Class281(arg2.method6457(local87, local78));
		}
		Static179.aClass326_15.method7236(local53, (long) arg0);
		return local53;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z[FI)[F")
	public static float[] method1544(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static600.method3765(arg0, 0, local11, 0, arg1);
		return local11;
	}
}

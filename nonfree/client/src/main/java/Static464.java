import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "Lclient!kda;")
	public static final Class168 aClass168_4 = new Class168();

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "[I")
	public static final int[] anIntArray570 = new int[1000];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method6494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!faa;Z)Lclient!faa;")
	public static Class97 method6495(@OriginalArg(0) Class97 arg0) {
		if (arg0.anInt2655 != -1) {
			return Static495.method7281(arg0.anInt2655);
		}
		@Pc(19) int local19 = arg0.anInt2678 >>> 16;
		@Pc(24) Class323 local24 = new Class323(Static162.aClass234_23);
		for (@Pc(29) Class6_Sub43 local29 = (Class6_Sub43) local24.method7241(); local29 != null; local29 = (Class6_Sub43) local24.method7240()) {
			if (local29.anInt8192 == local19) {
				return Static495.method7281((int) local29.aLong245);
			}
		}
		return null;
	}
}

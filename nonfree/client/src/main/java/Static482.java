import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public static int anInt7782;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ha;ILclient!pia;)I")
	public static int method6815(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class273 arg1) {
		if (arg1.anInt7212 != -1) {
			return arg1.anInt7212;
		}
		if (arg1.anInt7223 != -1) {
			@Pc(30) Class271 local30 = arg0.anInterface2_12.method6027(arg1.anInt7223);
			if (!local30.aBoolean514) {
				return local30.aShort94;
			}
		}
		return arg1.anInt7209;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method6816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
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
}

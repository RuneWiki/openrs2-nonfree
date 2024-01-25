import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public static int anInt8023;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray56 = new String[200];

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public static boolean method6914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static504.method8536(arg0, arg1) | (arg1 & 0x70000) != 0 || Static312.method5229(arg0, arg1);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;I)Lclient!ha;")
	public static Class100 method6915(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2) {
		return new Class100_Sub3(arg0, arg2, arg1);
	}
}

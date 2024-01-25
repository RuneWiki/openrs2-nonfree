import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
	public static int anInt3976;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_72 = new Class215(117, 1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!at;Z)Ljava/lang/String;")
	public static String method3484(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		if (!Static76.method2235(arg1).method9002(arg0) && arg1.anObjectArray12 == null) {
			return null;
		} else if (arg1.aStringArray2 == null || arg1.aStringArray2.length <= arg0 || arg1.aStringArray2[arg0] == null || arg1.aStringArray2[arg0].trim().length() == 0) {
			return Static591.aBoolean480 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray2[arg0];
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBI)Z")
	public static boolean method3486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

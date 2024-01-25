import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static620 {

	@OriginalMember(owner = "client!wb", name = "Jb", descriptor = "I")
	public static int anInt10298;

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_150 = new Class218(23, -1);

	@OriginalMember(owner = "client!wb", name = "Eb", descriptor = "[Lclient!lt;")
	public static Class208[] aClass208Array1 = new Class208[50];

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "Lclient!us;")
	public static final Class344 aClass344_122 = new Class344(32, -1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method8466(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
	public static boolean method8467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!rd;")
	public static Class203 aClass203_2;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	public static int anInt3981;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "J")
	public static long aLong154 = 0L;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)I")
	public static int method3721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static303.anIntArray581[arg0 & 0x3] : Static79.anIntArray162[arg0 & 0x3];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt10845;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public static boolean method9023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ[S)[S")
	public static short[] method9024(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static686.method4965(arg1, 0, local6, 0, arg0);
		return local6;
	}
}

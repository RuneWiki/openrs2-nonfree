import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public static final int anInt10050 = 1407;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[Z")
	public static final boolean[] aBooleanArray50 = new boolean[100];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;I)Lclient!ha;")
	public static Class87 method8412(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) int arg3) {
		return new Class87_Sub3(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(Z)V")
	public static void method8413() {
		@Pc(1) Class233 local1 = Static42.aClass233_2;
		synchronized (Static42.aClass233_2) {
			Static42.aClass233_2.method5663();
		}
		local1 = Static58.aClass233_5;
		synchronized (Static58.aClass233_5) {
			Static58.aClass233_5.method5663();
		}
	}
}

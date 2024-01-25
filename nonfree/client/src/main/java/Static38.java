import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "Lclient!gda;")
	public static Class126 aClass126_26;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_9 = new Class168(4);

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JLclient!gda;ZIIIB)V")
	public static void method678(@OriginalArg(0) long arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static508.method7014(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	public static void method680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static426.anInt7111 == 2) {
			Static331.anInt5582 = 0;
			Static96.anInt10862 = local15;
			Static542.anInt8612 = local7;
		}
		Static211.aFloat113 = (float) local15;
		Static243.aFloat117 = (float) local7;
		Static301.method4696();
		Static669.aBoolean763 = true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
	public static int anInt1171;

	@OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!dj", name = "U", descriptor = "[I")
	public static int[] anIntArray146 = new int[2];

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "[I")
	public static int[] anIntArray147 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)I")
	public static int method974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
	public static void method975() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static122.aClass26_26.method666(); local10 != null; local10 = (Class1_Sub4) Static122.aClass26_26.method672()) {
			if (local10.anInt909 == -1) {
				local10.anInt901 = 0;
				Static8.method259(local10);
			} else {
				local10.method4767();
			}
		}
	}
}

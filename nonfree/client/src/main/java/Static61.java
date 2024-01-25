import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1233(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static559.method5957(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method1235() {
		Static282.anInt5792 = 0;
		Static492.aClass161_108 = null;
		Static339.anInt5660 = -1;
		Static32.anInt815 = 2;
		Static346.aBoolean415 = false;
		Static319.anInt6143 = -1;
		Static429.anInt7900 = 1;
	}
}

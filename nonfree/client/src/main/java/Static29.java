import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_13 = new Class56(66, 2);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_9 = new Class146(16, 0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method175(@OriginalArg(0) int arg0) {
		Static458.anInt6588 = arg0;
		Static202.anInt3606 = -1;
		Static202.anInt3606 = -1;
		Static447.method5934();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	public static void method178() {
		for (@Pc(1) int local1 = 0; local1 < Static41.anInt669; local1++) {
			@Pc(6) Class8_Sub3 local6 = Static298.aClass8_Sub3Array3[local1];
			Static19.method281(local6);
			Static298.aClass8_Sub3Array3[local1] = null;
		}
		Static41.anInt669 = 0;
	}
}

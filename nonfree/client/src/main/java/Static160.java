import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public static int anInt3633 = -1;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "[I")
	public static final int[] anIntArray256 = new int[1024];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
	public static void method3014() {
		for (@Pc(1) int local1 = 0; local1 < Static226.anInt4632; local1++) {
			@Pc(6) Class11_Sub1_Sub1 local6 = Static310.aClass11_Sub1_Sub1Array1[local1];
			Static515.method7242(local6, true);
			Static310.aClass11_Sub1_Sub1Array1[local1] = null;
		}
		Static226.anInt4632 = 0;
	}
}

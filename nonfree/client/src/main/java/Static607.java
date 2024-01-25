import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "Lclient!da;")
	public static Class57 aClass57_12;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	public static int anInt9203;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_92 = new Class144(44, 8);

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
	public static final int[] anIntArray664 = new int[2];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public static int anInt9201 = 0;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "[I")
	public static final int[] anIntArray665 = new int[5];

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	public static int anInt9202 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
	public static void method7783() {
		for (@Pc(1) int local1 = 0; local1 < Static101.anInt2152; local1++) {
			@Pc(6) Class9_Sub1_Sub1 local6 = Static656.aClass9_Sub1_Sub1Array1[local1];
			Static530.method7066(local6, true);
			Static656.aClass9_Sub1_Sub1Array1[local1] = null;
		}
		Static101.anInt2152 = 0;
	}
}

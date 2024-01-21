import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub2_Sub2_Sub7 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
	public static int[] anIntArray388 = new int[32];

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	public int anInt3719;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray388[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Lclient!ia;")
	@Override
	protected Class1_Sub2_Sub2_Sub5 method2706() {
		return Static184.method2994(this.anInt3717).method1060(this.anInt3719, 0, null);
	}
}

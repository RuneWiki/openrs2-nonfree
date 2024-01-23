import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "[I")
	public static int[] anIntArray187 = new int[32];

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public int anInt1609;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public int anInt1611;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "[Lclient!kh;")
	public Class60[] aClass60Array11;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Lclient!kh;")
	public Class60 aClass60_512;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray187[local6] = local4 - 1;
			local4 += local4;
		}
	}
}

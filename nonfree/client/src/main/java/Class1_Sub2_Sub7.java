import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public abstract class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "[I")
	public static int[] anIntArray232 = new int[256];

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(18) int local18 = local15;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1) == 1) {
					local18 = local18 >>> 1 ^ 0xEDB88320;
				} else {
					local18 >>>= 0x1;
				}
			}
			anIntArray232[local15] = local18;
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2774();

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)Z")
	public abstract boolean method2777();
}

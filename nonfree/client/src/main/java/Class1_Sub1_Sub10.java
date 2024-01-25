import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
	public static final int[] anIntArray538 = new int[4096];

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray538[local6] = Static147.method2350(local6);
		}
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub10() {
	}
}

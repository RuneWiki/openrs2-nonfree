import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public abstract class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	public static final int[] anIntArray494 = new int[4096];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray494[local8] = Static330.method4345(local8);
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	protected Class4_Sub39() {
	}
}

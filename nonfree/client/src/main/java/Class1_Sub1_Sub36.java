import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
	public static int[] anIntArray370 = new int[4096];

	static {
		for (@Pc(13) int local13 = 0; local13 < 4096; local13++) {
			anIntArray370[local13] = Static222.method2947(local13);
		}
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		return Static36.anIntArray81;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
	public static final int[] anIntArray477 = new int[4096];

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 42)
	private Class2_Sub39() {
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 99)
	public Class2_Sub39(@OriginalArg(0) int arg0) {
		this.anInt6805 = arg0;
	}
}

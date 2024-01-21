import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		return Static204.anIntArray179;
	}
}

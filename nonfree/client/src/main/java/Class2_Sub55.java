import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class2_Sub55 extends Class2 {

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "[I")
	public final int[] anIntArray749;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub55(@OriginalArg(0) int arg0) {
		this.anIntArray749 = new int[arg0];
	}
}

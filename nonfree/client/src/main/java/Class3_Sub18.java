import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
	public final int[] anIntArray130;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub18(@OriginalArg(0) int arg0) {
		this.anIntArray130 = new int[arg0];
	}
}

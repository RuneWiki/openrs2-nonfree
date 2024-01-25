import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public final class Class130 {

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	public int anInt4121;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "[I")
	public final int[] anIntArray364;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "[I")
	public final int[] anIntArray363;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(I)V")
	public Class130(@OriginalArg(0) int arg0) {
		this.anInt4121 = arg0;
		this.anIntArray364 = new int[this.anInt4121];
		this.anIntArray363 = new int[this.anInt4121];
	}
}

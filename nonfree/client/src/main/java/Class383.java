import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class383 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
	public int anInt10429;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
	public final int[] anIntArray839;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "[I")
	public final int[] anIntArray840;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(I)V")
	public Class383(@OriginalArg(0) int arg0) {
		this.anInt10429 = arg0;
		this.anIntArray839 = new int[this.anInt10429];
		this.anIntArray840 = new int[this.anInt10429];
	}
}

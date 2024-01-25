import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class57 {

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "[I")
	public final int[] anIntArray93;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "[I")
	public final int[] anIntArray92;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt2284 = arg0;
		this.anIntArray93 = new int[this.anInt2284];
		this.anIntArray92 = new int[this.anInt2284];
	}
}

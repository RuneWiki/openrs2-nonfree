import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class176 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
	public int anInt4630;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "[I")
	public final int[] anIntArray399;

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
	public final int[] anIntArray400;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt4630 = arg0;
		this.anIntArray399 = new int[this.anInt4630];
		this.anIntArray400 = new int[this.anInt4630];
	}
}

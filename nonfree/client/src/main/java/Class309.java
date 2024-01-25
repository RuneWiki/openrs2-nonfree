import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class309 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public int anInt9005;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public final int[] anIntArray464;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(I)V")
	public Class309(@OriginalArg(0) int arg0) {
		this.anInt9005 = arg0;
		this.anIntArray464 = new int[this.anInt9005];
		this.anIntArray463 = new int[this.anInt9005];
	}
}

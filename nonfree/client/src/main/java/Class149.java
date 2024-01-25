import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class149 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
	public final int[] anIntArray352;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
	public final int[] anIntArray351;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class149(@OriginalArg(0) int arg0) {
		this.anInt4386 = arg0;
		this.anIntArray352 = new int[this.anInt4386];
		this.anIntArray351 = new int[this.anInt4386];
	}
}

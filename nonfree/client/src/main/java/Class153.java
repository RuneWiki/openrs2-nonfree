import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class153 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
	public final int[] anIntArray252;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "[I")
	public final int[] anIntArray253;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
	public Class153(@OriginalArg(0) int arg0) {
		this.anInt3938 = arg0;
		this.anIntArray252 = new int[this.anInt3938];
		this.anIntArray253 = new int[this.anInt3938];
	}
}

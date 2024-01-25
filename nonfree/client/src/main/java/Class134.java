import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class134 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public int anInt3827;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
	public final int[] anIntArray523;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
	public final int[] anIntArray522;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
	public Class134(@OriginalArg(0) int arg0) {
		this.anInt3827 = arg0;
		this.anIntArray523 = new int[this.anInt3827];
		this.anIntArray522 = new int[this.anInt3827];
	}
}

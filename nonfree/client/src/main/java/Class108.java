import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class108 {

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "[I")
	public final int[] anIntArray156;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[I")
	public final int[] anIntArray155;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(I)V")
	public Class108(@OriginalArg(0) int arg0) {
		this.anInt3129 = arg0;
		this.anIntArray156 = new int[this.anInt3129];
		this.anIntArray155 = new int[this.anInt3129];
	}
}

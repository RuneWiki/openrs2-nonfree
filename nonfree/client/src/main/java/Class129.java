import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class129 {

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
	public int anInt3588;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
	public final int[] anIntArray232;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "[I")
	public final int[] anIntArray233;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3588 = arg0;
		this.anIntArray232 = new int[this.anInt3588];
		this.anIntArray233 = new int[this.anInt3588];
	}
}

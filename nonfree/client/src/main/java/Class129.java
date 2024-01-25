import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class129 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public final int[] anIntArray336;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
	public final int[] anIntArray337;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3453 = arg0;
		this.anIntArray336 = new int[this.anInt3453];
		this.anIntArray337 = new int[this.anInt3453];
	}
}

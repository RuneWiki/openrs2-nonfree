import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class121 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public int anInt3011;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
	public final int[] anIntArray197;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class121(@OriginalArg(0) int arg0) {
		this.anInt3011 = arg0;
		this.anIntArray197 = new int[this.anInt3011];
		this.anIntArray198 = new int[this.anInt3011];
	}
}

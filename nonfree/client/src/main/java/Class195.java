import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class195 {

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public int anInt5679;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
	public final int[] anIntArray396;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "[I")
	public final int[] anIntArray397;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
	public Class195(@OriginalArg(0) int arg0) {
		this.anInt5679 = arg0;
		this.anIntArray396 = new int[this.anInt5679];
		this.anIntArray397 = new int[this.anInt5679];
	}
}

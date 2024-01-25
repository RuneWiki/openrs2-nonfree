import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class11 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "[I")
	public final int[] anIntArray7;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
	public final int[] anIntArray9;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class11(@OriginalArg(0) int arg0) {
		this.anInt186 = arg0;
		this.anIntArray7 = new int[this.anInt186];
		this.anIntArray9 = new int[this.anInt186];
	}
}

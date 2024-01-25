import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class116 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public int anInt3317;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public final int[] anIntArray154;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
	public final int[] anIntArray153;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3317 = arg0;
		this.anIntArray154 = new int[this.anInt3317];
		this.anIntArray153 = new int[this.anInt3317];
	}
}

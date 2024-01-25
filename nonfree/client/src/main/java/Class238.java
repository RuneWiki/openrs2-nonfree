import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class238 {

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
	public int anInt7252;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "[I")
	public final int[] anIntArray465;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "[I")
	public final int[] anIntArray464;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(I)V")
	public Class238(@OriginalArg(0) int arg0) {
		this.anInt7252 = arg0;
		this.anIntArray465 = new int[this.anInt7252];
		this.anIntArray464 = new int[this.anInt7252];
	}
}

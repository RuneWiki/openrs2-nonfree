import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class176 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	public int anInt5012;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
	public final int[] anIntArray273;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
	public final int[] anIntArray272;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt5012 = arg0;
		this.anIntArray273 = new int[this.anInt5012];
		this.anIntArray272 = new int[this.anInt5012];
	}
}

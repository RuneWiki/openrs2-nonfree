import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class303 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public int anInt8095;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
	public final int[] anIntArray596;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
	public final int[] anIntArray597;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.anInt8095 = arg0;
		this.anIntArray596 = new int[this.anInt8095];
		this.anIntArray597 = new int[this.anInt8095];
	}
}

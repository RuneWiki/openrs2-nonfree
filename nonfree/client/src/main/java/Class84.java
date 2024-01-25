import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class84 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
	public final int[] anIntArray108;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
	public final int[] anIntArray109;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.anInt2088 = arg0;
		this.anIntArray108 = new int[this.anInt2088];
		this.anIntArray109 = new int[this.anInt2088];
	}
}

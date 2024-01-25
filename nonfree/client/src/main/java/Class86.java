import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class86 {

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public int anInt2801;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	public final int[] anIntArray211;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
	public final int[] anIntArray210;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt2801 = arg0;
		this.anIntArray211 = new int[this.anInt2801];
		this.anIntArray210 = new int[this.anInt2801];
	}
}

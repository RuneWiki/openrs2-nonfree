import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class170 {

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
	public int anInt4734;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "[I")
	public final int[] anIntArray391;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "[I")
	public final int[] anIntArray390;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.anInt4734 = arg0;
		this.anIntArray391 = new int[this.anInt4734];
		this.anIntArray390 = new int[this.anInt4734];
	}
}

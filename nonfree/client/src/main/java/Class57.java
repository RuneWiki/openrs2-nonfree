import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class57 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	public int anInt1840;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
	public final int[] anIntArray60;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
	public final int[] anIntArray61;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt1840 = arg0;
		this.anIntArray60 = new int[this.anInt1840];
		this.anIntArray61 = new int[this.anInt1840];
	}
}

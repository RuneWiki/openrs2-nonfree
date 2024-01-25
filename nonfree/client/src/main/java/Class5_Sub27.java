import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!no", name = "x", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "I")
	public final int anInt4335;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(II)V")
	public Class5_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4334 = arg1;
		this.anInt4335 = arg0;
	}
}

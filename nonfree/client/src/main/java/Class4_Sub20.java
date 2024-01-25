import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public final int anInt2616;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public final int anInt2614;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2616 = arg1;
		this.anInt2614 = arg0;
	}
}

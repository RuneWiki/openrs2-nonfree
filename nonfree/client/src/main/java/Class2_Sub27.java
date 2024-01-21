import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public final int anInt4420;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public final int anInt4419;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4420 = arg0;
		this.anInt4419 = arg1;
	}
}

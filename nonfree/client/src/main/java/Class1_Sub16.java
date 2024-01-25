import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	public final int anInt2748;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public final int anInt2747;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2748 = arg0;
		this.anInt2747 = arg1;
	}
}

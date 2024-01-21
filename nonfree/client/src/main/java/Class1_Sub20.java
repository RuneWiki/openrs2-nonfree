import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	public final int anInt2663;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20(@OriginalArg(0) int arg0) {
		this.anInt2663 = arg0;
	}
}

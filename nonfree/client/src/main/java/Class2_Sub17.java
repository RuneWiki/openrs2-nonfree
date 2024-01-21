import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "I")
	public final int anInt2641;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	public final int anInt2646;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2641 = arg0;
		this.anInt2646 = arg1;
	}
}

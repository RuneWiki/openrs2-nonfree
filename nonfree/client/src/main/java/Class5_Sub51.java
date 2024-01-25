import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class5_Sub51 extends Class5 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public final int anInt9669;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	public final int anInt9668;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class5_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9669 = arg0;
		this.anInt9668 = arg1;
	}
}

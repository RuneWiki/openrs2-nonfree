import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!jka", name = "n", descriptor = "I")
	public final int anInt5638;

	@OriginalMember(owner = "client!jka", name = "m", descriptor = "I")
	public final int anInt5637;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(II)V")
	public Class5_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5638 = arg1;
		this.anInt5637 = arg0;
	}
}

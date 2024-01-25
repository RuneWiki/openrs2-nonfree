import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public final int anInt118;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public int anInt113;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt118 = arg0;
		this.anInt113 = arg1;
	}
}

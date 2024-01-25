import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	public final int anInt3463;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3463 = arg0;
		this.anInt3461 = arg1;
	}
}

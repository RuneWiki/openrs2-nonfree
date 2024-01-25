import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	public final int anInt4689;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	public final int anInt4691;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4689 = arg0;
		this.anInt4691 = arg1;
	}
}

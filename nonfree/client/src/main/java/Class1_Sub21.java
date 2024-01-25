import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!jea", name = "r", descriptor = "Z")
	public final boolean aBoolean360;

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "I")
	public final int anInt4618;

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	public final int anInt4616;

	@OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
	public final int anInt4617;

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
	public final int anInt4619;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
	public final int anInt4614;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean360 = arg5;
		this.anInt4618 = arg2;
		this.anInt4616 = arg0;
		this.anInt4617 = arg4;
		this.anInt4619 = arg3;
		this.anInt4614 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class162 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public final int anInt4483;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public final int anInt4482;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public final int anInt4485;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public final int anInt4484;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIII)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4483 = arg0;
		this.anInt4482 = arg3;
		this.anInt4485 = arg2;
		this.anInt4484 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Lclient!me;")
	public Class162 method3611(@OriginalArg(1) int arg0) {
		return new Class162(this.anInt4483, arg0, this.anInt4485, this.anInt4482);
	}
}

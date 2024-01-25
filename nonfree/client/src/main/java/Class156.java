import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class156 {

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
	public final int anInt5531;

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
	public final int anInt5528;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	public final int anInt5524;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
	public final int anInt5527;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(IIII)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5531 = arg1;
		this.anInt5528 = arg0;
		this.anInt5524 = arg2;
		this.anInt5527 = arg3;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Lclient!jga;")
	public Class156 method4537(@OriginalArg(0) int arg0) {
		return new Class156(this.anInt5528, arg0, this.anInt5524, this.anInt5527);
	}
}

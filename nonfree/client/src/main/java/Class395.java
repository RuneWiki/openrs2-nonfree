import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class395 {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public final int anInt10370;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public final int anInt10371;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public final int anInt10374;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public final int anInt10373;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIII)V")
	public Class395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10370 = arg0;
		this.anInt10371 = arg2;
		this.anInt10374 = arg1;
		this.anInt10373 = arg3;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!wl;")
	public Class395 method8943(@OriginalArg(0) int arg0) {
		return new Class395(this.anInt10370, arg0, this.anInt10371, this.anInt10373);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class319 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public final int anInt8746;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public final int anInt8754;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public final int anInt8748;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	public final int anInt8749;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIII)V")
	public Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8746 = arg3;
		this.anInt8754 = arg0;
		this.anInt8748 = arg1;
		this.anInt8749 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lclient!sf;")
	public Class319 method7415(@OriginalArg(0) int arg0) {
		return new Class319(this.anInt8754, arg0, this.anInt8749, this.anInt8746);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class364 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
	public int anInt9819;

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
	public int anInt9820;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
	public int anInt9821;

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
	public int anInt9825;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
	public int anInt9826;

	@OriginalMember(owner = "client!uda", name = "u", descriptor = "Lclient!uda;")
	public Class364 aClass364_1;

	@OriginalMember(owner = "client!uda", name = "t", descriptor = "I")
	public int anInt9827;

	@OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
	public int anInt9830;

	@OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
	public int anInt9831;

	@OriginalMember(owner = "client!uda", name = "x", descriptor = "I")
	public int anInt9832;

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
	public final int anInt9822;

	@OriginalMember(owner = "client!uda", name = "w", descriptor = "I")
	public final int anInt9816;

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!uda", name = "s", descriptor = "I")
	public final int anInt9818;

	@OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
	private final int anInt9828;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(IIIIB)V")
	public Class364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt9822 = arg3;
		this.anInt9816 = arg1;
		this.aByte130 = arg4;
		this.anInt9818 = arg2;
		this.anInt9828 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)Lclient!saa;")
	public Class334 method8670() {
		return Static490.method7039(this.anInt9828);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIB)Lclient!uda;")
	public Class364 method8673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class364(this.anInt9828, arg2, arg0, arg1, this.aByte130);
	}
}

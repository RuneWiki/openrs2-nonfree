import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class345 implements Interface23 {

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
	public final int anInt9636;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
	public final int anInt9634;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	public final int anInt9643;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public final int anInt9638;

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "Lclient!rg;")
	public final Class293 aClass293_12;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public final int anInt9641;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "Lclient!al;")
	public final Class15 aClass15_13;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	public final int anInt9645;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	public final int anInt9642;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	public final int anInt9633;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
	public final boolean aBoolean731;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(ILclient!rg;Lclient!al;IIIIIIIZ)V")
	public Class345(@OriginalArg(0) int arg0, @OriginalArg(1) Class293 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt9636 = arg9;
		this.anInt9634 = arg8;
		this.anInt9643 = arg4;
		this.anInt9638 = arg5;
		this.aClass293_12 = arg1;
		this.anInt9641 = arg3;
		this.aClass15_13 = arg2;
		this.anInt9645 = arg0;
		this.anInt9642 = arg6;
		this.anInt9633 = arg7;
		this.aBoolean731 = arg10;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static179.aClass384_28;
	}
}

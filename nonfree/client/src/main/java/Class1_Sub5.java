import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public final int anInt620;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public final int anInt623;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
	public final boolean aBoolean56;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	public final int anInt619;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	public final int anInt622;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public final int anInt624;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt620 = arg2;
		this.anInt623 = arg3;
		this.aBoolean56 = arg5;
		this.anInt619 = arg0;
		this.anInt622 = arg4;
		this.anInt624 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	public final int anInt10519;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public final int anInt10517;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public final int anInt10518;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public final int anInt10516;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Z")
	public final boolean aBoolean769;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public final int anInt10520;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10519 = arg4;
		this.anInt10517 = arg2;
		this.anInt10518 = arg0;
		this.anInt10516 = arg3;
		this.aBoolean769 = arg5;
		this.anInt10520 = arg1;
	}
}

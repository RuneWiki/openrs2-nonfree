import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public final int anInt5731;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public final int anInt5734;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
	public final int anInt5735;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	public final int anInt5737;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "Z")
	public final boolean aBoolean438;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public final int anInt5733;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5731 = arg2;
		this.anInt5734 = arg1;
		this.anInt5735 = arg4;
		this.anInt5737 = arg0;
		this.aBoolean438 = arg5;
		this.anInt5733 = arg3;
	}
}

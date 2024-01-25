import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	public final int anInt9583;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "Z")
	public final boolean aBoolean731;

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public final int anInt9586;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	public final int anInt9585;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	public final int anInt9587;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
	public final int anInt9582;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9583 = arg0;
		this.aBoolean731 = arg5;
		this.anInt9586 = arg4;
		this.anInt9585 = arg1;
		this.anInt9587 = arg3;
		this.anInt9582 = arg2;
	}
}

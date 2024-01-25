import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
	public final int anInt7546;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public final int anInt7540;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
	public final int anInt7544;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
	public final int anInt7545;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "Z")
	public final boolean aBoolean520;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7546 = arg1;
		this.anInt7540 = arg2;
		this.anInt7544 = arg0;
		this.anInt7545 = arg4;
		this.aBoolean520 = arg5;
		this.anInt7539 = arg3;
	}
}

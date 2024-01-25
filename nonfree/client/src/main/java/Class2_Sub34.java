import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!pha", name = "n", descriptor = "I")
	public final int anInt7178;

	@OriginalMember(owner = "client!pha", name = "m", descriptor = "I")
	public final int anInt7177;

	@OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
	public final int anInt7180;

	@OriginalMember(owner = "client!pha", name = "j", descriptor = "Z")
	public final boolean aBoolean517;

	@OriginalMember(owner = "client!pha", name = "q", descriptor = "I")
	public final int anInt7181;

	@OriginalMember(owner = "client!pha", name = "l", descriptor = "I")
	public final int anInt7176;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7178 = arg1;
		this.anInt7177 = arg4;
		this.anInt7180 = arg2;
		this.aBoolean517 = arg5;
		this.anInt7181 = arg3;
		this.anInt7176 = arg0;
	}
}

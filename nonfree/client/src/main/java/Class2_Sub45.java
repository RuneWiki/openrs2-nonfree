import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public final int anInt7246;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	public final int anInt7249;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public final int anInt7245;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	public final int anInt7243;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	public final int anInt7244;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "Z")
	public final boolean aBoolean524;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7246 = arg3;
		this.anInt7249 = arg4;
		this.anInt7245 = arg1;
		this.anInt7243 = arg2;
		this.anInt7244 = arg0;
		this.aBoolean524 = arg5;
	}
}

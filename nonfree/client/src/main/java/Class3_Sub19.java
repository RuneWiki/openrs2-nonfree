import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
	public final int anInt3499;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
	public final int anInt3497;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
	public final int anInt3495;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "Z")
	public final boolean aBoolean290;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
	public final int anInt3492;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
	public final int anInt3500;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3499 = arg0;
		this.anInt3497 = arg4;
		this.anInt3495 = arg2;
		this.aBoolean290 = arg5;
		this.anInt3492 = arg1;
		this.anInt3500 = arg3;
	}
}

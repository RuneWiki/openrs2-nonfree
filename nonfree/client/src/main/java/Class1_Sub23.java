import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
	public final int anInt4195;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
	public final int anInt4196;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
	public final boolean aBoolean260;

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
	public final int anInt4197;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
	public final int anInt4192;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4195 = arg4;
		this.anInt4196 = arg0;
		this.anInt4189 = arg3;
		this.aBoolean260 = arg5;
		this.anInt4197 = arg1;
		this.anInt4192 = arg2;
	}
}

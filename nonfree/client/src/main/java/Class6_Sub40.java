import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	public final int anInt5950;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "I")
	public final int anInt5954;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Z")
	public final boolean aBoolean399;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public final int anInt5955;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	public final int anInt5948;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public final int anInt5953;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5950 = arg1;
		this.anInt5954 = arg2;
		this.aBoolean399 = arg5;
		this.anInt5955 = arg3;
		this.anInt5948 = arg4;
		this.anInt5953 = arg0;
	}
}

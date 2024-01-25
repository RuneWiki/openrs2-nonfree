import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	public final int anInt3219;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "Z")
	public final boolean aBoolean238;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
	public final int anInt3222;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
	public final int anInt3221;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
	public final int anInt3220;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
	public final int anInt3218;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3219 = arg2;
		this.aBoolean238 = arg5;
		this.anInt3222 = arg1;
		this.anInt3221 = arg4;
		this.anInt3220 = arg3;
		this.anInt3218 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class81 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public final int anInt3052;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public final int anInt3061;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public final int anInt3057;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public final int anInt3060;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public final int anInt3055;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3053 = arg3;
		this.anInt3052 = arg5;
		this.anInt3061 = arg0;
		this.anInt3057 = arg4;
		this.anInt3060 = arg1;
		this.anInt3055 = arg2;
		this.aBoolean145 = arg6;
	}
}

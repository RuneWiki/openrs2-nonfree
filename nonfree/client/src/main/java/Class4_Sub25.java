import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public final int anInt4953;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
	public final boolean aBoolean371;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public final int anInt4955;

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
	public final int anInt4958;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public final int anInt4954;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
	public final int anInt4957;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4953 = arg4;
		this.aBoolean371 = arg5;
		this.anInt4955 = arg2;
		this.anInt4958 = arg0;
		this.anInt4954 = arg3;
		this.anInt4957 = arg1;
	}
}

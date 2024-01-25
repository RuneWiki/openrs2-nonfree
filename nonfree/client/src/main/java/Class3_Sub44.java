import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public final int anInt6956;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
	public final boolean aBoolean471;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public final int anInt6954;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public final int anInt6959;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public final int anInt6961;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public final int anInt6957;

	static {
		new Class174(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6956 = arg4;
		this.aBoolean471 = arg5;
		this.anInt6954 = arg2;
		this.anInt6959 = arg3;
		this.anInt6961 = arg1;
		this.anInt6957 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	protected int anInt5961;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	protected int anInt5954;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	protected final int anInt5963;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public final int anInt5964;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIII)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5961 = arg2;
		this.anInt5954 = arg0;
		this.anInt5963 = arg1;
		this.anInt5964 = arg3;
	}
}

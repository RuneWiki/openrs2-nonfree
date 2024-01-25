import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	protected final int anInt5785;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	public final int anInt5786;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	protected int anInt5783;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	protected int anInt5781;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIII)V")
	protected Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5785 = arg1;
		this.anInt5786 = arg3;
		this.anInt5783 = arg2;
		this.anInt5781 = arg0;
	}
}

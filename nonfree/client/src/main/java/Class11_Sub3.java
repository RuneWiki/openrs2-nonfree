import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	protected final int anInt4001;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	public final int anInt4000;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	protected int anInt3997;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	protected int anInt3996;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4001 = arg1;
		this.anInt4000 = arg3;
		this.anInt3997 = arg0;
		this.anInt3996 = arg2;
	}
}

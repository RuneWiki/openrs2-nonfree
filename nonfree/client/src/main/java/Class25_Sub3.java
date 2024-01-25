import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt6241;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	protected final int anInt6238;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt6244;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public final int anInt6242;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public int anInt6248;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public final int anInt6237;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class25_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6241 = arg0;
		this.anInt6238 = arg1;
		this.anInt6244 = arg2;
		this.anInt6251 = arg4;
		this.anInt6242 = arg3;
		this.anInt6248 = arg5;
		this.anInt6237 = arg6;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	@Override
	public final void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public final void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
	public abstract int method5547();
}

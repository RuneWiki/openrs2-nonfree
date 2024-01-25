import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	public final int anInt6707;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	public int anInt6695;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	public final int anInt6698;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	public int anInt6696;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public int anInt6706;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
	protected final int anInt6701;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6707 = arg6;
		this.anInt6695 = arg0;
		this.anInt6699 = arg4;
		this.anInt6698 = arg3;
		this.anInt6696 = arg5;
		this.anInt6706 = arg2;
		this.anInt6701 = arg1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public final void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)I")
	public abstract int method5640();

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
	@Override
	public final void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method7785() {
		return false;
	}
}

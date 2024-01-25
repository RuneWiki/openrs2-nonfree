import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	protected final int anInt8740;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public final int anInt8731;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public final int anInt8736;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	public int anInt8732;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public int anInt8737;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public int anInt8735;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public int anInt8729;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8740 = arg1;
		this.anInt8731 = arg6;
		this.anInt8736 = arg3;
		this.anInt8732 = arg0;
		this.anInt8737 = arg2;
		this.anInt8735 = arg4;
		this.anInt8729 = arg5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	@Override
	public final void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public final void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(B)I")
	public abstract int method7188();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	public final int anInt6255;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	public int anInt6264;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	public final int anInt6257;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	public int anInt6263;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
	public int anInt6266;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
	protected final int anInt6262;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6255 = arg3;
		this.anInt6264 = arg0;
		this.anInt6258 = arg4;
		this.anInt6257 = arg6;
		this.anInt6263 = arg2;
		this.anInt6266 = arg5;
		this.anInt6262 = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)V")
	@Override
	public final void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)I")
	public abstract int method5442();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public final void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}

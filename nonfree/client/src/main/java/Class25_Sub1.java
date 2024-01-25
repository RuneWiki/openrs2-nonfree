import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	public int anInt5351;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
	public final int anInt5357;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public int anInt5355;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	protected final int anInt5356;

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
	public int anInt5359;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	public final int anInt5354;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5351 = arg0;
		this.anInt5357 = arg6;
		this.anInt5355 = arg2;
		this.anInt5356 = arg1;
		this.anInt5359 = arg4;
		this.anInt5353 = arg5;
		this.anInt5354 = arg3;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	@Override
	public final void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public final void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)I")
	public abstract int method4207();
}

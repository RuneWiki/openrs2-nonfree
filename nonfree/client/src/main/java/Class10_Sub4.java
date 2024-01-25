import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public final int anInt6330;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public int anInt6335;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public int anInt6333;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	protected final int anInt6329;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public final int anInt6323;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6330 = arg3;
		this.anInt6335 = arg4;
		this.anInt6333 = arg5;
		this.anInt6332 = arg2;
		this.anInt6326 = arg0;
		this.anInt6329 = arg1;
		this.anInt6323 = arg6;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I")
	public abstract int method5444();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public final void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}

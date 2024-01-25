import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!go", name = "z", descriptor = "I")
	public final int anInt5262;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "I")
	public int anInt5261;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "I")
	public int anInt5257;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public int anInt5249;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	protected final int anInt5248;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "I")
	public final int anInt5260;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class25_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5262 = arg6;
		this.anInt5261 = arg0;
		this.anInt5257 = arg2;
		this.anInt5249 = arg4;
		this.anInt5248 = arg1;
		this.anInt5260 = arg3;
		this.anInt5255 = arg5;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(B)I")
	public abstract int method4611();

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	@Override
	public final void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public final void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}

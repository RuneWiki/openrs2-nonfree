import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	public int anInt4924;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public int anInt4917;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public final int anInt4915;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public final int anInt4923;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	protected final int anInt4914;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	public int anInt4922;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4924 = arg0;
		this.anInt4917 = arg2;
		this.anInt4915 = arg6;
		this.anInt4923 = arg3;
		this.anInt4914 = arg1;
		this.anInt4922 = arg4;
		this.anInt4920 = arg5;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public final void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	@Override
	public final void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)I")
	public abstract int method4354();
}

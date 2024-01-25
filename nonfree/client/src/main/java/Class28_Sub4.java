import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public int anInt6092;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	protected final int anInt6093;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public final int anInt6097;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public int anInt6099;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public int anInt6100;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public final int anInt6091;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt6096;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class28_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6092 = arg5;
		this.anInt6093 = arg1;
		this.anInt6097 = arg6;
		this.anInt6099 = arg2;
		this.anInt6100 = arg0;
		this.anInt6091 = arg3;
		this.anInt6096 = arg4;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
	@Override
	public final void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public final void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)I")
	public abstract int method5419();
}

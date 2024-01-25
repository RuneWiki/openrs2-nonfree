import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	public int anInt5761;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	protected final int anInt5756;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public final int anInt5757;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	public int anInt5759;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	public final int anInt5758;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "I")
	public int anInt5763;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "I")
	public int anInt5762;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5761 = arg5;
		this.anInt5756 = arg1;
		this.anInt5757 = arg3;
		this.anInt5759 = arg2;
		this.anInt5758 = arg6;
		this.anInt5763 = arg0;
		this.anInt5762 = arg4;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
	@Override
	public final void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)I")
	public abstract int method5230();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public final void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5783() {
		return false;
	}
}

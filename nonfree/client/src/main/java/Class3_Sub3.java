import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	public final int anInt6464;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
	public int anInt6458;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
	public int anInt6456;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public final int anInt6457;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	protected final int anInt6459;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	public int anInt6454;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6464 = arg3;
		this.anInt6458 = arg2;
		this.anInt6456 = arg5;
		this.anInt6457 = arg6;
		this.anInt6459 = arg1;
		this.anInt6454 = arg0;
		this.anInt6462 = arg4;
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)I")
	public abstract int method5020();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public final void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V")
	@Override
	public final void method5284() {
		throw new IllegalStateException();
	}
}

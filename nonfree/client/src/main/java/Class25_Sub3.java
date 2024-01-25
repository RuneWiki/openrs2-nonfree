import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public abstract class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	public int anInt1527;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt1529;

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public final void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
	@Override
	public final void method4607() {
		throw new IllegalStateException();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public final void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	@Override
	public final void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5277() {
		return false;
	}
}

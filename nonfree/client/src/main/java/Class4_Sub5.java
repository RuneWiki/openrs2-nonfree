import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	public int anInt7583;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
	public int anInt7586;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt7588;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public final void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5889() {
		throw new IllegalStateException();
	}
}

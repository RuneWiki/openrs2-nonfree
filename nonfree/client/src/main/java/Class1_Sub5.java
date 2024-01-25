import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
	public int anInt5669;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
	public int anInt5671;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
	public int anInt5674;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Z")
	public boolean aBoolean405;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public final void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
	@Override
	public final void method6244() {
		throw new IllegalStateException();
	}
}

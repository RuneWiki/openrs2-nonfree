import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
	public int anInt1533;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public int anInt1541;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public final void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
	@Override
	public final void method5643() {
		throw new IllegalStateException();
	}
}

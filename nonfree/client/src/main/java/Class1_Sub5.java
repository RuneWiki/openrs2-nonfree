import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public int anInt6148;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
	public boolean aBoolean548;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	public int anInt6154;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
	public int anInt6156;

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public final void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	@Override
	public final void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method5759() {
		return false;
	}
}

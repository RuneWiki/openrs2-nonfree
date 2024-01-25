import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class26_Sub5 extends Class26 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public int anInt4190;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public int anInt4193;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public int anInt4196;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public final void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public final void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}

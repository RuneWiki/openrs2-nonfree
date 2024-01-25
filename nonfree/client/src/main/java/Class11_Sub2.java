import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public final void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	@Override
	public final void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8105() {
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	public int anInt3898;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public int anInt3899;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Z")
	public boolean aBoolean305;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	@Override
	public final void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public final void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5839() {
		return false;
	}
}

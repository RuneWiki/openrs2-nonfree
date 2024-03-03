import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public static int anInt3961 = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public static int anInt3966 = 0;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public int anInt3960;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt3962;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public int anInt3963;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Z", line = 20)
	@Override
	public final boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 39)
	@Override
	public final void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 53)
	@Override
	public final void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}
}

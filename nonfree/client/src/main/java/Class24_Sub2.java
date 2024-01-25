import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt3060;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public int anInt3061;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public final void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	@Override
	public final void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method5692() {
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
	public boolean aBoolean822;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public int anInt9845;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public int anInt9847;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	public int anInt9848;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
	@Override
	public final void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public final void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}
}

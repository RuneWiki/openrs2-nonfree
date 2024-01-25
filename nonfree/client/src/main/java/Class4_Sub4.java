import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public int anInt1808;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public int anInt1810;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
	@Override
	public final void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public final void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}

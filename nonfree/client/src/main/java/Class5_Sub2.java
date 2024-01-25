import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	@Override
	public final void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public final void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}
}

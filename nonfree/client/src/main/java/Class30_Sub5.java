import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class30_Sub5 extends Class30 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public int anInt5608;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public int anInt5611;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
	@Override
	public final void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public final void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}
}

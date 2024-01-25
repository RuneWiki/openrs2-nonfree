import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Z")
	public boolean aBoolean96;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "I")
	public int anInt997;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public final void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	@Override
	public final void method4789() {
		throw new IllegalStateException();
	}
}

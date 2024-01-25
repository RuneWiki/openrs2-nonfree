import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public int anInt173;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
	@Override
	public final void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public final void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5339() {
		return false;
	}
}

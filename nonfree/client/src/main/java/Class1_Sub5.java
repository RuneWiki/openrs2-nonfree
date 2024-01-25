import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Z")
	public boolean aBoolean586;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	public int anInt7956;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public int anInt7960;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public int anInt7962;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public final void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
	@Override
	public final void method7675() {
		throw new IllegalStateException();
	}
}

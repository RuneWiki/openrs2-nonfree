import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public int anInt1589;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public int anInt1590;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	@Override
	public final void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public final void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method6024() {
		return false;
	}
}

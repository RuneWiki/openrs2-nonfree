import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public int anInt6618;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public int anInt6620;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	@Override
	public final void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public final void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}

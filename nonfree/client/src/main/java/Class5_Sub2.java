import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	@Override
	public final void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public final void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	public int anInt6086;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
	public final int anInt6092;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public int anInt6090;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	protected final int anInt6089;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	public int anInt6085;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
	public int anInt6083;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
	public final int anInt6084;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6086 = arg2;
		this.anInt6092 = arg3;
		this.anInt6090 = arg4;
		this.anInt6089 = arg1;
		this.anInt6085 = arg5;
		this.anInt6083 = arg0;
		this.anInt6084 = arg6;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)I")
	public abstract int method4889();

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public final void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	@Override
	public final void method5177() {
		throw new IllegalStateException();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class25_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt8476 = arg0;
		super.aByte118 = (byte) arg4;
		super.anInt8480 = arg1;
		super.anInt8482 = arg2;
		this.aShort78 = (short) arg6;
		this.aShort79 = (short) arg5;
		super.aByte117 = (byte) arg3;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6651() {
		return Static335.method4901(super.anInt8482 >> Static385.anInt6657, this.method6652(), super.anInt8476 >> Static385.anInt6657, super.aByte118);
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B[Lclient!cp;)I")
	@Override
	public final int method6658(@OriginalArg(1) Class3_Sub9[] arg0) {
		return this.method6649(arg0, super.anInt8482 >> Static385.anInt6657, super.anInt8476 >> Static385.anInt6657);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public final void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(B)V")
	@Override
	public final void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method6646() {
		return Static209.aBooleanArrayArray11[Static219.anInt4585 + (super.anInt8476 >> Static385.anInt6657) - Static261.anInt5023][(super.anInt8482 >> Static385.anInt6657) + Static219.anInt4585 - Static216.anInt4499];
	}
}

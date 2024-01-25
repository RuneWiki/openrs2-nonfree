import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public abstract class Class25_Sub2_Sub4 extends Class25_Sub2 {

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIII)V")
	public Class25_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte118 = (byte) arg4;
		super.anInt8480 = arg1;
		super.anInt8476 = arg0;
		super.aByte117 = (byte) arg3;
		super.anInt8482 = arg2;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public final void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6651() {
		@Pc(20) Class147 local20 = Static199.method3474(super.aByte117, super.anInt8476 >> Static385.anInt6657, super.anInt8482 >> Static385.anInt6657);
		return local20 != null && local20.aClass25_Sub2_Sub2_1.aBoolean576 ? Static335.method4901(super.anInt8482 >> Static385.anInt6657, local20.aClass25_Sub2_Sub2_1.method6652() + this.method6652(), super.anInt8476 >> Static385.anInt6657, super.aByte117) : Static258.method4012(super.anInt8476 >> Static385.anInt6657, super.anInt8482 >> Static385.anInt6657, super.aByte117);
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "(B)V")
	@Override
	public final void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method6646() {
		return Static209.aBooleanArrayArray11[(super.anInt8476 >> Static385.anInt6657) + Static219.anInt4585 - Static261.anInt5023][(super.anInt8482 >> Static385.anInt6657) + Static219.anInt4585 - Static216.anInt4499];
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B[Lclient!cp;)I")
	@Override
	public final int method6658(@OriginalArg(1) Class3_Sub9[] arg0) {
		return this.method6649(arg0, super.anInt8482 >> Static385.anInt6657, super.anInt8476 >> Static385.anInt6657);
	}
}

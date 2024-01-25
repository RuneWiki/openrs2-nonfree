import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class25_Sub2_Sub5 extends Class25_Sub2 {

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIII)V")
	protected Class25_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt8476 = arg0;
		super.anInt8482 = arg2;
		super.anInt8480 = arg1;
		this.aShort48 = (short) arg5;
		super.aByte117 = (byte) arg3;
		super.aByte118 = (byte) arg4;
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6651() {
		return Static258.method4012(super.anInt8476 >> Static385.anInt6657, super.anInt8482 >> Static385.anInt6657, super.aByte118);
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method6646() {
		return Static209.aBooleanArrayArray11[(super.anInt8476 >> Static385.anInt6657) - (Static261.anInt5023 - Static219.anInt4585)][Static219.anInt4585 + (super.anInt8482 >> Static385.anInt6657) - Static216.anInt4499];
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B[Lclient!cp;)I")
	@Override
	public final int method6658(@OriginalArg(1) Class3_Sub9[] arg0) {
		return this.method6649(arg0, super.anInt8482 >> Static385.anInt6657, super.anInt8476 >> Static385.anInt6657);
	}
}

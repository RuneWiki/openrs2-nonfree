import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class Class41_Sub1_Sub4 extends Class41_Sub1 {

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIII)V")
	protected Class41_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte150 = (byte) arg4;
		super.anInt10367 = arg2;
		super.aByte149 = (byte) arg3;
		this.aShort86 = (short) arg5;
		super.anInt10366 = arg0;
		super.anInt10370 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)Z")
	@Override
	public final boolean method8664() {
		return Static10.aBooleanArrayArray1[(super.anInt10366 >> Static138.anInt2287) + Static537.anInt10357 - Static281.anInt4404][(super.anInt10367 >> Static138.anInt2287) + Static537.anInt10357 - Static411.anInt7045];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z[Lclient!jw;)I")
	@Override
	public final int method8649(@OriginalArg(1) Class5_Sub3[] arg0) {
		return this.method8657(arg0, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8651(@OriginalArg(1) Class143 arg0) {
		return Static103.method1741(super.aByte150, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287);
	}
}

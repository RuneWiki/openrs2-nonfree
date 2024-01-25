import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class41_Sub1_Sub5 extends Class41_Sub1 {

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "S")
	public short aShort64;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class41_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10366 = arg0;
		this.aShort63 = (short) arg5;
		super.aByte149 = (byte) arg3;
		super.anInt10367 = arg2;
		super.anInt10370 = arg1;
		this.aShort64 = (short) arg6;
		super.aByte150 = (byte) arg4;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[Lclient!jw;)I")
	@Override
	public final int method8649(@OriginalArg(1) Class5_Sub3[] arg0) {
		return this.method8657(arg0, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public final void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "(I)Z")
	@Override
	public final boolean method8664() {
		return Static10.aBooleanArrayArray1[Static537.anInt10357 + (super.anInt10366 >> Static138.anInt2287) - Static281.anInt4404][(super.anInt10367 >> Static138.anInt2287) + Static537.anInt10357 - Static411.anInt7045];
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
	@Override
	public final void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8651(@OriginalArg(1) Class143 arg0) {
		return Static196.method2772(this.method8652(), super.anInt10366 >> Static138.anInt2287, super.anInt10367 >> Static138.anInt2287, super.aByte150);
	}
}

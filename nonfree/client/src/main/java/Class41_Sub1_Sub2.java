import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public abstract class Class41_Sub1_Sub2 extends Class41_Sub1 {

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIII)V")
	public Class41_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte150 = (byte) arg4;
		super.aByte149 = (byte) arg3;
		super.anInt10367 = arg2;
		super.anInt10370 = arg1;
		super.anInt10366 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public final void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Lclient!jw;)I")
	@Override
	public final int method8649(@OriginalArg(1) Class5_Sub3[] arg0) {
		return this.method8657(arg0, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287);
	}

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "(I)V")
	@Override
	public final void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "(I)Z")
	@Override
	public final boolean method8664() {
		return Static10.aBooleanArrayArray1[(super.anInt10366 >> Static138.anInt2287) + Static537.anInt10357 - Static281.anInt4404][Static537.anInt10357 + (super.anInt10367 >> Static138.anInt2287) - Static411.anInt7045];
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8651(@OriginalArg(1) Class143 arg0) {
		@Pc(20) Class40 local20 = Static395.method5735(super.aByte149, super.anInt10366 >> Static138.anInt2287, super.anInt10367 >> Static138.anInt2287);
		return local20 != null && local20.aClass41_Sub1_Sub1_1.aBoolean689 ? Static196.method2772(local20.aClass41_Sub1_Sub1_1.method8652() + this.method8652(), super.anInt10366 >> Static138.anInt2287, super.anInt10367 >> Static138.anInt2287, super.aByte149) : Static103.method1741(super.aByte149, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287);
	}
}

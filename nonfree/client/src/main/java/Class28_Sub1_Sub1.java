import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public abstract class Class28_Sub1_Sub1 extends Class28_Sub1 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIII)V")
	public Class28_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10781 = arg0;
		super.anInt10779 = arg1;
		super.anInt10784 = arg2;
		super.aByte145 = (byte) arg3;
		super.aByte144 = (byte) arg4;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	@Override
	public final void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public final void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lclient!gu;I)I")
	@Override
	public final int method8970(@OriginalArg(0) Class5_Sub18[] arg0) {
		return this.method8967(super.anInt10781 >> Static588.anInt9672, arg0, super.anInt10784 >> Static588.anInt9672);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8961() {
		return Static453.aBooleanArrayArray4[(super.anInt10781 >> Static588.anInt9672) - (Static57.anInt852 - Static187.anInt6996)][Static187.anInt6996 + (super.anInt10784 >> Static588.anInt9672) - Static481.anInt8080];
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method8974(@OriginalArg(0) Class65 arg0) {
		@Pc(23) Class41 local23 = Static300.method8603(super.aByte145, super.anInt10781 >> Static588.anInt9672, super.anInt10784 >> Static588.anInt9672);
		return local23 != null && local23.aClass28_Sub1_Sub4_1.aBoolean914 ? Static312.method4925(super.aByte145, super.anInt10784 >> Static588.anInt9672, local23.aClass28_Sub1_Sub4_1.method8976() + this.method8976(), super.anInt10781 >> Static588.anInt9672) : Static380.method5646(super.aByte145, super.anInt10781 >> Static588.anInt9672, super.anInt10784 >> Static588.anInt9672);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8973() {
		return false;
	}
}

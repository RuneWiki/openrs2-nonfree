import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public abstract class Class4_Sub3_Sub4 extends Class4_Sub3 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte146 = (byte) arg3;
		super.anInt11184 = arg0;
		super.anInt11178 = arg2;
		super.aByte147 = (byte) arg4;
		super.anInt11182 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method9486() {
		return Static18.aBooleanArrayArray1[(super.anInt11184 >> Static110.anInt1858) + Static459.anInt10513 - Static307.anInt5453][Static459.anInt10513 + (super.anInt11178 >> Static110.anInt1858) - Static325.anInt5630];
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public final void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!in", name = "k", descriptor = "(I)V")
	@Override
	public final void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method9487(@OriginalArg(0) Class144 arg0) {
		@Pc(21) Class58 local21 = Static609.method8606(super.aByte146, super.anInt11184 >> Static110.anInt1858, super.anInt11178 >> Static110.anInt1858);
		return local21 != null && local21.aClass4_Sub3_Sub3_1.aBoolean717 ? Static159.method2267(super.anInt11178 >> Static110.anInt1858, super.aByte146, local21.aClass4_Sub3_Sub3_1.method9479() + this.method9479(), super.anInt11184 >> Static110.anInt1858) : Static164.method2366(super.anInt11178 >> Static110.anInt1858, super.anInt11184 >> Static110.anInt1858, super.aByte146);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([Lclient!rfa;B)I")
	@Override
	public final int method9488(@OriginalArg(0) Class14_Sub18[] arg0) {
		return this.method9484(arg0, super.anInt11178 >> Static110.anInt1858, super.anInt11184 >> Static110.anInt1858);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class Class4_Sub3_Sub5 extends Class4_Sub3 {

	@OriginalMember(owner = "client!saa", name = "H", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!saa", name = "B", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte147 = (byte) arg4;
		super.anInt11182 = arg1;
		this.aShort113 = (short) arg5;
		super.anInt11184 = arg0;
		super.aByte146 = (byte) arg3;
		this.aShort114 = (short) arg6;
		super.anInt11178 = arg2;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public final void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method9486() {
		return Static18.aBooleanArrayArray1[Static459.anInt10513 + (super.anInt11184 >> Static110.anInt1858) - Static307.anInt5453][Static459.anInt10513 + (super.anInt11178 >> Static110.anInt1858) - Static325.anInt5630];
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method9487(@OriginalArg(0) Class144 arg0) {
		return Static159.method2267(super.anInt11178 >> Static110.anInt1858, super.aByte147, this.method9479(), super.anInt11184 >> Static110.anInt1858);
	}

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([Lclient!rfa;B)I")
	@Override
	public final int method9488(@OriginalArg(0) Class14_Sub18[] arg0) {
		return this.method9484(arg0, super.anInt11178 >> Static110.anInt1858, super.anInt11184 >> Static110.anInt1858);
	}

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "(I)V")
	@Override
	public final void method9482() {
		throw new IllegalStateException();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte146 = (byte) arg3;
		this.aShort123 = (short) arg5;
		super.aByte147 = (byte) arg4;
		super.anInt11184 = arg0;
		super.anInt11182 = arg1;
		super.anInt11178 = arg2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!rfa;B)I")
	@Override
	public final int method9488(@OriginalArg(0) Class14_Sub18[] arg0) {
		return this.method9484(arg0, super.anInt11178 >> Static110.anInt1858, super.anInt11184 >> Static110.anInt1858);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method9487(@OriginalArg(0) Class144 arg0) {
		return Static164.method2366(super.anInt11178 >> Static110.anInt1858, super.anInt11184 >> Static110.anInt1858, super.aByte147);
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method9486() {
		return Static18.aBooleanArrayArray1[(super.anInt11184 >> Static110.anInt1858) + Static459.anInt10513 - Static307.anInt5453][(super.anInt11178 >> Static110.anInt1858) + Static459.anInt10513 - Static325.anInt5630];
	}
}

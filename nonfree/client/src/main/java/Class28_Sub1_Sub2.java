import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class28_Sub1_Sub2 extends Class28_Sub1 {

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIII)V")
	protected Class28_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte145 = (byte) arg3;
		this.aShort106 = (short) arg5;
		super.aByte144 = (byte) arg4;
		super.anInt10781 = arg0;
		super.anInt10784 = arg2;
		super.anInt10779 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lclient!gu;I)I")
	@Override
	public final int method8970(@OriginalArg(0) Class5_Sub18[] arg0) {
		return this.method8967(super.anInt10781 >> Static588.anInt9672, arg0, super.anInt10784 >> Static588.anInt9672);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method8974(@OriginalArg(0) Class65 arg0) {
		return Static380.method5646(super.aByte144, super.anInt10781 >> Static588.anInt9672, super.anInt10784 >> Static588.anInt9672);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8961() {
		return Static453.aBooleanArrayArray4[Static187.anInt6996 + (super.anInt10781 >> Static588.anInt9672) - Static57.anInt852][Static187.anInt6996 + (super.anInt10784 >> Static588.anInt9672) - Static481.anInt8080];
	}
}

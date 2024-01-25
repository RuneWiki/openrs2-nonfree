import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class9_Sub1_Sub4 extends Class9_Sub1 {

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "S")
	public final short aShort97;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte139 = (byte) arg3;
		super.anInt10695 = arg2;
		super.anInt10690 = arg1;
		super.anInt10694 = arg0;
		this.aShort97 = (short) arg5;
		super.aByte140 = (byte) arg4;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9082(@OriginalArg(0) Class22 arg0) {
		return Static323.method4705(super.aByte140, super.anInt10695 >> Static626.anInt9669, super.anInt10694 >> Static626.anInt9669);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([Lclient!jw;I)I")
	@Override
	public final int method9094(@OriginalArg(0) Class3_Sub5[] arg0) {
		return this.method9096(super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method9079() {
		return Static181.aBooleanArrayArray2[Static720.anInt11190 + (super.anInt10694 >> Static626.anInt9669) - Static507.anInt8070][(super.anInt10695 >> Static626.anInt9669) + Static720.anInt11190 - Static527.anInt8230];
	}
}

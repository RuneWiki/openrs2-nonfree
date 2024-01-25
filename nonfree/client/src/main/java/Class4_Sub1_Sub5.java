import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort115 = (short) arg5;
		super.anInt8915 = arg1;
		super.aByte123 = (byte) arg3;
		super.anInt8916 = arg0;
		super.aByte124 = (byte) arg4;
		super.anInt8911 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[Lclient!wh;)I")
	@Override
	public final int method7698(@OriginalArg(1) Class3_Sub16[] arg0) {
		return this.method7691(super.anInt8916 >> Static308.anInt5834, arg0, super.anInt8911 >> Static308.anInt5834);
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7694() {
		return Static579.aBooleanArrayArray7[Static468.anInt10228 + (super.anInt8916 >> Static308.anInt5834) - Static626.anInt10075][Static468.anInt10228 + (super.anInt8911 >> Static308.anInt5834) - Static386.anInt7210];
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7701() {
		return Static69.method1704(super.anInt8916 >> Static308.anInt5834, super.anInt8911 >> Static308.anInt5834, super.aByte124);
	}
}

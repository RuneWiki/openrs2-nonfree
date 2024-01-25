import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class Class14_Sub1_Sub5 extends Class14_Sub1 {

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII)V")
	protected Class14_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte125 = (byte) arg3;
		super.anInt9315 = arg2;
		super.anInt9317 = arg0;
		this.aShort102 = (short) arg5;
		super.aByte126 = (byte) arg4;
		super.anInt9321 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8000(@OriginalArg(0) Class126 arg0) {
		return Static422.method6374(super.aByte126, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([Lclient!tn;B)I")
	@Override
	public final int method7990(@OriginalArg(0) Class5_Sub27[] arg0) {
		return this.method8005(arg0, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		return Static601.aBooleanArrayArray17[(super.anInt9317 >> Static162.anInt2830) + Static597.anInt9765 - Static484.anInt8046][Static597.anInt9765 + (super.anInt9315 >> Static162.anInt2830) - Static263.anInt4379];
	}
}

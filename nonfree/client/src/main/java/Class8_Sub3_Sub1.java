import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class Class8_Sub3_Sub1 extends Class8_Sub3 {

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIII)V")
	protected Class8_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte124 = (byte) arg4;
		super.anInt9365 = arg0;
		this.aShort37 = (short) arg5;
		super.anInt9361 = arg1;
		super.anInt9370 = arg2;
		super.aByte123 = (byte) arg3;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7624() {
		return Static44.aBooleanArrayArray1[Static240.anInt4447 + (super.anInt9365 >> Static351.anInt5832) - Static258.anInt4643][Static240.anInt4447 + (super.anInt9370 >> Static351.anInt5832) - Static312.anInt5339];
	}

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method7631() {
		return Static548.method7005(super.aByte124, super.anInt9365 >> Static351.anInt5832, super.anInt9370 >> Static351.anInt5832);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I[Lclient!rc;)I")
	@Override
	public final int method7616(@OriginalArg(1) Class1_Sub18[] arg0) {
		return this.method7619(super.anInt9365 >> Static351.anInt5832, arg0, super.anInt9370 >> Static351.anInt5832);
	}
}

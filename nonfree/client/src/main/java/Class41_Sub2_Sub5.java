import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class41_Sub2_Sub5 extends Class41_Sub2 {

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIII)V")
	protected Class41_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte118 = (byte) arg4;
		super.anInt9443 = arg1;
		this.aShort64 = (short) arg5;
		super.anInt9444 = arg0;
		super.aByte117 = (byte) arg3;
		super.anInt9442 = arg2;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[Lclient!eq;)I")
	@Override
	public final int method7846(@OriginalArg(1) Class3_Sub10[] arg0) {
		return this.method7848(super.anInt9444 >> Static315.anInt5369, super.anInt9442 >> Static315.anInt5369, arg0);
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7837() {
		return Static562.aBooleanArrayArray7[Static453.anInt7589 + (super.anInt9444 >> Static315.anInt5369) - Static5.anInt120][Static453.anInt7589 + (super.anInt9442 >> Static315.anInt5369) - Static394.anInt6891];
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return Static238.method3671(super.anInt9444 >> Static315.anInt5369, super.aByte118, super.anInt9442 >> Static315.anInt5369);
	}
}

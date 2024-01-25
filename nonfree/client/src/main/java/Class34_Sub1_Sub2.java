import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class34_Sub1_Sub2 extends Class34_Sub1 {

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "S")
	public final short aShort49;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V")
	protected Class34_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9622 = arg1;
		this.aShort49 = (short) arg5;
		super.aByte131 = (byte) arg4;
		super.anInt9619 = arg2;
		super.anInt9614 = arg0;
		super.aByte132 = (byte) arg3;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ha;Z)Z")
	@Override
	public final boolean method7852(@OriginalArg(0) Class95 arg0) {
		return Static674.method8987(super.aByte131, super.anInt9614 >> Static571.anInt9216, super.anInt9619 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[Lclient!uaa;)I")
	@Override
	public final int method7851(@OriginalArg(1) Class3_Sub13[] arg0) {
		return this.method7838(super.anInt9619 >> Static571.anInt9216, arg0, super.anInt9614 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7836() {
		return Static375.aBooleanArrayArray6[Static362.anInt6205 + (super.anInt9614 >> Static571.anInt9216) - Static88.anInt1826][Static362.anInt6205 + (super.anInt9619 >> Static571.anInt9216) - Static353.anInt6041];
	}
}

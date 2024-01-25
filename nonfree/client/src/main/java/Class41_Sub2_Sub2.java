import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class Class41_Sub2_Sub2 extends Class41_Sub2 {

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class41_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9442 = arg2;
		super.anInt9444 = arg0;
		super.anInt9443 = arg1;
		this.aShort35 = (short) arg5;
		this.aShort36 = (short) arg6;
		super.aByte118 = (byte) arg4;
		super.aByte117 = (byte) arg3;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[Lclient!eq;)I")
	@Override
	public final int method7846(@OriginalArg(1) Class3_Sub10[] arg0) {
		return this.method7848(super.anInt9444 >> Static315.anInt5369, super.anInt9442 >> Static315.anInt5369, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7837() {
		return Static562.aBooleanArrayArray7[(super.anInt9444 >> Static315.anInt5369) - (Static5.anInt120 - Static453.anInt7589)][Static453.anInt7589 + (super.anInt9442 >> Static315.anInt5369) - Static394.anInt6891];
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "(I)V")
	@Override
	public final void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public final void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return Static256.method3945(super.anInt9444 >> Static315.anInt5369, super.aByte118, super.anInt9442 >> Static315.anInt5369, this.method7844());
	}
}

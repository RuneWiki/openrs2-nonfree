import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public abstract class Class41_Sub2_Sub4 extends Class41_Sub2 {

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(IIIII)V")
	public Class41_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt9444 = arg0;
		super.aByte117 = (byte) arg3;
		super.aByte118 = (byte) arg4;
		super.anInt9443 = arg1;
		super.anInt9442 = arg2;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[Lclient!eq;)I")
	@Override
	public final int method7846(@OriginalArg(1) Class3_Sub10[] arg0) {
		return this.method7848(super.anInt9444 >> Static315.anInt5369, super.anInt9442 >> Static315.anInt5369, arg0);
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		@Pc(20) Class38 local20 = Static483.method6593(super.aByte117, super.anInt9444 >> Static315.anInt5369, super.anInt9442 >> Static315.anInt5369);
		return local20 != null && local20.aClass41_Sub2_Sub1_1.aBoolean737 ? Static256.method3945(super.anInt9444 >> Static315.anInt5369, super.aByte117, super.anInt9442 >> Static315.anInt5369, local20.aClass41_Sub2_Sub1_1.method7844() + this.method7844()) : Static238.method3671(super.anInt9444 >> Static315.anInt5369, super.aByte117, super.anInt9442 >> Static315.anInt5369);
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7837() {
		return Static562.aBooleanArrayArray7[Static453.anInt7589 + (super.anInt9444 >> Static315.anInt5369) - Static5.anInt120][(super.anInt9442 >> Static315.anInt5369) - (Static394.anInt6891 - Static453.anInt7589)];
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public final void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "(I)V")
	@Override
	public final void method7852() {
		throw new IllegalStateException();
	}
}

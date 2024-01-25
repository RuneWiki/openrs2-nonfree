import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class34_Sub1_Sub4 extends Class34_Sub1 {

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIII)V")
	public Class34_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt9619 = arg2;
		super.aByte132 = (byte) arg3;
		super.anInt9614 = arg0;
		super.anInt9622 = arg1;
		super.aByte131 = (byte) arg4;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
	@Override
	public final void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B[Lclient!uaa;)I")
	@Override
	public final int method7851(@OriginalArg(1) Class3_Sub13[] arg0) {
		return this.method7838(super.anInt9619 >> Static571.anInt9216, arg0, super.anInt9614 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7836() {
		return Static375.aBooleanArrayArray6[Static362.anInt6205 + (super.anInt9614 >> Static571.anInt9216) - Static88.anInt1826][(super.anInt9619 >> Static571.anInt9216) + Static362.anInt6205 - Static353.anInt6041];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public final void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;Z)Z")
	@Override
	public final boolean method7852(@OriginalArg(0) Class95 arg0) {
		@Pc(27) Class205 local27 = Static436.method5968(super.aByte132, super.anInt9614 >> Static571.anInt9216, super.anInt9619 >> Static571.anInt9216);
		return local27 != null && local27.aClass34_Sub1_Sub1_1.aBoolean672 ? Static174.method2755(super.aByte132, super.anInt9614 >> Static571.anInt9216, local27.aClass34_Sub1_Sub1_1.method7847() + this.method7847(), super.anInt9619 >> Static571.anInt9216) : Static674.method8987(super.aByte132, super.anInt9614 >> Static571.anInt9216, super.anInt9619 >> Static571.anInt9216);
	}
}

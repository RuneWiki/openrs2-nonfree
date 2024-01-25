import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class34_Sub1_Sub3 extends Class34_Sub1 {

	@OriginalMember(owner = "client!md", name = "z", descriptor = "S")
	public short aShort72;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class34_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte132 = (byte) arg3;
		super.aByte131 = (byte) arg4;
		super.anInt9614 = arg0;
		this.aShort72 = (short) arg5;
		super.anInt9619 = arg2;
		super.anInt9622 = arg1;
		this.aShort73 = (short) arg6;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public final void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ha;Z)Z")
	@Override
	public final boolean method7852(@OriginalArg(0) Class95 arg0) {
		return Static174.method2755(super.aByte131, super.anInt9614 >> Static571.anInt9216, this.method7847(), super.anInt9619 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7836() {
		return Static375.aBooleanArrayArray6[(super.anInt9614 >> Static571.anInt9216) + Static362.anInt6205 - Static88.anInt1826][(super.anInt9619 >> Static571.anInt9216) + Static362.anInt6205 - Static353.anInt6041];
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V")
	@Override
	public final void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B[Lclient!uaa;)I")
	@Override
	public final int method7851(@OriginalArg(1) Class3_Sub13[] arg0) {
		return this.method7838(super.anInt9619 >> Static571.anInt9216, arg0, super.anInt9614 >> Static571.anInt9216);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return false;
	}
}

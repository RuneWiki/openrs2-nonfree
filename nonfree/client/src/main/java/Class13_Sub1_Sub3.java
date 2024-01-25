import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public abstract class Class13_Sub1_Sub3 extends Class13_Sub1 {

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class13_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10090 = arg0;
		super.aByte126 = (byte) arg4;
		super.aByte127 = (byte) arg3;
		super.anInt10089 = arg2;
		super.anInt10097 = arg1;
		this.aShort126 = (short) arg5;
		this.aShort127 = (short) arg6;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8403() {
		return Static494.aBooleanArrayArray8[(super.anInt10090 >> Static609.anInt9827) + Static335.anInt5343 - Static566.anInt9234][(super.anInt10089 >> Static609.anInt9827) + Static335.anInt5343 - Static370.anInt5837];
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)V")
	@Override
	public final void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public final void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[Lclient!kb;)I")
	@Override
	public final int method8401(@OriginalArg(1) Class2_Sub24[] arg0) {
		return this.method8398(super.anInt10089 >> Static609.anInt9827, arg0, super.anInt10090 >> Static609.anInt9827);
	}

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8406() {
		return Static135.method1851(this.method8397(), super.anInt10090 >> Static609.anInt9827, super.anInt10089 >> Static609.anInt9827, super.aByte126);
	}
}

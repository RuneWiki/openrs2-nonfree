import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public abstract class Class13_Sub1_Sub5 extends Class13_Sub1 {

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIII)V")
	public Class13_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte127 = (byte) arg3;
		super.anInt10090 = arg0;
		super.anInt10089 = arg2;
		super.aByte126 = (byte) arg4;
		super.anInt10097 = arg1;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public final void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8403() {
		return Static494.aBooleanArrayArray8[(super.anInt10090 >> Static609.anInt9827) + Static335.anInt5343 - Static566.anInt9234][(super.anInt10089 >> Static609.anInt9827) + Static335.anInt5343 - Static370.anInt5837];
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V")
	@Override
	public final void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[Lclient!kb;)I")
	@Override
	public final int method8401(@OriginalArg(1) Class2_Sub24[] arg0) {
		return this.method8398(super.anInt10089 >> Static609.anInt9827, arg0, super.anInt10090 >> Static609.anInt9827);
	}

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8406() {
		@Pc(15) Class325 local15 = Static387.method5191(super.aByte127, super.anInt10090 >> Static609.anInt9827, super.anInt10089 >> Static609.anInt9827);
		return local15 != null && local15.aClass13_Sub1_Sub1_1.aBoolean680 ? Static135.method1851(local15.aClass13_Sub1_Sub1_1.method8397() + this.method8397(), super.anInt10090 >> Static609.anInt9827, super.anInt10089 >> Static609.anInt9827, super.aByte127) : Static223.method3048(super.anInt10089 >> Static609.anInt9827, super.anInt10090 >> Static609.anInt9827, super.aByte127);
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8404() {
		return false;
	}
}

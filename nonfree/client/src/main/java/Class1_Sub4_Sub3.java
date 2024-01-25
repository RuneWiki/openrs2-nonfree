import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public abstract class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIII)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt9935 = arg2;
		super.anInt9934 = arg0;
		super.anInt9932 = arg1;
		super.aByte126 = (byte) arg3;
		super.aByte127 = (byte) arg4;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([Lclient!ul;I)I")
	@Override
	public final int method8129(@OriginalArg(0) Class4_Sub24[] arg0) {
		return this.method8119(arg0, super.anInt9935 >> Static145.anInt3093, super.anInt9934 >> Static145.anInt3093);
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public final void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)V")
	@Override
	public final void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8126() {
		return Static522.aBooleanArrayArray18[Static579.anInt10075 + (super.anInt9934 >> Static145.anInt3093) - Static26.anInt403][Static579.anInt10075 + (super.anInt9935 >> Static145.anInt3093) - Static528.anInt9392];
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8115() {
		@Pc(23) Class289 local23 = Static463.method5951(super.aByte126, super.anInt9934 >> Static145.anInt3093, super.anInt9935 >> Static145.anInt3093);
		return local23 != null && local23.aClass1_Sub4_Sub2_1.aBoolean698 ? Static170.method3117(super.aByte126, local23.aClass1_Sub4_Sub2_1.method8117() + this.method8117(), super.anInt9935 >> Static145.anInt3093, super.anInt9934 >> Static145.anInt3093) : Static181.method3235(super.anInt9935 >> Static145.anInt3093, super.aByte126, super.anInt9934 >> Static145.anInt3093);
	}
}

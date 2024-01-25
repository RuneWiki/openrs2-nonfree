import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public abstract class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt8916 = arg0;
		super.anInt8915 = arg1;
		super.anInt8911 = arg2;
		super.aByte124 = (byte) arg4;
		super.aByte123 = (byte) arg3;
	}

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public final void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7694() {
		return Static579.aBooleanArrayArray7[Static468.anInt10228 + (super.anInt8916 >> Static308.anInt5834) - Static626.anInt10075][Static468.anInt10228 + (super.anInt8911 >> Static308.anInt5834) - Static386.anInt7210];
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V")
	@Override
	public final void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7701() {
		@Pc(22) Class128 local22 = Static502.method7419(super.aByte123, super.anInt8916 >> Static308.anInt5834, super.anInt8911 >> Static308.anInt5834);
		return local22 != null && local22.aClass4_Sub1_Sub2_1.aBoolean639 ? Static322.method5269(local22.aClass4_Sub1_Sub2_1.method7703() + this.method7703(), super.anInt8911 >> Static308.anInt5834, super.aByte123, super.anInt8916 >> Static308.anInt5834) : Static69.method1704(super.anInt8916 >> Static308.anInt5834, super.anInt8911 >> Static308.anInt5834, super.aByte123);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[Lclient!wh;)I")
	@Override
	public final int method7698(@OriginalArg(1) Class3_Sub16[] arg0) {
		return this.method7691(super.anInt8916 >> Static308.anInt5834, arg0, super.anInt8911 >> Static308.anInt5834);
	}
}

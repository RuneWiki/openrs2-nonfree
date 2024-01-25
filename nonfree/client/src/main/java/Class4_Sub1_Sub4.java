import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!um", name = "z", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt8911 = arg2;
		super.aByte123 = (byte) arg3;
		super.anInt8915 = arg1;
		this.aShort63 = (short) arg6;
		this.aShort62 = (short) arg5;
		super.anInt8916 = arg0;
		super.aByte124 = (byte) arg4;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7694() {
		return Static579.aBooleanArrayArray7[Static468.anInt10228 + (super.anInt8916 >> Static308.anInt5834) - Static626.anInt10075][(super.anInt8911 >> Static308.anInt5834) + Static468.anInt10228 - Static386.anInt7210];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lclient!wh;)I")
	@Override
	public final int method7698(@OriginalArg(1) Class3_Sub16[] arg0) {
		return this.method7691(super.anInt8916 >> Static308.anInt5834, arg0, super.anInt8911 >> Static308.anInt5834);
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7701() {
		return Static322.method5269(this.method7703(), super.anInt8911 >> Static308.anInt5834, super.aByte124, super.anInt8916 >> Static308.anInt5834);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public final void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	@Override
	public final void method7697() {
		throw new IllegalStateException();
	}
}

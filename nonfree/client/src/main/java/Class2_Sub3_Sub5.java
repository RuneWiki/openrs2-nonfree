import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIII)V")
	protected Class2_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort116 = (short) arg5;
		super.anInt10428 = arg0;
		super.anInt10424 = arg2;
		super.anInt10429 = arg1;
		super.aByte128 = (byte) arg3;
		super.aByte129 = (byte) arg4;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[Lclient!pk;)I")
	@Override
	public final int method8577(@OriginalArg(1) Class3_Sub27[] arg0) {
		return this.method8568(super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846, arg0);
	}

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8580() {
		return Static622.aBooleanArrayArray11[Static157.anInt3831 + (super.anInt10428 >> Static276.anInt5846) - Static607.anInt10024][Static157.anInt3831 + (super.anInt10424 >> Static276.anInt5846) - Static23.anInt369];
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8567(@OriginalArg(1) Class33 arg0) {
		return Static562.method7912(super.aByte129, super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846);
	}
}

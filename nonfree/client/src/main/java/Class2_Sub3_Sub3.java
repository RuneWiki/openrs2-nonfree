import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pda", name = "G", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class2_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort108 = (short) arg5;
		super.anInt10429 = arg1;
		super.aByte129 = (byte) arg4;
		this.aShort107 = (short) arg6;
		super.aByte128 = (byte) arg3;
		super.anInt10424 = arg2;
		super.anInt10428 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "(I)V")
	@Override
	public final void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public final void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[Lclient!pk;)I")
	@Override
	public final int method8577(@OriginalArg(1) Class3_Sub27[] arg0) {
		return this.method8568(super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846, arg0);
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8567(@OriginalArg(1) Class33 arg0) {
		return Static22.method276(this.method8574(), super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846, super.aByte129);
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8580() {
		return Static622.aBooleanArrayArray11[Static157.anInt3831 + (super.anInt10428 >> Static276.anInt5846) - Static607.anInt10024][(super.anInt10424 >> Static276.anInt5846) + Static157.anInt3831 - Static23.anInt369];
	}
}

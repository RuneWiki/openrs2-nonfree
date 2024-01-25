import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public abstract class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(IIIII)V")
	public Class2_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte129 = (byte) arg4;
		super.anInt10424 = arg2;
		super.aByte128 = (byte) arg3;
		super.anInt10428 = arg0;
		super.anInt10429 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I[Lclient!pk;)I")
	@Override
	public final int method8577(@OriginalArg(1) Class3_Sub27[] arg0) {
		return this.method8568(super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846, arg0);
	}

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)V")
	@Override
	public final void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8580() {
		return Static622.aBooleanArrayArray11[Static157.anInt3831 + (super.anInt10428 >> Static276.anInt5846) - Static607.anInt10024][(super.anInt10424 >> Static276.anInt5846) + Static157.anInt3831 - Static23.anInt369];
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8567(@OriginalArg(1) Class33 arg0) {
		@Pc(20) Class243 local20 = Static189.method3781(super.aByte128, super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846);
		return local20 != null && local20.aClass2_Sub3_Sub1_1.aBoolean874 ? Static22.method276(local20.aClass2_Sub3_Sub1_1.method8574() + this.method8574(), super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846, super.aByte128) : Static562.method7912(super.aByte128, super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846);
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public final void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}

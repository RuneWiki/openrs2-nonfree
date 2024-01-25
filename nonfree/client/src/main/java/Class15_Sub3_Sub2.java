import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public abstract class Class15_Sub3_Sub2 extends Class15_Sub3 {

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIII)V")
	public Class15_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt11024 = arg2;
		super.anInt11022 = arg0;
		super.anInt11029 = arg1;
		super.aByte142 = (byte) arg3;
		super.aByte141 = (byte) arg4;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9433(@OriginalArg(1) Class101 arg0) {
		@Pc(27) Class27 local27 = Static48.method983(super.aByte142, super.anInt11022 >> Static170.anInt3602, super.anInt11024 >> Static170.anInt3602);
		return local27 != null && local27.aClass15_Sub3_Sub3_1.aBoolean432 ? Static439.method7153(super.aByte142, super.anInt11022 >> Static170.anInt3602, local27.aClass15_Sub3_Sub3_1.method9430() + this.method9430(), super.anInt11024 >> Static170.anInt3602) : Static328.method5423(super.anInt11024 >> Static170.anInt3602, super.anInt11022 >> Static170.anInt3602, super.aByte142);
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	@Override
	public final void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9437() {
		return Static423.aBooleanArrayArray8[(super.anInt11022 >> Static170.anInt3602) + Static602.anInt10539 - Static440.anInt8000][(super.anInt11024 >> Static170.anInt3602) + Static602.anInt10539 - Static139.anInt2631];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lclient!mfa;)I")
	@Override
	public final int method9428(@OriginalArg(1) Class2_Sub13[] arg0) {
		return this.method9441(arg0, super.anInt11024 >> Static170.anInt3602, super.anInt11022 >> Static170.anInt3602);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public final void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method9439() {
		return false;
	}
}

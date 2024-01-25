import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class15_Sub3_Sub5 extends Class15_Sub3 {

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIII)V")
	protected Class15_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt11024 = arg2;
		this.aShort74 = (short) arg5;
		super.aByte141 = (byte) arg4;
		super.anInt11029 = arg1;
		super.anInt11022 = arg0;
		super.aByte142 = (byte) arg3;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[Lclient!mfa;)I")
	@Override
	public final int method9428(@OriginalArg(1) Class2_Sub13[] arg0) {
		return this.method9441(arg0, super.anInt11024 >> Static170.anInt3602, super.anInt11022 >> Static170.anInt3602);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9433(@OriginalArg(1) Class101 arg0) {
		return Static328.method5423(super.anInt11024 >> Static170.anInt3602, super.anInt11022 >> Static170.anInt3602, super.aByte141);
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9437() {
		return Static423.aBooleanArrayArray8[(super.anInt11022 >> Static170.anInt3602) + Static602.anInt10539 - Static440.anInt8000][(super.anInt11024 >> Static170.anInt3602) + Static602.anInt10539 - Static139.anInt2631];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public abstract class Class15_Sub3_Sub4 extends Class15_Sub3 {

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(IIIIII)V")
	protected Class15_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort126 = (short) arg5;
		super.anInt11022 = arg0;
		super.aByte142 = (byte) arg3;
		super.anInt11024 = arg2;
		super.anInt11029 = arg1;
		super.aByte141 = (byte) arg4;
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9437() {
		return Static423.aBooleanArrayArray8[(super.anInt11022 >> Static170.anInt3602) + (Static602.anInt10539 - Static440.anInt8000)][Static602.anInt10539 + (super.anInt11024 >> Static170.anInt3602) - Static139.anInt2631];
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9433(@OriginalArg(1) Class101 arg0) {
		return Static460.method9473(super.aByte141, super.anInt11024 >> Static170.anInt3602, super.anInt11022 >> Static170.anInt3602, this);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[Lclient!mfa;)I")
	@Override
	public final int method9428(@OriginalArg(1) Class2_Sub13[] arg0) {
		@Pc(10) int local10 = super.anInt11022 >> Static170.anInt3602;
		@Pc(15) int local15 = super.anInt11024 >> Static170.anInt3602;
		@Pc(17) int local17 = 0;
		if (local10 == Static440.anInt8000) {
			local17++;
		} else if (local10 > Static440.anInt8000) {
			local17 += 2;
		}
		if (Static139.anInt2631 == local15) {
			local17 += 3;
		} else if (local15 < Static139.anInt2631) {
			local17 += 6;
		}
		@Pc(41) int local41 = Static64.anIntArray65[local17];
		if ((local41 & this.aShort126) != 0) {
			return this.method9441(arg0, local15, local10);
		} else if (this.aShort126 == 1 && local10 > 0) {
			return this.method9441(arg0, local15, local10 - 1);
		} else if (this.aShort126 == 4 && Static585.anInt10170 >= local10) {
			return this.method9441(arg0, local15, local10 + 1);
		} else if (this.aShort126 == 8 && local15 > 0) {
			return this.method9441(arg0, local15 - 1, local10);
		} else if (this.aShort126 == 2 && local15 <= Static202.anInt4238) {
			return this.method9441(arg0, local15 + 1, local10);
		} else if (this.aShort126 == 16 && local10 > 0 && Static202.anInt4238 >= local15) {
			return this.method9441(arg0, local15 + 1, local10 + -1);
		} else if (this.aShort126 == 32 && local10 <= Static585.anInt10170 && Static202.anInt4238 >= local15) {
			return this.method9441(arg0, local15 + 1, local10 + 1);
		} else if (this.aShort126 == 128 && local10 > 0 && local15 > 0) {
			return this.method9441(arg0, local15 - 1, local10 + -1);
		} else if (this.aShort126 == 64 && Static585.anInt10170 >= local10 && local15 > 0) {
			return this.method9441(arg0, local15 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}
}

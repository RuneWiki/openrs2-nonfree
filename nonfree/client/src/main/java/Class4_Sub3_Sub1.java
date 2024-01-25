import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public abstract class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!tha", name = "B", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte147 = (byte) arg4;
		super.anInt11178 = arg2;
		super.anInt11182 = arg1;
		super.anInt11184 = arg0;
		this.aShort90 = (short) arg5;
		super.aByte146 = (byte) arg3;
	}

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method9486() {
		return Static18.aBooleanArrayArray1[(super.anInt11184 >> Static110.anInt1858) + Static459.anInt10513 - Static307.anInt5453][(super.anInt11178 >> Static110.anInt1858) + Static459.anInt10513 - Static325.anInt5630];
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method9487(@OriginalArg(0) Class144 arg0) {
		return Static248.method4214(super.anInt11184 >> Static110.anInt1858, super.aByte147, this, super.anInt11178 >> Static110.anInt1858);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([Lclient!rfa;B)I")
	@Override
	public final int method9488(@OriginalArg(0) Class14_Sub18[] arg0) {
		@Pc(16) int local16 = super.anInt11184 >> Static110.anInt1858;
		@Pc(21) int local21 = super.anInt11178 >> Static110.anInt1858;
		@Pc(23) int local23 = 0;
		if (Static307.anInt5453 == local16) {
			local23++;
		} else if (local16 > Static307.anInt5453) {
			local23 += 2;
		}
		if (Static325.anInt5630 == local21) {
			local23 += 3;
		} else if (local21 < Static325.anInt5630) {
			local23 += 6;
		}
		@Pc(63) int local63 = Static435.anIntArray388[local23];
		if ((this.aShort90 & local63) != 0) {
			return this.method9484(arg0, local21, local16);
		} else if (this.aShort90 == 1 && local16 > 0) {
			return this.method9484(arg0, local21, local16 - 1);
		} else if (this.aShort90 == 4 && Static654.anInt10715 >= local16) {
			return this.method9484(arg0, local21, local16 + 1);
		} else if (this.aShort90 == 8 && local21 > 0) {
			return this.method9484(arg0, local21 - 1, local16);
		} else if (this.aShort90 == 2 && local21 <= Static180.anInt2928) {
			return this.method9484(arg0, local21 + 1, local16);
		} else if (this.aShort90 == 16 && local16 > 0 && Static180.anInt2928 >= local21) {
			return this.method9484(arg0, local21 + 1, local16 + -1);
		} else if (this.aShort90 == 32 && Static654.anInt10715 >= local16 && Static180.anInt2928 >= local21) {
			return this.method9484(arg0, local21 + 1, local16 - -1);
		} else if (this.aShort90 == 128 && local16 > 0 && local21 > 0) {
			return this.method9484(arg0, local21 - 1, local16 + -1);
		} else if (this.aShort90 == 64 && Static654.anInt10715 >= local16 && local21 > 0) {
			return this.method9484(arg0, local21 - 1, local16 - -1);
		} else {
			throw new RuntimeException("");
		}
	}
}

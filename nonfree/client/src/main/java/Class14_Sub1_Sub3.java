import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public abstract class Class14_Sub1_Sub3 extends Class14_Sub1 {

	@OriginalMember(owner = "client!og", name = "C", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIII)V")
	protected Class14_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort115 = (short) arg5;
		super.aByte126 = (byte) arg4;
		super.anInt9317 = arg0;
		super.aByte125 = (byte) arg3;
		super.anInt9315 = arg2;
		super.anInt9321 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8000(@OriginalArg(0) Class126 arg0) {
		return Static285.method4277(super.aByte126, super.anInt9315 >> Static162.anInt2830, this, super.anInt9317 >> Static162.anInt2830);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([Lclient!tn;B)I")
	@Override
	public final int method7990(@OriginalArg(0) Class5_Sub27[] arg0) {
		@Pc(15) int local15 = super.anInt9317 >> Static162.anInt2830;
		@Pc(20) int local20 = super.anInt9315 >> Static162.anInt2830;
		@Pc(22) int local22 = 0;
		if (Static484.anInt8046 == local15) {
			local22++;
		} else if (Static484.anInt8046 < local15) {
			local22 += 2;
		}
		if (local20 == Static263.anInt4379) {
			local22 += 3;
		} else if (local20 < Static263.anInt4379) {
			local22 += 6;
		}
		@Pc(54) int local54 = Static85.anIntArray111[local22];
		if ((local54 & this.aShort115) != 0) {
			return this.method8005(arg0, local15, local20);
		} else if (this.aShort115 == 1 && local15 > 0) {
			return this.method8005(arg0, local15 - 1, local20);
		} else if (this.aShort115 == 4 && local15 <= Static129.anInt6336) {
			return this.method8005(arg0, local15 + 1, local20);
		} else if (this.aShort115 == 8 && local20 > 0) {
			return this.method8005(arg0, local15, local20 - 1);
		} else if (this.aShort115 == 2 && Static150.anInt2400 >= local20) {
			return this.method8005(arg0, local15, local20 + 1);
		} else if (this.aShort115 == 16 && local15 > 0 && Static150.anInt2400 >= local20) {
			return this.method8005(arg0, local15 - 1, local20 - -1);
		} else if (this.aShort115 == 32 && Static129.anInt6336 >= local15 && local20 <= Static150.anInt2400) {
			return this.method8005(arg0, local15 + 1, local20 - -1);
		} else if (this.aShort115 == 128 && local15 > 0 && local20 > 0) {
			return this.method8005(arg0, local15 - 1, local20 + -1);
		} else if (this.aShort115 == 64 && local15 <= Static129.anInt6336 && local20 > 0) {
			return this.method8005(arg0, local15 + 1, local20 + -1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		return Static601.aBooleanArrayArray17[Static597.anInt9765 + (super.anInt9317 >> Static162.anInt2830) - Static484.anInt8046][Static597.anInt9765 + (super.anInt9315 >> Static162.anInt2830) - Static263.anInt4379];
	}
}

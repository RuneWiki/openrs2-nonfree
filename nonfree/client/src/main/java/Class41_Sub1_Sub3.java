import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public abstract class Class41_Sub1_Sub3 extends Class41_Sub1 {

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIIII)V")
	protected Class41_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort116 = (short) arg5;
		super.aByte150 = (byte) arg4;
		super.anInt10366 = arg0;
		super.anInt10370 = arg1;
		super.anInt10367 = arg2;
		super.aByte149 = (byte) arg3;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z[Lclient!jw;)I")
	@Override
	public final int method8649(@OriginalArg(1) Class5_Sub3[] arg0) {
		@Pc(10) int local10 = super.anInt10366 >> Static138.anInt2287;
		@Pc(15) int local15 = super.anInt10367 >> Static138.anInt2287;
		@Pc(17) int local17 = 0;
		if (local10 == Static281.anInt4404) {
			local17++;
		} else if (Static281.anInt4404 < local10) {
			local17 += 2;
		}
		if (Static411.anInt7045 == local15) {
			local17 += 3;
		} else if (local15 < Static411.anInt7045) {
			local17 += 6;
		}
		@Pc(61) int local61 = Static416.anIntArray406[local17];
		if ((this.aShort116 & local61) != 0) {
			return this.method8657(arg0, local15, local10);
		} else if (this.aShort116 == 1 && local10 > 0) {
			return this.method8657(arg0, local15, local10 - 1);
		} else if (this.aShort116 == 4 && local10 <= Static665.anInt7330) {
			return this.method8657(arg0, local15, local10 + 1);
		} else if (this.aShort116 == 8 && local15 > 0) {
			return this.method8657(arg0, local15 - 1, local10);
		} else if (this.aShort116 == 2 && local15 <= Static92.anInt1526) {
			return this.method8657(arg0, local15 + 1, local10);
		} else if (this.aShort116 == 16 && local10 > 0 && local15 <= Static92.anInt1526) {
			return this.method8657(arg0, local15 + 1, local10 - 1);
		} else if (this.aShort116 == 32 && Static665.anInt7330 >= local10 && Static92.anInt1526 >= local15) {
			return this.method8657(arg0, local15 + 1, local10 + 1);
		} else if (this.aShort116 == 128 && local10 > 0 && local15 > 0) {
			return this.method8657(arg0, local15 - 1, local10 - 1);
		} else if (this.aShort116 == 64 && Static665.anInt7330 >= local10 && local15 > 0) {
			return this.method8657(arg0, local15 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8651(@OriginalArg(1) Class143 arg0) {
		return Static577.method7870(this, super.anInt10367 >> Static138.anInt2287, super.anInt10366 >> Static138.anInt2287, super.aByte150);
	}

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "(I)Z")
	@Override
	public final boolean method8664() {
		return Static10.aBooleanArrayArray1[Static537.anInt10357 + (super.anInt10366 >> Static138.anInt2287) - Static281.anInt4404][Static537.anInt10357 + (super.anInt10367 >> Static138.anInt2287) - Static411.anInt7045];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public abstract class Class12_Sub2_Sub5 extends Class12_Sub2 {

	@OriginalMember(owner = "client!po", name = "x", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIII)V")
	protected Class12_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort116 = (short) arg5;
		super.aByte127 = (byte) arg4;
		super.aByte128 = (byte) arg3;
		super.anInt9374 = arg0;
		super.anInt9373 = arg1;
		super.anInt9375 = arg2;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7499() {
		return Static590.aBooleanArrayArray10[Static351.anInt6012 + (super.anInt9374 >> Static562.anInt9207) - Static258.anInt4281][(super.anInt9375 >> Static562.anInt9207) + Static351.anInt6012 - Static505.anInt8016];
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I[Lclient!tg;)I")
	@Override
	public final int method7505(@OriginalArg(1) Class2_Sub11[] arg0) {
		@Pc(10) int local10 = super.anInt9374 >> Static562.anInt9207;
		@Pc(15) int local15 = super.anInt9375 >> Static562.anInt9207;
		@Pc(17) int local17 = 0;
		if (local10 == Static258.anInt4281) {
			local17++;
		} else if (local10 > Static258.anInt4281) {
			local17 += 2;
		}
		if (Static505.anInt8016 == local15) {
			local17 += 3;
		} else if (Static505.anInt8016 > local15) {
			local17 += 6;
		}
		@Pc(53) int local53 = Static62.anIntArray111[local17];
		if ((this.aShort116 & local53) != 0) {
			return this.method7508(local10, local15, arg0);
		} else if (this.aShort116 == 1 && local10 > 0) {
			return this.method7508(local10 - 1, local15, arg0);
		} else if (this.aShort116 == 4 && local10 <= Static83.anInt1434) {
			return this.method7508(local10 + 1, local15, arg0);
		} else if (this.aShort116 == 8 && local15 > 0) {
			return this.method7508(local10, local15 - 1, arg0);
		} else if (this.aShort116 == 2 && local15 <= Static405.anInt6657) {
			return this.method7508(local10, local15 + 1, arg0);
		} else if (this.aShort116 == 16 && local10 > 0 && Static405.anInt6657 >= local15) {
			return this.method7508(local10 - 1, local15 + 1, arg0);
		} else if (this.aShort116 == 32 && Static83.anInt1434 >= local10 && Static405.anInt6657 >= local15) {
			return this.method7508(local10 + 1, local15 + 1, arg0);
		} else if (this.aShort116 == 128 && local10 > 0 && local15 > 0) {
			return this.method7508(local10 - 1, local15 - 1, arg0);
		} else if (this.aShort116 == 64 && Static83.anInt1434 >= local10 && local15 > 0) {
			return this.method7508(local10 + 1, local15 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method7506() {
		return Static491.method6285(super.aByte127, super.anInt9375 >> Static562.anInt9207, this, super.anInt9374 >> Static562.anInt9207);
	}
}

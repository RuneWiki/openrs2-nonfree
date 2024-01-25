import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!he", name = "A", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V")
	protected Class16_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte109 = (byte) arg3;
		super.anInt8034 = arg2;
		super.aByte108 = (byte) arg4;
		super.anInt8036 = arg1;
		this.aShort89 = (short) arg5;
		super.anInt8037 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method6979(@OriginalArg(1) Class13 arg0) {
		return Static74.method7158(super.anInt8037 >> Static326.anInt5713, super.anInt8034 >> Static326.anInt5713, super.aByte108, this);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!laa;Z)I")
	@Override
	public final int method6977(@OriginalArg(0) Class2_Sub12[] arg0) {
		@Pc(10) int local10 = super.anInt8037 >> Static326.anInt5713;
		@Pc(15) int local15 = super.anInt8034 >> Static326.anInt5713;
		@Pc(17) int local17 = 0;
		if (local10 == Static636.anInt10301) {
			local17++;
		} else if (Static636.anInt10301 < local10) {
			local17 += 2;
		}
		if (local15 == Static66.anInt1803) {
			local17 += 3;
		} else if (Static66.anInt1803 > local15) {
			local17 += 6;
		}
		@Pc(45) int local45 = Static445.anIntArray496[local17];
		if ((this.aShort89 & local45) != 0) {
			return this.method6973(local10, local15, arg0);
		} else if (this.aShort89 == 1 && local10 > 0) {
			return this.method6973(local10 - 1, local15, arg0);
		} else if (this.aShort89 == 4 && local10 <= Static595.anInt9881) {
			return this.method6973(local10 + 1, local15, arg0);
		} else if (this.aShort89 == 8 && local15 > 0) {
			return this.method6973(local10, local15 - 1, arg0);
		} else if (this.aShort89 == 2 && Static389.anInt6693 >= local15) {
			return this.method6973(local10, local15 + 1, arg0);
		} else if (this.aShort89 == 16 && local10 > 0 && Static389.anInt6693 >= local15) {
			return this.method6973(local10 - 1, local15 - -1, arg0);
		} else if (this.aShort89 == 32 && local10 <= Static595.anInt9881 && Static389.anInt6693 >= local15) {
			return this.method6973(local10 + 1, local15 + 1, arg0);
		} else if (this.aShort89 == 128 && local10 > 0 && local15 > 0) {
			return this.method6973(local10 - 1, local15 + -1, arg0);
		} else if (this.aShort89 == 64 && local10 <= Static595.anInt9881 && local15 > 0) {
			return this.method6973(local10 + 1, local15 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6982() {
		return Static447.aBooleanArrayArray9[(super.anInt8037 >> Static326.anInt5713) + Static621.anInt10151 - Static636.anInt10301][(super.anInt8034 >> Static326.anInt5713) + Static621.anInt10151 - Static66.anInt1803];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public abstract class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(IIIIII)V")
	protected Class21_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10551 = arg0;
		this.aShort65 = (short) arg5;
		super.aByte127 = (byte) arg3;
		super.anInt10550 = arg2;
		super.anInt10554 = arg1;
		super.aByte128 = (byte) arg4;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8226() {
		return Static339.aBooleanArrayArray8[Static30.anInt1124 + (super.anInt10551 >> Static392.anInt3635) - Static465.anInt8858][Static30.anInt1124 + (super.anInt10550 >> Static392.anInt3635) - Static78.anInt1933];
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[Lclient!am;)I")
	@Override
	public final int method8234(@OriginalArg(1) Class4_Sub3[] arg0) {
		@Pc(10) int local10 = super.anInt10551 >> Static392.anInt3635;
		@Pc(15) int local15 = super.anInt10550 >> Static392.anInt3635;
		@Pc(17) int local17 = 0;
		if (local10 == Static465.anInt8858) {
			local17++;
		} else if (Static465.anInt8858 < local10) {
			local17 += 2;
		}
		if (Static78.anInt1933 == local15) {
			local17 += 3;
		} else if (local15 < Static78.anInt1933) {
			local17 += 6;
		}
		@Pc(53) int local53 = Static40.anIntArray31[local17];
		if ((local53 & this.aShort65) != 0) {
			return this.method8236(local15, local10, arg0);
		} else if (this.aShort65 == 1 && local10 > 0) {
			return this.method8236(local15, local10 - 1, arg0);
		} else if (this.aShort65 == 4 && local10 <= Static10.anInt812) {
			return this.method8236(local15, local10 + 1, arg0);
		} else if (this.aShort65 == 8 && local15 > 0) {
			return this.method8236(local15 - 1, local10, arg0);
		} else if (this.aShort65 == 2 && Static255.anInt5209 >= local15) {
			return this.method8236(local15 + 1, local10, arg0);
		} else if (this.aShort65 == 16 && local10 > 0 && local15 <= Static255.anInt5209) {
			return this.method8236(local15 + 1, local10 - 1, arg0);
		} else if (this.aShort65 == 32 && local10 <= Static10.anInt812 && Static255.anInt5209 >= local15) {
			return this.method8236(local15 + 1, local10 + 1, arg0);
		} else if (this.aShort65 == 128 && local10 > 0 && local15 > 0) {
			return this.method8236(local15 - 1, local10 + -1, arg0);
		} else if (this.aShort65 == 64 && Static10.anInt812 >= local10 && local15 > 0) {
			return this.method8236(local15 - 1, local10 + 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8221() {
		return Static482.method6975(super.anInt10551 >> Static392.anInt3635, this, super.anInt10550 >> Static392.anInt3635, super.aByte128);
	}
}

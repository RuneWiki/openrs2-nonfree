import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public abstract class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIII)V")
	protected Class11_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9930 = arg1;
		super.aByte125 = (byte) arg4;
		super.anInt9929 = arg2;
		this.aShort102 = (short) arg5;
		super.anInt9925 = arg0;
		super.aByte124 = (byte) arg3;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8314() {
		return Static36.aBooleanArrayArray2[Static319.anInt5795 + (super.anInt9925 >> Static415.anInt7579) - Static623.anInt9563][Static319.anInt5795 + (super.anInt9929 >> Static415.anInt7579) - Static507.anInt8547];
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!bh;I)I")
	@Override
	public final int method8318(@OriginalArg(0) Class2_Sub4[] arg0) {
		@Pc(10) int local10 = super.anInt9925 >> Static415.anInt7579;
		@Pc(15) int local15 = super.anInt9929 >> Static415.anInt7579;
		@Pc(17) int local17 = 0;
		if (local10 == Static623.anInt9563) {
			local17++;
		} else if (Static623.anInt9563 < local10) {
			local17 += 2;
		}
		if (Static507.anInt8547 == local15) {
			local17 += 3;
		} else if (Static507.anInt8547 > local15) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static53.anIntArray123[local17];
		if ((this.aShort102 & local49) != 0) {
			return this.method8317(arg0, local10, local15);
		} else if (this.aShort102 == 1 && local10 > 0) {
			return this.method8317(arg0, local10 - 1, local15);
		} else if (this.aShort102 == 4 && Static347.anInt6411 >= local10) {
			return this.method8317(arg0, local10 + 1, local15);
		} else if (this.aShort102 == 8 && local15 > 0) {
			return this.method8317(arg0, local10, local15 - 1);
		} else if (this.aShort102 == 2 && Static191.anInt6006 >= local15) {
			return this.method8317(arg0, local10, local15 + 1);
		} else if (this.aShort102 == 16 && local10 > 0 && Static191.anInt6006 >= local15) {
			return this.method8317(arg0, local10 - 1, local15 + 1);
		} else if (this.aShort102 == 32 && local10 <= Static347.anInt6411 && Static191.anInt6006 >= local15) {
			return this.method8317(arg0, local10 + 1, local15 + 1);
		} else if (this.aShort102 == 128 && local10 > 0 && local15 > 0) {
			return this.method8317(arg0, local10 - 1, local15 + -1);
		} else if (this.aShort102 == 64 && local10 <= Static347.anInt6411 && local15 > 0) {
			return this.method8317(arg0, local10 + 1, local15 + -1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8302() {
		return Static199.method3503(super.anInt9929 >> Static415.anInt7579, this, super.anInt9925 >> Static415.anInt7579, super.aByte125);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public abstract class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!et", name = "N", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIII)V")
	protected Class3_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort106 = (short) arg5;
		super.anInt9917 = arg2;
		super.anInt9925 = arg0;
		super.anInt9915 = arg1;
		super.aByte142 = (byte) arg4;
		super.aByte141 = (byte) arg3;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8490(@OriginalArg(0) Class33 arg0) {
		return Static141.method2474(super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424, super.aByte142, this);
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8503() {
		return Static537.aBooleanArrayArray32[(super.anInt9925 >> Static273.anInt4424) + Static112.anInt2200 - Static323.anInt5049][Static112.anInt2200 + (super.anInt9917 >> Static273.anInt4424) - Static417.anInt6041];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B[Lclient!kp;)I")
	@Override
	public final int method8498(@OriginalArg(1) Class4_Sub29[] arg0) {
		@Pc(10) int local10 = super.anInt9925 >> Static273.anInt4424;
		@Pc(15) int local15 = super.anInt9917 >> Static273.anInt4424;
		@Pc(17) int local17 = 0;
		if (local10 == Static323.anInt5049) {
			local17++;
		} else if (Static323.anInt5049 < local10) {
			local17 += 2;
		}
		if (local15 == Static417.anInt6041) {
			local17 += 3;
		} else if (Static417.anInt6041 > local15) {
			local17 += 6;
		}
		@Pc(45) int local45 = Static34.anIntArray667[local17];
		if ((this.aShort106 & local45) != 0) {
			return this.method8494(local15, local10, arg0);
		} else if (this.aShort106 == 1 && local10 > 0) {
			return this.method8494(local15, local10 - 1, arg0);
		} else if (this.aShort106 == 4 && local10 <= Static51.anInt1108) {
			return this.method8494(local15, local10 + 1, arg0);
		} else if (this.aShort106 == 8 && local15 > 0) {
			return this.method8494(local15 - 1, local10, arg0);
		} else if (this.aShort106 == 2 && Static245.anInt7888 >= local15) {
			return this.method8494(local15 + 1, local10, arg0);
		} else if (this.aShort106 == 16 && local10 > 0 && local15 <= Static245.anInt7888) {
			return this.method8494(local15 + 1, local10 + -1, arg0);
		} else if (this.aShort106 == 32 && Static51.anInt1108 >= local10 && Static245.anInt7888 >= local15) {
			return this.method8494(local15 + 1, local10 + 1, arg0);
		} else if (this.aShort106 == 128 && local10 > 0 && local15 > 0) {
			return this.method8494(local15 - 1, local10 + -1, arg0);
		} else if (this.aShort106 == 64 && local10 <= Static51.anInt1108 && local15 > 0) {
			return this.method8494(local15 - 1, local10 + 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}
}

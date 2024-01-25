import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public abstract class Class11_Sub1_Sub3 extends Class11_Sub1 {

	@OriginalMember(owner = "client!cu", name = "K", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIII)V")
	protected Class11_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte113 = (byte) arg3;
		super.anInt8906 = arg2;
		super.aByte112 = (byte) arg4;
		super.anInt8902 = arg0;
		super.anInt8908 = arg1;
		this.aShort33 = (short) arg5;
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7221() {
		return Static172.method2766(super.aByte112, super.anInt8902 >> Static166.anInt7796, super.anInt8906 >> Static166.anInt7796, this);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([Lclient!tw;I)I")
	@Override
	public final int method7204(@OriginalArg(0) Class1_Sub24[] arg0) {
		@Pc(10) int local10 = super.anInt8902 >> Static166.anInt7796;
		@Pc(15) int local15 = super.anInt8906 >> Static166.anInt7796;
		@Pc(17) int local17 = 0;
		if (Static115.anInt1985 == local10) {
			local17++;
		} else if (local10 > Static115.anInt1985) {
			local17 += 2;
		}
		if (local15 == Static326.anInt4975) {
			local17 += 3;
		} else if (Static326.anInt4975 > local15) {
			local17 += 6;
		}
		@Pc(53) int local53 = Static245.anIntArray247[local17];
		if ((local53 & this.aShort33) != 0) {
			return this.method7203(local15, arg0, local10);
		} else if (this.aShort33 == 1 && local10 > 0) {
			return this.method7203(local15, arg0, local10 - 1);
		} else if (this.aShort33 == 4 && local10 <= Static327.anInt5993) {
			return this.method7203(local15, arg0, local10 + 1);
		} else if (this.aShort33 == 8 && local15 > 0) {
			return this.method7203(local15 - 1, arg0, local10);
		} else if (this.aShort33 == 2 && Static191.anInt3757 >= local15) {
			return this.method7203(local15 + 1, arg0, local10);
		} else if (this.aShort33 == 16 && local10 > 0 && Static191.anInt3757 >= local15) {
			return this.method7203(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort33 == 32 && local10 <= Static327.anInt5993 && Static191.anInt3757 >= local15) {
			return this.method7203(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort33 == 128 && local10 > 0 && local15 > 0) {
			return this.method7203(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort33 == 64 && Static327.anInt5993 >= local10 && local15 > 0) {
			return this.method7203(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7216() {
		return Static496.aBooleanArrayArray7[Static548.anInt9156 + (super.anInt8902 >> Static166.anInt7796) - Static115.anInt1985][(super.anInt8906 >> Static166.anInt7796) + Static548.anInt9156 - Static326.anInt4975];
	}
}

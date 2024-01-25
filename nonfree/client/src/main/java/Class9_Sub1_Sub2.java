import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public abstract class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!cja", name = "G", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10695 = arg2;
		super.anInt10690 = arg1;
		this.aShort52 = (short) arg5;
		super.aByte140 = (byte) arg4;
		super.aByte139 = (byte) arg3;
		super.anInt10694 = arg0;
	}

	@OriginalMember(owner = "client!cja", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method9079() {
		return Static181.aBooleanArrayArray2[Static720.anInt11190 + (super.anInt10694 >> Static626.anInt9669) - Static507.anInt8070][Static720.anInt11190 + (super.anInt10695 >> Static626.anInt9669) - Static527.anInt8230];
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "([Lclient!jw;I)I")
	@Override
	public final int method9094(@OriginalArg(0) Class3_Sub5[] arg0) {
		@Pc(10) int local10 = super.anInt10694 >> Static626.anInt9669;
		@Pc(15) int local15 = super.anInt10695 >> Static626.anInt9669;
		@Pc(17) int local17 = 0;
		if (local10 == Static507.anInt8070) {
			local17++;
		} else if (Static507.anInt8070 < local10) {
			local17 += 2;
		}
		if (local15 == Static527.anInt8230) {
			local17 += 3;
		} else if (local15 < Static527.anInt8230) {
			local17 += 6;
		}
		@Pc(57) int local57 = Static102.anIntArray122[local17];
		if ((local57 & this.aShort52) != 0) {
			return this.method9096(local10, local15, arg0);
		} else if (this.aShort52 == 1 && local10 > 0) {
			return this.method9096(local10 - 1, local15, arg0);
		} else if (this.aShort52 == 4 && local10 <= Static128.anInt2531) {
			return this.method9096(local10 + 1, local15, arg0);
		} else if (this.aShort52 == 8 && local15 > 0) {
			return this.method9096(local10, local15 - 1, arg0);
		} else if (this.aShort52 == 2 && local15 <= Static448.anInt6835) {
			return this.method9096(local10, local15 + 1, arg0);
		} else if (this.aShort52 == 16 && local10 > 0 && local15 <= Static448.anInt6835) {
			return this.method9096(local10 - 1, local15 + 1, arg0);
		} else if (this.aShort52 == 32 && local10 <= Static128.anInt2531 && local15 <= Static448.anInt6835) {
			return this.method9096(local10 + 1, local15 - -1, arg0);
		} else if (this.aShort52 == 128 && local10 > 0 && local15 > 0) {
			return this.method9096(local10 - 1, local15 + -1, arg0);
		} else if (this.aShort52 == 64 && Static128.anInt2531 >= local10 && local15 > 0) {
			return this.method9096(local10 + 1, local15 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9082(@OriginalArg(0) Class22 arg0) {
		return Static5.method230(super.aByte140, super.anInt10694 >> Static626.anInt9669, this, super.anInt10695 >> Static626.anInt9669);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public abstract class Class8_Sub3_Sub4 extends Class8_Sub3 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIII)V")
	protected Class8_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort116 = (short) arg5;
		super.anInt9370 = arg2;
		super.aByte124 = (byte) arg4;
		super.anInt9365 = arg0;
		super.anInt9361 = arg1;
		super.aByte123 = (byte) arg3;
	}

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method7631() {
		return Static359.method4478(this, super.anInt9370 >> Static351.anInt5832, super.aByte124, super.anInt9365 >> Static351.anInt5832);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[Lclient!rc;)I")
	@Override
	public final int method7616(@OriginalArg(1) Class1_Sub18[] arg0) {
		@Pc(10) int local10 = super.anInt9365 >> Static351.anInt5832;
		@Pc(15) int local15 = super.anInt9370 >> Static351.anInt5832;
		@Pc(17) int local17 = 0;
		if (Static258.anInt4643 == local10) {
			local17++;
		} else if (local10 > Static258.anInt4643) {
			local17 += 2;
		}
		if (local15 == Static312.anInt5339) {
			local17 += 3;
		} else if (local15 < Static312.anInt5339) {
			local17 += 6;
		}
		@Pc(45) int local45 = Static124.anIntArray515[local17];
		if ((local45 & this.aShort116) != 0) {
			return this.method7619(local10, arg0, local15);
		} else if (this.aShort116 == 1 && local10 > 0) {
			return this.method7619(local10 - 1, arg0, local15);
		} else if (this.aShort116 == 4 && Static27.anInt373 >= local10) {
			return this.method7619(local10 + 1, arg0, local15);
		} else if (this.aShort116 == 8 && local15 > 0) {
			return this.method7619(local10, arg0, local15 - 1);
		} else if (this.aShort116 == 2 && Static507.anInt8645 >= local15) {
			return this.method7619(local10, arg0, local15 + 1);
		} else if (this.aShort116 == 16 && local10 > 0 && Static507.anInt8645 >= local15) {
			return this.method7619(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort116 == 32 && local10 <= Static27.anInt373 && local15 <= Static507.anInt8645) {
			return this.method7619(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort116 == 128 && local10 > 0 && local15 > 0) {
			return this.method7619(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort116 == 64 && local10 <= Static27.anInt373 && local15 > 0) {
			return this.method7619(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7624() {
		return Static44.aBooleanArrayArray1[Static240.anInt4447 + (super.anInt9365 >> Static351.anInt5832) - Static258.anInt4643][Static240.anInt4447 + (super.anInt9370 >> Static351.anInt5832) - Static312.anInt5339];
	}
}

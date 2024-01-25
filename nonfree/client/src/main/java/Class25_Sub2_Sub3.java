import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public abstract class Class25_Sub2_Sub3 extends Class25_Sub2 {

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIII)V")
	protected Class25_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt8476 = arg0;
		super.aByte118 = (byte) arg4;
		super.aByte117 = (byte) arg3;
		super.anInt8482 = arg2;
		super.anInt8480 = arg1;
		this.aShort68 = (short) arg5;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B[Lclient!cp;)I")
	@Override
	public final int method6658(@OriginalArg(1) Class3_Sub9[] arg0) {
		@Pc(10) int local10 = super.anInt8476 >> Static385.anInt6657;
		@Pc(15) int local15 = super.anInt8482 >> Static385.anInt6657;
		@Pc(17) int local17 = 0;
		if (Static261.anInt5023 == local10) {
			local17++;
		} else if (local10 > Static261.anInt5023) {
			local17 += 2;
		}
		if (Static216.anInt4499 == local15) {
			local17 += 3;
		} else if (Static216.anInt4499 > local15) {
			local17 += 6;
		}
		@Pc(54) int local54 = Static239.anIntArray224[local17];
		if ((local54 & this.aShort68) != 0) {
			return this.method6649(arg0, local15, local10);
		} else if (this.aShort68 == 1 && local10 > 0) {
			return this.method6649(arg0, local15, local10 - 1);
		} else if (this.aShort68 == 4 && local10 <= Static349.anInt6237) {
			return this.method6649(arg0, local15, local10 + 1);
		} else if (this.aShort68 == 8 && local15 > 0) {
			return this.method6649(arg0, local15 - 1, local10);
		} else if (this.aShort68 == 2 && local15 <= Static414.anInt7451) {
			return this.method6649(arg0, local15 + 1, local10);
		} else if (this.aShort68 == 16 && local10 > 0 && Static414.anInt7451 >= local15) {
			return this.method6649(arg0, local15 + 1, local10 + -1);
		} else if (this.aShort68 == 32 && Static349.anInt6237 >= local10 && Static414.anInt7451 >= local15) {
			return this.method6649(arg0, local15 + 1, local10 + 1);
		} else if (this.aShort68 == 128 && local10 > 0 && local15 > 0) {
			return this.method6649(arg0, local15 - 1, local10 + -1);
		} else if (this.aShort68 == 64 && local10 <= Static349.anInt6237 && local15 > 0) {
			return this.method6649(arg0, local15 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6651() {
		return Static179.method3186(super.aByte118, super.anInt8482 >> Static385.anInt6657, this, super.anInt8476 >> Static385.anInt6657);
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method6646() {
		return Static209.aBooleanArrayArray11[(super.anInt8476 >> Static385.anInt6657) + Static219.anInt4585 - Static261.anInt5023][Static219.anInt4585 + (super.anInt8482 >> Static385.anInt6657) - Static216.anInt4499];
	}
}

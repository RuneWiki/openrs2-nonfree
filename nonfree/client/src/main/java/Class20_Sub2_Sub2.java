import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public abstract class Class20_Sub2_Sub2 extends Class20_Sub2 {

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIII)V")
	protected Class20_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort102 = (short) arg5;
		super.aByte117 = (byte) arg4;
		super.aByte116 = (byte) arg3;
		super.anInt8796 = arg0;
		super.anInt8790 = arg1;
		super.anInt8795 = arg2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([Lclient!qea;B)I")
	@Override
	public final int method7258(@OriginalArg(0) Class1_Sub5[] arg0) {
		@Pc(10) int local10 = super.anInt8796 >> Static378.anInt6665;
		@Pc(15) int local15 = super.anInt8795 >> Static378.anInt6665;
		@Pc(17) int local17 = 0;
		if (Static251.anInt4676 == local10) {
			local17++;
		} else if (local10 > Static251.anInt4676) {
			local17 += 2;
		}
		if (local15 == Static63.anInt1544) {
			local17 += 3;
		} else if (local15 < Static63.anInt1544) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static368.anIntArray439[local17];
		if ((this.aShort102 & local49) != 0) {
			return this.method7266(local10, arg0, local15);
		} else if (this.aShort102 == 1 && local10 > 0) {
			return this.method7266(local10 - 1, arg0, local15);
		} else if (this.aShort102 == 4 && local10 <= Static446.anInt7725) {
			return this.method7266(local10 + 1, arg0, local15);
		} else if (this.aShort102 == 8 && local15 > 0) {
			return this.method7266(local10, arg0, local15 - 1);
		} else if (this.aShort102 == 2 && Static218.anInt4229 >= local15) {
			return this.method7266(local10, arg0, local15 + 1);
		} else if (this.aShort102 == 16 && local10 > 0 && Static218.anInt4229 >= local15) {
			return this.method7266(local10 - 1, arg0, local15 + 1);
		} else if (this.aShort102 == 32 && Static446.anInt7725 >= local10 && Static218.anInt4229 >= local15) {
			return this.method7266(local10 + 1, arg0, local15 + 1);
		} else if (this.aShort102 == 128 && local10 > 0 && local15 > 0) {
			return this.method7266(local10 - 1, arg0, local15 - 1);
		} else if (this.aShort102 == 64 && Static446.anInt7725 >= local10 && local15 > 0) {
			return this.method7266(local10 + 1, arg0, local15 - 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method7259() {
		return Static116.aBooleanArrayArray4[Static246.anInt8757 + (super.anInt8796 >> Static378.anInt6665) - Static251.anInt4676][(super.anInt8795 >> Static378.anInt6665) + Static246.anInt8757 - Static63.anInt1544];
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7252() {
		return Static60.method1381(super.aByte117, super.anInt8796 >> Static378.anInt6665, super.anInt8795 >> Static378.anInt6665, this);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public abstract class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pba", name = "A", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte139 = (byte) arg3;
		this.aShort67 = (short) arg5;
		super.anInt9797 = arg1;
		super.anInt9805 = arg0;
		super.aByte138 = (byte) arg4;
		super.anInt9803 = arg2;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "([Lclient!ih;Z)I")
	@Override
	public final int method8349(@OriginalArg(0) Class5_Sub12[] arg0) {
		@Pc(10) int local10 = super.anInt9805 >> Static314.anInt5377;
		@Pc(15) int local15 = super.anInt9803 >> Static314.anInt5377;
		@Pc(17) int local17 = 0;
		if (local10 == Static220.anInt3838) {
			local17++;
		} else if (local10 > Static220.anInt3838) {
			local17 += 2;
		}
		if (Static377.anInt6335 == local15) {
			local17 += 3;
		} else if (local15 < Static377.anInt6335) {
			local17 += 6;
		}
		@Pc(67) int local67 = Static331.anIntArray326[local17];
		if ((local67 & this.aShort67) != 0) {
			return this.method8346(arg0, local10, local15);
		} else if (this.aShort67 == 1 && local10 > 0) {
			return this.method8346(arg0, local10 - 1, local15);
		} else if (this.aShort67 == 4 && local10 <= Static672.anInt10829) {
			return this.method8346(arg0, local10 + 1, local15);
		} else if (this.aShort67 == 8 && local15 > 0) {
			return this.method8346(arg0, local10, local15 - 1);
		} else if (this.aShort67 == 2 && local15 <= Static532.anInt8517) {
			return this.method8346(arg0, local10, local15 + 1);
		} else if (this.aShort67 == 16 && local10 > 0 && Static532.anInt8517 >= local15) {
			return this.method8346(arg0, local10 - 1, local15 + 1);
		} else if (this.aShort67 == 32 && local10 <= Static672.anInt10829 && Static532.anInt8517 >= local15) {
			return this.method8346(arg0, local10 + 1, local15 + 1);
		} else if (this.aShort67 == 128 && local10 > 0 && local15 > 0) {
			return this.method8346(arg0, local10 - 1, local15 + -1);
		} else if (this.aShort67 == 64 && local10 <= Static672.anInt10829 && local15 > 0) {
			return this.method8346(arg0, local10 + 1, local15 + -1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8352(@OriginalArg(0) int arg0) {
		if (arg0 > -19) {
			Static445.anIntArrayArray43 = null;
		}
		return Static407.aBooleanArrayArray8[(super.anInt9805 >> Static314.anInt5377) + Static553.anInt8738 - Static220.anInt3838][Static553.anInt8738 + (super.anInt9803 >> Static314.anInt5377) - Static377.anInt6335];
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8343(@OriginalArg(1) Class100 arg0) {
		return Static188.method9007(super.anInt9805 >> Static314.anInt5377, super.aByte138, super.anInt9803 >> Static314.anInt5377, this);
	}
}

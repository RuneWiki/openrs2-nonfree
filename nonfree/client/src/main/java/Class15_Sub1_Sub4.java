import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class15_Sub1_Sub4 extends Class15_Sub1 {

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V")
	protected Class15_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort61 = (short) arg5;
		super.anInt10297 = arg1;
		super.anInt10298 = arg2;
		super.aByte124 = (byte) arg3;
		super.anInt10301 = arg0;
		super.aByte125 = (byte) arg4;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B[Lclient!ada;)I")
	@Override
	public final int method8329(@OriginalArg(1) Class8_Sub1[] arg0) {
		@Pc(10) int local10 = super.anInt10301 >> Static172.anInt4156;
		@Pc(15) int local15 = super.anInt10298 >> Static172.anInt4156;
		@Pc(17) int local17 = 0;
		if (local10 == Static603.anInt10257) {
			local17++;
		} else if (local10 > Static603.anInt10257) {
			local17 += 2;
		}
		if (local15 == Static470.anInt8495) {
			local17 += 3;
		} else if (local15 < Static470.anInt8495) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static193.anIntArray247[local17];
		if ((this.aShort61 & local49) != 0) {
			return this.method8330(local15, arg0, local10);
		} else if (this.aShort61 == 1 && local10 > 0) {
			return this.method8330(local15, arg0, local10 - 1);
		} else if (this.aShort61 == 4 && Static489.anInt8688 >= local10) {
			return this.method8330(local15, arg0, local10 + 1);
		} else if (this.aShort61 == 8 && local15 > 0) {
			return this.method8330(local15 - 1, arg0, local10);
		} else if (this.aShort61 == 2 && Static596.anInt10195 >= local15) {
			return this.method8330(local15 + 1, arg0, local10);
		} else if (this.aShort61 == 16 && local10 > 0 && local15 <= Static596.anInt10195) {
			return this.method8330(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort61 == 32 && Static489.anInt8688 >= local10 && local15 <= Static596.anInt10195) {
			return this.method8330(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort61 == 128 && local10 > 0 && local15 > 0) {
			return this.method8330(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort61 == 64 && local10 <= Static489.anInt8688 && local15 > 0) {
			return this.method8330(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8325() {
		return Static100.aBooleanArrayArray3[Static183.anInt4307 + (super.anInt10301 >> Static172.anInt4156) - Static603.anInt10257][(super.anInt10298 >> Static172.anInt4156) + Static183.anInt4307 - Static470.anInt8495];
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8324() {
		return Static435.method6732(this, super.anInt10298 >> Static172.anInt4156, super.anInt10301 >> Static172.anInt4156, super.aByte125);
	}
}

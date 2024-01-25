import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public abstract class Class60_Sub1_Sub3 extends Class60_Sub1 {

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIII)V")
	protected Class60_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9057 = arg2;
		super.anInt9051 = arg1;
		this.aShort115 = (short) arg5;
		super.aByte135 = (byte) arg3;
		super.anInt9048 = arg0;
		super.aByte134 = (byte) arg4;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7912() {
		return Static488.aBooleanArrayArray4[(super.anInt9048 >> Static594.anInt9440) - (Static506.anInt8446 - Static382.anInt6636)][Static382.anInt6636 + (super.anInt9057 >> Static594.anInt9440) - Static676.anInt10368];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method7925(@OriginalArg(0) Class75 arg0) {
		return Static385.method5931(super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440, super.aByte134, this);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[Lclient!ta;)I")
	@Override
	public final int method7923(@OriginalArg(1) Class6_Sub10[] arg0) {
		@Pc(18) int local18 = super.anInt9048 >> Static594.anInt9440;
		@Pc(23) int local23 = super.anInt9057 >> Static594.anInt9440;
		@Pc(25) int local25 = 0;
		if (Static506.anInt8446 == local18) {
			local25++;
		} else if (Static506.anInt8446 < local18) {
			local25 += 2;
		}
		if (local23 == Static676.anInt10368) {
			local25 += 3;
		} else if (local23 < Static676.anInt10368) {
			local25 += 6;
		}
		@Pc(77) int local77 = Static7.anIntArray7[local25];
		if ((local77 & this.aShort115) != 0) {
			return this.method7910(local18, local23, arg0);
		} else if (this.aShort115 == 1 && local18 > 0) {
			return this.method7910(local18 - 1, local23, arg0);
		} else if (this.aShort115 == 4 && Static230.anInt4470 >= local18) {
			return this.method7910(local18 + 1, local23, arg0);
		} else if (this.aShort115 == 8 && local23 > 0) {
			return this.method7910(local18, local23 - 1, arg0);
		} else if (this.aShort115 == 2 && Static63.anInt777 >= local23) {
			return this.method7910(local18, local23 + 1, arg0);
		} else if (this.aShort115 == 16 && local18 > 0 && Static63.anInt777 >= local23) {
			return this.method7910(local18 - 1, local23 + 1, arg0);
		} else if (this.aShort115 == 32 && Static230.anInt4470 >= local18 && local23 <= Static63.anInt777) {
			return this.method7910(local18 + 1, local23 + 1, arg0);
		} else if (this.aShort115 == 128 && local18 > 0 && local23 > 0) {
			return this.method7910(local18 - 1, local23 + -1, arg0);
		} else if (this.aShort115 == 64 && Static230.anInt4470 >= local18 && local23 > 0) {
			return this.method7910(local18 + 1, local23 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}
}

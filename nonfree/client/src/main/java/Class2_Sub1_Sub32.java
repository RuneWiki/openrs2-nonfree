import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
	private int anInt6028 = 1;

	@OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
	private int anInt6035 = 1;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
	private int anInt6029 = 204;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6035 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt6028 = arg1.method5732();
		} else if (arg0 == 2) {
			this.anInt6029 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			for (@Pc(17) int local17 = 0; local17 < Static391.anInt7118; local17++) {
				@Pc(23) int local23 = Static167.anIntArray267[local17];
				@Pc(27) int local27 = Static229.anIntArray382[arg0];
				@Pc(34) int local34 = local23 * this.anInt6035 >> 12;
				@Pc(41) int local41 = local27 * this.anInt6028 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt6035) * this.anInt6035;
				@Pc(61) int local61 = local27 % (4096 / this.anInt6028) * this.anInt6028;
				if (this.anInt6029 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt6029 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt6029 > local51) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}

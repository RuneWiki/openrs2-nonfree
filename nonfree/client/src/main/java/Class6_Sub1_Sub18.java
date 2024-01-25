import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
	private int anInt4771 = 0;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
	private int anInt4775 = 0;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	private int anInt4776 = 20;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
	private int anInt4774 = 1365;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4774 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt4776 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt4771 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt4775 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			for (@Pc(17) int local17 = 0; local17 < Static479.anInt8231; local17++) {
				@Pc(31) int local31 = (Static205.anIntArray199[local17] << 12) / this.anInt4774 + this.anInt4771;
				@Pc(43) int local43 = (Static230.anIntArray222[arg0] << 12) / this.anInt4774 + this.anInt4775;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local63 + local57 < 16384 && this.anInt4776 > local65) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local31 + local57 - local63;
					local65++;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = this.anInt4776 - 1 > local65 ? (local65 << 12) / this.anInt4776 : 0;
			}
		}
		return local11;
	}
}

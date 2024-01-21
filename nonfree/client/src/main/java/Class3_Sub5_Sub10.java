import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class3_Sub5_Sub10 extends Class3_Sub5 {

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	private int anInt1469;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	private int anInt1472;

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	private int anInt1474;

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
	private int anInt1479;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1474 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt1469 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt1472 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt1479 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			for (@Pc(17) int local17 = 0; local17 < Static104.anInt2195; local17++) {
				@Pc(31) int local31 = (Static124.anIntArray355[local17] << 12) / this.anInt1474 + this.anInt1472;
				@Pc(43) int local43 = this.anInt1479 + (Static94.anIntArray277[arg0] << 12) / this.anInt1474;
				@Pc(49) int local49 = local43;
				@Pc(51) int local51 = local31;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && local65 < this.anInt1469) {
					local65++;
					local49 = local43 + (local51 * local49 >> 12) * 2;
					local51 = local57 + local31 - local63;
					local57 = local51 * local51 >> 12;
					local63 = local49 * local49 >> 12;
				}
				local11[local17] = this.anInt1469 - 1 <= local65 ? 0 : (local65 << 12) / this.anInt1469;
			}
		}
		return local11;
	}
}

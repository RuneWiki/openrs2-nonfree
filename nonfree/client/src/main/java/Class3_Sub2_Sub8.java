import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dga", name = "N", descriptor = "I")
	private int anInt2217 = 0;

	@OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
	private int anInt2223 = 20;

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "I")
	private int anInt2220 = 1365;

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
	private int anInt2224 = 0;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			for (@Pc(17) int local17 = 0; local17 < Static636.anInt10302; local17++) {
				@Pc(31) int local31 = this.anInt2224 + (Static508.anIntArray472[local17] << 12) / this.anInt2220;
				@Pc(43) int local43 = (Static123.anIntArray113[arg0] << 12) / this.anInt2220 + this.anInt2217;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && this.anInt2223 > local65) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local31 + local57 - local63;
					local65++;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = this.anInt2223 - 1 > local65 ? (local65 << 12) / this.anInt2223 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt2220 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt2223 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt2224 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt2217 = arg1.method5272();
		}
	}
}

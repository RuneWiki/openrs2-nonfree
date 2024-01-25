import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class2_Sub4_Sub15 extends Class2_Sub4 {

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
	private int anInt2969 = 1365;

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
	private int anInt2973 = 0;

	@OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
	private int anInt2974 = 0;

	@OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
	private int anInt2978 = 20;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2969 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt2978 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt2973 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt2974 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			for (@Pc(29) int local29 = 0; local29 < Static76.anInt1458; local29++) {
				@Pc(43) int local43 = this.anInt2973 + (Static40.anIntArray173[local29] << 12) / this.anInt2969;
				@Pc(55) int local55 = this.anInt2974 + (Static347.anIntArray1193[arg0] << 12) / this.anInt2969;
				@Pc(61) int local61 = local43;
				@Pc(63) int local63 = local55;
				@Pc(69) int local69 = local43 * local43 >> 12;
				@Pc(75) int local75 = local55 * local55 >> 12;
				@Pc(77) int local77 = 0;
				while (local69 + local75 < 16384 && local77 < this.anInt2978) {
					local63 = (local63 * local61 >> 12) * 2 + local55;
					local61 = local69 + local43 - local75;
					local69 = local61 * local61 >> 12;
					local77++;
					local75 = local63 * local63 >> 12;
				}
				local11[local29] = this.anInt2978 - 1 <= local77 ? 0 : (local77 << 12) / this.anInt2978;
			}
		}
		return local11;
	}
}

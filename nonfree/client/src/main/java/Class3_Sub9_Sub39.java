import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class3_Sub9_Sub39 extends Class3_Sub9 {

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
	private int anInt10590 = 585;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10590 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(25) int local25 = Static147.anIntArray259[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static62.anInt1251; local27++) {
				@Pc(33) int local33 = Static239.anIntArray394[local27];
				@Pc(71) int local71;
				if (local33 > this.anInt10590 && local33 < 4096 - this.anInt10590 && local25 > 2048 - this.anInt10590 && this.anInt10590 + 2048 > local25) {
					local71 = 2048 - local33;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt10590;
					local11[local27] = 4096 - local71;
				} else if (2048 - this.anInt10590 < local33 && local33 < this.anInt10590 + 2048) {
					local71 = local25 - 2048;
					local71 = local71 < 0 ? -local71 : local71;
					local71 -= this.anInt10590;
					local71 <<= 0xC;
					local11[local27] = local71 / (2048 - this.anInt10590);
				} else if (this.anInt10590 > local25 || 4096 - this.anInt10590 < local25) {
					local71 = local33 - 2048;
					@Pc(176) int local176 = local71 < 0 ? -local71 : local71;
					@Pc(181) int local181 = local176 - this.anInt10590;
					@Pc(185) int local185 = local181 << 12;
					local11[local27] = local185 / (2048 - this.anInt10590);
				} else if (this.anInt10590 <= local33 && 4096 - this.anInt10590 >= local33) {
					local11[local27] = 0;
				} else {
					local71 = 2048 - local25;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt10590;
					local11[local27] = 4096 - local71;
				}
			}
		}
		return local11;
	}
}

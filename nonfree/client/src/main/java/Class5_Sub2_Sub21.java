import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
	private int anInt6870 = 585;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6870 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(19) int local19 = Static61.anIntArray80[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static314.anInt6320; local21++) {
				@Pc(27) int local27 = Static68.anIntArray94[local21];
				@Pc(56) int local56;
				if (local27 > this.anInt6870 && local27 < 4096 - this.anInt6870 && local19 > 2048 - this.anInt6870 && local19 < this.anInt6870 + 2048) {
					local56 = 2048 - local27;
					local56 = local56 < 0 ? -local56 : local56;
					local56 <<= 0xC;
					local56 /= 2048 - this.anInt6870;
					local11[local21] = 4096 - local56;
				} else if (2048 - this.anInt6870 < local27 && local27 < this.anInt6870 + 2048) {
					local56 = local19 - 2048;
					local56 = local56 >= 0 ? local56 : -local56;
					local56 -= this.anInt6870;
					local56 <<= 0xC;
					local11[local21] = local56 / (2048 - this.anInt6870);
				} else if (this.anInt6870 > local19 || local19 > 4096 - this.anInt6870) {
					local56 = local27 - 2048;
					@Pc(163) int local163 = local56 < 0 ? -local56 : local56;
					@Pc(168) int local168 = local163 - this.anInt6870;
					@Pc(172) int local172 = local168 << 12;
					local11[local21] = local172 / (2048 - this.anInt6870);
				} else if (local27 >= this.anInt6870 && local27 <= 4096 - this.anInt6870) {
					local11[local21] = 0;
				} else {
					local56 = 2048 - local19;
					local56 = local56 >= 0 ? local56 : -local56;
					local56 <<= 0xC;
					local56 /= 2048 - this.anInt6870;
					local11[local21] = 4096 - local56;
				}
			}
		}
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class2_Sub15_Sub39 extends Class2_Sub15 {

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
	private int anInt11363 = 585;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(19) int local19 = Static401.anIntArray357[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static329.anInt6017; local21++) {
				@Pc(27) int local27 = Static537.anIntArray480[local21];
				@Pc(55) int local55;
				if (this.anInt11363 < local27 && local27 < 4096 - this.anInt11363 && 2048 - this.anInt11363 < local19 && this.anInt11363 + 2048 > local19) {
					local55 = 2048 - local27;
					local55 = local55 >= 0 ? local55 : -local55;
					local55 <<= 0xC;
					local55 /= 2048 - this.anInt11363;
					local11[local21] = 4096 - local55;
				} else if (2048 - this.anInt11363 < local27 && local27 < this.anInt11363 + 2048) {
					local55 = local19 - 2048;
					local55 = local55 >= 0 ? local55 : -local55;
					local55 -= this.anInt11363;
					local55 <<= 0xC;
					local11[local21] = local55 / (2048 - this.anInt11363);
				} else if (this.anInt11363 > local19 || local19 > 4096 - this.anInt11363) {
					local55 = local27 - 2048;
					@Pc(156) int local156 = local55 < 0 ? -local55 : local55;
					@Pc(161) int local161 = local156 - this.anInt11363;
					@Pc(165) int local165 = local161 << 12;
					local11[local21] = local165 / (2048 - this.anInt11363);
				} else if (this.anInt11363 <= local27 && local27 <= 4096 - this.anInt11363) {
					local11[local21] = 0;
				} else {
					local55 = 2048 - local19;
					local55 = local55 < 0 ? -local55 : local55;
					local55 <<= 0xC;
					local55 /= 2048 - this.anInt11363;
					local11[local21] = 4096 - local55;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt11363 = arg1.method5211();
		}
	}
}

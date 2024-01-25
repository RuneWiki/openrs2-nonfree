import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class5_Sub2_Sub39 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
	private int anInt6603 = 585;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6603 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(19) int local19 = Static287.anIntArray413[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static15.anInt493; local21++) {
				@Pc(27) int local27 = Static257.anIntArray386[local21];
				@Pc(59) int local59;
				if (local27 > this.anInt6603 && 4096 - this.anInt6603 > local27 && 2048 - this.anInt6603 < local19 && local19 < this.anInt6603 + 2048) {
					local59 = 2048 - local27;
					local59 = local59 < 0 ? -local59 : local59;
					local59 <<= 0xC;
					local59 /= 2048 - this.anInt6603;
					local11[local21] = 4096 - local59;
				} else if (local27 > 2048 - this.anInt6603 && local27 < this.anInt6603 + 2048) {
					local59 = local19 - 2048;
					local59 = local59 < 0 ? -local59 : local59;
					local59 -= this.anInt6603;
					local59 <<= 0xC;
					local11[local21] = local59 / (2048 - this.anInt6603);
				} else if (local19 < this.anInt6603 || 4096 - this.anInt6603 < local19) {
					local59 = local27 - 2048;
					@Pc(163) int local163 = local59 < 0 ? -local59 : local59;
					@Pc(168) int local168 = local163 - this.anInt6603;
					@Pc(172) int local172 = local168 << 12;
					local11[local21] = local172 / (2048 - this.anInt6603);
				} else if (local27 >= this.anInt6603 && 4096 - this.anInt6603 >= local27) {
					local11[local21] = 0;
				} else {
					local59 = 2048 - local19;
					local59 = local59 >= 0 ? local59 : -local59;
					local59 <<= 0xC;
					local59 /= 2048 - this.anInt6603;
					local11[local21] = 4096 - local59;
				}
			}
		}
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class2_Sub4_Sub37 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
	private int anInt10048 = 585;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10048 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(27) int local27 = Static415.anIntArray482[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static395.anInt6816; local29++) {
				@Pc(35) int local35 = Static20.anIntArray40[local29];
				@Pc(76) int local76;
				if (local35 > this.anInt10048 && 4096 - this.anInt10048 > local35 && 2048 - this.anInt10048 < local27 && this.anInt10048 + 2048 > local27) {
					local76 = 2048 - local35;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt10048;
					local19[local29] = 4096 - local76;
				} else if (local35 > 2048 - this.anInt10048 && this.anInt10048 + 2048 > local35) {
					local76 = local27 - 2048;
					local76 = local76 < 0 ? -local76 : local76;
					local76 -= this.anInt10048;
					local76 <<= 0xC;
					local19[local29] = local76 / (2048 - this.anInt10048);
				} else if (local27 < this.anInt10048 || 4096 - this.anInt10048 < local27) {
					local76 = local35 - 2048;
					@Pc(175) int local175 = local76 >= 0 ? local76 : -local76;
					@Pc(180) int local180 = local175 - this.anInt10048;
					@Pc(184) int local184 = local180 << 12;
					local19[local29] = local184 / (2048 - this.anInt10048);
				} else if (this.anInt10048 <= local35 && local35 <= 4096 - this.anInt10048) {
					local19[local29] = 0;
				} else {
					local76 = 2048 - local27;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt10048;
					local19[local29] = 4096 - local76;
				}
			}
		}
		return local19;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class2_Sub3_Sub20 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
	private int anInt7522 = 585;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(24) int local24 = Static547.anIntArray641[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static222.anInt4971; local26++) {
				@Pc(32) int local32 = Static464.anIntArray556[local26];
				@Pc(76) int local76;
				if (local32 > this.anInt7522 && local32 < 4096 - this.anInt7522 && 2048 - this.anInt7522 < local24 && this.anInt7522 + 2048 > local24) {
					local76 = 2048 - local32;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt7522;
					local11[local26] = 4096 - local76;
				} else if (local32 > 2048 - this.anInt7522 && local32 < this.anInt7522 + 2048) {
					local76 = local24 - 2048;
					local76 = local76 < 0 ? -local76 : local76;
					local76 -= this.anInt7522;
					local76 <<= 0xC;
					local11[local26] = local76 / (2048 - this.anInt7522);
				} else if (this.anInt7522 > local24 || local24 > 4096 - this.anInt7522) {
					local76 = local32 - 2048;
					@Pc(176) int local176 = local76 >= 0 ? local76 : -local76;
					@Pc(181) int local181 = local176 - this.anInt7522;
					@Pc(185) int local185 = local181 << 12;
					local11[local26] = local185 / (2048 - this.anInt7522);
				} else if (local32 >= this.anInt7522 && local32 <= 4096 - this.anInt7522) {
					local11[local26] = 0;
				} else {
					local76 = 2048 - local24;
					local76 = local76 < 0 ? -local76 : local76;
					local76 <<= 0xC;
					local76 /= 2048 - this.anInt7522;
					local11[local26] = 4096 - local76;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7522 = arg0.method8326();
		}
	}
}

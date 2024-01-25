import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class6_Sub1_Sub17 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
	private int anInt6166 = 585;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(24) int local24 = Static603.anIntArray549[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static53.anInt1787; local26++) {
				@Pc(32) int local32 = Static12.anIntArray15[local26];
				@Pc(68) int local68;
				if (this.anInt6166 < local32 && local32 < 4096 - this.anInt6166 && 2048 - this.anInt6166 < local24 && this.anInt6166 + 2048 > local24) {
					local68 = 2048 - local32;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt6166;
					local11[local26] = 4096 - local68;
				} else if (local32 > 2048 - this.anInt6166 && local32 < this.anInt6166 + 2048) {
					local68 = local24 - 2048;
					local68 = local68 < 0 ? -local68 : local68;
					local68 -= this.anInt6166;
					local68 <<= 0xC;
					local11[local26] = local68 / (2048 - this.anInt6166);
				} else if (local24 < this.anInt6166 || local24 > 4096 - this.anInt6166) {
					local68 = local32 - 2048;
					@Pc(173) int local173 = local68 < 0 ? -local68 : local68;
					@Pc(178) int local178 = local173 - this.anInt6166;
					@Pc(182) int local182 = local178 << 12;
					local11[local26] = local182 / (2048 - this.anInt6166);
				} else if (local32 >= this.anInt6166 && 4096 - this.anInt6166 >= local32) {
					local11[local26] = 0;
				} else {
					local68 = 2048 - local24;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt6166;
					local11[local26] = 4096 - local68;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6166 = arg1.method8220();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class5_Sub2_Sub27 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
	private int anInt8168 = 585;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(24) int local24 = Static493.anIntArray476[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static597.anInt10025; local26++) {
				@Pc(32) int local32 = Static352.anIntArray331[local26];
				@Pc(72) int local72;
				if (local32 > this.anInt8168 && 4096 - this.anInt8168 > local32 && local24 > 2048 - this.anInt8168 && this.anInt8168 + 2048 > local24) {
					local72 = 2048 - local32;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt8168;
					local11[local26] = 4096 - local72;
				} else if (2048 - this.anInt8168 < local32 && local32 < this.anInt8168 + 2048) {
					local72 = local24 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt8168;
					local72 <<= 0xC;
					local11[local26] = local72 / (2048 - this.anInt8168);
				} else if (this.anInt8168 > local24 || 4096 - this.anInt8168 < local24) {
					local72 = local32 - 2048;
					@Pc(185) int local185 = local72 >= 0 ? local72 : -local72;
					@Pc(190) int local190 = local185 - this.anInt8168;
					@Pc(194) int local194 = local190 << 12;
					local11[local26] = local194 / (2048 - this.anInt8168);
				} else if (local32 >= this.anInt8168 && 4096 - this.anInt8168 >= local32) {
					local11[local26] = 0;
				} else {
					local72 = 2048 - local24;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt8168;
					local11[local26] = 4096 - local72;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8168 = arg0.method5968();
		}
	}
}

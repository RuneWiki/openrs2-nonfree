import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
	private int anInt3686 = 585;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3686 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(24) int local24 = Static369.anIntArray377[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static195.anInt3759; local26++) {
				@Pc(32) int local32 = Static554.anIntArray510[local26];
				@Pc(62) int local62;
				if (this.anInt3686 < local32 && 4096 - this.anInt3686 > local32 && 2048 - this.anInt3686 < local24 && local24 < this.anInt3686 + 2048) {
					local62 = 2048 - local32;
					local62 = local62 >= 0 ? local62 : -local62;
					local62 <<= 0xC;
					local62 /= 2048 - this.anInt3686;
					local16[local26] = 4096 - local62;
				} else if (local32 > 2048 - this.anInt3686 && this.anInt3686 + 2048 > local32) {
					local62 = local24 - 2048;
					local62 = local62 >= 0 ? local62 : -local62;
					local62 -= this.anInt3686;
					local62 <<= 0xC;
					local16[local26] = local62 / (2048 - this.anInt3686);
				} else if (local24 < this.anInt3686 || 4096 - this.anInt3686 < local24) {
					local62 = local32 - 2048;
					@Pc(168) int local168 = local62 < 0 ? -local62 : local62;
					@Pc(173) int local173 = local168 - this.anInt3686;
					@Pc(177) int local177 = local173 << 12;
					local16[local26] = local177 / (2048 - this.anInt3686);
				} else if (local32 >= this.anInt3686 && 4096 - this.anInt3686 >= local32) {
					local16[local26] = 0;
				} else {
					local62 = 2048 - local24;
					local62 = local62 < 0 ? -local62 : local62;
					local62 <<= 0xC;
					local62 /= 2048 - this.anInt3686;
					local16[local26] = 4096 - local62;
				}
			}
		}
		return local16;
	}
}

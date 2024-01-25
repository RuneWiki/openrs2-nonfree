import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	private int anInt154 = 585;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(24) int local24 = Static201.anIntArray251[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static30.anInt908; local26++) {
				@Pc(32) int local32 = Static26.anIntArray20[local26];
				@Pc(61) int local61;
				if (local32 > this.anInt154 && 4096 - this.anInt154 > local32 && 2048 - this.anInt154 < local24 && local24 < this.anInt154 + 2048) {
					local61 = 2048 - local32;
					local61 = local61 < 0 ? -local61 : local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt154;
					local16[local26] = 4096 - local61;
				} else if (2048 - this.anInt154 < local32 && local32 < this.anInt154 + 2048) {
					local61 = local24 - 2048;
					local61 = local61 < 0 ? -local61 : local61;
					local61 -= this.anInt154;
					local61 <<= 0xC;
					local16[local26] = local61 / (2048 - this.anInt154);
				} else if (local24 < this.anInt154 || local24 > 4096 - this.anInt154) {
					local61 = local32 - 2048;
					@Pc(168) int local168 = local61 < 0 ? -local61 : local61;
					@Pc(173) int local173 = local168 - this.anInt154;
					@Pc(177) int local177 = local173 << 12;
					local16[local26] = local177 / (2048 - this.anInt154);
				} else if (local32 >= this.anInt154 && 4096 - this.anInt154 >= local32) {
					local16[local26] = 0;
				} else {
					local61 = 2048 - local24;
					local61 = local61 >= 0 ? local61 : -local61;
					local61 <<= 0xC;
					local61 /= 2048 - this.anInt154;
					local16[local26] = 4096 - local61;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt154 = arg0.method4858();
		}
	}
}

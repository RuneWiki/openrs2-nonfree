import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
	private int anInt5523 = 585;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(24) int local24 = Static258.anIntArray335[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static218.anInt3990; local26++) {
				@Pc(32) int local32 = Static434.anIntArray495[local26];
				@Pc(65) int local65;
				if (this.anInt5523 < local32 && 4096 - this.anInt5523 > local32 && 2048 - this.anInt5523 < local24 && local24 < this.anInt5523 + 2048) {
					local65 = 2048 - local32;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt5523;
					local16[local26] = 4096 - local65;
				} else if (2048 - this.anInt5523 < local32 && local32 < this.anInt5523 + 2048) {
					local65 = local24 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt5523;
					local65 <<= 0xC;
					local16[local26] = local65 / (2048 - this.anInt5523);
				} else if (local24 < this.anInt5523 || 4096 - this.anInt5523 < local24) {
					local65 = local32 - 2048;
					@Pc(173) int local173 = local65 < 0 ? -local65 : local65;
					@Pc(178) int local178 = local173 - this.anInt5523;
					@Pc(182) int local182 = local178 << 12;
					local16[local26] = local182 / (2048 - this.anInt5523);
				} else if (this.anInt5523 <= local32 && local32 <= 4096 - this.anInt5523) {
					local16[local26] = 0;
				} else {
					local65 = 2048 - local24;
					local65 = local65 < 0 ? -local65 : local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt5523;
					local16[local26] = 4096 - local65;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5523 = arg0.method2896();
		}
	}
}

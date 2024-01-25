import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class6_Sub1_Sub19 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
	private int anInt6040 = 585;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt6040 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(24) int local24 = Static346.anIntArray472[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static289.anInt5549; local26++) {
				@Pc(32) int local32 = Static473.anIntArray730[local26];
				@Pc(71) int local71;
				if (local32 > this.anInt6040 && local32 < 4096 - this.anInt6040 && 2048 - this.anInt6040 < local24 && this.anInt6040 + 2048 > local24) {
					local71 = 2048 - local32;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt6040;
					local16[local26] = 4096 - local71;
				} else if (local32 > 2048 - this.anInt6040 && local32 < this.anInt6040 + 2048) {
					local71 = local24 - 2048;
					local71 = local71 < 0 ? -local71 : local71;
					local71 -= this.anInt6040;
					local71 <<= 0xC;
					local16[local26] = local71 / (2048 - this.anInt6040);
				} else if (local24 < this.anInt6040 || 4096 - this.anInt6040 < local24) {
					local71 = local32 - 2048;
					@Pc(173) int local173 = local71 >= 0 ? local71 : -local71;
					@Pc(178) int local178 = local173 - this.anInt6040;
					@Pc(182) int local182 = local178 << 12;
					local16[local26] = local182 / (2048 - this.anInt6040);
				} else if (this.anInt6040 <= local32 && 4096 - this.anInt6040 >= local32) {
					local16[local26] = 0;
				} else {
					local71 = 2048 - local24;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt6040;
					local16[local26] = 4096 - local71;
				}
			}
		}
		return local16;
	}
}

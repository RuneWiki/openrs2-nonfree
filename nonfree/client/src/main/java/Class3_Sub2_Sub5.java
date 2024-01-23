import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt602 = 585;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt602 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(29) int local29 = Static205.anIntArray450[arg0];
			for (@Pc(31) int local31 = 0; local31 < Static22.anInt421; local31++) {
				@Pc(38) int local38 = Static185.anIntArray424[local31];
				@Pc(71) int local71;
				if (local38 > this.anInt602 && 4096 - this.anInt602 > local38 && local29 > 2048 - this.anInt602 && this.anInt602 + 2048 > local29) {
					local71 = 2048 - local38;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt602;
					local20[local31] = 4096 - local71;
				} else if (2048 - this.anInt602 < local38 && this.anInt602 + 2048 > local38) {
					local71 = local29 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt602;
					local71 <<= 0xC;
					local20[local31] = local71 / (2048 - this.anInt602);
				} else if (local29 < this.anInt602 || 4096 - this.anInt602 < local29) {
					local71 = local38 - 2048;
					@Pc(177) int local177 = local71 >= 0 ? local71 : -local71;
					@Pc(182) int local182 = local177 - this.anInt602;
					@Pc(186) int local186 = local182 << 12;
					local20[local31] = local186 / (2048 - this.anInt602);
				} else if (this.anInt602 <= local38 && 4096 - this.anInt602 >= local38) {
					local20[local31] = 0;
				} else {
					local71 = 2048 - local29;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt602;
					local20[local31] = 4096 - local71;
				}
			}
		}
		return local20;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(24) int local24 = Static86.anIntArray218[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static149.anInt3233; local26++) {
				@Pc(32) int local32 = Static154.anIntArray354[local26];
				@Pc(69) int local69;
				if (local32 > this.anInt1750 && 4096 - this.anInt1750 > local32 && 2048 - this.anInt1750 < local24 && this.anInt1750 + 2048 > local24) {
					local69 = 2048 - local32;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt1750;
					local11[local26] = 4096 - local69;
				} else if (local32 > 2048 - this.anInt1750 && this.anInt1750 + 2048 > local32) {
					local69 = local24 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt1750;
					local69 <<= 0xC;
					local11[local26] = local69 / (2048 - this.anInt1750);
				} else if (local24 < this.anInt1750 || local24 > 4096 - this.anInt1750) {
					local69 = local32 - 2048;
					@Pc(177) int local177 = local69 >= 0 ? local69 : -local69;
					@Pc(182) int local182 = local177 - this.anInt1750;
					@Pc(186) int local186 = local182 << 12;
					local11[local26] = local186 / (2048 - this.anInt1750);
				} else if (local32 >= this.anInt1750 && local32 <= 4096 - this.anInt1750) {
					local11[local26] = 0;
				} else {
					local69 = 2048 - local24;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt1750;
					local11[local26] = 4096 - local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1750 = arg1.method1456();
		}
	}
}

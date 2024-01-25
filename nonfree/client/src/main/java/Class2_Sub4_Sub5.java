import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub4_Sub5 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	private int anInt590 = 585;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt590 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(24) int local24 = Static347.anIntArray1193[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static76.anInt1458; local26++) {
				@Pc(32) int local32 = Static40.anIntArray173[local26];
				@Pc(74) int local74;
				if (this.anInt590 < local32 && 4096 - this.anInt590 > local32 && local24 > 2048 - this.anInt590 && this.anInt590 + 2048 > local24) {
					local74 = 2048 - local32;
					local74 = local74 >= 0 ? local74 : -local74;
					local74 <<= 0xC;
					local74 /= 2048 - this.anInt590;
					local11[local26] = 4096 - local74;
				} else if (2048 - this.anInt590 < local32 && local32 < this.anInt590 + 2048) {
					local74 = local24 - 2048;
					local74 = local74 >= 0 ? local74 : -local74;
					local74 -= this.anInt590;
					local74 <<= 0xC;
					local11[local26] = local74 / (2048 - this.anInt590);
				} else if (this.anInt590 > local24 || 4096 - this.anInt590 < local24) {
					local74 = local32 - 2048;
					@Pc(184) int local184 = local74 < 0 ? -local74 : local74;
					@Pc(189) int local189 = local184 - this.anInt590;
					@Pc(193) int local193 = local189 << 12;
					local11[local26] = local193 / (2048 - this.anInt590);
				} else if (local32 >= this.anInt590 && 4096 - this.anInt590 >= local32) {
					local11[local26] = 0;
				} else {
					local74 = 2048 - local24;
					local74 = local74 < 0 ? -local74 : local74;
					local74 <<= 0xC;
					local74 /= 2048 - this.anInt590;
					local11[local26] = 4096 - local74;
				}
			}
		}
		return local11;
	}
}

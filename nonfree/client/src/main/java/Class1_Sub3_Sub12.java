import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
	private int anInt1156 = 585;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1156 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(24) int local24 = Static23.anIntArray47[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static76.anInt1531; local26++) {
				@Pc(32) int local32 = Static106.anIntArray202[local26];
				@Pc(66) int local66;
				if (local32 > this.anInt1156 && local32 < 4096 - this.anInt1156 && local24 > 2048 - this.anInt1156 && local24 < this.anInt1156 + 2048) {
					local66 = 2048 - local32;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt1156;
					local16[local26] = 4096 - local66;
				} else if (2048 - this.anInt1156 < local32 && this.anInt1156 + 2048 > local32) {
					local66 = local24 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt1156;
					local66 <<= 0xC;
					local16[local26] = local66 / (2048 - this.anInt1156);
				} else if (this.anInt1156 > local24 || local24 > 4096 - this.anInt1156) {
					local66 = local32 - 2048;
					@Pc(160) int local160 = local66 < 0 ? -local66 : local66;
					@Pc(165) int local165 = local160 - this.anInt1156;
					@Pc(169) int local169 = local165 << 12;
					local16[local26] = local169 / (2048 - this.anInt1156);
				} else if (local32 >= this.anInt1156 && local32 <= 4096 - this.anInt1156) {
					local16[local26] = 0;
				} else {
					local66 = 2048 - local24;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt1156;
					local16[local26] = 4096 - local66;
				}
			}
		}
		return local16;
	}
}

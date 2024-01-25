import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
	private int anInt7893 = 585;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(24) int local24 = Static9.anIntArray15[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static206.anInt4182; local26++) {
				@Pc(32) int local32 = Static329.anIntArray456[local26];
				@Pc(60) int local60;
				if (this.anInt7893 < local32 && local32 < 4096 - this.anInt7893 && local24 > 2048 - this.anInt7893 && this.anInt7893 + 2048 > local24) {
					local60 = 2048 - local32;
					local60 = local60 < 0 ? -local60 : local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7893;
					local11[local26] = 4096 - local60;
				} else if (2048 - this.anInt7893 < local32 && local32 < this.anInt7893 + 2048) {
					local60 = local24 - 2048;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 -= this.anInt7893;
					local60 <<= 0xC;
					local11[local26] = local60 / (2048 - this.anInt7893);
				} else if (local24 < this.anInt7893 || 4096 - this.anInt7893 < local24) {
					local60 = local32 - 2048;
					@Pc(169) int local169 = local60 < 0 ? -local60 : local60;
					@Pc(174) int local174 = local169 - this.anInt7893;
					@Pc(178) int local178 = local174 << 12;
					local11[local26] = local178 / (2048 - this.anInt7893);
				} else if (local32 >= this.anInt7893 && 4096 - this.anInt7893 >= local32) {
					local11[local26] = 0;
				} else {
					local60 = 2048 - local24;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7893;
					local11[local26] = 4096 - local60;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7893 = arg0.method3109();
		}
	}
}

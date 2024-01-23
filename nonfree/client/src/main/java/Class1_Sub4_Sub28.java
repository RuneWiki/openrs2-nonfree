import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub4_Sub28 extends Class1_Sub4 {

	@OriginalMember(owner = "client!of", name = "H", descriptor = "I")
	private int anInt3900 = 585;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(26) int local26 = Static250.anIntArray398[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static182.anInt3492; local28++) {
				@Pc(35) int local35 = Static279.anIntArray454[local28];
				@Pc(70) int local70;
				if (this.anInt3900 < local35 && local35 < 4096 - this.anInt3900 && 2048 - this.anInt3900 < local26 && local26 < this.anInt3900 + 2048) {
					local70 = 2048 - local35;
					local70 = local70 >= 0 ? local70 : -local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt3900;
					local13[local28] = 4096 - local70;
				} else if (local35 > 2048 - this.anInt3900 && this.anInt3900 + 2048 > local35) {
					local70 = local26 - 2048;
					local70 = local70 < 0 ? -local70 : local70;
					local70 -= this.anInt3900;
					local70 <<= 0xC;
					local13[local28] = local70 / (2048 - this.anInt3900);
				} else if (this.anInt3900 > local26 || local26 > 4096 - this.anInt3900) {
					local70 = local35 - 2048;
					@Pc(184) int local184 = local70 >= 0 ? local70 : -local70;
					@Pc(189) int local189 = local184 - this.anInt3900;
					@Pc(193) int local193 = local189 << 12;
					local13[local28] = local193 / (2048 - this.anInt3900);
				} else if (this.anInt3900 <= local35 && 4096 - this.anInt3900 >= local35) {
					local13[local28] = 0;
				} else {
					local70 = 2048 - local26;
					local70 = local70 < 0 ? -local70 : local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt3900;
					local13[local28] = 4096 - local70;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3900 = arg0.method1386();
		}
	}
}

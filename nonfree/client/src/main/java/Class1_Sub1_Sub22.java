import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
	private int anInt3189 = 585;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(26) int local26 = Static10.anIntArray604[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static6.anInt4960; local28++) {
				@Pc(35) int local35 = Static298.anIntArray589[local28];
				@Pc(73) int local73;
				if (local35 > this.anInt3189 && 4096 - this.anInt3189 > local35 && local26 > 2048 - this.anInt3189 && this.anInt3189 + 2048 > local26) {
					local73 = 2048 - local35;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt3189;
					local18[local28] = 4096 - local73;
				} else if (local35 > 2048 - this.anInt3189 && this.anInt3189 + 2048 > local35) {
					local73 = local26 - 2048;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 -= this.anInt3189;
					local73 <<= 0xC;
					local18[local28] = local73 / (2048 - this.anInt3189);
				} else if (this.anInt3189 > local26 || local26 > 4096 - this.anInt3189) {
					local73 = local35 - 2048;
					@Pc(187) int local187 = local73 < 0 ? -local73 : local73;
					@Pc(192) int local192 = local187 - this.anInt3189;
					@Pc(196) int local196 = local192 << 12;
					local18[local28] = local196 / (2048 - this.anInt3189);
				} else if (this.anInt3189 <= local35 && 4096 - this.anInt3189 >= local35) {
					local18[local28] = 0;
				} else {
					local73 = 2048 - local26;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt3189;
					local18[local28] = 4096 - local73;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3189 = arg0.method1879();
		}
	}
}

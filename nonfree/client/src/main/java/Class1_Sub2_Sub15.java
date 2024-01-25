import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	private int anInt2084 = 585;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(25) int local25 = Static394.anIntArray751[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static158.anInt2658; local27++) {
				@Pc(33) int local33 = Static87.anIntArray211[local27];
				@Pc(74) int local74;
				if (local33 > this.anInt2084 && local33 < 4096 - this.anInt2084 && local25 > 2048 - this.anInt2084 && local25 < this.anInt2084 + 2048) {
					local74 = 2048 - local33;
					local74 = local74 < 0 ? -local74 : local74;
					local74 <<= 0xC;
					local74 /= 2048 - this.anInt2084;
					local17[local27] = 4096 - local74;
				} else if (2048 - this.anInt2084 < local33 && local33 < this.anInt2084 + 2048) {
					local74 = local25 - 2048;
					local74 = local74 < 0 ? -local74 : local74;
					local74 -= this.anInt2084;
					local74 <<= 0xC;
					local17[local27] = local74 / (2048 - this.anInt2084);
				} else if (local25 < this.anInt2084 || local25 > 4096 - this.anInt2084) {
					local74 = local33 - 2048;
					@Pc(184) int local184 = local74 < 0 ? -local74 : local74;
					@Pc(189) int local189 = local184 - this.anInt2084;
					@Pc(193) int local193 = local189 << 12;
					local17[local27] = local193 / (2048 - this.anInt2084);
				} else if (local33 >= this.anInt2084 && local33 <= 4096 - this.anInt2084) {
					local17[local27] = 0;
				} else {
					local74 = 2048 - local25;
					local74 = local74 >= 0 ? local74 : -local74;
					local74 <<= 0xC;
					local74 /= 2048 - this.anInt2084;
					local17[local27] = 4096 - local74;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2084 = arg1.method5177();
		}
	}
}

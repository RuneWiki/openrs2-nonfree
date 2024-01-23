import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
	private int anInt3553 = 585;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3553 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(24) int local24 = Static94.anIntArray321[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static110.anInt2934; local26++) {
				@Pc(32) int local32 = Static175.anIntArray302[local26];
				@Pc(73) int local73;
				if (this.anInt3553 < local32 && local32 < 4096 - this.anInt3553 && 2048 - this.anInt3553 < local24 && this.anInt3553 + 2048 > local24) {
					local73 = 2048 - local32;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt3553;
					local11[local26] = 4096 - local73;
				} else if (2048 - this.anInt3553 < local32 && this.anInt3553 + 2048 > local32) {
					local73 = local24 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt3553;
					local73 <<= 0xC;
					local11[local26] = local73 / (2048 - this.anInt3553);
				} else if (this.anInt3553 > local24 || local24 > 4096 - this.anInt3553) {
					local73 = local32 - 2048;
					@Pc(178) int local178 = local73 >= 0 ? local73 : -local73;
					@Pc(183) int local183 = local178 - this.anInt3553;
					@Pc(187) int local187 = local183 << 12;
					local11[local26] = local187 / (2048 - this.anInt3553);
				} else if (this.anInt3553 <= local32 && local32 <= 4096 - this.anInt3553) {
					local11[local26] = 0;
				} else {
					local73 = 2048 - local24;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt3553;
					local11[local26] = 4096 - local73;
				}
			}
		}
		return local11;
	}
}

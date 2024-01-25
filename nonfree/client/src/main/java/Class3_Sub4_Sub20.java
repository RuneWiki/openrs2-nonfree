import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class3_Sub4_Sub20 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	private int anInt3843 = 585;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(24) int local24 = Static317.anIntArray337[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static148.anInt2687; local26++) {
				@Pc(32) int local32 = Static401.anIntArray419[local26];
				@Pc(69) int local69;
				if (this.anInt3843 < local32 && 4096 - this.anInt3843 > local32 && 2048 - this.anInt3843 < local24 && local24 < this.anInt3843 + 2048) {
					local69 = 2048 - local32;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt3843;
					local11[local26] = 4096 - local69;
				} else if (local32 > 2048 - this.anInt3843 && this.anInt3843 + 2048 > local32) {
					local69 = local24 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt3843;
					local69 <<= 0xC;
					local11[local26] = local69 / (2048 - this.anInt3843);
				} else if (local24 < this.anInt3843 || 4096 - this.anInt3843 < local24) {
					local69 = local32 - 2048;
					@Pc(179) int local179 = local69 >= 0 ? local69 : -local69;
					@Pc(184) int local184 = local179 - this.anInt3843;
					@Pc(188) int local188 = local184 << 12;
					local11[local26] = local188 / (2048 - this.anInt3843);
				} else if (this.anInt3843 <= local32 && 4096 - this.anInt3843 >= local32) {
					local11[local26] = 0;
				} else {
					local69 = 2048 - local24;
					local69 = local69 < 0 ? -local69 : local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt3843;
					local11[local26] = 4096 - local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3843 = arg0.method4083();
		}
	}
}

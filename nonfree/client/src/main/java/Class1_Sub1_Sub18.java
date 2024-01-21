import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
	private int anInt2378 = 585;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(24) int local24 = Static22.anIntArray68[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static176.anInt3921; local26++) {
				@Pc(32) int local32 = Static171.anIntArray439[local26];
				@Pc(68) int local68;
				if (this.anInt2378 < local32 && 4096 - this.anInt2378 > local32 && 2048 - this.anInt2378 < local24 && local24 < this.anInt2378 + 2048) {
					local68 = 2048 - local32;
					local68 = local68 >= 0 ? local68 : -local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt2378;
					local16[local26] = 4096 - local68;
				} else if (2048 - this.anInt2378 < local32 && this.anInt2378 + 2048 > local32) {
					local68 = local24 - 2048;
					local68 = local68 < 0 ? -local68 : local68;
					local68 -= this.anInt2378;
					local68 <<= 0xC;
					local16[local26] = local68 / (2048 - this.anInt2378);
				} else if (this.anInt2378 > local24 || local24 > 4096 - this.anInt2378) {
					local68 = local32 - 2048;
					@Pc(180) int local180 = local68 < 0 ? -local68 : local68;
					@Pc(185) int local185 = local180 - this.anInt2378;
					@Pc(189) int local189 = local185 << 12;
					local16[local26] = local189 / (2048 - this.anInt2378);
				} else if (local32 >= this.anInt2378 && local32 <= 4096 - this.anInt2378) {
					local16[local26] = 0;
				} else {
					local68 = 2048 - local24;
					local68 = local68 < 0 ? -local68 : local68;
					local68 <<= 0xC;
					local68 /= 2048 - this.anInt2378;
					local16[local26] = 4096 - local68;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2378 = arg1.method1753();
		}
	}
}

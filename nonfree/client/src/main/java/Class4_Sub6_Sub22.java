import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class4_Sub6_Sub22 extends Class4_Sub6 {

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	private int anInt3536 = 2000;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	private int anInt3537 = 0;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
	private int anInt3540 = 0;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	private int anInt3535 = 4096;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
	private int anInt3538 = 16;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3537 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt3536 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt3538 = arg0.method1874();
		} else if (arg1 == 3) {
			this.anInt3540 = arg0.method1837();
		} else if (arg1 == 4) {
			this.anInt3535 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		Static197.method3082();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(16) int local16 = this.anInt3535 >> 1;
			@Pc(21) int[][] local21 = this.aClass156_41.method3755();
			@Pc(28) Random local28 = new Random((long) this.anInt3537);
			for (@Pc(30) int local30 = 0; local30 < this.anInt3536; local30++) {
				@Pc(55) int local55 = this.anInt3535 <= 0 ? this.anInt3540 : this.anInt3540 + Static241.method3695(this.anInt3535, local28) - local16;
				@Pc(61) int local61 = local55 >> 4 & 0xFF;
				@Pc(66) int local66 = Static241.method3695(Static2.anInt19, local28);
				@Pc(71) int local71 = Static241.method3695(Static16.anInt308, local28);
				@Pc(82) int local82 = local66 + (Static79.anIntArray165[local61] * this.anInt3538 >> 12);
				@Pc(93) int local93 = local71 + (this.anInt3538 * Static53.anIntArray123[local61] >> 12);
				@Pc(98) int local98 = local93 - local71;
				@Pc(102) int local102 = local82 - local66;
				if (local102 != 0 || local98 != 0) {
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local98 < 0) {
						local98 = -local98;
					}
					@Pc(133) boolean local133 = local102 < local98;
					@Pc(138) int local138;
					@Pc(142) int local142;
					if (local133) {
						local138 = local66;
						local66 = local71;
						local142 = local82;
						local71 = local138;
						local82 = local93;
						local93 = local142;
					}
					if (local82 < local66) {
						local138 = local66;
						local66 = local82;
						local82 = local138;
						local142 = local71;
						local71 = local93;
						local93 = local142;
					}
					local142 = local82 - local66;
					local138 = local71;
					@Pc(180) int local180 = local93 - local71;
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(192) int local192 = -local142 / 2;
					@Pc(196) int local196 = 2048 / local142;
					@Pc(205) int local205 = 1024 - (Static241.method3695(4096, local28) >> 2);
					@Pc(216) int local216 = local93 > local71 ? 1 : -1;
					for (@Pc(218) int local218 = local66; local218 < local82; local218++) {
						local192 += local180;
						@Pc(237) int local237 = local205 + (local218 + -local66) * local196 + 1024;
						@Pc(241) int local241 = Static168.anInt3337 & local218;
						@Pc(245) int local245 = local138 & Static137.anInt2812;
						if (local133) {
							local21[local245][local241] = local237;
						} else {
							local21[local241][local245] = local237;
						}
						if (local192 > 0) {
							local138 -= -local216;
							local192 += -local142;
						}
					}
				}
			}
		}
		return local7;
	}
}

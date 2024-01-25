import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class7_Sub4_Sub29 extends Class7_Sub4 {

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
	private int anInt5036 = 4096;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
	private int anInt5039 = 0;

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
	private int anInt5037 = 16;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
	private int anInt5038 = 0;

	@OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
	private int anInt5043 = 2000;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5039 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt5043 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt5037 = arg0.method2772();
		} else if (arg1 == 3) {
			this.anInt5038 = arg0.method2764();
		} else if (arg1 == 4) {
			this.anInt5036 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		Static14.method201();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(28) int local28 = this.anInt5036 >> 1;
			@Pc(33) int[][] local33 = super.aClass219_41.method5704();
			@Pc(40) Random local40 = new Random((long) this.anInt5039);
			for (@Pc(42) int local42 = 0; local42 < this.anInt5043; local42++) {
				@Pc(62) int local62 = this.anInt5036 <= 0 ? this.anInt5038 : this.anInt5038 + Static350.method5618(this.anInt5036, local40) - local28;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static350.method5618(Static201.anInt4174, local40);
				@Pc(78) int local78 = Static350.method5618(Static216.anInt4322, local40);
				@Pc(89) int local89 = local73 + (Static279.anIntArray848[local68] * this.anInt5037 >> 12);
				@Pc(101) int local101 = local78 + (this.anInt5037 * Static268.anIntArray680[local68] >> 12);
				@Pc(106) int local106 = local101 - local78;
				@Pc(111) int local111 = local89 - local73;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(144) boolean local144 = local106 > local111;
					@Pc(148) int local148;
					@Pc(150) int local150;
					if (local144) {
						local148 = local73;
						local150 = local89;
						local73 = local78;
						local89 = local101;
						local78 = local148;
						local101 = local150;
					}
					if (local73 > local89) {
						local148 = local73;
						local150 = local78;
						local73 = local89;
						local78 = local101;
						local89 = local148;
						local101 = local150;
					}
					local148 = local78;
					local150 = local89 - local73;
					@Pc(188) int local188 = local101 - local78;
					@Pc(193) int local193 = -local150 / 2;
					@Pc(197) int local197 = 2048 / local150;
					@Pc(207) int local207 = 1024 - (Static350.method5618(4096, local40) >> 2);
					if (local188 < 0) {
						local188 = -local188;
					}
					@Pc(219) int local219 = local101 <= local78 ? -1 : 1;
					for (@Pc(221) int local221 = local73; local221 < local89; local221++) {
						@Pc(235) int local235 = local207 + (local221 - local73) * local197 + 1024;
						@Pc(239) int local239 = Static110.anInt2508 & local221;
						@Pc(243) int local243 = local148 & Static153.anInt3263;
						local193 += local188;
						if (local144) {
							local33[local243][local239] = local235;
						} else {
							local33[local239][local243] = local235;
						}
						if (local193 > 0) {
							local148 += local219;
							local193 += -local150;
						}
					}
				}
			}
		}
		return local19;
	}
}

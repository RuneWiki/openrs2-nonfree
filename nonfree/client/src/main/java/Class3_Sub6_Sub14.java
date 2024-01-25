import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class3_Sub6_Sub14 extends Class3_Sub6 {

	@OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
	private int anInt3401 = 0;

	@OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
	private int anInt3402 = 4096;

	@OriginalMember(owner = "client!gfa", name = "G", descriptor = "I")
	private int anInt3405 = 2000;

	@OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
	private int anInt3409 = 16;

	@OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
	private int anInt3403 = 0;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(26) int local26 = this.anInt3402 >> 1;
			@Pc(31) int[][] local31 = super.aClass213_41.method4805();
			@Pc(38) Random local38 = new Random((long) this.anInt3401);
			for (@Pc(40) int local40 = 0; local40 < this.anInt3405; local40++) {
				@Pc(63) int local63 = this.anInt3402 > 0 ? this.anInt3403 + Static164.method2981(local38, this.anInt3402) - local26 : this.anInt3403;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static164.method2981(local38, Static521.anInt8383);
				@Pc(79) int local79 = Static164.method2981(local38, Static522.anInt8394);
				@Pc(90) int local90 = local74 + (Static411.anIntArray438[local69] * this.anInt3409 >> 12);
				@Pc(101) int local101 = (Static52.anIntArray41[local69] * this.anInt3409 >> 12) + local79;
				@Pc(106) int local106 = local101 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(145) boolean local145 = local106 > local111;
					@Pc(149) int local149;
					@Pc(153) int local153;
					if (local145) {
						local149 = local74;
						local74 = local79;
						local153 = local90;
						local79 = local149;
						local90 = local101;
						local101 = local153;
					}
					if (local74 > local90) {
						local149 = local74;
						local74 = local90;
						local153 = local79;
						local79 = local101;
						local90 = local149;
						local101 = local153;
					}
					local149 = local79;
					local153 = local90 - local74;
					@Pc(190) int local190 = local101 - local79;
					@Pc(195) int local195 = -local153 / 2;
					@Pc(199) int local199 = 2048 / local153;
					@Pc(209) int local209 = 1024 - (Static164.method2981(local38, 4096) >> 2);
					@Pc(220) int local220 = local79 >= local101 ? -1 : 1;
					if (local190 < 0) {
						local190 = -local190;
					}
					for (@Pc(230) int local230 = local74; local230 < local90; local230++) {
						@Pc(242) int local242 = (local230 - local74) * local199 + local209 + 1024;
						@Pc(246) int local246 = Static296.anInt5049 & local230;
						@Pc(250) int local250 = Static68.anInt1579 & local149;
						if (local145) {
							local31[local250][local246] = local242;
						} else {
							local31[local246][local250] = local242;
						}
						local195 += local190;
						if (local195 > 0) {
							local195 -= local153;
							local149 += local220;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3401 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt3405 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt3409 = arg0.method5175();
		} else if (arg1 == 3) {
			this.anInt3403 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt3402 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		Static195.method3275();
	}
}

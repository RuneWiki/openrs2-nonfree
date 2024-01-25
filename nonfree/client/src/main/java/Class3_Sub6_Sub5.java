import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class3_Sub6_Sub5 extends Class3_Sub6 {

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
	private int anInt2238 = 2000;

	@OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
	private int anInt2245 = 16;

	@OriginalMember(owner = "client!daa", name = "X", descriptor = "I")
	private int anInt2247 = 0;

	@OriginalMember(owner = "client!daa", name = "W", descriptor = "I")
	private int anInt2246 = 0;

	@OriginalMember(owner = "client!daa", name = "U", descriptor = "I")
	private int anInt2244 = 4096;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(25) int local25 = this.anInt2244 >> 1;
			@Pc(30) int[][] local30 = super.aClass170_41.method4101();
			@Pc(37) Random local37 = new Random((long) this.anInt2246);
			for (@Pc(39) int local39 = 0; local39 < this.anInt2238; local39++) {
				@Pc(58) int local58 = this.anInt2244 <= 0 ? this.anInt2247 : this.anInt2247 + Static120.method2330(local37, this.anInt2244) - local25;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static120.method2330(local37, Static481.anInt8358);
				@Pc(74) int local74 = Static120.method2330(local37, Static465.anInt8091);
				@Pc(85) int local85 = (this.anInt2245 * Static392.anIntArray389[local64] >> 12) + local69;
				@Pc(96) int local96 = local74 + (this.anInt2245 * Static372.anIntArray362[local64] >> 12);
				@Pc(100) int local100 = local96 - local74;
				@Pc(105) int local105 = local85 - local69;
				if (local105 != 0 || local100 != 0) {
					if (local100 < 0) {
						local100 = -local100;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(136) boolean local136 = local105 < local100;
					@Pc(140) int local140;
					@Pc(144) int local144;
					if (local136) {
						local140 = local69;
						local69 = local74;
						local144 = local85;
						local74 = local140;
						local85 = local96;
						local96 = local144;
					}
					if (local69 > local85) {
						local140 = local69;
						local69 = local85;
						local144 = local74;
						local74 = local96;
						local85 = local140;
						local96 = local144;
					}
					local140 = local74;
					local144 = local85 - local69;
					@Pc(175) int local175 = local96 - local74;
					@Pc(180) int local180 = -local144 / 2;
					@Pc(184) int local184 = 2048 / local144;
					@Pc(194) int local194 = 1024 - (Static120.method2330(local37, 4096) >> 2);
					@Pc(205) int local205 = local96 > local74 ? 1 : -1;
					if (local175 < 0) {
						local175 = -local175;
					}
					for (@Pc(215) int local215 = local69; local215 < local85; local215++) {
						@Pc(227) int local227 = local184 * (local215 - local69) + local194 + 1024;
						@Pc(231) int local231 = local215 & Static325.anInt5932;
						@Pc(235) int local235 = Static527.anInt10285 & local140;
						if (local136) {
							local30[local235][local231] = local227;
						} else {
							local30[local231][local235] = local227;
						}
						local180 += local175;
						if (local180 > 0) {
							local140 += local205;
							local180 -= local144;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2246 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt2238 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt2245 = arg0.method6814();
		} else if (arg1 == 3) {
			this.anInt2247 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt2244 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		Static578.method7854();
	}
}

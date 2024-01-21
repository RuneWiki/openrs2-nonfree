import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
	private int anInt3321 = 0;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
	private int anInt3323 = 16;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	private int anInt3328 = 4096;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	private int anInt3327 = 0;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
	private int anInt3330 = 2000;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		Static110.method1653();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(24) int local24 = this.anInt3328 >> 1;
			@Pc(29) int[][] local29 = super.aClass43_41.method1182();
			@Pc(36) Random local36 = new Random((long) this.anInt3321);
			for (@Pc(38) int local38 = 0; local38 < this.anInt3330; local38++) {
				@Pc(58) int local58 = this.anInt3328 > 0 ? this.anInt3327 + Static192.method3141(this.anInt3328, local36) - local24 : this.anInt3327;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static192.method3141(Static107.anInt2321, local36);
				@Pc(74) int local74 = Static192.method3141(Static123.anInt2607, local36);
				@Pc(85) int local85 = local74 + (this.anInt3323 * Static22.anIntArray48[local64] >> 12);
				@Pc(89) int local89 = local85 - local74;
				@Pc(100) int local100 = local69 + (this.anInt3323 * Static7.anIntArray17[local64] >> 12);
				@Pc(105) int local105 = local100 - local69;
				if (local105 != 0 || local89 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local89 < 0) {
						local89 = -local89;
					}
					@Pc(132) boolean local132 = local89 > local105;
					@Pc(140) int local140;
					@Pc(136) int local136;
					if (local132) {
						local136 = local100;
						local100 = local85;
						local140 = local69;
						local69 = local74;
						local85 = local136;
						local74 = local140;
					}
					if (local69 > local100) {
						local136 = local74;
						local74 = local85;
						local140 = local69;
						local85 = local136;
						local69 = local100;
						local100 = local140;
					}
					local140 = local74;
					local136 = local100 - local69;
					@Pc(177) int local177 = local85 - local74;
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(187) int local187 = -local136 / 2;
					@Pc(191) int local191 = 2048 / local136;
					@Pc(201) int local201 = 1024 - (Static192.method3141(4096, local36) >> 2);
					@Pc(208) int local208 = local85 > local74 ? 1 : -1;
					for (@Pc(210) int local210 = local69; local210 < local100; local210++) {
						@Pc(223) int local223 = local201 + (-local69 + local210) * local191 + 1024;
						@Pc(227) int local227 = Static144.anInt2893 & local210;
						local187 += local177;
						@Pc(235) int local235 = Static15.anInt388 & local140;
						if (local132) {
							local29[local235][local227] = local223;
						} else {
							local29[local227][local235] = local223;
						}
						if (local187 > 0) {
							local187 += -local136;
							local140 += local208;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3321 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt3330 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt3323 = arg0.method3010();
		} else if (arg1 == 3) {
			this.anInt3327 = arg0.method3023();
		} else if (arg1 == 4) {
			this.anInt3328 = arg0.method3023();
		}
	}
}

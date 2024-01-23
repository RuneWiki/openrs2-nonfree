import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
	private int anInt3443 = 0;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
	private int anInt3447 = 2000;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	private int anInt3448 = 0;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
	private int anInt3449 = 16;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
	private int anInt3452 = 4096;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		Static19.method365();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int local27 = this.anInt3452 >> 1;
			@Pc(32) int[][] local32 = this.aClass122_41.method3153();
			@Pc(39) Random local39 = new Random((long) this.anInt3443);
			for (@Pc(41) int local41 = 0; local41 < this.anInt3447; local41++) {
				@Pc(63) int local63 = this.anInt3452 <= 0 ? this.anInt3448 : this.anInt3448 + Static186.method3095(local39, this.anInt3452) - local27;
				@Pc(68) int local68 = Static186.method3095(local39, Static227.anInt4511);
				@Pc(74) int local74 = local63 >> 4 & 0xFF;
				@Pc(79) int local79 = Static186.method3095(local39, Static26.anInt632);
				@Pc(90) int local90 = (this.anInt3449 * Static112.anIntArray231[local74] >> 12) + local79;
				@Pc(95) int local95 = local90 - local79;
				@Pc(106) int local106 = (this.anInt3449 * Static281.anIntArray463[local74] >> 12) + local68;
				@Pc(111) int local111 = local106 - local68;
				if (local111 != 0 || local95 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local95 < 0) {
						local95 = -local95;
					}
					@Pc(138) boolean local138 = local95 > local111;
					@Pc(143) int local143;
					@Pc(149) int local149;
					if (local138) {
						local143 = local68;
						local68 = local79;
						local79 = local143;
						local149 = local106;
						local106 = local90;
						local90 = local149;
					}
					if (local68 > local106) {
						local143 = local68;
						local149 = local79;
						local68 = local106;
						local79 = local90;
						local106 = local143;
						local90 = local149;
					}
					local143 = local79;
					local149 = local106 - local68;
					@Pc(180) int local180 = local90 - local79;
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(190) int local190 = -local149 / 2;
					@Pc(194) int local194 = 2048 / local149;
					@Pc(204) int local204 = 1024 - (Static186.method3095(local39, 4096) >> 2);
					@Pc(211) int local211 = local90 > local79 ? 1 : -1;
					for (@Pc(213) int local213 = local68; local213 < local106; local213++) {
						@Pc(231) int local231 = (local213 - local68) * local194 + local204 + 1024;
						local190 += local180;
						@Pc(239) int local239 = local213 & Static229.anInt4527;
						@Pc(243) int local243 = local143 & Static202.anInt4099;
						if (local190 > 0) {
							local190 += -local149;
							local143 += local211;
						}
						if (local138) {
							local32[local243][local239] = local231;
						} else {
							local32[local239][local243] = local231;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3443 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt3447 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt3449 = arg0.method2690();
		} else if (arg1 == 3) {
			this.anInt3448 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt3452 = arg0.method2691();
		}
	}
}

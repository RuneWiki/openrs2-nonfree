import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public abstract class Class129 {

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	private int anInt5968 = 0;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
	protected int anInt5971 = 4;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
	private int anInt5965 = 4;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "[S")
	private final short[] aShortArray105 = new short[512];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	private int anInt5964 = 4;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	private int anInt5966 = 4;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIII)V")
	protected Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5964 = arg3;
		this.anInt5965 = arg2;
		this.anInt5971 = arg1;
		this.anInt5966 = arg4;
		this.anInt5968 = arg0;
		this.method5192();
		this.method5186();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	private void method5186() {
		@Pc(12) Random local12 = new Random((long) this.anInt5968);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray105[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static367.method5542(local41, local12);
			@Pc(51) short local51 = this.aShortArray105[local46];
			this.aShortArray105[local46] = this.aShortArray105[local41];
			this.aShortArray105[local41] = this.aShortArray105[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	protected abstract void method5187();

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI)V")
	protected final void method5190() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local40[local58] = (local58 << 12) / 16;
		}
		this.method5193();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt5971; local93++) {
						@Pc(102) int local102 = this.aShortArray104[local93] << 12;
						@Pc(110) int local110 = local102 * local40[local81] >> 12;
						@Pc(117) int local117 = local102 * this.anInt5965 >> 12;
						@Pc(125) int local125 = local14[local89] * local102 >> 12;
						@Pc(132) int local132 = this.anInt5964 * local102 >> 12;
						@Pc(140) int local140 = local17[local85] * local102 >> 12;
						@Pc(147) int local147 = local102 * this.anInt5966 >> 12;
						@Pc(152) int local152 = local110 * this.anInt5966;
						@Pc(157) int local157 = local125 * this.anInt5965;
						@Pc(162) int local162 = local140 * this.anInt5964;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local162 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local152 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local157 & 0xFFF;
						if (local170 >= local117) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						local110 = local152 & 0xFFF;
						local186 &= 0xFF;
						if (local147 > local194) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						if (local132 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local140 = local162 & 0xFFF;
						@Pc(255) int local255 = local140 - 4096;
						@Pc(259) int local259 = Class2_Sub29.anIntArray556[local110];
						@Pc(264) short local264 = this.aShortArray105[local186];
						@Pc(268) int local268 = Class2_Sub29.anIntArray556[local140];
						@Pc(272) int local272 = Class2_Sub29.anIntArray556[local198];
						@Pc(277) short local277 = this.aShortArray105[local194];
						@Pc(281) int local281 = local198 - 4096;
						@Pc(285) int local285 = local110 - 4096;
						@Pc(292) short local292 = this.aShortArray105[local264 + local182];
						@Pc(299) short local299 = this.aShortArray105[local264 + local190];
						@Pc(306) short local306 = this.aShortArray105[local277 + local182];
						@Pc(313) short local313 = this.aShortArray105[local277 + local190];
						@Pc(325) int local325 = Static179.method2926(local110, local198, local140, this.aShortArray105[local299 + local174]);
						@Pc(337) int local337 = Static179.method2926(local110, local281, local140, this.aShortArray105[local170 + local299]);
						@Pc(348) int local348 = local325 + (local272 * (local337 - local325) >> 12);
						@Pc(360) int local360 = Static179.method2926(local110, local198, local255, this.aShortArray105[local292 + local174]);
						@Pc(372) int local372 = Static179.method2926(local110, local281, local255, this.aShortArray105[local170 + local292]);
						@Pc(382) int local382 = (local272 * (local372 - local360) >> 12) + local360;
						@Pc(394) int local394 = Static179.method2926(local285, local198, local140, this.aShortArray105[local313 + local174]);
						@Pc(405) int local405 = local348 + ((local382 - local348) * local268 >> 12);
						@Pc(418) int local418 = Static179.method2926(local285, local281, local140, this.aShortArray105[local170 + local313]);
						@Pc(430) int local430 = local394 + ((local418 - local394) * local272 >> 12);
						@Pc(442) int local442 = Static179.method2926(local285, local198, local255, this.aShortArray105[local306 + local174]);
						@Pc(454) int local454 = Static179.method2926(local285, local281, local255, this.aShortArray105[local306 + local170]);
						@Pc(466) int local466 = local442 + ((local454 - local442) * local272 >> 12);
						@Pc(477) int local477 = (local268 * (local466 - local430) >> 12) + local430;
						this.method5191(((local477 - local405) * local259 >> 12) + local405, local93);
					}
					this.method5187();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	protected abstract void method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	private void method5192() {
		this.aShortArray104 = new short[this.anInt5971];
		for (@Pc(20) int local20 = 0; local20 < this.anInt5971; local20++) {
			this.aShortArray104[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	protected abstract void method5193();
}

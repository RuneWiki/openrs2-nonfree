import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub3_Sub34 extends Class2_Sub3 {

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	private int anInt10398 = 4096;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	private int anInt10401 = 16;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	private int anInt10402 = 0;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	private int anInt10396 = 2000;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "I")
	private int anInt10400 = 0;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		Static508.method7815();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10400 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt10396 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt10401 = arg0.method8383();
		} else if (arg1 == 3) {
			this.anInt10402 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt10398 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(26) int local26 = this.anInt10398 >> 1;
			@Pc(31) int[][] local31 = super.aClass281_41.method7183();
			@Pc(38) Random local38 = new Random((long) this.anInt10400);
			for (@Pc(40) int local40 = 0; local40 < this.anInt10396; local40++) {
				@Pc(63) int local63 = this.anInt10398 > 0 ? this.anInt10402 + Static42.method1597(this.anInt10398, local38) - local26 : this.anInt10402;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static42.method1597(Static222.anInt4971, local38);
				@Pc(79) int local79 = Static42.method1597(Static101.anInt2845, local38);
				@Pc(91) int local91 = local74 + (this.anInt10401 * Static375.anIntArray163[local69] >> 12);
				@Pc(102) int local102 = (Static56.anIntArray79[local69] * this.anInt10401 >> 12) + local79;
				@Pc(107) int local107 = local102 - local79;
				@Pc(112) int local112 = local91 - local74;
				if (local112 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(139) boolean local139 = local112 < local107;
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local139) {
						local143 = local74;
						local145 = local91;
						local74 = local79;
						local79 = local143;
						local91 = local102;
						local102 = local145;
					}
					if (local74 > local91) {
						local143 = local74;
						local74 = local91;
						local145 = local79;
						local91 = local143;
						local79 = local102;
						local102 = local145;
					}
					local143 = local79;
					local145 = local91 - local74;
					@Pc(184) int local184 = local102 - local79;
					@Pc(189) int local189 = -local145 / 2;
					@Pc(193) int local193 = 2048 / local145;
					@Pc(202) int local202 = 1024 - (Static42.method1597(4096, local38) >> 2);
					if (local184 < 0) {
						local184 = -local184;
					}
					@Pc(218) int local218 = local79 >= local102 ? -1 : 1;
					for (@Pc(220) int local220 = local74; local220 < local91; local220++) {
						@Pc(232) int local232 = (local220 - local74) * local193 + local202 + 1024;
						@Pc(236) int local236 = Static620.anInt10845 & local220;
						@Pc(240) int local240 = local143 & Static591.anInt6375;
						if (local139) {
							local31[local240][local236] = local232;
						} else {
							local31[local236][local240] = local232;
						}
						local189 += local184;
						if (local189 > 0) {
							local143 -= -local218;
							local189 += -local145;
						}
					}
				}
			}
		}
		return local17;
	}
}

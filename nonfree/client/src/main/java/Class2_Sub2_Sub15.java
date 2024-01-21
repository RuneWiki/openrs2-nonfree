import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
	private int anInt2466 = 2000;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	private int anInt2472 = 16;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	private int anInt2469 = 0;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
	private int anInt2474 = 0;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
	private int anInt2476 = 4096;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2474 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt2466 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt2472 = arg1.method218();
		} else if (arg0 == 3) {
			this.anInt2469 = arg1.method234();
		} else if (arg0 == 4) {
			this.anInt2476 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(25) int local25 = this.anInt2476 >> 1;
			@Pc(30) int[][] local30 = super.aClass57_41.method2572();
			@Pc(37) Random local37 = new Random((long) this.anInt2474);
			for (@Pc(39) int local39 = 0; local39 < this.anInt2466; local39++) {
				@Pc(62) int local62 = this.anInt2476 > 0 ? this.anInt2469 + Static183.method3421(local37, this.anInt2476) - local25 : this.anInt2469;
				@Pc(67) int local67 = Static183.method3421(local37, Static106.anInt3045);
				@Pc(73) int local73 = local62 >> 4 & 0xFF;
				@Pc(78) int local78 = Static183.method3421(local37, Static57.anInt1795);
				@Pc(89) int local89 = local78 + (this.anInt2472 * Static155.anIntArray438[local73] >> 12);
				@Pc(100) int local100 = local67 + (Static122.anIntArray389[local73] * this.anInt2472 >> 12);
				@Pc(105) int local105 = local100 - local67;
				@Pc(110) int local110 = local89 - local78;
				if (local105 != 0 || local110 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(141) boolean local141 = local105 < local110;
					@Pc(147) int local147;
					@Pc(145) int local145;
					if (local141) {
						local145 = local100;
						local147 = local67;
						local100 = local89;
						local67 = local78;
						local89 = local145;
						local78 = local147;
					}
					if (local100 < local67) {
						local147 = local67;
						local67 = local100;
						local145 = local78;
						local100 = local147;
						local78 = local89;
						local89 = local145;
					}
					local147 = local78;
					local145 = local100 - local67;
					@Pc(185) int local185 = local89 - local78;
					@Pc(189) int local189 = 2048 / local145;
					@Pc(194) int local194 = -local145 / 2;
					if (local185 < 0) {
						local185 = -local185;
					}
					@Pc(209) int local209 = local89 > local78 ? 1 : -1;
					@Pc(218) int local218 = 1024 - (Static183.method3421(local37, 4096) >> 2);
					for (@Pc(220) int local220 = local67; local220 < local100; local220++) {
						local194 += local185;
						@Pc(238) int local238 = local218 + local189 * (-local67 + local220) + 1024;
						@Pc(242) int local242 = local220 & Static96.anInt3099;
						@Pc(246) int local246 = Static53.anInt1668 & local147;
						if (local194 > 0) {
							local147 += local209;
							local194 += -local145;
						}
						if (local141) {
							local30[local246][local242] = local238;
						} else {
							local30[local242][local246] = local238;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		Static53.method1249();
	}
}

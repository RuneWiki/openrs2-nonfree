import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class6_Sub1_Sub19 extends Class6_Sub1 {

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
	private int anInt6581 = 0;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
	private int anInt6575 = 0;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
	private int anInt6577 = 16;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
	private int anInt6584 = 4096;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
	private int anInt6579 = 2000;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6575 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt6579 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt6577 = arg1.method8246();
		} else if (arg0 == 3) {
			this.anInt6581 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt6584 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(20) int local20 = this.anInt6584 >> 1;
			@Pc(25) int[][] local25 = super.aClass24_41.method789();
			@Pc(32) Random local32 = new Random((long) this.anInt6575);
			for (@Pc(34) int local34 = 0; local34 < this.anInt6579; local34++) {
				@Pc(54) int local54 = this.anInt6584 <= 0 ? this.anInt6581 : this.anInt6581 + Static123.method2611(this.anInt6584, local32) - local20;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static123.method2611(Static53.anInt1787, local32);
				@Pc(72) int local72 = Static123.method2611(Static123.anInt3099, local32);
				@Pc(83) int local83 = (this.anInt6577 * Static420.anIntArray408[local60] >> 12) + local65;
				@Pc(94) int local94 = local72 + (Static227.anIntArray214[local60] * this.anInt6577 >> 12);
				@Pc(99) int local99 = local94 - local72;
				@Pc(104) int local104 = local83 - local65;
				if (local104 != 0 || local99 != 0) {
					if (local99 < 0) {
						local99 = -local99;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(131) boolean local131 = local104 < local99;
					@Pc(135) int local135;
					@Pc(139) int local139;
					if (local131) {
						local135 = local65;
						local65 = local72;
						local139 = local83;
						local83 = local94;
						local72 = local135;
						local94 = local139;
					}
					if (local65 > local83) {
						local135 = local65;
						local139 = local72;
						local65 = local83;
						local72 = local94;
						local83 = local135;
						local94 = local139;
					}
					local135 = local72;
					local139 = local83 - local65;
					@Pc(171) int local171 = local94 - local72;
					@Pc(176) int local176 = -local139 / 2;
					@Pc(180) int local180 = 2048 / local139;
					@Pc(190) int local190 = 1024 - (Static123.method2611(4096, local32) >> 2);
					if (local171 < 0) {
						local171 = -local171;
					}
					@Pc(205) int local205 = local94 > local72 ? 1 : -1;
					for (@Pc(207) int local207 = local65; local207 < local83; local207++) {
						@Pc(219) int local219 = (local207 - local65) * local180 + local190 + 1024;
						@Pc(223) int local223 = Static564.anInt9697 & local207;
						@Pc(227) int local227 = local135 & Static117.anInt3013;
						local176 += local171;
						if (local131) {
							local25[local227][local223] = local219;
						} else {
							local25[local223][local227] = local219;
						}
						if (local176 > 0) {
							local135 -= -local205;
							local176 += -local139;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		Static621.method8513();
	}
}

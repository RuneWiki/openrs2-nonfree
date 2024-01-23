import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	private int anInt2450 = 16;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	private int anInt2455 = 0;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt2456 = 2000;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
	private int anInt2457 = 0;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	private int anInt2460 = 4096;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2457 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt2456 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt2450 = arg0.method1378();
		} else if (arg1 == 3) {
			this.anInt2455 = arg0.method1386();
		} else if (arg1 == 4) {
			this.anInt2460 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(26) int local26 = this.anInt2460 >> 1;
			@Pc(31) int[][] local31 = this.aClass7_41.method112();
			@Pc(38) Random local38 = new Random((long) this.anInt2457);
			for (@Pc(40) int local40 = 0; local40 < this.anInt2456; local40++) {
				@Pc(67) int local67 = this.anInt2460 <= 0 ? this.anInt2455 : this.anInt2455 + Static151.method2554(this.anInt2460, local38) - local26;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(78) int local78 = Static151.method2554(Static182.anInt3492, local38);
				@Pc(83) int local83 = Static151.method2554(Static117.anInt2472, local38);
				@Pc(94) int local94 = (this.anInt2450 * Static21.anIntArray21[local73] >> 12) + local83;
				@Pc(105) int local105 = local78 + (this.anInt2450 * Static107.anIntArray193[local73] >> 12);
				@Pc(110) int local110 = local94 - local83;
				@Pc(115) int local115 = local105 - local78;
				if (local115 != 0 || local110 != 0) {
					if (local115 < 0) {
						local115 = -local115;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(145) boolean local145 = local115 < local110;
					@Pc(149) int local149;
					@Pc(153) int local153;
					if (local145) {
						local149 = local78;
						local78 = local83;
						local153 = local105;
						local105 = local94;
						local83 = local149;
						local94 = local153;
					}
					if (local105 < local78) {
						local149 = local78;
						local153 = local83;
						local83 = local94;
						local94 = local153;
						local78 = local105;
						local105 = local149;
					}
					local149 = local83;
					local153 = local105 - local78;
					@Pc(190) int local190 = local94 - local83;
					@Pc(195) int local195 = -local153 / 2;
					@Pc(205) int local205 = 1024 - (Static151.method2554(4096, local38) >> 2);
					if (local190 < 0) {
						local190 = -local190;
					}
					@Pc(216) int local216 = 2048 / local153;
					@Pc(227) int local227 = local94 <= local83 ? -1 : 1;
					for (@Pc(229) int local229 = local78; local229 < local105; local229++) {
						local195 += local190;
						@Pc(244) int local244 = Static61.anInt1166 & local229;
						@Pc(248) int local248 = local149 & Static171.anInt3359;
						if (local195 > 0) {
							local195 -= local153;
							local149 += local227;
						}
						@Pc(272) int local272 = local216 * (local229 - local78) + local205 + 1024;
						if (local145) {
							local31[local248][local244] = local272;
						} else {
							local31[local244][local248] = local272;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		Static17.method243();
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class2_Sub4_Sub23 extends Class2_Sub4 {

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
	private int anInt5708 = 16;

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "I")
	private int anInt5707 = 0;

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "I")
	private int anInt5712 = 4096;

	@OriginalMember(owner = "client!lia", name = "Q", descriptor = "I")
	private int anInt5717 = 2000;

	@OriginalMember(owner = "client!lia", name = "P", descriptor = "I")
	private int anInt5716 = 0;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(25) int local25 = this.anInt5712 >> 1;
			@Pc(30) int[][] local30 = super.aClass348_41.method8071();
			@Pc(37) Random local37 = new Random((long) this.anInt5716);
			for (@Pc(39) int local39 = 0; local39 < this.anInt5717; local39++) {
				@Pc(59) int local59 = this.anInt5712 <= 0 ? this.anInt5707 : this.anInt5707 + Static142.method2572(this.anInt5712, local37) - local25;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static142.method2572(Static395.anInt6816, local37);
				@Pc(77) int local77 = Static142.method2572(Static118.anInt2485, local37);
				@Pc(89) int local89 = local70 + (Static511.anIntArray605[local65] * this.anInt5708 >> 12);
				@Pc(100) int local100 = (Static246.anIntArray290[local65] * this.anInt5708 >> 12) + local77;
				@Pc(105) int local105 = local100 - local77;
				@Pc(109) int local109 = local89 - local70;
				if (local109 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(140) boolean local140 = local109 < local105;
					@Pc(144) int local144;
					@Pc(146) int local146;
					if (local140) {
						local144 = local70;
						local146 = local89;
						local70 = local77;
						local89 = local100;
						local77 = local144;
						local100 = local146;
					}
					if (local89 < local70) {
						local144 = local70;
						local146 = local77;
						local70 = local89;
						local77 = local100;
						local89 = local144;
						local100 = local146;
					}
					local144 = local77;
					local146 = local89 - local70;
					@Pc(185) int local185 = local100 - local77;
					@Pc(190) int local190 = -local146 / 2;
					@Pc(194) int local194 = 2048 / local146;
					@Pc(206) int local206 = 1024 - (Static142.method2572(4096, local37) >> 2);
					@Pc(217) int local217 = local77 >= local100 ? -1 : 1;
					if (local185 < 0) {
						local185 = -local185;
					}
					for (@Pc(227) int local227 = local70; local227 < local89; local227++) {
						@Pc(240) int local240 = (local227 - local70) * local194 + local206 + 1024;
						@Pc(244) int local244 = local227 & Static104.anInt2340;
						@Pc(248) int local248 = local144 & Static463.anInt7489;
						local190 += local185;
						if (local140) {
							local30[local248][local244] = local240;
						} else {
							local30[local244][local248] = local240;
						}
						if (local190 > 0) {
							local190 += -local146;
							local144 += local217;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5716 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt5717 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt5708 = arg0.method2859();
		} else if (arg1 == 3) {
			this.anInt5707 = arg0.method2825();
		} else if (arg1 == 4) {
			this.anInt5712 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		Static154.method2691();
	}
}

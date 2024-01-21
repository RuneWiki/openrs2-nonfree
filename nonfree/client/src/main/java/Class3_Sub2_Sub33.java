import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	private int anInt3757 = 4096;

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
	private int anInt3765 = 0;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
	private int anInt3763 = 16;

	@OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
	private int anInt3767 = 0;

	@OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
	private int anInt3766 = 2000;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(28) int local28 = this.anInt3757 >> 1;
			@Pc(33) int[][] local33 = super.aClass2_41.method11();
			@Pc(40) Random local40 = new Random((long) this.anInt3767);
			for (@Pc(42) int local42 = 0; local42 < this.anInt3766; local42++) {
				@Pc(65) int local65 = this.anInt3757 > 0 ? this.anInt3765 + Static13.method273(local40, this.anInt3757) - local28 : this.anInt3765;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static13.method273(local40, Static190.anInt3865);
				@Pc(81) int local81 = Static13.method273(local40, Static97.anInt2014);
				@Pc(92) int local92 = (this.anInt3763 * Static52.anIntArray58[local71] >> 12) + local81;
				@Pc(97) int local97 = local92 - local81;
				@Pc(109) int local109 = local76 + (this.anInt3763 * Static1.anIntArray93[local71] >> 12);
				@Pc(114) int local114 = local109 - local76;
				if (local114 != 0 || local97 != 0) {
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local97 < 0) {
						local97 = -local97;
					}
					@Pc(145) boolean local145 = local114 < local97;
					@Pc(149) int local149;
					@Pc(155) int local155;
					if (local145) {
						local149 = local76;
						local76 = local81;
						local81 = local149;
						local155 = local109;
						local109 = local92;
						local92 = local155;
					}
					if (local76 > local109) {
						local149 = local76;
						local155 = local81;
						local76 = local109;
						local109 = local149;
						local81 = local92;
						local92 = local155;
					}
					local149 = local81;
					local155 = local109 - local76;
					@Pc(186) int local186 = local92 - local81;
					if (local186 < 0) {
						local186 = -local186;
					}
					@Pc(196) int local196 = -local155 / 2;
					@Pc(200) int local200 = 2048 / local155;
					@Pc(207) int local207 = local81 >= local92 ? -1 : 1;
					@Pc(217) int local217 = 1024 - (Static13.method273(local40, 4096) >> 2);
					for (@Pc(219) int local219 = local76; local219 < local109; local219++) {
						local196 += local186;
						@Pc(237) int local237 = local217 + local200 * (-local76 + local219) + 1024;
						@Pc(241) int local241 = Static134.anInt2681 & local219;
						@Pc(245) int local245 = local149 & Static170.anInt1101;
						if (local145) {
							local33[local245][local241] = local237;
						} else {
							local33[local241][local245] = local237;
						}
						if (local196 > 0) {
							local149 += local207;
							local196 += -local155;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3767 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt3766 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt3763 = arg0.method1278();
		} else if (arg1 == 3) {
			this.anInt3765 = arg0.method1270();
		} else if (arg1 == 4) {
			this.anInt3757 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		Static198.method3152();
	}
}

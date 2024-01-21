import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
	private int anInt4117 = 4096;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "I")
	private int anInt4120 = 0;

	@OriginalMember(owner = "client!th", name = "X", descriptor = "I")
	private int anInt4123 = 2000;

	@OriginalMember(owner = "client!th", name = "V", descriptor = "I")
	private int anInt4122 = 0;

	@OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
	private int anInt4127 = 16;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int local26 = this.anInt4117 >> 1;
			@Pc(33) int[][] local33 = super.aClass40_41.method1363();
			@Pc(40) Random local40 = new Random((long) this.anInt4120);
			for (@Pc(42) int local42 = 0; local42 < this.anInt4123; local42++) {
				@Pc(65) int local65 = this.anInt4117 > 0 ? this.anInt4122 + Static132.method2265(this.anInt4117, local40) - local26 : this.anInt4122;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static132.method2265(Static115.anInt2578, local40);
				@Pc(81) int local81 = Static132.method2265(Static31.anInt857, local40);
				@Pc(92) int local92 = local76 + (Static189.anIntArray364[local71] * this.anInt4127 >> 12);
				@Pc(103) int local103 = local81 + (Static134.anIntArray243[local71] * this.anInt4127 >> 12);
				@Pc(108) int local108 = local103 - local81;
				@Pc(112) int local112 = local92 - local76;
				if (local112 != 0 || local108 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(139) boolean local139 = local112 < local108;
					@Pc(143) int local143;
					@Pc(149) int local149;
					if (local139) {
						local143 = local76;
						local76 = local81;
						local81 = local143;
						local149 = local92;
						local92 = local103;
						local103 = local149;
					}
					if (local92 < local76) {
						local143 = local76;
						local149 = local81;
						local81 = local103;
						local76 = local92;
						local92 = local143;
						local103 = local149;
					}
					local143 = local81;
					local149 = local92 - local76;
					@Pc(180) int local180 = local103 - local81;
					@Pc(185) int local185 = -local149 / 2;
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(197) int local197 = 2048 / local149;
					@Pc(207) int local207 = 1024 - (Static132.method2265(4096, local40) >> 2);
					@Pc(218) int local218 = local103 > local81 ? 1 : -1;
					for (@Pc(220) int local220 = local76; local220 < local92; local220++) {
						local185 += local180;
						@Pc(237) int local237 = (local220 - local76) * local197 + local207 + 1024;
						@Pc(241) int local241 = Static48.anInt1202 & local220;
						@Pc(245) int local245 = Static91.anInt2110 & local143;
						if (local185 > 0) {
							local143 += local218;
							local185 += -local149;
						}
						if (local139) {
							local33[local245][local241] = local237;
						} else {
							local33[local241][local245] = local237;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		Static64.method1304();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4120 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt4123 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt4127 = arg0.method2771();
		} else if (arg1 == 3) {
			this.anInt4122 = arg0.method2765();
		} else if (arg1 == 4) {
			this.anInt4117 = arg0.method2765();
		}
	}
}

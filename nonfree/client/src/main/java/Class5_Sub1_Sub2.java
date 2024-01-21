import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
	private int anInt149 = 0;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
	private int anInt150 = 4096;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	private int anInt147 = 16;

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
	private int anInt156 = 2000;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	private int anInt148 = 0;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		Static64.method1048();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(24) int local24 = this.anInt150 >> 1;
			@Pc(29) int[][] local29 = super.aClass101_41.method2885();
			@Pc(36) Random local36 = new Random((long) this.anInt148);
			for (@Pc(38) int local38 = 0; local38 < this.anInt156; local38++) {
				@Pc(60) int local60 = this.anInt150 > 0 ? this.anInt149 + Static85.method1454(local36, this.anInt150) - local24 : this.anInt149;
				@Pc(65) int local65 = Static85.method1454(local36, Static174.anInt3489);
				@Pc(71) int local71 = local60 >> 4 & 0xFF;
				@Pc(76) int local76 = Static85.method1454(local36, Static207.anInt4072);
				@Pc(88) int local88 = local65 + (Static106.anIntArray238[local71] * this.anInt147 >> 12);
				@Pc(99) int local99 = (this.anInt147 * Static94.anIntArray191[local71] >> 12) + local76;
				@Pc(104) int local104 = local88 - local65;
				@Pc(109) int local109 = local99 - local76;
				if (local104 != 0 || local109 != 0) {
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(139) boolean local139 = local104 < local109;
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local139) {
						local143 = local65;
						local145 = local88;
						local65 = local76;
						local88 = local99;
						local99 = local145;
						local76 = local143;
					}
					if (local65 > local88) {
						local143 = local65;
						local65 = local88;
						local145 = local76;
						local76 = local99;
						local88 = local143;
						local99 = local145;
					}
					@Pc(173) int local173 = local99 - local76;
					local145 = local88 - local65;
					if (local173 < 0) {
						local173 = -local173;
					}
					local143 = local76;
					@Pc(195) int local195 = 1024 - (Static85.method1454(local36, 4096) >> 2);
					@Pc(200) int local200 = -local145 / 2;
					@Pc(204) int local204 = 2048 / local145;
					@Pc(211) int local211 = local99 <= local76 ? -1 : 1;
					for (@Pc(213) int local213 = local65; local213 < local88; local213++) {
						@Pc(226) int local226 = local195 + local204 * (-local65 + local213) + 1024;
						@Pc(230) int local230 = local143 & Static3.anInt74;
						local200 += local173;
						@Pc(238) int local238 = local213 & Static189.anInt3753;
						if (local200 > 0) {
							local200 += -local145;
							local143 += local211;
						}
						if (local139) {
							local29[local230][local238] = local226;
						} else {
							local29[local238][local230] = local226;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt148 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt156 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt147 = arg0.method3062();
		} else if (arg1 == 3) {
			this.anInt149 = arg0.method3077();
		} else if (arg1 == 4) {
			this.anInt150 = arg0.method3077();
		}
	}
}

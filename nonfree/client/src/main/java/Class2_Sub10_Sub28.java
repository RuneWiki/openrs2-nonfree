import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class2_Sub10_Sub28 extends Class2_Sub10 {

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
	private int anInt8405 = 0;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
	private int anInt8407 = 4096;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
	private int anInt8406 = 16;

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
	private int anInt8408 = 0;

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
	private int anInt8411 = 2000;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		Static385.method5800();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(30) int local30 = this.anInt8407 >> 1;
			@Pc(35) int[][] local35 = super.aClass304_41.method7210();
			@Pc(42) Random local42 = new Random((long) this.anInt8408);
			for (@Pc(44) int local44 = 0; local44 < this.anInt8411; local44++) {
				@Pc(64) int local64 = this.anInt8407 > 0 ? this.anInt8405 + Static610.method8343(local42, this.anInt8407) - local30 : this.anInt8405;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static610.method8343(local42, Static93.anInt1862);
				@Pc(80) int local80 = Static610.method8343(local42, Static512.anInt8591);
				@Pc(91) int local91 = local75 + (this.anInt8406 * Static68.anIntArray145[local70] >> 12);
				@Pc(102) int local102 = local80 + (Static253.anIntArray343[local70] * this.anInt8406 >> 12);
				@Pc(107) int local107 = local102 - local80;
				@Pc(112) int local112 = local91 - local75;
				if (local112 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(143) boolean local143 = local112 < local107;
					@Pc(147) int local147;
					@Pc(149) int local149;
					if (local143) {
						local147 = local75;
						local149 = local91;
						local75 = local80;
						local80 = local147;
						local91 = local102;
						local102 = local149;
					}
					if (local75 > local91) {
						local147 = local75;
						local149 = local80;
						local75 = local91;
						local80 = local102;
						local91 = local147;
						local102 = local149;
					}
					local147 = local80;
					local149 = local91 - local75;
					@Pc(183) int local183 = local102 - local80;
					@Pc(188) int local188 = -local149 / 2;
					@Pc(192) int local192 = 2048 / local149;
					@Pc(202) int local202 = 1024 - (Static610.method8343(local42, 4096) >> 2);
					if (local183 < 0) {
						local183 = -local183;
					}
					@Pc(218) int local218 = local102 <= local80 ? -1 : 1;
					for (@Pc(220) int local220 = local75; local220 < local91; local220++) {
						@Pc(233) int local233 = local192 * (local220 - local75) + local202 + 1024;
						@Pc(237) int local237 = local220 & Static603.anInt9994;
						@Pc(241) int local241 = local147 & Static93.anInt1860;
						local188 += local183;
						if (local143) {
							local35[local241][local237] = local233;
						} else {
							local35[local237][local241] = local233;
						}
						if (local188 > 0) {
							local188 += -local149;
							local147 += local218;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8408 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt8411 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt8406 = arg0.method6904();
		} else if (arg1 == 3) {
			this.anInt8405 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt8407 = arg0.method6884();
		}
	}
}

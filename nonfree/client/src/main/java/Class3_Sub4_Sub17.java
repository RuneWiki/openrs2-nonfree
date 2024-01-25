import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	private int anInt3045 = 4096;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
	private int anInt3050 = 2000;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	private int anInt3051 = 0;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "I")
	private int anInt3048 = 0;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "I")
	private int anInt3046 = 16;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		Static417.method5714();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3051 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt3050 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt3046 = arg0.method4096();
		} else if (arg1 == 3) {
			this.anInt3048 = arg0.method4083();
		} else if (arg1 == 4) {
			this.anInt3045 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int local26 = this.anInt3045 >> 1;
			@Pc(31) int[][] local31 = super.aClass109_41.method2832();
			@Pc(38) Random local38 = new Random((long) this.anInt3051);
			for (@Pc(40) int local40 = 0; local40 < this.anInt3050; local40++) {
				@Pc(60) int local60 = this.anInt3045 <= 0 ? this.anInt3048 : this.anInt3048 + Static438.method2068(local38, this.anInt3045) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static438.method2068(local38, Static148.anInt2687);
				@Pc(76) int local76 = Static438.method2068(local38, Static140.anInt2503);
				@Pc(88) int local88 = local71 + (this.anInt3046 * Static331.anIntArray491[local66] >> 12);
				@Pc(99) int local99 = (this.anInt3046 * Static418.anIntArray448[local66] >> 12) + local76;
				@Pc(104) int local104 = local99 - local76;
				@Pc(109) int local109 = local88 - local71;
				if (local109 != 0 || local104 != 0) {
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(140) boolean local140 = local109 < local104;
					@Pc(144) int local144;
					@Pc(148) int local148;
					if (local140) {
						local144 = local71;
						local71 = local76;
						local148 = local88;
						local88 = local99;
						local76 = local144;
						local99 = local148;
					}
					if (local88 < local71) {
						local144 = local71;
						local148 = local76;
						local71 = local88;
						local76 = local99;
						local88 = local144;
						local99 = local148;
					}
					local144 = local76;
					local148 = local88 - local71;
					@Pc(184) int local184 = local99 - local76;
					@Pc(189) int local189 = -local148 / 2;
					@Pc(193) int local193 = 2048 / local148;
					@Pc(203) int local203 = 1024 - (Static438.method2068(local38, 4096) >> 2);
					@Pc(214) int local214 = local99 > local76 ? 1 : -1;
					if (local184 < 0) {
						local184 = -local184;
					}
					for (@Pc(221) int local221 = local71; local221 < local88; local221++) {
						@Pc(234) int local234 = local193 * (local221 - local71) + local203 + 1024;
						@Pc(238) int local238 = local221 & Static225.anInt3793;
						@Pc(242) int local242 = Static165.anInt2326 & local144;
						local189 += local184;
						if (local140) {
							local31[local242][local238] = local234;
						} else {
							local31[local238][local242] = local234;
						}
						if (local189 > 0) {
							local144 -= -local214;
							local189 += -local148;
						}
					}
				}
			}
		}
		return local17;
	}
}

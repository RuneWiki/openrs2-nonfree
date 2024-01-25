import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class5_Sub3_Sub23 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
	private int anInt4208 = 16;

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
	private int anInt4206 = 0;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
	private int anInt4210 = 0;

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
	private int anInt4205 = 2000;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	private int anInt4211 = 4096;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(20) int local20 = this.anInt4211 >> 1;
			@Pc(25) int[][] local25 = super.aClass188_41.method5316();
			@Pc(32) Random local32 = new Random((long) this.anInt4206);
			for (@Pc(34) int local34 = 0; local34 < this.anInt4205; local34++) {
				@Pc(57) int local57 = this.anInt4211 > 0 ? this.anInt4210 + Static329.method5695(local32, this.anInt4211) - local20 : this.anInt4210;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static329.method5695(local32, Static7.anInt129);
				@Pc(73) int local73 = Static329.method5695(local32, Static227.anInt4557);
				@Pc(84) int local84 = local68 + (this.anInt4208 * Static186.anIntArray370[local63] >> 12);
				@Pc(96) int local96 = local73 + (Static77.anIntArray120[local63] * this.anInt4208 >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local84 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(137) boolean local137 = local106 < local101;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local137) {
						local141 = local68;
						local143 = local84;
						local68 = local73;
						local84 = local96;
						local73 = local141;
						local96 = local143;
					}
					if (local84 < local68) {
						local141 = local68;
						local143 = local73;
						local68 = local84;
						local84 = local141;
						local73 = local96;
						local96 = local143;
					}
					local141 = local73;
					local143 = local84 - local68;
					@Pc(178) int local178 = local96 - local73;
					@Pc(183) int local183 = -local143 / 2;
					@Pc(187) int local187 = 2048 / local143;
					@Pc(199) int local199 = 1024 - (Static329.method5695(local32, 4096) >> 2);
					@Pc(206) int local206 = local96 > local73 ? 1 : -1;
					if (local178 < 0) {
						local178 = -local178;
					}
					for (@Pc(216) int local216 = local68; local216 < local84; local216++) {
						@Pc(230) int local230 = local199 + local187 * (local216 - local68) + 1024;
						@Pc(234) int local234 = local216 & Static177.anInt3515;
						@Pc(238) int local238 = Static221.anInt4359 & local141;
						if (local137) {
							local25[local238][local234] = local230;
						} else {
							local25[local234][local238] = local230;
						}
						local183 += local178;
						if (local183 > 0) {
							local183 += -local143;
							local141 -= -local206;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4206 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt4205 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt4208 = arg0.method5115();
		} else if (arg1 == 3) {
			this.anInt4210 = arg0.method5106();
		} else if (arg1 == 4) {
			this.anInt4211 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		Static124.method2201();
	}
}

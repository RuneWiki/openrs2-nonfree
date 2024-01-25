import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class2_Sub15_Sub38 extends Class2_Sub15 {

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
	private int anInt11332 = 0;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
	private int anInt11331 = 0;

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	private int anInt11338 = 4096;

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
	private int anInt11333 = 16;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
	private int anInt11339 = 2000;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		Static410.method6766();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt11332 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt11339 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt11333 = arg1.method5203();
		} else if (arg0 == 3) {
			this.anInt11331 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt11338 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(20) int local20 = this.anInt11338 >> 1;
			@Pc(25) int[][] local25 = super.aClass338_41.method8467();
			@Pc(32) Random local32 = new Random((long) this.anInt11332);
			for (@Pc(34) int local34 = 0; local34 < this.anInt11339; local34++) {
				@Pc(57) int local57 = this.anInt11338 > 0 ? this.anInt11331 + Static17.method7641(this.anInt11338, local32) - local20 : this.anInt11331;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static17.method7641(Static329.anInt6017, local32);
				@Pc(73) int local73 = Static17.method7641(Static667.anInt10615, local32);
				@Pc(84) int local84 = local68 + (Static464.anIntArray420[local63] * this.anInt11333 >> 12);
				@Pc(96) int local96 = local73 + (this.anInt11333 * Static148.anIntArray154[local63] >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local84 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(133) boolean local133 = local106 < local101;
					@Pc(137) int local137;
					@Pc(139) int local139;
					if (local133) {
						local137 = local68;
						local139 = local84;
						local68 = local73;
						local73 = local137;
						local84 = local96;
						local96 = local139;
					}
					if (local84 < local68) {
						local137 = local68;
						local139 = local73;
						local68 = local84;
						local73 = local96;
						local84 = local137;
						local96 = local139;
					}
					local137 = local73;
					local139 = local84 - local68;
					@Pc(178) int local178 = local96 - local73;
					@Pc(183) int local183 = -local139 / 2;
					@Pc(187) int local187 = 2048 / local139;
					@Pc(197) int local197 = 1024 - (Static17.method7641(4096, local32) >> 2);
					@Pc(208) int local208 = local73 < local96 ? 1 : -1;
					if (local178 < 0) {
						local178 = -local178;
					}
					for (@Pc(215) int local215 = local68; local215 < local84; local215++) {
						@Pc(229) int local229 = local197 + local187 * (local215 + -local68) + 1024;
						@Pc(233) int local233 = Static386.anInt7302 & local215;
						@Pc(237) int local237 = local137 & Static426.anInt11132;
						if (local133) {
							local25[local237][local233] = local229;
						} else {
							local25[local233][local237] = local229;
						}
						local183 += local178;
						if (local183 > 0) {
							local137 += local208;
							local183 += -local139;
						}
					}
				}
			}
		}
		return local11;
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
	private int anInt2472 = 0;

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
	private int anInt2474 = 4096;

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
	private int anInt2473 = 0;

	@OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
	private int anInt2466 = 16;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
	private int anInt2470 = 2000;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int local26 = this.anInt2474 >> 1;
			@Pc(31) int[][] local31 = super.aClass98_41.method2852();
			@Pc(38) Random local38 = new Random((long) this.anInt2472);
			for (@Pc(40) int local40 = 0; local40 < this.anInt2470; local40++) {
				@Pc(60) int local60 = this.anInt2474 <= 0 ? this.anInt2473 : this.anInt2473 + Static297.method5193(local38, this.anInt2474) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static297.method5193(local38, Static85.anInt1910);
				@Pc(76) int local76 = Static297.method5193(local38, Static208.anInt4105);
				@Pc(88) int local88 = local71 + (this.anInt2466 * Static6.anIntArray22[local66] >> 12);
				@Pc(100) int local100 = local76 + (this.anInt2466 * Static171.anIntArray265[local66] >> 12);
				@Pc(105) int local105 = local100 - local76;
				@Pc(110) int local110 = local88 - local71;
				if (local110 != 0 || local105 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(137) boolean local137 = local105 > local110;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local137) {
						local141 = local71;
						local143 = local88;
						local71 = local76;
						local88 = local100;
						local76 = local141;
						local100 = local143;
					}
					if (local71 > local88) {
						local141 = local71;
						local71 = local88;
						local143 = local76;
						local88 = local141;
						local76 = local100;
						local100 = local143;
					}
					local141 = local76;
					local143 = local88 - local71;
					@Pc(181) int local181 = local100 - local76;
					@Pc(186) int local186 = -local143 / 2;
					@Pc(190) int local190 = 2048 / local143;
					@Pc(199) int local199 = 1024 - (Static297.method5193(local38, 4096) >> 2);
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(211) int local211 = local76 < local100 ? 1 : -1;
					for (@Pc(213) int local213 = local71; local213 < local88; local213++) {
						@Pc(226) int local226 = local190 * (local213 - local71) + local199 + 1024;
						@Pc(230) int local230 = local213 & Static346.anInt6542;
						@Pc(234) int local234 = local141 & Static279.anInt5435;
						if (local137) {
							local31[local234][local230] = local226;
						} else {
							local31[local230][local234] = local226;
						}
						local186 += local181;
						if (local186 > 0) {
							local141 += local211;
							local186 += -local143;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		Static113.method2407();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2472 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt2470 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt2466 = arg1.method2132();
		} else if (arg0 == 3) {
			this.anInt2473 = arg1.method2161();
		} else if (arg0 == 4) {
			this.anInt2474 = arg1.method2161();
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
	private int anInt8352 = 0;

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
	private int anInt8355 = 4096;

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
	private int anInt8359 = 2000;

	@OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
	private int anInt8354 = 0;

	@OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
	private int anInt8362 = 16;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8354 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt8359 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt8362 = arg0.method4225();
		} else if (arg1 == 3) {
			this.anInt8352 = arg0.method4221();
		} else if (arg1 == 4) {
			this.anInt8355 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(25) int local25 = this.anInt8355 >> 1;
			@Pc(30) int[][] local30 = super.aClass40_41.method1571();
			@Pc(37) Random local37 = new Random((long) this.anInt8354);
			for (@Pc(39) int local39 = 0; local39 < this.anInt8359; local39++) {
				@Pc(62) int local62 = this.anInt8355 > 0 ? this.anInt8352 + Static522.method7729(local37, this.anInt8355) - local25 : this.anInt8352;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static522.method7729(local37, Static491.anInt8519);
				@Pc(78) int local78 = Static522.method7729(local37, Static336.anInt6310);
				@Pc(89) int local89 = (Static587.anIntArray621[local68] * this.anInt8362 >> 12) + local73;
				@Pc(100) int local100 = local78 + (Static246.anIntArray241[local68] * this.anInt8362 >> 12);
				@Pc(105) int local105 = local100 - local78;
				@Pc(110) int local110 = local89 - local73;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(138) boolean local138 = local105 > local110;
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local138) {
						local142 = local73;
						local73 = local78;
						local146 = local89;
						local89 = local100;
						local78 = local142;
						local100 = local146;
					}
					if (local89 < local73) {
						local142 = local73;
						local146 = local78;
						local73 = local89;
						local78 = local100;
						local89 = local142;
						local100 = local146;
					}
					local142 = local78;
					local146 = local89 - local73;
					@Pc(178) int local178 = local100 - local78;
					@Pc(183) int local183 = -local146 / 2;
					@Pc(187) int local187 = 2048 / local146;
					@Pc(197) int local197 = 1024 - (Static522.method7729(local37, 4096) >> 2);
					if (local178 < 0) {
						local178 = -local178;
					}
					@Pc(209) int local209 = local100 > local78 ? 1 : -1;
					for (@Pc(211) int local211 = local73; local211 < local89; local211++) {
						@Pc(224) int local224 = local187 * (local211 - local73) + local197 + 1024;
						@Pc(228) int local228 = Static309.anInt5846 & local211;
						@Pc(232) int local232 = local142 & Class4_Sub1_Sub3_Sub2.lb;
						local183 += local178;
						if (local138) {
							local30[local232][local228] = local224;
						} else {
							local30[local228][local232] = local224;
						}
						if (local183 > 0) {
							local142 -= -local209;
							local183 += -local146;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		Static511.method7631();
	}
}

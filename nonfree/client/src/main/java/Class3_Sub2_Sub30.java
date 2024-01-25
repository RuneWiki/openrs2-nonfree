import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	private int anInt8536 = 16;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
	private int anInt8539 = 0;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	private int anInt8535 = 4096;

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
	private int anInt8541 = 0;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private int anInt8542 = 2000;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt8539 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt8542 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt8536 = arg1.method8401();
		} else if (arg0 == 3) {
			this.anInt8541 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt8535 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		Static468.method6978();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(28) int local28 = this.anInt8535 >> 1;
			@Pc(33) int[][] local33 = super.aClass330_41.method7982();
			@Pc(40) Random local40 = new Random((long) this.anInt8539);
			for (@Pc(42) int local42 = 0; local42 < this.anInt8542; local42++) {
				@Pc(62) int local62 = this.anInt8535 <= 0 ? this.anInt8541 : this.anInt8541 + Static106.method2589(local40, this.anInt8535) - local28;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static106.method2589(local40, Static164.anInt8839);
				@Pc(78) int local78 = Static106.method2589(local40, Static638.anInt10476);
				@Pc(89) int local89 = local73 + (Static365.anIntArray410[local68] * this.anInt8536 >> 12);
				@Pc(101) int local101 = local78 + (this.anInt8536 * Static8.anIntArray7[local68] >> 12);
				@Pc(106) int local106 = local101 - local78;
				@Pc(111) int local111 = local89 - local73;
				if (local111 != 0 || local106 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(145) boolean local145 = local111 < local106;
					@Pc(149) int local149;
					@Pc(151) int local151;
					if (local145) {
						local149 = local73;
						local151 = local89;
						local73 = local78;
						local89 = local101;
						local78 = local149;
						local101 = local151;
					}
					if (local89 < local73) {
						local149 = local73;
						local73 = local89;
						local151 = local78;
						local78 = local101;
						local89 = local149;
						local101 = local151;
					}
					local149 = local78;
					local151 = local89 - local73;
					@Pc(190) int local190 = local101 - local78;
					@Pc(195) int local195 = -local151 / 2;
					@Pc(199) int local199 = 2048 / local151;
					@Pc(209) int local209 = 1024 - (Static106.method2589(local40, 4096) >> 2);
					@Pc(220) int local220 = local78 >= local101 ? -1 : 1;
					if (local190 < 0) {
						local190 = -local190;
					}
					for (@Pc(227) int local227 = local73; local227 < local89; local227++) {
						@Pc(240) int local240 = local209 + (-local73 + local227) * local199 + 1024;
						@Pc(244) int local244 = Static52.anInt1120 & local227;
						@Pc(248) int local248 = local149 & Static46.anInt1029;
						local195 += local190;
						if (local145) {
							local33[local248][local244] = local240;
						} else {
							local33[local244][local248] = local240;
						}
						if (local195 > 0) {
							local195 += -local151;
							local149 += local220;
						}
					}
				}
			}
		}
		return local11;
	}
}

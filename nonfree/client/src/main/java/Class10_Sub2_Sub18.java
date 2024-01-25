import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class10_Sub2_Sub18 extends Class10_Sub2 {

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	private int anInt3376 = 0;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	private int anInt3379 = 4096;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "I")
	private int anInt3377 = 2000;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	private int anInt3382 = 16;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	private int anInt3381 = 0;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		Static44.method657();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int local26 = this.anInt3379 >> 1;
			@Pc(31) int[][] local31 = super.aClass241_41.method5237();
			@Pc(38) Random local38 = new Random((long) this.anInt3381);
			for (@Pc(40) int local40 = 0; local40 < this.anInt3377; local40++) {
				@Pc(60) int local60 = this.anInt3379 <= 0 ? this.anInt3376 : this.anInt3376 + Static434.method5743(local38, this.anInt3379) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(73) int local73 = Static434.method5743(local38, Static121.anInt2458);
				@Pc(78) int local78 = Static434.method5743(local38, Static190.anInt3835);
				@Pc(89) int local89 = (Static132.anIntArray275[local66] * this.anInt3382 >> 12) + local73;
				@Pc(100) int local100 = (this.anInt3382 * Static218.anIntArray410[local66] >> 12) + local78;
				@Pc(104) int local104 = local100 - local78;
				@Pc(108) int local108 = local89 - local73;
				if (local108 != 0 || local104 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local104 < 0) {
						local104 = -local104;
					}
					@Pc(135) boolean local135 = local104 > local108;
					@Pc(139) int local139;
					@Pc(141) int local141;
					if (local135) {
						local139 = local73;
						local141 = local89;
						local73 = local78;
						local89 = local100;
						local78 = local139;
						local100 = local141;
					}
					if (local73 > local89) {
						local139 = local73;
						local141 = local78;
						local73 = local89;
						local89 = local139;
						local78 = local100;
						local100 = local141;
					}
					local139 = local78;
					local141 = local89 - local73;
					@Pc(175) int local175 = local100 - local78;
					@Pc(180) int local180 = -local141 / 2;
					@Pc(184) int local184 = 2048 / local141;
					@Pc(193) int local193 = 1024 - (Static434.method5743(local38, 4096) >> 2);
					if (local175 < 0) {
						local175 = -local175;
					}
					@Pc(212) int local212 = local78 >= local100 ? -1 : 1;
					for (@Pc(214) int local214 = local73; local214 < local89; local214++) {
						@Pc(227) int local227 = local193 + local184 * (local214 - local73) + 1024;
						@Pc(231) int local231 = Static429.anInt7203 & local214;
						@Pc(235) int local235 = local139 & Static140.anInt2877;
						if (local135) {
							local31[local235][local231] = local227;
						} else {
							local31[local231][local235] = local227;
						}
						local180 += local175;
						if (local180 > 0) {
							local139 += local212;
							local180 += -local141;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3381 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt3377 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt3382 = arg1.method2502();
		} else if (arg0 == 3) {
			this.anInt3376 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt3379 = arg1.method2485();
		}
	}
}

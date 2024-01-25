import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub9_Sub38 extends Class3_Sub9 {

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	private int anInt10374 = 16;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	private int anInt10379 = 4096;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	private int anInt10378 = 0;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt10377 = 2000;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	private int anInt10383 = 0;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int local26 = this.anInt10379 >> 1;
			@Pc(31) int[][] local31 = super.aClass113_41.method3238();
			@Pc(38) Random local38 = new Random((long) this.anInt10383);
			for (@Pc(40) int local40 = 0; local40 < this.anInt10377; local40++) {
				@Pc(60) int local60 = this.anInt10379 <= 0 ? this.anInt10378 : this.anInt10378 + Static371.method5392(local38, this.anInt10379) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static371.method5392(local38, Static62.anInt1251);
				@Pc(76) int local76 = Static371.method5392(local38, Static452.anInt7497);
				@Pc(87) int local87 = (Static144.anIntArray235[local66] * this.anInt10374 >> 12) + local71;
				@Pc(98) int local98 = (this.anInt10374 * Static608.anIntArray846[local66] >> 12) + local76;
				@Pc(103) int local103 = local98 - local76;
				@Pc(108) int local108 = local87 - local71;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(135) boolean local135 = local103 > local108;
					@Pc(139) int local139;
					@Pc(141) int local141;
					if (local135) {
						local139 = local71;
						local141 = local87;
						local71 = local76;
						local76 = local139;
						local87 = local98;
						local98 = local141;
					}
					if (local71 > local87) {
						local139 = local71;
						local71 = local87;
						local141 = local76;
						local87 = local139;
						local76 = local98;
						local98 = local141;
					}
					local139 = local76;
					local141 = local87 - local71;
					@Pc(179) int local179 = local98 - local76;
					@Pc(184) int local184 = -local141 / 2;
					@Pc(188) int local188 = 2048 / local141;
					@Pc(198) int local198 = 1024 - (Static371.method5392(local38, 4096) >> 2);
					@Pc(205) int local205 = local98 <= local76 ? -1 : 1;
					if (local179 < 0) {
						local179 = -local179;
					}
					for (@Pc(215) int local215 = local71; local215 < local87; local215++) {
						@Pc(228) int local228 = local198 + (local215 - local71) * local188 + 1024;
						@Pc(232) int local232 = local215 & Static302.anInt5067;
						@Pc(236) int local236 = Static636.anInt10126 & local139;
						if (local135) {
							local31[local236][local232] = local228;
						} else {
							local31[local232][local236] = local228;
						}
						local184 += local179;
						if (local184 > 0) {
							local139 += local205;
							local184 += -local141;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		Static609.method8656();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10383 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt10377 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt10374 = arg0.method8632();
		} else if (arg1 == 3) {
			this.anInt10378 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt10379 = arg0.method8593();
		}
	}
}

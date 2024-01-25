import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class6_Sub1_Sub22 extends Class6_Sub1 {

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
	private int anInt7494 = 0;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	private int anInt7497 = 0;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
	private int anInt7499 = 2000;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
	private int anInt7502 = 4096;

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	private int anInt7498 = 16;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		Static463.method7157();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(26) int local26 = this.anInt7502 >> 1;
			@Pc(31) int[][] local31 = super.aClass187_41.method4592();
			@Pc(38) Random local38 = new Random((long) this.anInt7494);
			for (@Pc(40) int local40 = 0; local40 < this.anInt7499; local40++) {
				@Pc(60) int local60 = this.anInt7502 > 0 ? this.anInt7497 + Static326.method5252(local38, this.anInt7502) - local26 : this.anInt7497;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static326.method5252(local38, Static289.anInt5549);
				@Pc(76) int local76 = Static326.method5252(local38, Static468.anInt8642);
				@Pc(87) int local87 = (this.anInt7498 * Static293.anIntArray416[local66] >> 12) + local71;
				@Pc(98) int local98 = local76 + (Static571.anIntArray829[local66] * this.anInt7498 >> 12);
				@Pc(103) int local103 = local98 - local76;
				@Pc(108) int local108 = local87 - local71;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(129) boolean local129 = local108 < local103;
					@Pc(133) int local133;
					@Pc(137) int local137;
					if (local129) {
						local133 = local71;
						local71 = local76;
						local137 = local87;
						local87 = local98;
						local76 = local133;
						local98 = local137;
					}
					if (local71 > local87) {
						local133 = local71;
						local71 = local87;
						local137 = local76;
						local76 = local98;
						local87 = local133;
						local98 = local137;
					}
					local133 = local76;
					local137 = local87 - local71;
					@Pc(170) int local170 = local98 - local76;
					@Pc(175) int local175 = -local137 / 2;
					@Pc(179) int local179 = 2048 / local137;
					@Pc(189) int local189 = 1024 - (Static326.method5252(local38, 4096) >> 2);
					@Pc(196) int local196 = local98 > local76 ? 1 : -1;
					if (local170 < 0) {
						local170 = -local170;
					}
					for (@Pc(206) int local206 = local71; local206 < local87; local206++) {
						@Pc(219) int local219 = (local206 - local71) * local179 + local189 + 1024;
						@Pc(223) int local223 = Static153.anInt3343 & local206;
						@Pc(227) int local227 = local133 & Static574.anInt9711;
						if (local129) {
							local31[local227][local223] = local219;
						} else {
							local31[local223][local227] = local219;
						}
						local175 += local170;
						if (local175 > 0) {
							local133 += local196;
							local175 -= local137;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt7494 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt7499 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt7498 = arg1.method4966();
		} else if (arg0 == 3) {
			this.anInt7497 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt7502 = arg1.method4999();
		}
	}
}

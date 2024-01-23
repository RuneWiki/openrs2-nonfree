import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class4_Sub6_Sub28 extends Class4_Sub6 {

	@OriginalMember(owner = "client!r", name = "L", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	private int anInt4419;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	private int anInt4415 = 409;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	private int anInt4414 = 204;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	private int anInt4409 = 4;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	private int anInt4421 = 8;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "I")
	private int anInt4404 = 0;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	private int anInt4422 = 1024;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	private int anInt4417 = 1024;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	private int anInt4410 = 81;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.method3556();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4409 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt4421 = arg0.method1874();
		} else if (arg1 == 2) {
			this.anInt4415 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt4414 = arg0.method1837();
		} else if (arg1 == 4) {
			this.anInt4417 = arg0.method1837();
		} else if (arg1 == 5) {
			this.anInt4404 = arg0.method1837();
		} else if (arg1 == 6) {
			this.anInt4410 = arg0.method1837();
		} else if (arg1 == 7) {
			this.anInt4422 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(28) int local28 = 0;
			@Pc(35) int local35;
			for (local35 = this.anInt4404 + Static273.anIntArray127[arg0]; local35 < 0; local35 += 4096) {
			}
			while (local35 > 4096) {
				local35 -= 4096;
			}
			while (local28 < this.anInt4421 && local35 >= this.anIntArray394[local28]) {
				local28++;
			}
			@Pc(73) boolean local73 = (local28 & 0x1) == 0;
			@Pc(77) int local77 = local28 - 1;
			@Pc(82) int local82 = this.anIntArray394[local28];
			@Pc(89) int local89 = this.anIntArray394[local28 - 1];
			if (local89 + this.anInt4419 < local35 && local82 - this.anInt4419 > local35) {
				for (@Pc(116) int local116 = 0; local116 < Static2.anInt19; local116++) {
					@Pc(128) int local128 = local73 ? this.anInt4417 : -this.anInt4417;
					@Pc(139) int local139 = (local128 * this.anInt4408 >> 12) + Static192.anIntArray318[local116];
					@Pc(141) int local141 = 0;
					while (local139 < 0) {
						local139 += 4096;
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (local141 < this.anInt4409 && this.anIntArrayArray36[local77][local141] <= local139) {
						local141++;
					}
					@Pc(180) int local180 = local141 - 1;
					@Pc(187) int local187 = this.anIntArrayArray36[local77][local180];
					@Pc(194) int local194 = this.anIntArrayArray36[local77][local141];
					if (local139 > this.anInt4419 + local187 && local194 - this.anInt4419 > local139) {
						local21[local116] = this.anIntArrayArray35[local77][local180];
					} else {
						local21[local116] = 0;
					}
				}
			} else {
				Static307.method3249(local21, 0, Static2.anInt19, 0);
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	private void method3556() {
		@Pc(18) Random local18 = new Random((long) this.anInt4421);
		this.anIntArrayArray36 = new int[this.anInt4421][this.anInt4409 + 1];
		this.anInt4419 = this.anInt4410 / 2;
		this.anInt4408 = 4096 / this.anInt4409;
		this.anIntArrayArray35 = new int[this.anInt4421][this.anInt4409];
		this.anIntArray394 = new int[this.anInt4421 + 1];
		@Pc(58) int local58 = this.anInt4408 / 2;
		this.anInt4423 = 4096 / this.anInt4421;
		this.anIntArray394[0] = 0;
		@Pc(74) int local74 = this.anInt4423 / 2;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4421; local76++) {
			@Pc(92) int local92;
			@Pc(104) int local104;
			if (local76 > 0) {
				local92 = this.anInt4423;
				local104 = (Static241.method3695(4096, local18) - 2048) * this.anInt4414 >> 12;
				@Pc(112) int local112 = local92 + (local104 * local74 >> 12);
				this.anIntArray394[local76] = local112 + this.anIntArray394[local76 - 1];
			}
			this.anIntArrayArray36[local76][0] = 0;
			for (local92 = 0; local92 < this.anInt4409; local92++) {
				if (local92 > 0) {
					local104 = this.anInt4408;
					@Pc(161) int local161 = (Static241.method3695(4096, local18) - 2048) * this.anInt4415 >> 12;
					local104 += local58 * local161 >> 12;
					this.anIntArrayArray36[local76][local92] = this.anIntArrayArray36[local76][local92 - 1] + local104;
				}
				this.anIntArrayArray35[local76][local92] = this.anInt4422 > 0 ? 4096 - Static241.method3695(this.anInt4422, local18) : 4096;
			}
			this.anIntArrayArray36[local76][this.anInt4409] = 4096;
		}
		this.anIntArray394[this.anInt4421] = 4096;
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	private int anInt5144;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray127;

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray128;

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
	private int anInt5160;

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
	private int anInt5150 = 409;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
	private int anInt5149 = 0;

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
	private int anInt5148 = 4;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
	private int anInt5147 = 81;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	private int anInt5151 = 1024;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
	private int anInt5153 = 204;

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
	private int anInt5158 = 1024;

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
	private int anInt5154 = 8;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.method4030();
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	private void method4030() {
		@Pc(12) Random local12 = new Random((long) this.anInt5154);
		this.anInt5160 = this.anInt5147 / 2;
		this.anInt5144 = 4096 / this.anInt5148;
		this.anInt5157 = 4096 / this.anInt5154;
		@Pc(35) int local35 = this.anInt5144 / 2;
		this.anIntArray309 = new int[this.anInt5154 + 1];
		this.anIntArrayArray127 = new int[this.anInt5154][this.anInt5148];
		@Pc(54) int local54 = this.anInt5157 / 2;
		this.anIntArrayArray128 = new int[this.anInt5154][this.anInt5148 + 1];
		this.anIntArray309[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt5154; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt5157;
				local89 = (Static368.method4796(local12, 4096) - 2048) * this.anInt5153 >> 12;
				@Pc(97) int local97 = local77 + (local54 * local89 >> 12);
				this.anIntArray309[local70] = this.anIntArray309[local70 - 1] + local97;
			}
			this.anIntArrayArray128[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt5148; local77++) {
				if (local77 > 0) {
					local89 = this.anInt5144;
					@Pc(137) int local137 = (Static368.method4796(local12, 4096) - 2048) * this.anInt5150 >> 12;
					local89 += local35 * local137 >> 12;
					this.anIntArrayArray128[local70][local77] = local89 + this.anIntArrayArray128[local70][local77 - 1];
				}
				this.anIntArrayArray127[local70][local77] = this.anInt5158 > 0 ? 4096 - Static368.method4796(local12, this.anInt5158) : 4096;
			}
			this.anIntArrayArray128[local70][this.anInt5148] = 4096;
		}
		this.anIntArray309[this.anInt5154] = 4096;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5148 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt5154 = arg1.method4463();
		} else if (arg0 == 2) {
			this.anInt5150 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt5153 = arg1.method4485();
		} else if (arg0 == 4) {
			this.anInt5151 = arg1.method4485();
		} else if (arg0 == 5) {
			this.anInt5149 = arg1.method4485();
		} else if (arg0 == 6) {
			this.anInt5147 = arg1.method4485();
		} else if (arg0 == 7) {
			this.anInt5158 = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static221.anIntArray194[arg0] + this.anInt5149; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt5154 > local22 && this.anIntArray309[local22] <= local29) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(74) boolean local74 = (local22 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray309[local22];
			@Pc(86) int local86 = this.anIntArray309[local22 - 1];
			if (local29 > local86 + this.anInt5160 && local79 - this.anInt5160 > local29) {
				for (@Pc(108) int local108 = 0; local108 < Static434.anInt4326; local108++) {
					@Pc(112) int local112 = 0;
					@Pc(121) int local121 = local74 ? this.anInt5151 : -this.anInt5151;
					@Pc(132) int local132;
					for (local132 = (local121 * this.anInt5144 >> 12) + Static280.anIntArray238[local108]; local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (this.anInt5148 > local112 && this.anIntArrayArray128[local63][local112] <= local132) {
						local112++;
					}
					@Pc(169) int local169 = local112 - 1;
					@Pc(176) int local176 = this.anIntArrayArray128[local63][local112];
					@Pc(183) int local183 = this.anIntArrayArray128[local63][local169];
					if (local132 > local183 + this.anInt5160 && local132 < local176 - this.anInt5160) {
						local11[local108] = this.anIntArrayArray127[local63][local169];
					} else {
						local11[local108] = 0;
					}
				}
			} else {
				Static459.method2113(local11, 0, Static434.anInt4326, 0);
			}
		}
		return local11;
	}
}

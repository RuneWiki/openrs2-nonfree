import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
	private int anInt299 = 1;

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
	private int anInt298 = 2048;

	@OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
	private int anInt300 = 2;

	@OriginalMember(owner = "client!ao", name = "bb", descriptor = "[B")
	private byte[] aByteArray2 = new byte[512];

	@OriginalMember(owner = "client!ao", name = "cb", descriptor = "I")
	private int anInt301 = 5;

	@OriginalMember(owner = "client!ao", name = "ib", descriptor = "I")
	private int anInt305 = 0;

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
	private int anInt294 = 5;

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "[S")
	private short[] aShortArray3 = new short[512];

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)V")
	private void method281() {
		@Pc(12) Random local12 = new Random((long) this.anInt305);
		this.aShortArray3 = new short[512];
		if (this.anInt298 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray3[local28] = (short) Static329.method5695(local12, this.anInt298);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt294 = this.anInt301 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt305 = arg0.method5115();
		} else if (arg1 == 2) {
			this.anInt298 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt300 = arg0.method5115();
		} else if (arg1 == 4) {
			this.anInt299 = arg0.method5115();
		} else if (arg1 == 5) {
			this.anInt294 = arg0.method5115();
		} else if (arg1 == 6) {
			this.anInt301 = arg0.method5115();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.aByteArray2 = Static322.method549(this.anInt305);
		this.method281();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(31) int local31 = this.anInt301 * Static345.anIntArray627[arg0] + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static7.anInt129; local41++) {
				Static46.anInt864 = Integer.MAX_VALUE;
				Static141.anInt2738 = Integer.MAX_VALUE;
				Static22.anInt478 = Integer.MAX_VALUE;
				Static187.anInt3708 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static164.anIntArray337[local41] * this.anInt294 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(154) int local154;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(93) int local93 = this.aByteArray2[(this.anInt301 > local72 ? local72 : local72 - this.anInt301) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(125) int local125 = (this.aByteArray2[(this.anInt294 > local97 ? local97 : local97 - this.anInt294) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(139) int local139 = local60 - this.aShortArray3[local125] - (local97 << 12);
						@Pc(151) int local151 = local31 - this.aShortArray3[local129] - (local72 << 12);
						local154 = this.anInt299;
						@Pc(183) int local183;
						if (local154 == 1) {
							local183 = local151 * local151 + local139 * local139 >> 12;
						} else if (local154 == 3) {
							local151 = local151 < 0 ? -local151 : local151;
							local139 = local139 < 0 ? -local139 : local139;
							local183 = local151 < local139 ? local139 : local151;
						} else if (local154 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local183 = local151 + local139;
							local183 = local183 * local183 >> 12;
						} else if (local154 == 5) {
							local139 *= local139;
							local151 *= local151;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local139 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local183 = (local139 < 0 ? -local139 : local139) + (local151 >= 0 ? local151 : -local151);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static187.anInt3708 > local183) {
							Static46.anInt864 = Static141.anInt2738;
							Static141.anInt2738 = Static22.anInt478;
							Static22.anInt478 = Static187.anInt3708;
							Static187.anInt3708 = local183;
						} else if (local183 < Static22.anInt478) {
							Static46.anInt864 = Static141.anInt2738;
							Static141.anInt2738 = Static22.anInt478;
							Static22.anInt478 = local183;
						} else if (local183 < Static141.anInt2738) {
							Static46.anInt864 = Static141.anInt2738;
							Static141.anInt2738 = local183;
						} else if (Static46.anInt864 > local183) {
							Static46.anInt864 = local183;
						}
					}
				}
				local154 = this.anInt300;
				if (local154 == 0) {
					local18[local41] = Static187.anInt3708;
				} else if (local154 == 1) {
					local18[local41] = Static22.anInt478;
				} else if (local154 == 3) {
					local18[local41] = Static141.anInt2738;
				} else if (local154 == 4) {
					local18[local41] = Static46.anInt864;
				} else if (local154 == 2) {
					local18[local41] = Static22.anInt478 - Static187.anInt3708;
				}
			}
		}
		return local18;
	}
}

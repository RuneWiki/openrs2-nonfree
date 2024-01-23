import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
	private int anInt200 = 0;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
	private int anInt199 = 2048;

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
	private int anInt205 = 5;

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "[S")
	private short[] aShortArray20 = new short[512];

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
	private int anInt208 = 1;

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
	private int anInt198 = 2;

	@OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
	private int anInt210 = 5;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt205 = this.anInt210 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt200 = arg0.method2199();
		} else if (arg1 == 2) {
			this.anInt199 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt198 = arg0.method2199();
		} else if (arg1 == 4) {
			this.anInt208 = arg0.method2199();
		} else if (arg1 == 5) {
			this.anInt205 = arg0.method2199();
		} else if (arg1 == 6) {
			this.anInt210 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.aByteArray6 = Static296.method4534(this.anInt200);
		this.method240();
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	private void method240() {
		@Pc(8) Random local8 = new Random((long) this.anInt200);
		this.aShortArray20 = new short[512];
		if (this.anInt199 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray20[local31] = (short) Static207.method3275(this.anInt199, local8);
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(30) int local30 = this.anInt210 * Static256.anIntArray474[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static62.anInt1350; local40++) {
				Static197.anInt4299 = Integer.MAX_VALUE;
				Static190.anInt4201 = Integer.MAX_VALUE;
				Static312.anInt6267 = Integer.MAX_VALUE;
				Static281.anInt2853 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt205 * Static3.anIntArray3[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(161) int local161;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(94) int local94 = this.aByteArray6[(local72 >= this.anInt210 ? local72 - this.anInt210 : local72) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local64 - 1; local98 <= local68; local98++) {
						@Pc(132) int local132 = (this.aByteArray6[local94 + (this.anInt205 > local98 ? local98 : local98 - this.anInt205) & 0xFF] & 0xFF) * 2;
						@Pc(136) int local136 = -(local98 << 12);
						@Pc(140) int local140 = local132 + 1;
						@Pc(145) int local145 = local136 + local60 - this.aShortArray20[local132];
						@Pc(158) int local158 = local30 - (local72 << 12) - this.aShortArray20[local140];
						local161 = this.anInt208;
						@Pc(197) int local197;
						if (local161 == 1) {
							local197 = local145 * local145 + local158 * local158 >> 12;
						} else if (local161 == 3) {
							local145 = local145 >= 0 ? local145 : -local145;
							local158 = local158 >= 0 ? local158 : -local158;
							local197 = local145 <= local158 ? local158 : local145;
						} else if (local161 == 4) {
							local145 = (int) (Math.sqrt((double) ((float) (local145 >= 0 ? local145 : -local145) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 < 0 ? -local158 : local158) / 4096.0F)) * 4096.0D);
							local197 = local158 + local145;
							local197 = local197 * local197 >> 12;
						} else if (local161 == 5) {
							local158 *= local158;
							local145 *= local145;
							local197 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local158 + local145) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local197 = (local145 >= 0 ? local145 : -local145) + (local158 < 0 ? -local158 : local158);
						} else {
							local197 = (int) (Math.sqrt((double) ((float) (local145 * local145 + local158 * local158) / 1.6777216E7F)) * 4096.0D);
						}
						if (local197 < Static281.anInt2853) {
							Static197.anInt4299 = Static190.anInt4201;
							Static190.anInt4201 = Static312.anInt6267;
							Static312.anInt6267 = Static281.anInt2853;
							Static281.anInt2853 = local197;
						} else if (local197 < Static312.anInt6267) {
							Static197.anInt4299 = Static190.anInt4201;
							Static190.anInt4201 = Static312.anInt6267;
							Static312.anInt6267 = local197;
						} else if (local197 < Static190.anInt4201) {
							Static197.anInt4299 = Static190.anInt4201;
							Static190.anInt4201 = local197;
						} else if (local197 < Static197.anInt4299) {
							Static197.anInt4299 = local197;
						}
					}
				}
				local161 = this.anInt198;
				if (local161 == 0) {
					local7[local40] = Static281.anInt2853;
				} else if (local161 == 1) {
					local7[local40] = Static312.anInt6267;
				} else if (local161 == 3) {
					local7[local40] = Static190.anInt4201;
				} else if (local161 == 4) {
					local7[local40] = Static197.anInt4299;
				} else if (local161 == 2) {
					local7[local40] = Static312.anInt6267 - Static281.anInt2853;
				}
			}
		}
		return local7;
	}
}

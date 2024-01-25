import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class7_Sub4_Sub21 extends Class7_Sub4 {

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
	private int anInt4039 = 1;

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
	private int anInt4043 = 5;

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
	private int anInt4040 = 5;

	@OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
	private int anInt4048 = 2048;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "[S")
	private short[] aShortArray69 = new short[512];

	@OriginalMember(owner = "client!mn", name = "W", descriptor = "[B")
	private byte[] aByteArray56 = new byte[512];

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
	private int anInt4046 = 0;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
	private int anInt4038 = 2;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(32) int local32 = Static314.anIntArray756[arg0] * this.anInt4040 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static201.anInt4174; local42++) {
				Static341.anInt6482 = Integer.MAX_VALUE;
				Static33.anInt737 = Integer.MAX_VALUE;
				Static37.anInt1051 = Integer.MAX_VALUE;
				Static59.anInt1505 = Integer.MAX_VALUE;
				@Pc(61) int local61 = Static129.anIntArray375[local42] * this.anInt4043 + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(161) int local161;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(98) int local98 = this.aByteArray56[(local73 < this.anInt4040 ? local73 : local73 - this.anInt4040) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(132) int local132 = (this.aByteArray56[local98 + (this.anInt4043 <= local102 ? local102 - this.anInt4043 : local102) & 0xFF] & 0xFF) * 2;
						@Pc(137) int local137 = local132 + 1;
						@Pc(145) int local145 = local61 - this.aShortArray69[local132] - (local102 << 12);
						@Pc(158) int local158 = local32 - (local73 << 12) - this.aShortArray69[local137];
						local161 = this.anInt4039;
						@Pc(193) int local193;
						if (local161 == 1) {
							local193 = local145 * local145 + local158 * local158 >> 12;
						} else if (local161 == 3) {
							local145 = local145 >= 0 ? local145 : -local145;
							local158 = local158 >= 0 ? local158 : -local158;
							local193 = local145 > local158 ? local145 : local158;
						} else if (local161 == 4) {
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 >= 0 ? local158 : -local158) / 4096.0F)) * 4096.0D);
							local193 = local145 + local158;
							local193 = local193 * local193 >> 12;
						} else if (local161 == 5) {
							local158 *= local158;
							local145 *= local145;
							local193 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local145 + local158) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local193 = (local145 < 0 ? -local145 : local145) + (local158 < 0 ? -local158 : local158);
						} else {
							local193 = (int) (Math.sqrt((double) ((float) (local158 * local158 + local145 * local145) / 1.6777216E7F)) * 4096.0D);
						}
						if (local193 < Static59.anInt1505) {
							Static341.anInt6482 = Static33.anInt737;
							Static33.anInt737 = Static37.anInt1051;
							Static37.anInt1051 = Static59.anInt1505;
							Static59.anInt1505 = local193;
						} else if (local193 < Static37.anInt1051) {
							Static341.anInt6482 = Static33.anInt737;
							Static33.anInt737 = Static37.anInt1051;
							Static37.anInt1051 = local193;
						} else if (local193 < Static33.anInt737) {
							Static341.anInt6482 = Static33.anInt737;
							Static33.anInt737 = local193;
						} else if (Static341.anInt6482 > local193) {
							Static341.anInt6482 = local193;
						}
					}
				}
				local161 = this.anInt4038;
				if (local161 == 0) {
					local11[local42] = Static59.anInt1505;
				} else if (local161 == 1) {
					local11[local42] = Static37.anInt1051;
				} else if (local161 == 3) {
					local11[local42] = Static33.anInt737;
				} else if (local161 == 4) {
					local11[local42] = Static341.anInt6482;
				} else if (local161 == 2) {
					local11[local42] = Static37.anInt1051 - Static59.anInt1505;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4043 = this.anInt4040 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt4046 = arg0.method2772();
		} else if (arg1 == 2) {
			this.anInt4048 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt4038 = arg0.method2772();
		} else if (arg1 == 4) {
			this.anInt4039 = arg0.method2772();
		} else if (arg1 == 5) {
			this.anInt4043 = arg0.method2772();
		} else if (arg1 == 6) {
			this.anInt4040 = arg0.method2772();
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.aByteArray56 = Static74.method1491(this.anInt4046);
		this.method3625();
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V")
	private void method3625() {
		@Pc(19) Random local19 = new Random((long) this.anInt4046);
		this.aShortArray69 = new short[512];
		if (this.anInt4048 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray69[local28] = (short) Static350.method5618(this.anInt4048, local19);
			}
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class6_Sub8_Sub17 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "[B")
	private byte[] aByteArray51 = new byte[512];

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	private int anInt5425 = 5;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
	private int anInt5428 = 1;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
	private int anInt5429 = 5;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	private int anInt5427 = 2;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
	private int anInt5430 = 2048;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	private int anInt5431 = 0;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "[S")
	private short[] aShortArray55 = new short[512];

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
	private void method4953() {
		@Pc(12) Random local12 = new Random((long) this.anInt5431);
		this.aShortArray55 = new short[512];
		if (this.anInt5430 > 0) {
			for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
				this.aShortArray55[local26] = (short) Static196.method3692(local12, this.anInt5430);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(32) int local32 = this.anInt5429 * Static424.anIntArray466[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static83.anInt1268; local42++) {
				Static207.anInt4157 = Integer.MAX_VALUE;
				Static394.anInt6806 = Integer.MAX_VALUE;
				Static238.anInt4609 = Integer.MAX_VALUE;
				Static222.anInt4361 = Integer.MAX_VALUE;
				@Pc(61) int local61 = Static2.anIntArray1[local42] * this.anInt5425 + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(156) int local156;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(96) int local96 = this.aByteArray51[(this.anInt5429 <= local73 ? local73 - this.anInt5429 : local73) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local65 - 1; local100 <= local69; local100++) {
						@Pc(127) int local127 = (this.aByteArray51[(local100 < this.anInt5425 ? local100 : local100 - this.anInt5425) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = -(local100 << 12);
						@Pc(135) int local135 = local127 + 1;
						@Pc(140) int local140 = local131 + local61 - this.aShortArray55[local127];
						@Pc(153) int local153 = local32 - (local73 << 12) - this.aShortArray55[local135];
						local156 = this.anInt5428;
						@Pc(197) int local197;
						if (local156 == 1) {
							local197 = local153 * local153 + local140 * local140 >> 12;
						} else if (local156 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local153 = local153 < 0 ? -local153 : local153;
							local197 = local153 >= local140 ? local153 : local140;
						} else if (local156 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 >= 0 ? local153 : -local153) / 4096.0F)) * 4096.0D);
							local197 = local153 + local140;
							local197 = local197 * local197 >> 12;
						} else if (local156 == 5) {
							local153 *= local153;
							local140 *= local140;
							local197 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local140 + local153) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local197 = (local153 >= 0 ? local153 : -local153) + (local140 >= 0 ? local140 : -local140);
						} else {
							local197 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static222.anInt4361 > local197) {
							Static207.anInt4157 = Static394.anInt6806;
							Static394.anInt6806 = Static238.anInt4609;
							Static238.anInt4609 = Static222.anInt4361;
							Static222.anInt4361 = local197;
						} else if (Static238.anInt4609 > local197) {
							Static207.anInt4157 = Static394.anInt6806;
							Static394.anInt6806 = Static238.anInt4609;
							Static238.anInt4609 = local197;
						} else if (local197 < Static394.anInt6806) {
							Static207.anInt4157 = Static394.anInt6806;
							Static394.anInt6806 = local197;
						} else if (local197 < Static207.anInt4157) {
							Static207.anInt4157 = local197;
						}
					}
				}
				local156 = this.anInt5427;
				if (local156 == 0) {
					local19[local42] = Static222.anInt4361;
				} else if (local156 == 1) {
					local19[local42] = Static238.anInt4609;
				} else if (local156 == 3) {
					local19[local42] = Static394.anInt6806;
				} else if (local156 == 4) {
					local19[local42] = Static207.anInt4157;
				} else if (local156 == 2) {
					local19[local42] = Static238.anInt4609 - Static222.anInt4361;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.aByteArray51 = Static105.method2020(this.anInt5431);
		this.method4953();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5425 = this.anInt5429 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt5431 = arg1.method3030();
		} else if (arg0 == 2) {
			this.anInt5430 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt5427 = arg1.method3030();
		} else if (arg0 == 4) {
			this.anInt5428 = arg1.method3030();
		} else if (arg0 == 5) {
			this.anInt5425 = arg1.method3030();
		} else if (arg0 == 6) {
			this.anInt5429 = arg1.method3030();
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class4_Sub6_Sub34 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
	private int anInt6520 = 5;

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "[S")
	private short[] aShortArray234 = new short[512];

	@OriginalMember(owner = "client!tp", name = "I", descriptor = "[B")
	private byte[] aByteArray92 = new byte[512];

	@OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
	private int anInt6522 = 2048;

	@OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
	private int anInt6523 = 2;

	@OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
	private int anInt6524 = 1;

	@OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
	private int anInt6525 = 5;

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
	private int anInt6519 = 0;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(32) int local32 = this.anInt6525 * Static165.anIntArray209[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static80.anInt1616; local42++) {
				Static102.anInt2046 = Integer.MAX_VALUE;
				Static3.anInt4067 = Integer.MAX_VALUE;
				Static388.anInt6499 = Integer.MAX_VALUE;
				Static426.anInt7014 = Integer.MAX_VALUE;
				@Pc(61) int local61 = Static341.anIntArray504[local42] * this.anInt6520 + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(158) int local158;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(98) int local98 = this.aByteArray92[(local73 >= this.anInt6525 ? local73 - this.anInt6525 : local73) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(130) int local130 = (this.aByteArray92[(local102 >= this.anInt6520 ? local102 - this.anInt6520 : local102) + local98 & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local61 - (local102 << 12);
						@Pc(139) int local139 = local130 + 1;
						@Pc(142) int local142 = local135 - this.aShortArray234[local130];
						@Pc(155) int local155 = local32 - (local73 << 12) - this.aShortArray234[local139];
						local158 = this.anInt6524;
						@Pc(190) int local190;
						if (local158 == 1) {
							local190 = local142 * local142 + local155 * local155 >> 12;
						} else if (local158 == 3) {
							local155 = local155 >= 0 ? local155 : -local155;
							local142 = local142 < 0 ? -local142 : local142;
							local190 = local155 >= local142 ? local155 : local142;
						} else if (local158 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 < 0 ? -local142 : local142) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 >= 0 ? local155 : -local155) / 4096.0F)) * 4096.0D);
							local190 = local155 + local142;
							local190 = local190 * local190 >> 12;
						} else if (local158 == 5) {
							local155 *= local155;
							local142 *= local142;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local155 + local142) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local190 = (local142 >= 0 ? local142 : -local142) + (local155 >= 0 ? local155 : -local155);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local155 * local155 + local142 * local142) / 1.6777216E7F)) * 4096.0D);
						}
						if (local190 < Static426.anInt7014) {
							Static102.anInt2046 = Static3.anInt4067;
							Static3.anInt4067 = Static388.anInt6499;
							Static388.anInt6499 = Static426.anInt7014;
							Static426.anInt7014 = local190;
						} else if (Static388.anInt6499 > local190) {
							Static102.anInt2046 = Static3.anInt4067;
							Static3.anInt4067 = Static388.anInt6499;
							Static388.anInt6499 = local190;
						} else if (Static3.anInt4067 > local190) {
							Static102.anInt2046 = Static3.anInt4067;
							Static3.anInt4067 = local190;
						} else if (local190 < Static102.anInt2046) {
							Static102.anInt2046 = local190;
						}
					}
				}
				local158 = this.anInt6523;
				if (local158 == 0) {
					local11[local42] = Static426.anInt7014;
				} else if (local158 == 1) {
					local11[local42] = Static388.anInt6499;
				} else if (local158 == 3) {
					local11[local42] = Static3.anInt4067;
				} else if (local158 == 4) {
					local11[local42] = Static102.anInt2046;
				} else if (local158 == 2) {
					local11[local42] = Static388.anInt6499 - Static426.anInt7014;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V")
	private void method5114() {
		@Pc(18) Random local18 = new Random((long) this.anInt6519);
		this.aShortArray234 = new short[512];
		if (this.anInt6522 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray234[local27] = (short) Static226.method3443(local18, this.anInt6522);
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.aByteArray92 = Static36.method643(this.anInt6519);
		this.method5114();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6520 = this.anInt6525 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt6519 = arg1.method2490();
		} else if (arg0 == 2) {
			this.anInt6522 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt6523 = arg1.method2490();
		} else if (arg0 == 4) {
			this.anInt6524 = arg1.method2490();
		} else if (arg0 == 5) {
			this.anInt6520 = arg1.method2490();
		} else if (arg0 == 6) {
			this.anInt6525 = arg1.method2490();
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class4_Sub6_Sub11 extends Class4_Sub6 {

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
	private int anInt1816 = 1;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "[S")
	private short[] aShortArray36 = new short[512];

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "[B")
	private byte[] aByteArray26 = new byte[512];

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
	private int anInt1821 = 2;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	private int anInt1817 = 5;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
	private int anInt1825 = 2048;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	private int anInt1822 = 5;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	private int anInt1824 = 0;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.aByteArray26 = Static218.method3958(this.anInt1824);
		this.method1647();
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	private void method1647() {
		@Pc(12) Random local12 = new Random((long) this.anInt1824);
		this.aShortArray36 = new short[512];
		if (this.anInt1825 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray36[local24] = (short) Static355.method5668(local12, this.anInt1825);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(30) int local30 = Static128.anIntArray265[arg0] * this.anInt1822 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static31.anInt797; local40++) {
				Static237.anInt6659 = Integer.MAX_VALUE;
				Static105.anInt2646 = Integer.MAX_VALUE;
				Static58.anInt1549 = Integer.MAX_VALUE;
				Static144.anInt3269 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt1817 * Static339.anIntArray4[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(160) int local160;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(97) int local97 = this.aByteArray26[(this.anInt1822 > local72 ? local72 : local72 - this.anInt1822) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(130) int local130 = (this.aByteArray26[(local101 >= this.anInt1817 ? local101 - this.anInt1817 : local101) + local97 & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local130 + 1;
						@Pc(144) int local144 = local60 - this.aShortArray36[local130] - (local101 << 12);
						@Pc(157) int local157 = local30 - (local72 << 12) - this.aShortArray36[local135];
						local160 = this.anInt1816;
						@Pc(192) int local192;
						if (local160 == 1) {
							local192 = local144 * local144 + local157 * local157 >> 12;
						} else if (local160 == 3) {
							local144 = local144 < 0 ? -local144 : local144;
							local157 = local157 >= 0 ? local157 : -local157;
							local192 = local144 > local157 ? local144 : local157;
						} else if (local160 == 4) {
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local157 = (int) (Math.sqrt((double) ((float) (local157 < 0 ? -local157 : local157) / 4096.0F)) * 4096.0D);
							local192 = local157 + local144;
							local192 = local192 * local192 >> 12;
						} else if (local160 == 5) {
							local144 *= local144;
							local157 *= local157;
							local192 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local157 + local144) / 1.6777216E7F))) * 4096.0D);
						} else if (local160 == 2) {
							local192 = (local144 < 0 ? -local144 : local144) + (local157 < 0 ? -local157 : local157);
						} else {
							local192 = (int) (Math.sqrt((double) ((float) (local157 * local157 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static144.anInt3269 > local192) {
							Static237.anInt6659 = Static105.anInt2646;
							Static105.anInt2646 = Static58.anInt1549;
							Static58.anInt1549 = Static144.anInt3269;
							Static144.anInt3269 = local192;
						} else if (Static58.anInt1549 > local192) {
							Static237.anInt6659 = Static105.anInt2646;
							Static105.anInt2646 = Static58.anInt1549;
							Static58.anInt1549 = local192;
						} else if (Static105.anInt2646 > local192) {
							Static237.anInt6659 = Static105.anInt2646;
							Static105.anInt2646 = local192;
						} else if (local192 < Static237.anInt6659) {
							Static237.anInt6659 = local192;
						}
					}
				}
				local160 = this.anInt1821;
				if (local160 == 0) {
					local11[local40] = Static144.anInt3269;
				} else if (local160 == 1) {
					local11[local40] = Static58.anInt1549;
				} else if (local160 == 3) {
					local11[local40] = Static105.anInt2646;
				} else if (local160 == 4) {
					local11[local40] = Static237.anInt6659;
				} else if (local160 == 2) {
					local11[local40] = Static58.anInt1549 - Static144.anInt3269;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1817 = this.anInt1822 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt1824 = arg1.method3440();
		} else if (arg0 == 2) {
			this.anInt1825 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt1821 = arg1.method3440();
		} else if (arg0 == 4) {
			this.anInt1816 = arg1.method3440();
		} else if (arg0 == 5) {
			this.anInt1817 = arg1.method3440();
		} else if (arg0 == 6) {
			this.anInt1822 = arg1.method3440();
		}
	}
}

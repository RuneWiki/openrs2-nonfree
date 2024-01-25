import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class5_Sub1_Sub31 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	private int anInt8928 = 5;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	private int anInt8930 = 2;

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
	private int anInt8936 = 2048;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
	private int anInt8929 = 0;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	private int anInt8939 = 5;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "[B")
	private byte[] aByteArray85 = new byte[512];

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "[S")
	private short[] aShortArray117 = new short[512];

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	private int anInt8938 = 1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	private void method7629() {
		@Pc(12) Random local12 = new Random((long) this.anInt8929);
		this.aShortArray117 = new short[512];
		if (this.anInt8936 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray117[local32] = (short) Static547.method7966(this.anInt8936, local12);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt8939 = this.anInt8928 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt8929 = arg1.method8529();
		} else if (arg0 == 2) {
			this.anInt8936 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt8930 = arg1.method8529();
		} else if (arg0 == 4) {
			this.anInt8938 = arg1.method8529();
		} else if (arg0 == 5) {
			this.anInt8939 = arg1.method8529();
		} else if (arg0 == 6) {
			this.anInt8928 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.aByteArray85 = Static655.method9057(this.anInt8929);
		this.method7629();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(24) int local24 = Static23.anIntArray27[arg0] * this.anInt8928 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static648.anInt9588; local34++) {
				Static91.anInt1512 = Integer.MAX_VALUE;
				Static497.anInt10514 = Integer.MAX_VALUE;
				Static170.anInt2909 = Integer.MAX_VALUE;
				Static534.anInt552 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static293.anIntArray288[local34] * this.anInt8939 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(159) int local159;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(93) int local93 = this.aByteArray85[(local65 >= this.anInt8928 ? local65 - this.anInt8928 : local65) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local57 - 1; local97 <= local61; local97++) {
						@Pc(129) int local129 = (this.aByteArray85[(local97 >= this.anInt8939 ? local97 - this.anInt8939 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local129 + 1;
						@Pc(143) int local143 = local53 - this.aShortArray117[local129] - (local97 << 12);
						@Pc(156) int local156 = local24 - (local65 << 12) - this.aShortArray117[local133];
						local159 = this.anInt8938;
						@Pc(202) int local202;
						if (local159 == 1) {
							local202 = local143 * local143 + local156 * local156 >> 12;
						} else if (local159 == 3) {
							local143 = local143 >= 0 ? local143 : -local143;
							local156 = local156 < 0 ? -local156 : local156;
							local202 = local143 > local156 ? local143 : local156;
						} else if (local159 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 >= 0 ? local143 : -local143) / 4096.0F)) * 4096.0D);
							local156 = (int) (Math.sqrt((double) ((float) (local156 >= 0 ? local156 : -local156) / 4096.0F)) * 4096.0D);
							local202 = local156 + local143;
							local202 = local202 * local202 >> 12;
						} else if (local159 == 5) {
							local156 *= local156;
							local143 *= local143;
							local202 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local156 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local159 == 2) {
							local202 = (local143 < 0 ? -local143 : local143) + (local156 < 0 ? -local156 : local156);
						} else {
							local202 = (int) (Math.sqrt((double) ((float) (local143 * local143 + local156 * local156) / 1.6777216E7F)) * 4096.0D);
						}
						if (local202 < Static534.anInt552) {
							Static91.anInt1512 = Static497.anInt10514;
							Static497.anInt10514 = Static170.anInt2909;
							Static170.anInt2909 = Static534.anInt552;
							Static534.anInt552 = local202;
						} else if (Static170.anInt2909 > local202) {
							Static91.anInt1512 = Static497.anInt10514;
							Static497.anInt10514 = Static170.anInt2909;
							Static170.anInt2909 = local202;
						} else if (local202 < Static497.anInt10514) {
							Static91.anInt1512 = Static497.anInt10514;
							Static497.anInt10514 = local202;
						} else if (local202 < Static91.anInt1512) {
							Static91.anInt1512 = local202;
						}
					}
				}
				local159 = this.anInt8930;
				if (local159 == 0) {
					local11[local34] = Static534.anInt552;
				} else if (local159 == 1) {
					local11[local34] = Static170.anInt2909;
				} else if (local159 == 3) {
					local11[local34] = Static497.anInt10514;
				} else if (local159 == 4) {
					local11[local34] = Static91.anInt1512;
				} else if (local159 == 2) {
					local11[local34] = Static170.anInt2909 - Static534.anInt552;
				}
			}
		}
		return local11;
	}
}

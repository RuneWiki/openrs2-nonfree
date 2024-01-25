import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eda", name = "M", descriptor = "[S")
	private short[] aShortArray38 = new short[512];

	@OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
	private int anInt2199 = 5;

	@OriginalMember(owner = "client!eda", name = "Q", descriptor = "I")
	private int anInt2201 = 2;

	@OriginalMember(owner = "client!eda", name = "R", descriptor = "I")
	private int anInt2202 = 2048;

	@OriginalMember(owner = "client!eda", name = "T", descriptor = "[B")
	private byte[] aByteArray23 = new byte[512];

	@OriginalMember(owner = "client!eda", name = "Z", descriptor = "I")
	private int anInt2208 = 5;

	@OriginalMember(owner = "client!eda", name = "V", descriptor = "I")
	private int anInt2204 = 0;

	@OriginalMember(owner = "client!eda", name = "X", descriptor = "I")
	private int anInt2206 = 1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
	private void method2112() {
		@Pc(17) Random local17 = new Random((long) this.anInt2204);
		this.aShortArray38 = new short[512];
		if (this.anInt2202 > 0) {
			for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
				this.aShortArray38[local26] = (short) Static438.method6797(this.anInt2202, local17);
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		this.aByteArray23 = Static345.method5751(this.anInt2204);
		this.method2112();
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(25) int local25 = this.anInt2199 * Static392.anIntArray673[arg0] + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static254.anInt4973; local35++) {
				Static450.anInt7884 = Integer.MAX_VALUE;
				Static310.anInt6432 = Integer.MAX_VALUE;
				Static67.anInt1739 = Integer.MAX_VALUE;
				Static360.anInt6512 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt2208 * Static457.anIntArray732[local35] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(148) int local148;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(91) int local91 = this.aByteArray23[(this.anInt2199 > local66 ? local66 : local66 - this.anInt2199) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local58 - 1; local95 <= local62; local95++) {
						@Pc(120) int local120 = (this.aByteArray23[(local95 < this.anInt2208 ? local95 : local95 - this.anInt2208) + local91 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local120 + 1;
						@Pc(133) int local133 = local54 - this.aShortArray38[local120] - (local95 << 12);
						@Pc(145) int local145 = local25 - this.aShortArray38[local124] - (local66 << 12);
						local148 = this.anInt2206;
						@Pc(175) int local175;
						if (local148 == 1) {
							local175 = local145 * local145 + local133 * local133 >> 12;
						} else if (local148 == 3) {
							local133 = local133 < 0 ? -local133 : local133;
							local145 = local145 < 0 ? -local145 : local145;
							local175 = local133 <= local145 ? local145 : local133;
						} else if (local148 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 < 0 ? -local133 : local133) / 4096.0F)) * 4096.0D);
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local175 = local145 + local133;
							local175 = local175 * local175 >> 12;
						} else if (local148 == 5) {
							local133 *= local133;
							local145 *= local145;
							local175 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local145 + local133) / 1.6777216E7F))) * 4096.0D);
						} else if (local148 == 2) {
							local175 = (local133 < 0 ? -local133 : local133) + (local145 >= 0 ? local145 : -local145);
						} else {
							local175 = (int) (Math.sqrt((double) ((float) (local133 * local133 + local145 * local145) / 1.6777216E7F)) * 4096.0D);
						}
						if (local175 < Static360.anInt6512) {
							Static450.anInt7884 = Static310.anInt6432;
							Static310.anInt6432 = Static67.anInt1739;
							Static67.anInt1739 = Static360.anInt6512;
							Static360.anInt6512 = local175;
						} else if (local175 < Static67.anInt1739) {
							Static450.anInt7884 = Static310.anInt6432;
							Static310.anInt6432 = Static67.anInt1739;
							Static67.anInt1739 = local175;
						} else if (Static310.anInt6432 > local175) {
							Static450.anInt7884 = Static310.anInt6432;
							Static310.anInt6432 = local175;
						} else if (Static450.anInt7884 > local175) {
							Static450.anInt7884 = local175;
						}
					}
				}
				local148 = this.anInt2201;
				if (local148 == 0) {
					local11[local35] = Static360.anInt6512;
				} else if (local148 == 1) {
					local11[local35] = Static67.anInt1739;
				} else if (local148 == 3) {
					local11[local35] = Static310.anInt6432;
				} else if (local148 == 4) {
					local11[local35] = Static450.anInt7884;
				} else if (local148 == 2) {
					local11[local35] = Static67.anInt1739 - Static360.anInt6512;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2208 = this.anInt2199 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt2204 = arg1.method4487();
		} else if (arg0 == 2) {
			this.anInt2202 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt2201 = arg1.method4487();
		} else if (arg0 == 4) {
			this.anInt2206 = arg1.method4487();
		} else if (arg0 == 5) {
			this.anInt2208 = arg1.method4487();
		} else if (arg0 == 6) {
			this.anInt2199 = arg1.method4487();
		}
	}
}

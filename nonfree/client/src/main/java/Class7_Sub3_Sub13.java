import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class7_Sub3_Sub13 extends Class7_Sub3 {

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	private int anInt2887 = 5;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
	private int anInt2889 = 0;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "[S")
	private short[] aShortArray47 = new short[512];

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
	private int anInt2884 = 2048;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	private int anInt2886 = 5;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	private int anInt2888 = 2;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "[B")
	private byte[] aByteArray43 = new byte[512];

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	private int anInt2893 = 1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
	private void method2329() {
		@Pc(12) Random local12 = new Random((long) this.anInt2889);
		this.aShortArray47 = new short[512];
		if (this.anInt2884 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray47[local24] = (short) Static304.method4043(this.anInt2884, local12);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2887 = this.anInt2886 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt2889 = arg1.method3981();
		} else if (arg0 == 2) {
			this.anInt2884 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt2888 = arg1.method3981();
		} else if (arg0 == 4) {
			this.anInt2893 = arg1.method3981();
		} else if (arg0 == 5) {
			this.anInt2887 = arg1.method3981();
		} else if (arg0 == 6) {
			this.anInt2886 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.aByteArray43 = Static383.method4916(this.anInt2889);
		this.method2329();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(29) int local29 = this.anInt2886 * Static203.anIntArray322[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static58.anInt1052; local39++) {
				Static322.anInt5341 = Integer.MAX_VALUE;
				Static282.anInt4698 = Integer.MAX_VALUE;
				Static289.anInt4838 = Integer.MAX_VALUE;
				Static433.anInt7228 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static185.anIntArray298[local39] * this.anInt2887 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(149) int local149;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(90) int local90 = this.aByteArray43[(this.anInt2886 <= local70 ? local70 - this.anInt2886 : local70) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local62 - 1; local94 <= local66; local94++) {
						@Pc(119) int local119 = (this.aByteArray43[(local94 >= this.anInt2887 ? local94 - this.anInt2887 : local94) + local90 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local119 + 1;
						@Pc(133) int local133 = local58 - this.aShortArray47[local119] - (local94 << 12);
						@Pc(146) int local146 = local29 - this.aShortArray47[local124] - (local70 << 12);
						local149 = this.anInt2893;
						@Pc(179) int local179;
						if (local149 == 1) {
							local179 = local133 * local133 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local146 = local146 < 0 ? -local146 : local146;
							local133 = local133 >= 0 ? local133 : -local133;
							local179 = local133 <= local146 ? local146 : local133;
						} else if (local149 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 < 0 ? -local133 : local133) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 >= 0 ? local146 : -local146) / 4096.0F)) * 4096.0D);
							local179 = local146 + local133;
							local179 = local179 * local179 >> 12;
						} else if (local149 == 5) {
							local133 *= local133;
							local146 *= local146;
							local179 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local133 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local179 = (local146 < 0 ? -local146 : local146) + (local133 >= 0 ? local133 : -local133);
						} else {
							local179 = (int) (Math.sqrt((double) ((float) (local146 * local146 + local133 * local133) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static433.anInt7228 > local179) {
							Static322.anInt5341 = Static282.anInt4698;
							Static282.anInt4698 = Static289.anInt4838;
							Static289.anInt4838 = Static433.anInt7228;
							Static433.anInt7228 = local179;
						} else if (local179 < Static289.anInt4838) {
							Static322.anInt5341 = Static282.anInt4698;
							Static282.anInt4698 = Static289.anInt4838;
							Static289.anInt4838 = local179;
						} else if (Static282.anInt4698 > local179) {
							Static322.anInt5341 = Static282.anInt4698;
							Static282.anInt4698 = local179;
						} else if (local179 < Static322.anInt5341) {
							Static322.anInt5341 = local179;
						}
					}
				}
				local149 = this.anInt2888;
				if (local149 == 0) {
					local16[local39] = Static433.anInt7228;
				} else if (local149 == 1) {
					local16[local39] = Static289.anInt4838;
				} else if (local149 == 3) {
					local16[local39] = Static282.anInt4698;
				} else if (local149 == 4) {
					local16[local39] = Static322.anInt5341;
				} else if (local149 == 2) {
					local16[local39] = Static289.anInt4838 - Static433.anInt7228;
				}
			}
		}
		return local16;
	}
}

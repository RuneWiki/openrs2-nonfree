import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	private int anInt5007 = 0;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	private int anInt5008 = 1;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "[B")
	private byte[] aByteArray54 = new byte[512];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	private int anInt5009 = 2048;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "[S")
	private short[] aShortArray80 = new short[512];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	private int anInt5010 = 2;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
	private int anInt5014 = 5;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
	private int anInt5015 = 5;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.aByteArray54 = Static140.method7609(this.anInt5007);
		this.method4083();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(24) int local24 = Static445.anIntArray590[arg0] * this.anInt5014 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static279.anInt4906; local34++) {
				Static100.anInt2035 = Integer.MAX_VALUE;
				Static407.anInt7100 = Integer.MAX_VALUE;
				Static567.anInt9399 = Integer.MAX_VALUE;
				Static237.anInt4440 = Integer.MAX_VALUE;
				@Pc(53) int local53 = this.anInt5015 * Static557.anIntArray708[local34] + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(141) int local141;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(85) int local85 = this.aByteArray54[(local65 >= this.anInt5014 ? local65 - this.anInt5014 : local65) & 0xFF] & 0xFF;
					for (@Pc(89) int local89 = local57 - 1; local89 <= local61; local89++) {
						@Pc(114) int local114 = (this.aByteArray54[local85 + (local89 >= this.anInt5015 ? local89 - this.anInt5015 : local89) & 0xFF] & 0xFF) * 2;
						@Pc(118) int local118 = local114 + 1;
						@Pc(127) int local127 = local53 - this.aShortArray80[local114] - (local89 << 12);
						@Pc(138) int local138 = local24 - (local65 << 12) - this.aShortArray80[local118];
						local141 = this.anInt5008;
						@Pc(173) int local173;
						if (local141 == 1) {
							local173 = local127 * local127 + local138 * local138 >> 12;
						} else if (local141 == 3) {
							local127 = local127 >= 0 ? local127 : -local127;
							local138 = local138 >= 0 ? local138 : -local138;
							local173 = local127 <= local138 ? local138 : local127;
						} else if (local141 == 4) {
							local127 = (int) (Math.sqrt((double) ((float) (local127 >= 0 ? local127 : -local127) / 4096.0F)) * 4096.0D);
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local173 = local127 + local138;
							local173 = local173 * local173 >> 12;
						} else if (local141 == 5) {
							local138 *= local138;
							local127 *= local127;
							local173 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local127 + local138) / 1.6777216E7F))) * 4096.0D);
						} else if (local141 == 2) {
							local173 = (local127 < 0 ? -local127 : local127) + (local138 < 0 ? -local138 : local138);
						} else {
							local173 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local127 * local127) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static237.anInt4440 > local173) {
							Static100.anInt2035 = Static407.anInt7100;
							Static407.anInt7100 = Static567.anInt9399;
							Static567.anInt9399 = Static237.anInt4440;
							Static237.anInt4440 = local173;
						} else if (Static567.anInt9399 > local173) {
							Static100.anInt2035 = Static407.anInt7100;
							Static407.anInt7100 = Static567.anInt9399;
							Static567.anInt9399 = local173;
						} else if (local173 < Static407.anInt7100) {
							Static100.anInt2035 = Static407.anInt7100;
							Static407.anInt7100 = local173;
						} else if (local173 < Static100.anInt2035) {
							Static100.anInt2035 = local173;
						}
					}
				}
				local141 = this.anInt5010;
				if (local141 == 0) {
					local11[local34] = Static237.anInt4440;
				} else if (local141 == 1) {
					local11[local34] = Static567.anInt9399;
				} else if (local141 == 3) {
					local11[local34] = Static407.anInt7100;
				} else if (local141 == 4) {
					local11[local34] = Static100.anInt2035;
				} else if (local141 == 2) {
					local11[local34] = Static567.anInt9399 - Static237.anInt4440;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	private void method4083() {
		@Pc(18) Random local18 = new Random((long) this.anInt5007);
		this.aShortArray80 = new short[512];
		if (this.anInt5009 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray80[local27] = (short) Static87.method4324(this.anInt5009, local18);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5015 = this.anInt5014 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt5007 = arg0.method5750();
		} else if (arg1 == 2) {
			this.anInt5009 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt5010 = arg0.method5750();
		} else if (arg1 == 4) {
			this.anInt5008 = arg0.method5750();
		} else if (arg1 == 5) {
			this.anInt5015 = arg0.method5750();
		} else if (arg1 == 6) {
			this.anInt5014 = arg0.method5750();
		}
	}
}

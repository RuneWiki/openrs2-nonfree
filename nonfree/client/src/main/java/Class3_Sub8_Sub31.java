import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class3_Sub8_Sub31 extends Class3_Sub8 {

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "[B")
	private byte[] aByteArray74 = new byte[512];

	@OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
	private int anInt9008 = 5;

	@OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
	private int anInt9009 = 1;

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "[S")
	private short[] aShortArray120 = new short[512];

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
	private int anInt9005 = 2048;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
	private int anInt9006 = 5;

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
	private int anInt9007 = 0;

	@OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
	private int anInt9011 = 2;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt9008 = this.anInt9006 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt9007 = arg1.method7954();
		} else if (arg0 == 2) {
			this.anInt9005 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt9011 = arg1.method7954();
		} else if (arg0 == 4) {
			this.anInt9009 = arg1.method7954();
		} else if (arg0 == 5) {
			this.anInt9008 = arg1.method7954();
		} else if (arg0 == 6) {
			this.anInt9006 = arg1.method7954();
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V")
	private void method7349() {
		@Pc(12) Random local12 = new Random((long) this.anInt9007);
		this.aShortArray120 = new short[512];
		if (this.anInt9005 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray120[local30] = (short) Static93.method1603(this.anInt9005, local12);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.aByteArray74 = Static130.method8186(this.anInt9007);
		this.method7349();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(25) int local25 = this.anInt9006 * Static510.anIntArray172[arg0] + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static91.anInt1849; local35++) {
				Static527.anInt8307 = Integer.MAX_VALUE;
				Static393.anInt6537 = Integer.MAX_VALUE;
				Static495.anInt7856 = Integer.MAX_VALUE;
				Static272.anInt4681 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt9008 * Static13.anIntArray11[local35] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(153) int local153;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(90) int local90 = this.aByteArray74[(this.anInt9006 > local66 ? local66 : local66 - this.anInt9006) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local58 - 1; local94 <= local62; local94++) {
						@Pc(123) int local123 = (this.aByteArray74[local90 + (local94 < this.anInt9008 ? local94 : local94 - this.anInt9008) & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = local123 + 1;
						@Pc(137) int local137 = local54 - this.aShortArray120[local123] - (local94 << 12);
						@Pc(150) int local150 = local25 - (local66 << 12) - this.aShortArray120[local127];
						local153 = this.anInt9009;
						@Pc(184) int local184;
						if (local153 == 1) {
							local184 = local150 * local150 + local137 * local137 >> 12;
						} else if (local153 == 3) {
							local137 = local137 < 0 ? -local137 : local137;
							local150 = local150 >= 0 ? local150 : -local150;
							local184 = local137 <= local150 ? local150 : local137;
						} else if (local153 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 >= 0 ? local137 : -local137) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 >= 0 ? local150 : -local150) / 4096.0F)) * 4096.0D);
							local184 = local150 + local137;
							local184 = local184 * local184 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local137 *= local137;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local150 + local137) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local184 = (local150 >= 0 ? local150 : -local150) + (local137 >= 0 ? local137 : -local137);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local137 * local137 + local150 * local150) / 1.6777216E7F)) * 4096.0D);
						}
						if (local184 < Static272.anInt4681) {
							Static527.anInt8307 = Static393.anInt6537;
							Static393.anInt6537 = Static495.anInt7856;
							Static495.anInt7856 = Static272.anInt4681;
							Static272.anInt4681 = local184;
						} else if (local184 < Static495.anInt7856) {
							Static527.anInt8307 = Static393.anInt6537;
							Static393.anInt6537 = Static495.anInt7856;
							Static495.anInt7856 = local184;
						} else if (Static393.anInt6537 > local184) {
							Static527.anInt8307 = Static393.anInt6537;
							Static393.anInt6537 = local184;
						} else if (Static527.anInt8307 > local184) {
							Static527.anInt8307 = local184;
						}
					}
				}
				local153 = this.anInt9011;
				if (local153 == 0) {
					local11[local35] = Static272.anInt4681;
				} else if (local153 == 1) {
					local11[local35] = Static495.anInt7856;
				} else if (local153 == 3) {
					local11[local35] = Static393.anInt6537;
				} else if (local153 == 4) {
					local11[local35] = Static527.anInt8307;
				} else if (local153 == 2) {
					local11[local35] = Static495.anInt7856 - Static272.anInt4681;
				}
			}
		}
		return local11;
	}
}

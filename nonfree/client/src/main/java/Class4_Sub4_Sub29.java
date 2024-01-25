import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class4_Sub4_Sub29 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "[B")
	private byte[] aByteArray103 = new byte[512];

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	private int anInt7483 = 1;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "[S")
	private short[] aShortArray140 = new short[512];

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
	private int anInt7485 = 2048;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	private int anInt7489 = 0;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
	private int anInt7491 = 5;

	@OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
	private int anInt7492 = 5;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	private int anInt7490 = 2;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7491 = this.anInt7492 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt7489 = arg1.method6015();
		} else if (arg0 == 2) {
			this.anInt7485 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt7490 = arg1.method6015();
		} else if (arg0 == 4) {
			this.anInt7483 = arg1.method6015();
		} else if (arg0 == 5) {
			this.anInt7491 = arg1.method6015();
		} else if (arg0 == 6) {
			this.anInt7492 = arg1.method6015();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(30) int local30 = Static450.anIntArray619[arg0] * this.anInt7492 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static560.anInt9394; local40++) {
				Static80.anInt1665 = Integer.MAX_VALUE;
				Static475.anInt7997 = Integer.MAX_VALUE;
				Static367.anInt8232 = Integer.MAX_VALUE;
				Static506.anInt8763 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt7491 * Static80.anIntArray212[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(153) int local153;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray103[(this.anInt7492 > local71 ? local71 : local71 - this.anInt7492) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(124) int local124 = (this.aByteArray103[(local100 >= this.anInt7491 ? local100 - this.anInt7491 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = local59 - (local100 << 12);
						@Pc(134) int local134 = local124 + 1;
						@Pc(138) int local138 = local130 - this.aShortArray140[local124];
						@Pc(150) int local150 = local30 - (local71 << 12) - this.aShortArray140[local134];
						local153 = this.anInt7483;
						@Pc(188) int local188;
						if (local153 == 1) {
							local188 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local150 = local150 < 0 ? -local150 : local150;
							local188 = local150 >= local138 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local188 = local150 + local138;
							local188 = local188 * local188 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local188 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local188 = (local138 >= 0 ? local138 : -local138) + (local150 >= 0 ? local150 : -local150);
						} else {
							local188 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (local188 < Static506.anInt8763) {
							Static80.anInt1665 = Static475.anInt7997;
							Static475.anInt7997 = Static367.anInt8232;
							Static367.anInt8232 = Static506.anInt8763;
							Static506.anInt8763 = local188;
						} else if (local188 < Static367.anInt8232) {
							Static80.anInt1665 = Static475.anInt7997;
							Static475.anInt7997 = Static367.anInt8232;
							Static367.anInt8232 = local188;
						} else if (Static475.anInt7997 > local188) {
							Static80.anInt1665 = Static475.anInt7997;
							Static475.anInt7997 = local188;
						} else if (Static80.anInt1665 > local188) {
							Static80.anInt1665 = local188;
						}
					}
				}
				local153 = this.anInt7490;
				if (local153 == 0) {
					local17[local40] = Static506.anInt8763;
				} else if (local153 == 1) {
					local17[local40] = Static367.anInt8232;
				} else if (local153 == 3) {
					local17[local40] = Static475.anInt7997;
				} else if (local153 == 4) {
					local17[local40] = Static80.anInt1665;
				} else if (local153 == 2) {
					local17[local40] = Static367.anInt8232 - Static506.anInt8763;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.aByteArray103 = Static457.method6434(this.anInt7489);
		this.method6200();
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V")
	private void method6200() {
		@Pc(18) Random local18 = new Random((long) this.anInt7489);
		this.aShortArray140 = new short[512];
		if (this.anInt7485 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray140[local30] = (short) Static87.method2047(this.anInt7485, local18);
			}
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6_Sub5_Sub2 extends Class6_Sub5 {

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	private int anInt686 = 2;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "[B")
	private byte[] aByteArray10 = new byte[512];

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	private int anInt685 = 0;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	private int anInt687 = 2048;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	private int anInt689 = 5;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	private int anInt691 = 5;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "[S")
	private short[] aShortArray8 = new short[512];

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	private int anInt693 = 1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(32) int local32 = Static247.anIntArray318[arg0] * this.anInt691 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static240.anInt4386; local42++) {
				Static354.anInt6326 = Integer.MAX_VALUE;
				Static150.anInt3122 = Integer.MAX_VALUE;
				Static262.anInt2548 = Integer.MAX_VALUE;
				Static438.anInt7767 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt689 * Static80.anIntArray117[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(161) int local161;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(98) int local98 = this.aByteArray10[(local73 < this.anInt691 ? local73 : local73 - this.anInt691) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(131) int local131 = (this.aByteArray10[(this.anInt689 <= local102 ? local102 - this.anInt689 : local102) + local98 & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = -(local102 << 12);
						@Pc(139) int local139 = local131 + 1;
						@Pc(145) int local145 = local135 + local61 - this.aShortArray8[local131];
						@Pc(158) int local158 = local32 - (local73 << 12) - this.aShortArray8[local139];
						local161 = this.anInt693;
						@Pc(190) int local190;
						if (local161 == 1) {
							local190 = local158 * local158 + local145 * local145 >> 12;
						} else if (local161 == 3) {
							local145 = local145 >= 0 ? local145 : -local145;
							local158 = local158 < 0 ? -local158 : local158;
							local190 = local145 <= local158 ? local158 : local145;
						} else if (local161 == 4) {
							local145 = (int) (Math.sqrt((double) ((float) (local145 >= 0 ? local145 : -local145) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 < 0 ? -local158 : local158) / 4096.0F)) * 4096.0D);
							local190 = local145 + local158;
							local190 = local190 * local190 >> 12;
						} else if (local161 == 5) {
							local145 *= local145;
							local158 *= local158;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local158 + local145) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local190 = (local158 < 0 ? -local158 : local158) + (local145 < 0 ? -local145 : local145);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local158 * local158 + local145 * local145) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static438.anInt7767 > local190) {
							Static354.anInt6326 = Static150.anInt3122;
							Static150.anInt3122 = Static262.anInt2548;
							Static262.anInt2548 = Static438.anInt7767;
							Static438.anInt7767 = local190;
						} else if (Static262.anInt2548 > local190) {
							Static354.anInt6326 = Static150.anInt3122;
							Static150.anInt3122 = Static262.anInt2548;
							Static262.anInt2548 = local190;
						} else if (local190 < Static150.anInt3122) {
							Static354.anInt6326 = Static150.anInt3122;
							Static150.anInt3122 = local190;
						} else if (local190 < Static354.anInt6326) {
							Static354.anInt6326 = local190;
						}
					}
				}
				local161 = this.anInt686;
				if (local161 == 0) {
					local19[local42] = Static438.anInt7767;
				} else if (local161 == 1) {
					local19[local42] = Static262.anInt2548;
				} else if (local161 == 3) {
					local19[local42] = Static150.anInt3122;
				} else if (local161 == 4) {
					local19[local42] = Static354.anInt6326;
				} else if (local161 == 2) {
					local19[local42] = Static262.anInt2548 - Static438.anInt7767;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	private void method608() {
		@Pc(12) Random local12 = new Random((long) this.anInt685);
		this.aShortArray8 = new short[512];
		if (this.anInt687 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray8[local21] = (short) Static267.method4083(local12, this.anInt687);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.aByteArray10 = Static75.method1488(this.anInt685);
		this.method608();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt689 = this.anInt691 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt685 = arg1.method6433();
		} else if (arg0 == 2) {
			this.anInt687 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt686 = arg1.method6433();
		} else if (arg0 == 4) {
			this.anInt693 = arg1.method6433();
		} else if (arg0 == 5) {
			this.anInt689 = arg1.method6433();
		} else if (arg0 == 6) {
			this.anInt691 = arg1.method6433();
		}
	}
}

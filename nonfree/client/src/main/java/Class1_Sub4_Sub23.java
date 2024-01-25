import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class1_Sub4_Sub23 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	private int anInt4064 = 2;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	private int anInt4068 = 5;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
	private int anInt4066 = 5;

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	private int anInt4069 = 0;

	@OriginalMember(owner = "client!lj", name = "Q", descriptor = "[S")
	private short[] aShortArray69 = new short[512];

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "[B")
	private byte[] aByteArray50 = new byte[512];

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
	private int anInt4073 = 2048;

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private int anInt4072 = 1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	private void method3310() {
		@Pc(20) Random local20 = new Random((long) this.anInt4069);
		this.aShortArray69 = new short[512];
		if (this.anInt4073 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray69[local32] = (short) Static301.method4119(local20, this.anInt4073);
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4066 = this.anInt4068 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt4069 = arg0.method5337();
		} else if (arg1 == 2) {
			this.anInt4073 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt4064 = arg0.method5337();
		} else if (arg1 == 4) {
			this.anInt4072 = arg0.method5337();
		} else if (arg1 == 5) {
			this.anInt4066 = arg0.method5337();
		} else if (arg1 == 6) {
			this.anInt4068 = arg0.method5337();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(29) int local29 = Static419.anIntArray472[arg0] * this.anInt4068 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static395.anInt6592; local39++) {
				Static154.anInt2602 = Integer.MAX_VALUE;
				Static219.anInt3921 = Integer.MAX_VALUE;
				Static196.anInt6763 = Integer.MAX_VALUE;
				Static93.anInt1677 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt4066 * Static119.anIntArray146[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(153) int local153;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray50[(this.anInt4068 > local70 ? local70 : local70 - this.anInt4068) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(125) int local125 = (this.aByteArray50[local95 + (local99 < this.anInt4066 ? local99 : local99 - this.anInt4066) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(138) int local138 = local58 - this.aShortArray69[local125] - (local99 << 12);
						@Pc(150) int local150 = local29 - this.aShortArray69[local129] - (local70 << 12);
						local153 = this.anInt4072;
						@Pc(180) int local180;
						if (local153 == 1) {
							local180 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local150 = local150 < 0 ? -local150 : local150;
							local180 = local138 <= local150 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local180 = local150 + local138;
							local180 = local180 * local180 >> 12;
						} else if (local153 == 5) {
							local138 *= local138;
							local150 *= local150;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local180 = (local150 >= 0 ? local150 : -local150) + (local138 >= 0 ? local138 : -local138);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static93.anInt1677 > local180) {
							Static154.anInt2602 = Static219.anInt3921;
							Static219.anInt3921 = Static196.anInt6763;
							Static196.anInt6763 = Static93.anInt1677;
							Static93.anInt1677 = local180;
						} else if (Static196.anInt6763 > local180) {
							Static154.anInt2602 = Static219.anInt3921;
							Static219.anInt3921 = Static196.anInt6763;
							Static196.anInt6763 = local180;
						} else if (Static219.anInt3921 > local180) {
							Static154.anInt2602 = Static219.anInt3921;
							Static219.anInt3921 = local180;
						} else if (Static154.anInt2602 > local180) {
							Static154.anInt2602 = local180;
						}
					}
				}
				local153 = this.anInt4064;
				if (local153 == 0) {
					local16[local39] = Static93.anInt1677;
				} else if (local153 == 1) {
					local16[local39] = Static196.anInt6763;
				} else if (local153 == 3) {
					local16[local39] = Static219.anInt3921;
				} else if (local153 == 4) {
					local16[local39] = Static154.anInt2602;
				} else if (local153 == 2) {
					local16[local39] = Static196.anInt6763 - Static93.anInt1677;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.aByteArray50 = Static41.method588(this.anInt4069);
		this.method3310();
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	private int anInt4085 = 2;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	private int anInt4084 = 5;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	private int anInt4088 = 1;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "[S")
	private short[] aShortArray56 = new short[512];

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
	private int anInt4094 = 0;

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "[B")
	private byte[] aByteArray46 = new byte[512];

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
	private int anInt4095 = 5;

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
	private int anInt4093 = 2048;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	private void method3098() {
		@Pc(16) Random local16 = new Random((long) this.anInt4094);
		this.aShortArray56 = new short[512];
		if (this.anInt4093 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray56[local29] = (short) Static183.method3421(local16, this.anInt4093);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.aByteArray46 = Static14.method373(this.anInt4094);
		this.method3098();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(29) int local29 = Static160.anIntArray187[arg0] * this.anInt4095 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static106.anInt3045; local39++) {
				Static129.anInt3533 = Integer.MAX_VALUE;
				Static138.anInt655 = Integer.MAX_VALUE;
				Static157.anInt3988 = Integer.MAX_VALUE;
				Static149.anInt3853 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt4084 * Static15.anIntArray41[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(154) int local154;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(94) int local94 = this.aByteArray46[(this.anInt4095 > local70 ? local70 : local70 - this.anInt4095) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local62 - 1; local98 <= local66; local98++) {
						@Pc(127) int local127 = (this.aByteArray46[local94 + (local98 >= this.anInt4084 ? local98 - this.anInt4084 : local98) & 0xFF] & 0xFF) * 2;
						@Pc(132) int local132 = local127 + 1;
						@Pc(139) int local139 = local58 - this.aShortArray56[local127] - (local98 << 12);
						@Pc(151) int local151 = local29 - (local70 << 12) - this.aShortArray56[local132];
						local154 = this.anInt4088;
						@Pc(185) int local185;
						if (local154 == 1) {
							local185 = local151 * local151 + local139 * local139 >> 12;
						} else if (local154 == 3) {
							local151 = local151 >= 0 ? local151 : -local151;
							local139 = local139 < 0 ? -local139 : local139;
							local185 = local139 > local151 ? local139 : local151;
						} else if (local154 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local185 = local151 + local139;
							local185 = local185 * local185 >> 12;
						} else if (local154 == 5) {
							local139 *= local139;
							local151 *= local151;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local185 = (local151 < 0 ? -local151 : local151) + (local139 >= 0 ? local139 : -local139);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local139 * local139 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static149.anInt3853 > local185) {
							Static129.anInt3533 = Static138.anInt655;
							Static138.anInt655 = Static157.anInt3988;
							Static157.anInt3988 = Static149.anInt3853;
							Static149.anInt3853 = local185;
						} else if (local185 < Static157.anInt3988) {
							Static129.anInt3533 = Static138.anInt655;
							Static138.anInt655 = Static157.anInt3988;
							Static157.anInt3988 = local185;
						} else if (local185 < Static138.anInt655) {
							Static129.anInt3533 = Static138.anInt655;
							Static138.anInt655 = local185;
						} else if (local185 < Static129.anInt3533) {
							Static129.anInt3533 = local185;
						}
					}
				}
				local154 = this.anInt4085;
				if (local154 == 0) {
					local12[local39] = Static149.anInt3853;
				} else if (local154 == 1) {
					local12[local39] = Static157.anInt3988;
				} else if (local154 == 3) {
					local12[local39] = Static138.anInt655;
				} else if (local154 == 4) {
					local12[local39] = Static129.anInt3533;
				} else if (local154 == 2) {
					local12[local39] = Static157.anInt3988 - Static149.anInt3853;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4084 = this.anInt4095 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt4094 = arg1.method218();
		} else if (arg0 == 2) {
			this.anInt4093 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt4085 = arg1.method218();
		} else if (arg0 == 4) {
			this.anInt4088 = arg1.method218();
		} else if (arg0 == 5) {
			this.anInt4084 = arg1.method218();
		} else if (arg0 == 6) {
			this.anInt4095 = arg1.method218();
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class12_Sub1_Sub27 extends Class12_Sub1 {

	@OriginalMember(owner = "client!raa", name = "J", descriptor = "I")
	private int anInt7770 = 2048;

	@OriginalMember(owner = "client!raa", name = "Q", descriptor = "I")
	private int anInt7775 = 1;

	@OriginalMember(owner = "client!raa", name = "O", descriptor = "[S")
	private short[] aShortArray104 = new short[512];

	@OriginalMember(owner = "client!raa", name = "K", descriptor = "I")
	private int anInt7771 = 5;

	@OriginalMember(owner = "client!raa", name = "S", descriptor = "I")
	private int anInt7777 = 5;

	@OriginalMember(owner = "client!raa", name = "E", descriptor = "[B")
	private byte[] aByteArray96 = new byte[512];

	@OriginalMember(owner = "client!raa", name = "U", descriptor = "I")
	private int anInt7779 = 0;

	@OriginalMember(owner = "client!raa", name = "T", descriptor = "I")
	private int anInt7778 = 2;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7771 = this.anInt7777 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt7779 = arg0.method5216();
		} else if (arg1 == 2) {
			this.anInt7770 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt7778 = arg0.method5216();
		} else if (arg1 == 4) {
			this.anInt7775 = arg0.method5216();
		} else if (arg1 == 5) {
			this.anInt7771 = arg0.method5216();
		} else if (arg1 == 6) {
			this.anInt7777 = arg0.method5216();
		}
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.aByteArray96 = Static4.method195(this.anInt7779);
		this.method6473();
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(29) int local29 = Static353.anIntArray458[arg0] * this.anInt7777 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static357.anInt6670; local39++) {
				Static270.anInt7944 = Integer.MAX_VALUE;
				Static226.anInt4840 = Integer.MAX_VALUE;
				Static325.anInt6122 = Integer.MAX_VALUE;
				Static190.anInt4292 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static347.anIntArray455[local39] * this.anInt7771 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(151) int local151;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(94) int local94 = this.aByteArray96[(local70 >= this.anInt7777 ? local70 - this.anInt7777 : local70) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local62 - 1; local98 <= local66; local98++) {
						@Pc(122) int local122 = (this.aByteArray96[(local98 < this.anInt7771 ? local98 : local98 - this.anInt7771) + local94 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = -(local98 << 12);
						@Pc(130) int local130 = local122 + 1;
						@Pc(135) int local135 = local126 + local58 - this.aShortArray104[local122];
						@Pc(148) int local148 = local29 - (local70 << 12) - this.aShortArray104[local130];
						local151 = this.anInt7775;
						@Pc(185) int local185;
						if (local151 == 1) {
							local185 = local135 * local135 + local148 * local148 >> 12;
						} else if (local151 == 3) {
							local135 = local135 >= 0 ? local135 : -local135;
							local148 = local148 < 0 ? -local148 : local148;
							local185 = local148 < local135 ? local135 : local148;
						} else if (local151 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 >= 0 ? local135 : -local135) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local185 = local148 + local135;
							local185 = local185 * local185 >> 12;
						} else if (local151 == 5) {
							local148 *= local148;
							local135 *= local135;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local135) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local185 = (local148 >= 0 ? local148 : -local148) + (local135 < 0 ? -local135 : local135);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local148 * local148 + local135 * local135) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static190.anInt4292 > local185) {
							Static270.anInt7944 = Static226.anInt4840;
							Static226.anInt4840 = Static325.anInt6122;
							Static325.anInt6122 = Static190.anInt4292;
							Static190.anInt4292 = local185;
						} else if (Static325.anInt6122 > local185) {
							Static270.anInt7944 = Static226.anInt4840;
							Static226.anInt4840 = Static325.anInt6122;
							Static325.anInt6122 = local185;
						} else if (Static226.anInt4840 > local185) {
							Static270.anInt7944 = Static226.anInt4840;
							Static226.anInt4840 = local185;
						} else if (Static270.anInt7944 > local185) {
							Static270.anInt7944 = local185;
						}
					}
				}
				local151 = this.anInt7778;
				if (local151 == 0) {
					local11[local39] = Static190.anInt4292;
				} else if (local151 == 1) {
					local11[local39] = Static325.anInt6122;
				} else if (local151 == 3) {
					local11[local39] = Static226.anInt4840;
				} else if (local151 == 4) {
					local11[local39] = Static270.anInt7944;
				} else if (local151 == 2) {
					local11[local39] = Static325.anInt6122 - Static190.anInt4292;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V")
	private void method6473() {
		@Pc(12) Random local12 = new Random((long) this.anInt7779);
		this.aShortArray104 = new short[512];
		if (this.anInt7770 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray104[local27] = (short) Static114.method2345(local12, this.anInt7770);
			}
		}
	}
}

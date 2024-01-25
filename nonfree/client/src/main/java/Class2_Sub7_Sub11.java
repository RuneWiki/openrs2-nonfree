import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class2_Sub7_Sub11 extends Class2_Sub7 {

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
	private int anInt3030 = 1;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "[B")
	private byte[] aByteArray68 = new byte[512];

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
	private int anInt3031 = 2;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "[S")
	private short[] aShortArray63 = new short[512];

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
	private int anInt3032 = 5;

	@OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
	private int anInt3035 = 2048;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
	private int anInt3034 = 5;

	@OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
	private int anInt3036 = 0;

	static {
		new Class202("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.aByteArray68 = Static305.method4769(this.anInt3036);
		this.method2808();
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	private void method2808() {
		@Pc(20) Random local20 = new Random((long) this.anInt3036);
		this.aShortArray63 = new short[512];
		if (this.anInt3035 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray63[local32] = (short) Static202.method3259(this.anInt3035, local20);
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3032 = this.anInt3034 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt3036 = arg1.method5170();
		} else if (arg0 == 2) {
			this.anInt3035 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt3031 = arg1.method5170();
		} else if (arg0 == 4) {
			this.anInt3030 = arg1.method5170();
		} else if (arg0 == 5) {
			this.anInt3032 = arg1.method5170();
		} else if (arg0 == 6) {
			this.anInt3034 = arg1.method5170();
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(24) int local24 = Static313.anIntArray521[arg0] * this.anInt3034 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static352.anInt6485; local34++) {
				Static206.anInt3718 = Integer.MAX_VALUE;
				Static417.anInt7783 = Integer.MAX_VALUE;
				Static194.anInt1961 = Integer.MAX_VALUE;
				Static187.anInt3430 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static427.anIntArray602[local34] * this.anInt3032 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(142) int local142;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(86) int local86 = this.aByteArray68[(local65 >= this.anInt3034 ? local65 - this.anInt3034 : local65) & 0xFF] & 0xFF;
					for (@Pc(90) int local90 = local57 - 1; local90 <= local61; local90++) {
						@Pc(115) int local115 = (this.aByteArray68[local86 + (this.anInt3032 <= local90 ? local90 - this.anInt3032 : local90) & 0xFF] & 0xFF) * 2;
						@Pc(119) int local119 = local90 << 12;
						@Pc(123) int local123 = local115 + 1;
						@Pc(127) int local127 = local53 - local119 - this.aShortArray63[local115];
						@Pc(139) int local139 = local24 - (local65 << 12) - this.aShortArray63[local123];
						local142 = this.anInt3030;
						@Pc(175) int local175;
						if (local142 == 1) {
							local175 = local139 * local139 + local127 * local127 >> 12;
						} else if (local142 == 3) {
							local127 = local127 >= 0 ? local127 : -local127;
							local139 = local139 < 0 ? -local139 : local139;
							local175 = local127 > local139 ? local127 : local139;
						} else if (local142 == 4) {
							local127 = (int) (Math.sqrt((double) ((float) (local127 < 0 ? -local127 : local127) / 4096.0F)) * 4096.0D);
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local175 = local139 + local127;
							local175 = local175 * local175 >> 12;
						} else if (local142 == 5) {
							local139 *= local139;
							local127 *= local127;
							local175 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local139 + local127) / 1.6777216E7F))) * 4096.0D);
						} else if (local142 == 2) {
							local175 = (local127 < 0 ? -local127 : local127) + (local139 < 0 ? -local139 : local139);
						} else {
							local175 = (int) (Math.sqrt((double) ((float) (local127 * local127 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static187.anInt3430 > local175) {
							Static206.anInt3718 = Static417.anInt7783;
							Static417.anInt7783 = Static194.anInt1961;
							Static194.anInt1961 = Static187.anInt3430;
							Static187.anInt3430 = local175;
						} else if (local175 < Static194.anInt1961) {
							Static206.anInt3718 = Static417.anInt7783;
							Static417.anInt7783 = Static194.anInt1961;
							Static194.anInt1961 = local175;
						} else if (Static417.anInt7783 > local175) {
							Static206.anInt3718 = Static417.anInt7783;
							Static417.anInt7783 = local175;
						} else if (Static206.anInt3718 > local175) {
							Static206.anInt3718 = local175;
						}
					}
				}
				local142 = this.anInt3031;
				if (local142 == 0) {
					local11[local34] = Static187.anInt3430;
				} else if (local142 == 1) {
					local11[local34] = Static194.anInt1961;
				} else if (local142 == 3) {
					local11[local34] = Static417.anInt7783;
				} else if (local142 == 4) {
					local11[local34] = Static206.anInt3718;
				} else if (local142 == 2) {
					local11[local34] = Static194.anInt1961 - Static187.anInt3430;
				}
			}
		}
		return local11;
	}
}

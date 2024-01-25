import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	private int anInt4951 = 5;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	private int anInt4954 = 2;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "[B")
	private byte[] aByteArray79 = new byte[512];

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
	private int anInt4963 = 5;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
	private int anInt4962 = 0;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "[S")
	private short[] aShortArray103 = new short[512];

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	private int anInt4965 = 1;

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
	private int anInt4964 = 2048;

	static {
		new Class34("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(24) int local24 = Static266.anIntArray454[arg0] * this.anInt4951 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static153.anInt3378; local34++) {
				Static301.anInt5959 = Integer.MAX_VALUE;
				Static53.anInt1592 = Integer.MAX_VALUE;
				Static213.anInt4560 = Integer.MAX_VALUE;
				Static82.anInt2082 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static107.anIntArray234[local34] * this.anInt4963 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(147) int local147;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(86) int local86 = this.aByteArray79[(this.anInt4951 > local65 ? local65 : local65 - this.anInt4951) & 0xFF] & 0xFF;
					for (@Pc(90) int local90 = local57 - 1; local90 <= local61; local90++) {
						@Pc(119) int local119 = (this.aByteArray79[local86 + (local90 >= this.anInt4963 ? local90 - this.anInt4963 : local90) & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local119 + 1;
						@Pc(131) int local131 = local53 - this.aShortArray103[local119] - (local90 << 12);
						@Pc(144) int local144 = local24 - this.aShortArray103[local124] - (local65 << 12);
						local147 = this.anInt4965;
						@Pc(176) int local176;
						if (local147 == 1) {
							local176 = local144 * local144 + local131 * local131 >> 12;
						} else if (local147 == 3) {
							local144 = local144 >= 0 ? local144 : -local144;
							local131 = local131 < 0 ? -local131 : local131;
							local176 = local144 >= local131 ? local144 : local131;
						} else if (local147 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 < 0 ? -local131 : local131) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local176 = local131 + local144;
							local176 = local176 * local176 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local131 *= local131;
							local176 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local131) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local176 = (local131 < 0 ? -local131 : local131) + (local144 >= 0 ? local144 : -local144);
						} else {
							local176 = (int) (Math.sqrt((double) ((float) (local131 * local131 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static82.anInt2082 > local176) {
							Static301.anInt5959 = Static53.anInt1592;
							Static53.anInt1592 = Static213.anInt4560;
							Static213.anInt4560 = Static82.anInt2082;
							Static82.anInt2082 = local176;
						} else if (Static213.anInt4560 > local176) {
							Static301.anInt5959 = Static53.anInt1592;
							Static53.anInt1592 = Static213.anInt4560;
							Static213.anInt4560 = local176;
						} else if (local176 < Static53.anInt1592) {
							Static301.anInt5959 = Static53.anInt1592;
							Static53.anInt1592 = local176;
						} else if (Static301.anInt5959 > local176) {
							Static301.anInt5959 = local176;
						}
					}
				}
				local147 = this.anInt4954;
				if (local147 == 0) {
					local11[local34] = Static82.anInt2082;
				} else if (local147 == 1) {
					local11[local34] = Static213.anInt4560;
				} else if (local147 == 3) {
					local11[local34] = Static53.anInt1592;
				} else if (local147 == 4) {
					local11[local34] = Static301.anInt5959;
				} else if (local147 == 2) {
					local11[local34] = Static213.anInt4560 - Static82.anInt2082;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
	private void method4368() {
		@Pc(18) Random local18 = new Random((long) this.anInt4962);
		this.aShortArray103 = new short[512];
		if (this.anInt4964 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray103[local30] = (short) Static295.method4970(local18, this.anInt4964);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.aByteArray79 = Static252.method4575(this.anInt4962);
		this.method4368();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4963 = this.anInt4951 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt4962 = arg1.method4532();
		} else if (arg0 == 2) {
			this.anInt4964 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt4954 = arg1.method4532();
		} else if (arg0 == 4) {
			this.anInt4965 = arg1.method4532();
		} else if (arg0 == 5) {
			this.anInt4963 = arg1.method4532();
		} else if (arg0 == 6) {
			this.anInt4951 = arg1.method4532();
		}
	}
}

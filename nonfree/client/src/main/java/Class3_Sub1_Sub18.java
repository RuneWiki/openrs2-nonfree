import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
	private int anInt4627 = 5;

	@OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
	private int anInt4633 = 2048;

	@OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
	private int anInt4628 = 1;

	@OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
	private int anInt4632 = 2;

	@OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
	private int anInt4636 = 5;

	@OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
	private int anInt4635 = 0;

	@OriginalMember(owner = "client!ir", name = "X", descriptor = "[B")
	private byte[] aByteArray46 = new byte[512];

	@OriginalMember(owner = "client!ir", name = "V", descriptor = "[S")
	private short[] aShortArray89 = new short[512];

	static {
		new Class67("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt4627 = this.anInt4636 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt4635 = arg1.method7548();
		} else if (arg0 == 2) {
			this.anInt4633 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt4632 = arg1.method7548();
		} else if (arg0 == 4) {
			this.anInt4628 = arg1.method7548();
		} else if (arg0 == 5) {
			this.anInt4627 = arg1.method7548();
		} else if (arg0 == 6) {
			this.anInt4636 = arg1.method7548();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(24) int local24 = this.anInt4636 * Static402.anIntArray741[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static307.anInt4846; local34++) {
				Static196.anInt4452 = Integer.MAX_VALUE;
				Static359.anInt6719 = Integer.MAX_VALUE;
				Static486.anInt7914 = Integer.MAX_VALUE;
				Static250.anInt5126 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt4627 * Static241.anIntArray759[local34] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(148) int local148;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(87) int local87 = this.aByteArray46[(this.anInt4636 > local66 ? local66 : local66 - this.anInt4636) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(121) int local121 = (this.aByteArray46[local87 + (this.anInt4627 > local91 ? local91 : local91 - this.anInt4627) & 0xFF] & 0xFF) * 2;
						@Pc(125) int local125 = local121 + 1;
						@Pc(134) int local134 = local54 - this.aShortArray89[local121] - (local91 << 12);
						@Pc(145) int local145 = local24 - this.aShortArray89[local125] - (local66 << 12);
						local148 = this.anInt4628;
						@Pc(177) int local177;
						if (local148 == 1) {
							local177 = local134 * local134 + local145 * local145 >> 12;
						} else if (local148 == 3) {
							local134 = local134 < 0 ? -local134 : local134;
							local145 = local145 < 0 ? -local145 : local145;
							local177 = local134 > local145 ? local134 : local145;
						} else if (local148 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 < 0 ? -local134 : local134) / 4096.0F)) * 4096.0D);
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local177 = local134 + local145;
							local177 = local177 * local177 >> 12;
						} else if (local148 == 5) {
							local134 *= local134;
							local145 *= local145;
							local177 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local145 + local134) / 1.6777216E7F))) * 4096.0D);
						} else if (local148 == 2) {
							local177 = (local134 < 0 ? -local134 : local134) + (local145 >= 0 ? local145 : -local145);
						} else {
							local177 = (int) (Math.sqrt((double) ((float) (local145 * local145 + local134 * local134) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static250.anInt5126 > local177) {
							Static196.anInt4452 = Static359.anInt6719;
							Static359.anInt6719 = Static486.anInt7914;
							Static486.anInt7914 = Static250.anInt5126;
							Static250.anInt5126 = local177;
						} else if (Static486.anInt7914 > local177) {
							Static196.anInt4452 = Static359.anInt6719;
							Static359.anInt6719 = Static486.anInt7914;
							Static486.anInt7914 = local177;
						} else if (local177 < Static359.anInt6719) {
							Static196.anInt4452 = Static359.anInt6719;
							Static359.anInt6719 = local177;
						} else if (local177 < Static196.anInt4452) {
							Static196.anInt4452 = local177;
						}
					}
				}
				local148 = this.anInt4632;
				if (local148 == 0) {
					local11[local34] = Static250.anInt5126;
				} else if (local148 == 1) {
					local11[local34] = Static486.anInt7914;
				} else if (local148 == 3) {
					local11[local34] = Static359.anInt6719;
				} else if (local148 == 4) {
					local11[local34] = Static196.anInt4452;
				} else if (local148 == 2) {
					local11[local34] = Static486.anInt7914 - Static250.anInt5126;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.aByteArray46 = Static15.method661(this.anInt4635);
		this.method3876();
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	private void method3876() {
		@Pc(12) Random local12 = new Random((long) this.anInt4635);
		this.aShortArray89 = new short[512];
		if (this.anInt4633 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray89[local29] = (short) Static500.method7215(local12, this.anInt4633);
			}
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tq", name = "ab", descriptor = "[F")
	public static final float[] aFloatArray58;

	@OriginalMember(owner = "client!tq", name = "bb", descriptor = "[F")
	public static final float[] aFloatArray59;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	private int anInt7939;

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray102;

	@OriginalMember(owner = "client!tq", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray103;

	@OriginalMember(owner = "client!tq", name = "V", descriptor = "[I")
	private int[] anIntArray744;

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
	private int anInt7946;

	@OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
	private int anInt7947;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	private int anInt7935 = 4;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
	private int anInt7942 = 409;

	@OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
	private int anInt7944 = 204;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
	private int anInt7940 = 8;

	@OriginalMember(owner = "client!tq", name = "Z", descriptor = "I")
	private int anInt7949 = 1024;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
	private int anInt7937 = 81;

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
	private int anInt7936 = 0;

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
	private int anInt7938 = 1024;

	static {
		new Class306("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
		aFloatArray58 = new float[16384];
		aFloatArray59 = new float[16384];
		@Pc(19) double local19 = 3.834951969714103E-4D;
		for (@Pc(21) int local21 = 0; local21 < 16384; local21++) {
			aFloatArray58[local21] = (float) Math.sin((double) local21 * local19);
			aFloatArray59[local21] = (float) Math.cos(local19 * (double) local21);
		}
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.method6594();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt7936 + Static7.anIntArray20[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt7940 && local30 >= this.anIntArray744[local23]) {
				local23++;
			}
			@Pc(64) int local64 = local23 - 1;
			@Pc(75) boolean local75 = (local23 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray744[local23];
			@Pc(87) int local87 = this.anIntArray744[local23 - 1];
			if (this.anInt7939 + local87 < local30 && local80 - this.anInt7939 > local30) {
				for (@Pc(109) int local109 = 0; local109 < Static452.anInt7734; local109++) {
					@Pc(120) int local120 = local75 ? this.anInt7938 : -this.anInt7938;
					@Pc(122) int local122 = 0;
					@Pc(133) int local133;
					for (local133 = Static228.anIntArray442[local109] + (local120 * this.anInt7947 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (local122 < this.anInt7935 && local133 >= this.anIntArrayArray102[local64][local122]) {
						local122++;
					}
					@Pc(170) int local170 = local122 - 1;
					@Pc(177) int local177 = this.anIntArrayArray102[local64][local122];
					@Pc(184) int local184 = this.anIntArrayArray102[local64][local170];
					if (this.anInt7939 + local184 < local133 && local177 - this.anInt7939 > local133) {
						local17[local109] = this.anIntArrayArray103[local64][local170];
					} else {
						local17[local109] = 0;
					}
				}
			} else {
				Static551.method3492(local17, 0, Static452.anInt7734, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7935 = arg0.method3922();
		} else if (arg1 == 1) {
			this.anInt7940 = arg0.method3922();
		} else if (arg1 == 2) {
			this.anInt7942 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt7944 = arg0.method3967();
		} else if (arg1 == 4) {
			this.anInt7938 = arg0.method3967();
		} else if (arg1 == 5) {
			this.anInt7936 = arg0.method3967();
		} else if (arg1 == 6) {
			this.anInt7937 = arg0.method3967();
		} else if (arg1 == 7) {
			this.anInt7949 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	private void method6594() {
		@Pc(21) Random local21 = new Random((long) this.anInt7940);
		this.anInt7946 = 4096 / this.anInt7940;
		this.anInt7939 = this.anInt7937 / 2;
		this.anInt7947 = 4096 / this.anInt7935;
		@Pc(44) int local44 = this.anInt7947 / 2;
		this.anIntArrayArray103 = new int[this.anInt7940][this.anInt7935];
		@Pc(56) int local56 = this.anInt7946 / 2;
		this.anIntArray744 = new int[this.anInt7940 + 1];
		this.anIntArrayArray102 = new int[this.anInt7940][this.anInt7935 + 1];
		this.anIntArray744[0] = 0;
		for (@Pc(79) int local79 = 0; local79 < this.anInt7940; local79++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local79 > 0) {
				local86 = this.anInt7946;
				local98 = (Static220.method3801(local21, 4096) - 2048) * this.anInt7944 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local56 >> 12);
				this.anIntArray744[local79] = local106 + this.anIntArray744[local79 - 1];
			}
			this.anIntArrayArray102[local79][0] = 0;
			for (local86 = 0; local86 < this.anInt7935; local86++) {
				if (local86 > 0) {
					local98 = this.anInt7947;
					@Pc(150) int local150 = (Static220.method3801(local21, 4096) - 2048) * this.anInt7942 >> 12;
					local98 += local150 * local44 >> 12;
					this.anIntArrayArray102[local79][local86] = local98 + this.anIntArrayArray102[local79][local86 - 1];
				}
				this.anIntArrayArray103[local79][local86] = this.anInt7949 > 0 ? 4096 - Static220.method3801(local21, this.anInt7949) : 4096;
			}
			this.anIntArrayArray102[local79][this.anInt7935] = 4096;
		}
		this.anIntArray744[this.anInt7940] = 4096;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray142;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "[S")
	private final short[] aShortArray68 = new short[257];

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	private int anInt5650 = 0;

	static {
		new Class151("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
		new Class151("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(27) int[] local27 = this.method5620(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static434.anInt4326; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray68[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I")
	private int[] method4396(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray338;
		} else if (arg0 >= this.anIntArrayArray142.length) {
			return this.anIntArray337;
		} else {
			return this.anIntArrayArray142[arg0];
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	private void method4397() {
		@Pc(13) int local13 = this.anInt5650;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(64) int[] local64;
		@Pc(69) int[] local69;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray142.length - 1 > local33 && this.anIntArrayArray142[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray142[local33 - 1];
				local69 = this.anIntArrayArray142[local33];
				local80 = this.method4396(local33 - 2)[1];
				local84 = local64[1];
				local88 = local69[1];
				local97 = this.method4396(local33 + 1)[1];
				@Pc(113) int local113 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				@Pc(119) int local119 = local113 * local113 >> 12;
				@Pc(129) int local129 = local97 + local84 - local80 - local88;
				@Pc(137) int local137 = local80 - local84 - local129;
				@Pc(142) int local142 = local88 - local80;
				@Pc(154) int local154 = local119 * (local113 * local129 >> 12) >> 12;
				@Pc(160) int local160 = local137 * local119 >> 12;
				@Pc(166) int local166 = local142 * local113 >> 12;
				@Pc(175) int local175 = local160 + local154 + local166 + local84;
				if (local175 <= -32768) {
					local175 = -32767;
				}
				if (local175 >= 32768) {
					local175 = 32767;
				}
				this.aShortArray68[local13] = (short) local175;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray142.length - 1 > local33 && this.anIntArrayArray142[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray142[local33 - 1];
				local69 = this.anIntArrayArray142[local33];
				local80 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local84 = 4096 - Static366.anIntArray375[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local84 * local69[1] + local64[1] * local88 >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray68[local13] = (short) local97;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray142.length - 1 && local31 >= this.anIntArrayArray142[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray142[local33 - 1];
				local69 = this.anIntArrayArray142[local33];
				local80 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local84 = 4096 - local80;
				local88 = local69[1] * local80 + local64[1] * local84 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray68[local13] = (short) local88;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		if (this.anIntArrayArray142 == null) {
			this.anIntArrayArray142 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray142.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5650 == 2) {
			this.method4401();
		}
		Static103.method1475();
		this.method4397();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5650 = arg1.method4463();
		this.anIntArrayArray142 = new int[arg1.method4463()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray142.length; local17++) {
			this.anIntArrayArray142[local17][0] = arg1.method4485();
			this.anIntArrayArray142[local17][1] = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
	private void method4401() {
		@Pc(8) int[] local8 = this.anIntArrayArray142[0];
		@Pc(13) int[] local13 = this.anIntArrayArray142[1];
		@Pc(22) int[] local22 = this.anIntArrayArray142[this.anIntArrayArray142.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray142[this.anIntArrayArray142.length - 1];
		this.anIntArray337 = new int[] { local22[0] + local22[0] - local37[0], local22[1] + local22[1] + -local37[1] };
		this.anIntArray338 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class3_Sub4_Sub24 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nw", name = "R", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!nw", name = "V", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!nw", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!nw", name = "M", descriptor = "I")
	private int anInt5043 = 0;

	@OriginalMember(owner = "client!nw", name = "Y", descriptor = "[S")
	private final short[] aShortArray68 = new short[257];

	static {
		new Class174("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)[I")
	private int[] method4160(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray322;
		} else if (this.anIntArrayArray41.length <= arg0) {
			return this.anIntArray323;
		} else {
			return this.anIntArrayArray41[arg0];
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5043 = arg0.method4096();
		this.anIntArrayArray41 = new int[arg0.method4096()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray41.length; local20++) {
			this.anIntArrayArray41[local20][0] = arg0.method4083();
			this.anIntArrayArray41[local20][1] = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int[] local26 = this.method6139(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2687; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray68[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		if (this.anIntArrayArray41 == null) {
			this.anIntArrayArray41 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray41.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5043 == 2) {
			this.method4163();
		}
		Static417.method5714();
		this.method4164();
	}

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "(I)V")
	private void method4163() {
		@Pc(8) int[] local8 = this.anIntArrayArray41[0];
		@Pc(13) int[] local13 = this.anIntArrayArray41[1];
		@Pc(22) int[] local22 = this.anIntArrayArray41[this.anIntArrayArray41.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray41[this.anIntArrayArray41.length - 1];
		this.anIntArray323 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - local31[1] + local22[1] };
		this.anIntArray322 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + (local8[1] - local13[1]) };
	}

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "(I)V")
	private void method4164() {
		@Pc(14) int local14 = this.anInt5043;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray41.length - 1 > local32 && local30 >= this.anIntArrayArray41[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray41[local32 - 1];
				local68 = this.anIntArrayArray41[local32];
				local79 = this.method4160(local32 - 2)[1];
				local83 = local63[1];
				local87 = local68[1];
				local96 = this.method4160(local32 + 1)[1];
				@Pc(114) int local114 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(120) int local120 = local114 * local114 >> 12;
				@Pc(129) int local129 = local83 + local96 - local87 - local79;
				@Pc(136) int local136 = local79 - local83 - local129;
				@Pc(141) int local141 = local87 - local79;
				@Pc(153) int local153 = (local129 * local114 >> 12) * local120 >> 12;
				@Pc(159) int local159 = local120 * local136 >> 12;
				@Pc(165) int local165 = local141 * local114 >> 12;
				@Pc(173) int local173 = local165 + local153 + local159 + local83;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray68[local14] = (short) local173;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray41.length - 1 > local32 && this.anIntArrayArray41[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray41[local32 - 1];
				local68 = this.anIntArrayArray41[local32];
				local79 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local83 = 4096 - Static331.anIntArray491[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local68[1] * local83 + local87 * local63[1] >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray68[local14] = (short) local96;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray41.length - 1 > local32 && this.anIntArrayArray41[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray41[local32 - 1];
				local68 = this.anIntArrayArray41[local32];
				local79 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local83 = 4096 - local79;
				local87 = local83 * local63[1] + local79 * local68[1] >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray68[local14] = (short) local87;
			}
		}
	}
}

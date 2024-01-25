import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
	private int anInt7223 = 0;

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "[S")
	private final short[] aShortArray144 = new short[257];

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		if (this.anIntArrayArray74 == null) {
			this.anIntArrayArray74 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray74.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7223 == 2) {
			this.method6085();
		}
		Static272.method4337();
		this.method6081();
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
	private void method6081() {
		@Pc(8) int local8 = this.anInt7223;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray74.length - 1 > local28 && local26 >= this.anIntArrayArray74[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray74[local28 - 1];
				local68 = this.anIntArrayArray74[local28];
				local77 = this.method6082(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method6082(local28 + 1)[1];
				@Pc(111) int local111 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(128) int local128 = local94 + local81 - local77 - local85;
				@Pc(136) int local136 = local77 - local128 - local81;
				@Pc(141) int local141 = local85 - local77;
				@Pc(153) int local153 = (local111 * local128 >> 12) * local117 >> 12;
				@Pc(159) int local159 = local136 * local117 >> 12;
				@Pc(165) int local165 = local111 * local141 >> 12;
				@Pc(174) int local174 = local165 + local153 + local159 + local81;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray144[local8] = (short) local174;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray74.length - 1 && this.anIntArrayArray74[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray74[local28 - 1];
				local68 = this.anIntArrayArray74[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static540.anIntArray454[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local85 * local63[1] + local68[1] * local81 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray144[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray74.length - 1 > local28 && this.anIntArrayArray74[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray74[local28 - 1];
				local68 = this.anIntArrayArray74[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local77 * local68[1] + local81 * local63[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray144[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt7223 = arg0.method4888();
		this.anIntArrayArray74 = new int[arg0.method4888()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray74.length; local20++) {
			this.anIntArrayArray74[local20][0] = arg0.method4858();
			this.anIntArrayArray74[local20][1] = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
	private int[] method6082(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray452;
		} else if (this.anIntArrayArray74.length <= arg0) {
			return this.anIntArray451;
		} else {
			return this.anIntArrayArray74[arg0];
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(23) int[] local23 = this.method8716(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static30.anInt908; local25++) {
				@Pc(33) int local33 = local23[local25] >> 4;
				if (local33 < 0) {
					local33 = 0;
				}
				if (local33 > 256) {
					local33 = 256;
				}
				local11[local25] = this.aShortArray144[local33];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V")
	private void method6085() {
		@Pc(8) int[] local8 = this.anIntArrayArray74[0];
		@Pc(13) int[] local13 = this.anIntArrayArray74[1];
		@Pc(22) int[] local22 = this.anIntArrayArray74[this.anIntArrayArray74.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray74[this.anIntArrayArray74.length - 1];
		this.anIntArray452 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray451 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - (-local22[1] - local22[1]) };
	}
}

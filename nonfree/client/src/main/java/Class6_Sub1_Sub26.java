import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class6_Sub1_Sub26 extends Class6_Sub1 {

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!oba", name = "L", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!oba", name = "P", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!oba", name = "H", descriptor = "[S")
	private final short[] aShortArray87 = new short[257];

	@OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
	private int anInt7219 = 0;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	private void method6202() {
		@Pc(8) int[] local8 = this.anIntArrayArray36[0];
		@Pc(13) int[] local13 = this.anIntArrayArray36[1];
		@Pc(22) int[] local22 = this.anIntArrayArray36[this.anIntArrayArray36.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray36[this.anIntArrayArray36.length - 1];
		this.anIntArray444 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] + -local31[1] };
		this.anIntArray443 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] - local13[1] };
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)[I")
	private int[] method6203(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray443;
		} else if (this.anIntArrayArray36.length <= arg0) {
			return this.anIntArray444;
		} else {
			return this.anIntArrayArray36[arg0];
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(21) int[] local21 = this.method8963(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static479.anInt8231; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray87[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)V")
	private void method6206() {
		@Pc(10) int local10 = this.anInt7219;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local10 == 2) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray36.length - 1 > local30 && local28 >= this.anIntArrayArray36[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray36[local30 - 1];
				local66 = this.anIntArrayArray36[local30];
				local75 = this.method6203(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method6203(local30 + 1)[1];
				@Pc(109) int local109 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local79 + local92 - local75 - local83;
				@Pc(133) int local133 = local75 - local79 - local125;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = (local125 * local109 >> 12) * local115 >> 12;
				@Pc(156) int local156 = local133 * local115 >> 12;
				@Pc(162) int local162 = local109 * local138 >> 12;
				@Pc(171) int local171 = local79 + local150 + local156 + local162;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray87[local10] = (short) local171;
			}
		} else if (local10 == 1) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray36.length - 1 && this.anIntArrayArray36[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray36[local30 - 1];
				local66 = this.anIntArrayArray36[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static404.anIntArray300[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local66[1] * local79 + local83 * local61[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray87[local10] = (short) local92;
			}
		} else {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray36.length - 1 > local30 && this.anIntArrayArray36[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray36[local30 - 1];
				local66 = this.anIntArrayArray36[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local66[1] * local75 + local79 * local61[1] >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray87[local10] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt7219 = arg0.method8374();
		this.anIntArrayArray36 = new int[arg0.method8374()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray36.length; local28++) {
			this.anIntArrayArray36[local28][0] = arg0.method8363();
			this.anIntArrayArray36[local28][1] = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		if (this.anIntArrayArray36 == null) {
			this.anIntArrayArray36 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray36.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7219 == 2) {
			this.method6202();
		}
		Static364.method5249();
		this.method6206();
	}
}

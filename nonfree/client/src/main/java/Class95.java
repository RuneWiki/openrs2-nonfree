import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class95 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!ft;")
	public Class113 aClass113_1;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[[B")
	public byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "[Lclient!ft;")
	public Class113[] aClass113Array1;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public final int anInt2654;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "([BI[B)V")
	public Class95(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2654 = Static315.method5003(arg0, arg0.length);
		if (this.anInt2654 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray41 = Static53.method1112(0, arg0, arg0.length);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray41[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2202(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B[B)V")
	private void method2202(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class14_Sub29 local12 = new Class14_Sub29(Static69.method1359(arg0));
		@Pc(22) int local22 = local12.method5866();
		if (local22 < 5 || local22 > 6) {
			throw new RuntimeException();
		}
		if (local22 < 6) {
			this.anInt2652 = 0;
		} else {
			this.anInt2652 = local12.method5878();
		}
		@Pc(53) int local53 = local12.method5866();
		@Pc(64) boolean local64 = (local53 & 0x1) != 0;
		@Pc(75) boolean local75 = (local53 & 0x2) != 0;
		this.anInt2653 = local12.method5900();
		@Pc(82) int local82 = 0;
		@Pc(84) int local84 = -1;
		this.anIntArray219 = new int[this.anInt2653];
		for (@Pc(91) int local91 = 0; local91 < this.anInt2653; local91++) {
			this.anIntArray219[local91] = local82 += local12.method5900();
			if (local84 < this.anIntArray219[local91]) {
				local84 = this.anIntArray219[local91];
			}
		}
		this.anInt2650 = local84 + 1;
		this.anIntArray218 = new int[this.anInt2650];
		this.anIntArray217 = new int[this.anInt2650];
		this.anIntArray220 = new int[this.anInt2650];
		this.anIntArrayArray15 = new int[this.anInt2650][];
		if (local75) {
			this.aByteArrayArray21 = new byte[this.anInt2650][];
		}
		this.anIntArray221 = new int[this.anInt2650];
		@Pc(174) int local174;
		@Pc(188) int local188;
		if (local64) {
			this.anIntArray222 = new int[this.anInt2650];
			for (local174 = 0; local174 < this.anInt2650; local174++) {
				this.anIntArray222[local174] = -1;
			}
			for (local188 = 0; local188 < this.anInt2653; local188++) {
				this.anIntArray222[this.anIntArray219[local188]] = local12.method5878();
			}
			this.aClass113_1 = new Class113(this.anIntArray222);
		}
		for (local174 = 0; local174 < this.anInt2653; local174++) {
			this.anIntArray220[this.anIntArray219[local174]] = local12.method5878();
		}
		if (local75) {
			for (local188 = 0; local188 < this.anInt2653; local188++) {
				@Pc(244) byte[] local244 = new byte[64];
				local12.method5860(local244, 0, 64);
				this.aByteArrayArray21[this.anIntArray219[local188]] = local244;
			}
		}
		for (local188 = 0; local188 < this.anInt2653; local188++) {
			this.anIntArray221[this.anIntArray219[local188]] = local12.method5878();
		}
		for (@Pc(284) int local284 = 0; local284 < this.anInt2653; local284++) {
			this.anIntArray218[this.anIntArray219[local284]] = local12.method5900();
		}
		@Pc(314) int local314;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(331) int local331;
		@Pc(348) int local348;
		for (@Pc(307) int local307 = 0; local307 < this.anInt2653; local307++) {
			local314 = this.anIntArray219[local307];
			local82 = 0;
			local321 = this.anIntArray218[local314];
			local323 = -1;
			this.anIntArrayArray15[local314] = new int[local321];
			for (local331 = 0; local331 < local321; local331++) {
				local348 = this.anIntArrayArray15[local314][local331] = local82 += local12.method5900();
				if (local348 > local323) {
					local323 = local348;
				}
			}
			this.anIntArray217[local314] = local323 + 1;
			if (local323 + 1 == local321) {
				this.anIntArrayArray15[local314] = null;
			}
		}
		if (!local64) {
			return;
		}
		this.aClass113Array1 = new Class113[local84 + 1];
		this.anIntArrayArray14 = new int[local84 + 1][];
		for (local314 = 0; local314 < this.anInt2653; local314++) {
			local321 = this.anIntArray219[local314];
			local323 = this.anIntArray218[local321];
			this.anIntArrayArray14[local321] = new int[this.anIntArray217[local321]];
			for (local331 = 0; local331 < this.anIntArray217[local321]; local331++) {
				this.anIntArrayArray14[local321][local331] = -1;
			}
			for (local348 = 0; local348 < local323; local348++) {
				@Pc(454) int local454;
				if (this.anIntArrayArray15[local321] == null) {
					local454 = local348;
				} else {
					local454 = this.anIntArrayArray15[local321][local348];
				}
				this.anIntArrayArray14[local321][local454] = local12.method5878();
			}
			this.aClass113Array1[local321] = new Class113(this.anIntArrayArray14[local321]);
		}
	}
}

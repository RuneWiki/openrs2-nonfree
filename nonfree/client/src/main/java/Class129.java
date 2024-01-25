import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class129 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!dr;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public int anInt4115;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[Lclient!dr;")
	public Class75[] aClass75Array1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[[B")
	public byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public final int anInt4112;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([BI[B)V")
	public Class129(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4112 = Static104.method6574(arg0, arg0.length);
		if (arg1 != this.anInt4112) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray48 = Static137.method2579(arg0.length, arg0, 0);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (arg2[local38] != this.aByteArray48[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method3616(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)V")
	private void method3616(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class6_Sub26 local12 = new Class6_Sub26(Static483.method7335(arg0));
		@Pc(16) int local16 = local12.method4966();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt4116 = local12.method5000();
		} else {
			this.anInt4116 = 0;
		}
		@Pc(45) int local45 = local12.method4966();
		@Pc(56) boolean local56 = (local45 & 0x1) != 0;
		@Pc(67) boolean local67 = (local45 & 0x2) != 0;
		this.anInt4115 = local12.method4999();
		@Pc(74) int local74 = 0;
		@Pc(76) int local76 = -1;
		this.anIntArray269 = new int[this.anInt4115];
		for (@Pc(83) int local83 = 0; local83 < this.anInt4115; local83++) {
			this.anIntArray269[local83] = local74 += local12.method4999();
			if (local76 < this.anIntArray269[local83]) {
				local76 = this.anIntArray269[local83];
			}
		}
		this.anInt4117 = local76 + 1;
		this.anIntArray267 = new int[this.anInt4117];
		this.anIntArray271 = new int[this.anInt4117];
		this.anIntArray270 = new int[this.anInt4117];
		this.anIntArray266 = new int[this.anInt4117];
		if (local67) {
			this.aByteArrayArray15 = new byte[this.anInt4117][];
		}
		this.anIntArrayArray27 = new int[this.anInt4117][];
		@Pc(162) int local162;
		@Pc(176) int local176;
		if (local56) {
			this.anIntArray268 = new int[this.anInt4117];
			for (local162 = 0; local162 < this.anInt4117; local162++) {
				this.anIntArray268[local162] = -1;
			}
			for (local176 = 0; local176 < this.anInt4115; local176++) {
				this.anIntArray268[this.anIntArray269[local176]] = local12.method5000();
			}
			this.aClass75_1 = new Class75(this.anIntArray268);
		}
		for (local162 = 0; local162 < this.anInt4115; local162++) {
			this.anIntArray270[this.anIntArray269[local162]] = local12.method5000();
		}
		if (local67) {
			for (local176 = 0; local176 < this.anInt4115; local176++) {
				@Pc(236) byte[] local236 = new byte[64];
				local12.method4977(64, local236);
				this.aByteArrayArray15[this.anIntArray269[local176]] = local236;
			}
		}
		for (local176 = 0; local176 < this.anInt4115; local176++) {
			this.anIntArray271[this.anIntArray269[local176]] = local12.method5000();
		}
		for (@Pc(284) int local284 = 0; local284 < this.anInt4115; local284++) {
			this.anIntArray267[this.anIntArray269[local284]] = local12.method4999();
		}
		@Pc(314) int local314;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(331) int local331;
		@Pc(348) int local348;
		for (@Pc(307) int local307 = 0; local307 < this.anInt4115; local307++) {
			local314 = this.anIntArray269[local307];
			local74 = 0;
			local321 = this.anIntArray267[local314];
			local323 = -1;
			this.anIntArrayArray27[local314] = new int[local321];
			for (local331 = 0; local331 < local321; local331++) {
				local348 = this.anIntArrayArray27[local314][local331] = local74 += local12.method4999();
				if (local348 > local323) {
					local323 = local348;
				}
			}
			this.anIntArray266[local314] = local323 + 1;
			if (local321 == local323 + 1) {
				this.anIntArrayArray27[local314] = null;
			}
		}
		if (!local56) {
			return;
		}
		this.anIntArrayArray28 = new int[local76 + 1][];
		this.aClass75Array1 = new Class75[local76 + 1];
		for (local314 = 0; local314 < this.anInt4115; local314++) {
			local321 = this.anIntArray269[local314];
			local323 = this.anIntArray267[local321];
			this.anIntArrayArray28[local321] = new int[this.anIntArray266[local321]];
			for (local331 = 0; local331 < this.anIntArray266[local321]; local331++) {
				this.anIntArrayArray28[local321][local331] = -1;
			}
			for (local348 = 0; local348 < local323; local348++) {
				@Pc(454) int local454;
				if (this.anIntArrayArray27[local321] == null) {
					local454 = local348;
				} else {
					local454 = this.anIntArrayArray27[local321][local348];
				}
				this.anIntArrayArray28[local321][local454] = local12.method5000();
			}
			this.aClass75Array1[local321] = new Class75(this.anIntArrayArray28[local321]);
		}
	}
}

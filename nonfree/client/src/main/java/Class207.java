import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class207 {

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
	public int anInt5825;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "[I")
	public int[] anIntArray524;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "[[B")
	public byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "[I")
	public int[] anIntArray526;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
	public int anInt5829;

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "Lclient!cf;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "[Lclient!cf;")
	public Class48[] aClass48Array1;

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
	public final int anInt5828;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "([BI[B)V")
	public Class207(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5828 = Static127.method3634(arg0, arg0.length);
		if (this.anInt5828 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray71 = Static139.method2085(arg0.length, 0, arg0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray71[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method4992(arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "([BI)V")
	private void method4992(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub14 local12 = new Class6_Sub14(Static444.method6389(arg0));
		@Pc(16) int local16 = local12.method6041();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt5829 = 0;
		} else {
			this.anInt5829 = local12.method6027();
		}
		@Pc(47) int local47 = local12.method6041();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		this.anInt5825 = local12.method6006();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		this.anIntArray522 = new int[this.anInt5825];
		@Pc(80) int local80 = -1;
		for (@Pc(86) int local86 = 0; local86 < this.anInt5825; local86++) {
			this.anIntArray522[local86] = local73 += local12.method6006();
			if (this.anIntArray522[local86] > local80) {
				local80 = this.anIntArray522[local86];
			}
		}
		this.anInt5826 = local80 + 1;
		this.anIntArray526 = new int[this.anInt5826];
		this.anIntArray524 = new int[this.anInt5826];
		this.anIntArrayArray69 = new int[this.anInt5826][];
		if (local71) {
			this.aByteArrayArray18 = new byte[this.anInt5826][];
		}
		this.anIntArray525 = new int[this.anInt5826];
		this.anIntArray523 = new int[this.anInt5826];
		@Pc(169) int local169;
		@Pc(187) int local187;
		if (local55) {
			this.anIntArray521 = new int[this.anInt5826];
			for (local169 = 0; local169 < this.anInt5826; local169++) {
				this.anIntArray521[local169] = -1;
			}
			for (local187 = 0; local187 < this.anInt5825; local187++) {
				this.anIntArray521[this.anIntArray522[local187]] = local12.method6027();
			}
			this.aClass48_1 = new Class48(this.anIntArray521);
		}
		for (local169 = 0; local169 < this.anInt5825; local169++) {
			this.anIntArray525[this.anIntArray522[local169]] = local12.method6027();
		}
		if (local71) {
			for (local187 = 0; local187 < this.anInt5825; local187++) {
				@Pc(243) byte[] local243 = new byte[64];
				local12.method6018(64, local243);
				this.aByteArrayArray18[this.anIntArray522[local187]] = local243;
			}
		}
		for (local187 = 0; local187 < this.anInt5825; local187++) {
			this.anIntArray523[this.anIntArray522[local187]] = local12.method6027();
		}
		for (@Pc(291) int local291 = 0; local291 < this.anInt5825; local291++) {
			this.anIntArray524[this.anIntArray522[local291]] = local12.method6006();
		}
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(351) int local351;
		for (@Pc(310) int local310 = 0; local310 < this.anInt5825; local310++) {
			local317 = this.anIntArray522[local310];
			local73 = 0;
			local324 = this.anIntArray524[local317];
			this.anIntArrayArray69[local317] = new int[local324];
			local332 = -1;
			for (local334 = 0; local334 < local324; local334++) {
				local351 = this.anIntArrayArray69[local317][local334] = local73 += local12.method6006();
				if (local332 < local351) {
					local332 = local351;
				}
			}
			this.anIntArray526[local317] = local332 + 1;
			if (local332 + 1 == local324) {
				this.anIntArrayArray69[local317] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.anIntArrayArray68 = new int[local80 + 1][];
		this.aClass48Array1 = new Class48[local80 + 1];
		for (local317 = 0; local317 < this.anInt5825; local317++) {
			local324 = this.anIntArray522[local317];
			local332 = this.anIntArray524[local324];
			this.anIntArrayArray68[local324] = new int[this.anIntArray526[local324]];
			for (local334 = 0; local334 < this.anIntArray526[local324]; local334++) {
				this.anIntArrayArray68[local324][local334] = -1;
			}
			for (local351 = 0; local351 < local332; local351++) {
				@Pc(456) int local456;
				if (this.anIntArrayArray69[local324] == null) {
					local456 = local351;
				} else {
					local456 = this.anIntArrayArray69[local324][local351];
				}
				this.anIntArrayArray68[local324][local456] = local12.method6027();
			}
			this.aClass48Array1[local324] = new Class48(this.anIntArrayArray68[local324]);
		}
	}
}

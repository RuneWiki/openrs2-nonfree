import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class269 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
	public int anInt6892;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	public int anInt6894;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "[I")
	public int[] anIntArray506;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Lclient!qba;")
	public Class299 aClass299_1;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "[Lclient!qba;")
	public Class299[] aClass299Array1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "[[B")
	public byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public int anInt6897;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	public final int anInt6898;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "([BI[B)V")
	public Class269(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6898 = Static332.method4777(arg0, arg0.length);
		if (this.anInt6898 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray66 = Static101.method1985(0, arg0, arg0.length);
			for (@Pc(41) int local41 = 0; local41 < 64; local41++) {
				if (arg2[local41] != this.aByteArray66[local41]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5964(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([BZ)V")
	private void method5964(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub2 local12 = new Class3_Sub2(Static422.method5605(arg0));
		@Pc(16) int local16 = local12.method2048(255);
		if (local16 < 5 || local16 > 7) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6897 = 0;
		} else {
			this.anInt6897 = local12.method2036();
		}
		@Pc(52) int local52 = local12.method2048(255);
		@Pc(61) boolean local61 = (local52 & 0x1) != 0;
		if (local16 < 7) {
			this.anInt6894 = local12.method2028(-14795);
		} else {
			this.anInt6894 = local12.method2067();
		}
		@Pc(94) boolean local94 = (local52 & 0x2) != 0;
		@Pc(101) int local101 = 0;
		this.anIntArray509 = new int[this.anInt6894];
		@Pc(108) int local108 = -1;
		@Pc(113) int local113;
		if (local16 >= 7) {
			for (local113 = 0; local113 < this.anInt6894; local113++) {
				this.anIntArray509[local113] = local101 += local12.method2067();
				if (local108 < this.anIntArray509[local113]) {
					local108 = this.anIntArray509[local113];
				}
			}
		} else {
			for (local113 = 0; local113 < this.anInt6894; local113++) {
				this.anIntArray509[local113] = local101 += local12.method2028(-14795);
				if (this.anIntArray509[local113] > local108) {
					local108 = this.anIntArray509[local113];
				}
			}
		}
		this.anInt6892 = local108 + 1;
		this.anIntArray507 = new int[this.anInt6892];
		this.anIntArray508 = new int[this.anInt6892];
		this.anIntArray504 = new int[this.anInt6892];
		if (local94) {
			this.aByteArrayArray11 = new byte[this.anInt6892][];
		}
		this.anIntArrayArray37 = new int[this.anInt6892][];
		this.anIntArray506 = new int[this.anInt6892];
		@Pc(255) int local255;
		if (local61) {
			this.anIntArray505 = new int[this.anInt6892];
			for (local113 = 0; local113 < this.anInt6892; local113++) {
				this.anIntArray505[local113] = -1;
			}
			for (local255 = 0; local255 < this.anInt6894; local255++) {
				this.anIntArray505[this.anIntArray509[local255]] = local12.method2036();
			}
			this.aClass299_1 = new Class299(this.anIntArray505);
		}
		for (local113 = 0; local113 < this.anInt6894; local113++) {
			this.anIntArray506[this.anIntArray509[local113]] = local12.method2036();
		}
		if (local94) {
			for (local255 = 0; local255 < this.anInt6894; local255++) {
				@Pc(325) byte[] local325 = new byte[64];
				local12.method2064(64, 0, local325);
				this.aByteArrayArray11[this.anIntArray509[local255]] = local325;
			}
		}
		for (local255 = 0; local255 < this.anInt6894; local255++) {
			this.anIntArray508[this.anIntArray509[local255]] = local12.method2036();
		}
		@Pc(409) int local409;
		@Pc(418) int local418;
		@Pc(425) int local425;
		@Pc(427) int local427;
		@Pc(435) int local435;
		@Pc(452) int local452;
		@Pc(384) int local384;
		if (local16 < 7) {
			for (local384 = 0; local384 < this.anInt6894; local384++) {
				this.anIntArray507[this.anIntArray509[local384]] = local12.method2028(-14795);
			}
			for (local409 = 0; local409 < this.anInt6894; local409++) {
				local418 = this.anIntArray509[local409];
				local101 = 0;
				local425 = this.anIntArray507[local418];
				local427 = -1;
				this.anIntArrayArray37[local418] = new int[local425];
				for (local435 = 0; local435 < local425; local435++) {
					local452 = this.anIntArrayArray37[local418][local435] = local101 += local12.method2028(-14795);
					if (local427 < local452) {
						local427 = local452;
					}
				}
				this.anIntArray504[local418] = local427 + 1;
				if (local425 == local427 + 1) {
					this.anIntArrayArray37[local418] = null;
				}
			}
		} else {
			for (local384 = 0; local384 < this.anInt6894; local384++) {
				this.anIntArray507[this.anIntArray509[local384]] = local12.method2067();
			}
			for (local409 = 0; local409 < this.anInt6894; local409++) {
				local418 = this.anIntArray509[local409];
				local101 = 0;
				local425 = this.anIntArray507[local418];
				this.anIntArrayArray37[local418] = new int[local425];
				local427 = -1;
				for (local435 = 0; local435 < local425; local435++) {
					local452 = this.anIntArrayArray37[local418][local435] = local101 += local12.method2067();
					if (local427 < local452) {
						local427 = local452;
					}
				}
				this.anIntArray504[local418] = local427 + 1;
				if (local425 == local427 + 1) {
					this.anIntArrayArray37[local418] = null;
				}
			}
		}
		if (!local61) {
			return;
		}
		this.anIntArrayArray36 = new int[local108 + 1][];
		this.aClass299Array1 = new Class299[local108 + 1];
		for (local384 = 0; local384 < this.anInt6894; local384++) {
			local409 = this.anIntArray509[local384];
			local418 = this.anIntArray507[local409];
			this.anIntArrayArray36[local409] = new int[this.anIntArray504[local409]];
			for (local425 = 0; local425 < this.anIntArray504[local409]; local425++) {
				this.anIntArrayArray36[local409][local425] = -1;
			}
			for (local427 = 0; local427 < local418; local427++) {
				if (this.anIntArrayArray37[local409] == null) {
					local435 = local427;
				} else {
					local435 = this.anIntArrayArray37[local409][local427];
				}
				this.anIntArrayArray36[local409][local435] = local12.method2036();
			}
			this.aClass299Array1[local409] = new Class299(this.anIntArrayArray36[local409]);
		}
	}
}

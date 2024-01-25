import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class238 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[[B")
	public byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[Lclient!wv;")
	public Class320[] aClass320Array1;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!wv;")
	public Class320 aClass320_1;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int anInt6876;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[B")
	private byte[] aByteArray90;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([BI[B)V")
	public Class238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6876 = Static129.method7913(arg0, arg0.length);
		if (arg1 != this.anInt6876) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray90 = Static344.method5423(0, arg0.length, arg0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray90[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5752(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
	private void method5752(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class12_Sub8 local12 = new Class12_Sub8(Static7.method7757(arg0));
		@Pc(16) int local16 = local12.method5216();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6875 = 0;
		} else {
			this.anInt6875 = local12.method5225();
		}
		@Pc(45) int local45 = local12.method5216();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		this.anInt6880 = local12.method5199();
		@Pc(66) boolean local66 = (local45 & 0x2) != 0;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = -1;
		this.anIntArray478 = new int[this.anInt6880];
		for (@Pc(77) int local77 = 0; local77 < this.anInt6880; local77++) {
			this.anIntArray478[local77] = local68 += local12.method5199();
			if (this.anIntArray478[local77] > local70) {
				local70 = this.anIntArray478[local77];
			}
		}
		this.anInt6878 = local70 + 1;
		this.anIntArrayArray62 = new int[this.anInt6878][];
		this.anIntArray474 = new int[this.anInt6878];
		if (local66) {
			this.aByteArrayArray21 = new byte[this.anInt6878][];
		}
		this.anIntArray476 = new int[this.anInt6878];
		this.anIntArray479 = new int[this.anInt6878];
		this.anIntArray475 = new int[this.anInt6878];
		@Pc(158) int local158;
		@Pc(176) int local176;
		if (local53) {
			this.anIntArray477 = new int[this.anInt6878];
			for (local158 = 0; local158 < this.anInt6878; local158++) {
				this.anIntArray477[local158] = -1;
			}
			for (local176 = 0; local176 < this.anInt6880; local176++) {
				this.anIntArray477[this.anIntArray478[local176]] = local12.method5225();
			}
			this.aClass320_1 = new Class320(this.anIntArray477);
		}
		for (local158 = 0; local158 < this.anInt6880; local158++) {
			this.anIntArray475[this.anIntArray478[local158]] = local12.method5225();
		}
		if (local66) {
			for (local176 = 0; local176 < this.anInt6880; local176++) {
				@Pc(236) byte[] local236 = new byte[64];
				local12.method5181(64, local236);
				this.aByteArrayArray21[this.anIntArray478[local176]] = local236;
			}
		}
		for (local176 = 0; local176 < this.anInt6880; local176++) {
			this.anIntArray479[this.anIntArray478[local176]] = local12.method5225();
		}
		for (@Pc(282) int local282 = 0; local282 < this.anInt6880; local282++) {
			this.anIntArray474[this.anIntArray478[local282]] = local12.method5199();
		}
		@Pc(312) int local312;
		@Pc(319) int local319;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(346) int local346;
		for (@Pc(305) int local305 = 0; local305 < this.anInt6880; local305++) {
			local312 = this.anIntArray478[local305];
			local68 = 0;
			local319 = this.anIntArray474[local312];
			this.anIntArrayArray62[local312] = new int[local319];
			local327 = -1;
			for (local329 = 0; local329 < local319; local329++) {
				local346 = this.anIntArrayArray62[local312][local329] = local68 += local12.method5199();
				if (local346 > local327) {
					local327 = local346;
				}
			}
			this.anIntArray476[local312] = local327 + 1;
			if (local327 + 1 == local319) {
				this.anIntArrayArray62[local312] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.anIntArrayArray63 = new int[local70 + 1][];
		this.aClass320Array1 = new Class320[local70 + 1];
		for (local312 = 0; local312 < this.anInt6880; local312++) {
			local319 = this.anIntArray478[local312];
			local327 = this.anIntArray474[local319];
			this.anIntArrayArray63[local319] = new int[this.anIntArray476[local319]];
			for (local329 = 0; local329 < this.anIntArray476[local319]; local329++) {
				this.anIntArrayArray63[local319][local329] = -1;
			}
			for (local346 = 0; local346 < local327; local346++) {
				@Pc(456) int local456;
				if (this.anIntArrayArray62[local319] == null) {
					local456 = local346;
				} else {
					local456 = this.anIntArrayArray62[local319][local346];
				}
				this.anIntArrayArray63[local319][local456] = local12.method5225();
			}
			this.aClass320Array1[local319] = new Class320(this.anIntArrayArray63[local319]);
		}
	}
}

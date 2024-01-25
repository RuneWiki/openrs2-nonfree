import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class75 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Lclient!pi;")
	public Class263 aClass263_1;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "[Lclient!pi;")
	public Class263[] aClass263Array1;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "[[B")
	public byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	public final int anInt2304;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([BI[B)V")
	public Class75(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2304 = Static477.method7163(arg0.length, arg0);
		if (arg1 != this.anInt2304) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray23 = Static560.method8057(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray23[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2201(arg0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([BI)V")
	private void method2201(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub11 local12 = new Class4_Sub11(Static587.method8307(arg0));
		@Pc(16) int local16 = local12.method4905();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt2305 = 0;
		} else {
			this.anInt2305 = local12.method4931();
		}
		@Pc(47) int local47 = local12.method4905();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt2303 = local12.method4936();
		@Pc(75) int local75 = 0;
		this.anIntArray99 = new int[this.anInt2303];
		@Pc(82) int local82 = -1;
		for (@Pc(84) int local84 = 0; local84 < this.anInt2303; local84++) {
			this.anIntArray99[local84] = local75 += local12.method4936();
			if (this.anIntArray99[local84] > local82) {
				local82 = this.anIntArray99[local84];
			}
		}
		this.anInt2306 = local82 + 1;
		this.anIntArray97 = new int[this.anInt2306];
		this.anIntArray94 = new int[this.anInt2306];
		if (local66) {
			this.aByteArrayArray7 = new byte[this.anInt2306][];
		}
		this.anIntArray96 = new int[this.anInt2306];
		this.anIntArray95 = new int[this.anInt2306];
		this.anIntArrayArray15 = new int[this.anInt2306][];
		@Pc(165) int local165;
		@Pc(179) int local179;
		if (local55) {
			this.anIntArray98 = new int[this.anInt2306];
			for (local165 = 0; local165 < this.anInt2306; local165++) {
				this.anIntArray98[local165] = -1;
			}
			for (local179 = 0; local179 < this.anInt2303; local179++) {
				this.anIntArray98[this.anIntArray99[local179]] = local12.method4931();
			}
			this.aClass263_1 = new Class263(this.anIntArray98);
		}
		for (local165 = 0; local165 < this.anInt2303; local165++) {
			this.anIntArray95[this.anIntArray99[local165]] = local12.method4931();
		}
		if (local66) {
			for (local179 = 0; local179 < this.anInt2303; local179++) {
				@Pc(231) byte[] local231 = new byte[64];
				local12.method4926(64, local231);
				this.aByteArrayArray7[this.anIntArray99[local179]] = local231;
			}
		}
		for (local179 = 0; local179 < this.anInt2303; local179++) {
			this.anIntArray94[this.anIntArray99[local179]] = local12.method4931();
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt2303; local275++) {
			this.anIntArray96[this.anIntArray99[local275]] = local12.method4936();
		}
		@Pc(301) int local301;
		@Pc(308) int local308;
		@Pc(310) int local310;
		@Pc(318) int local318;
		@Pc(335) int local335;
		for (@Pc(294) int local294 = 0; local294 < this.anInt2303; local294++) {
			local301 = this.anIntArray99[local294];
			local75 = 0;
			local308 = this.anIntArray96[local301];
			local310 = -1;
			this.anIntArrayArray15[local301] = new int[local308];
			for (local318 = 0; local318 < local308; local318++) {
				local335 = this.anIntArrayArray15[local301][local318] = local75 += local12.method4936();
				if (local310 < local335) {
					local310 = local335;
				}
			}
			this.anIntArray97[local301] = local310 + 1;
			if (local308 == local310 + 1) {
				this.anIntArrayArray15[local301] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass263Array1 = new Class263[local82 + 1];
		this.anIntArrayArray14 = new int[local82 + 1][];
		for (local301 = 0; local301 < this.anInt2303; local301++) {
			local308 = this.anIntArray99[local301];
			local310 = this.anIntArray96[local308];
			this.anIntArrayArray14[local308] = new int[this.anIntArray97[local308]];
			for (local318 = 0; local318 < this.anIntArray97[local308]; local318++) {
				this.anIntArrayArray14[local308][local318] = -1;
			}
			for (local335 = 0; local335 < local310; local335++) {
				@Pc(440) int local440;
				if (this.anIntArrayArray15[local308] == null) {
					local440 = local335;
				} else {
					local440 = this.anIntArrayArray15[local308][local335];
				}
				this.anIntArrayArray14[local308][local440] = local12.method4931();
			}
			this.aClass263Array1[local308] = new Class263(this.anIntArrayArray14[local308]);
		}
	}
}

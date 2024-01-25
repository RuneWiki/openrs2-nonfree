import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class41 {

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[Lclient!hv;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public int anInt1031;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public int anInt1032;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!hv;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public final int anInt1029;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([BI[B)V")
	public Class41(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt1029 = Static425.method6268(arg0, arg0.length);
		if (this.anInt1029 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray10 = Static79.method1032(0, arg0.length, arg0);
			for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
				if (this.aByteArray10[local45] != arg2[local45]) {
					throw new RuntimeException();
				}
			}
		}
		this.method818(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)V")
	private void method818(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub28 local12 = new Class3_Sub28(Static133.method2921(arg0));
		@Pc(16) int local16 = local12.method5322(-68);
		if (local16 < 5 || local16 > 7) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt1030 = 0;
		} else {
			this.anInt1030 = local12.method5312();
		}
		@Pc(54) int local54 = local12.method5322(-104);
		@Pc(66) boolean local66 = (local54 & 0x1) != 0;
		if (local16 >= 7) {
			this.anInt1032 = local12.method5333();
		} else {
			this.anInt1032 = local12.method5272();
		}
		@Pc(99) boolean local99 = (local54 & 0x2) != 0;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = -1;
		this.anIntArray73 = new int[this.anInt1032];
		@Pc(113) int local113;
		if (local16 < 7) {
			for (local113 = 0; local113 < this.anInt1032; local113++) {
				this.anIntArray73[local113] = local101 += local12.method5272();
				if (local103 < this.anIntArray73[local113]) {
					local103 = this.anIntArray73[local113];
				}
			}
		} else {
			for (local113 = 0; local113 < this.anInt1032; local113++) {
				this.anIntArray73[local113] = local101 += local12.method5333();
				if (this.anIntArray73[local113] > local103) {
					local103 = this.anIntArray73[local113];
				}
			}
		}
		this.anInt1031 = local103 + 1;
		this.anIntArray74 = new int[this.anInt1031];
		this.anIntArray70 = new int[this.anInt1031];
		this.anIntArray72 = new int[this.anInt1031];
		this.anIntArrayArray6 = new int[this.anInt1031][];
		if (local99) {
			this.aByteArrayArray1 = new byte[this.anInt1031][];
		}
		this.anIntArray75 = new int[this.anInt1031];
		@Pc(255) int local255;
		if (local66) {
			this.anIntArray71 = new int[this.anInt1031];
			for (local113 = 0; local113 < this.anInt1031; local113++) {
				this.anIntArray71[local113] = -1;
			}
			for (local255 = 0; local255 < this.anInt1032; local255++) {
				this.anIntArray71[this.anIntArray73[local255]] = local12.method5312();
			}
			this.aClass163_1 = new Class163(this.anIntArray71);
		}
		for (local113 = 0; local113 < this.anInt1032; local113++) {
			this.anIntArray72[this.anIntArray73[local113]] = local12.method5312();
		}
		if (-112 <= -122) {
			return;
		}
		if (local99) {
			for (local255 = 0; local255 < this.anInt1032; local255++) {
				@Pc(330) byte[] local330 = new byte[64];
				local12.method5271(local330, 64, 0);
				this.aByteArrayArray1[this.anIntArray73[local255]] = local330;
			}
		}
		for (local255 = 0; local255 < this.anInt1032; local255++) {
			this.anIntArray74[this.anIntArray73[local255]] = local12.method5312();
		}
		@Pc(408) int local408;
		@Pc(417) int local417;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(434) int local434;
		@Pc(451) int local451;
		@Pc(387) int local387;
		if (local16 < 7) {
			for (local387 = 0; local387 < this.anInt1032; local387++) {
				this.anIntArray75[this.anIntArray73[local387]] = local12.method5272();
			}
			for (local408 = 0; local408 < this.anInt1032; local408++) {
				local417 = this.anIntArray73[local408];
				local422 = this.anIntArray75[local417];
				local101 = 0;
				local426 = -1;
				this.anIntArrayArray6[local417] = new int[local422];
				for (local434 = 0; local434 < local422; local434++) {
					local451 = this.anIntArrayArray6[local417][local434] = local101 += local12.method5272();
					if (local426 < local451) {
						local426 = local451;
					}
				}
				this.anIntArray70[local417] = local426 + 1;
				if (local426 + 1 == local422) {
					this.anIntArrayArray6[local417] = null;
				}
			}
		} else {
			for (local387 = 0; local387 < this.anInt1032; local387++) {
				this.anIntArray75[this.anIntArray73[local387]] = local12.method5333();
			}
			for (local408 = 0; local408 < this.anInt1032; local408++) {
				local417 = this.anIntArray73[local408];
				local101 = 0;
				local422 = this.anIntArray75[local417];
				this.anIntArrayArray6[local417] = new int[local422];
				local426 = -1;
				for (local434 = 0; local434 < local422; local434++) {
					local451 = this.anIntArrayArray6[local417][local434] = local101 += local12.method5333();
					if (local426 < local451) {
						local426 = local451;
					}
				}
				this.anIntArray70[local417] = local426 + 1;
				if (local426 + 1 == local422) {
					this.anIntArrayArray6[local417] = null;
				}
			}
		}
		if (!local66) {
			return;
		}
		this.anIntArrayArray5 = new int[local103 + 1][];
		this.aClass163Array1 = new Class163[local103 + 1];
		for (local387 = 0; local387 < this.anInt1032; local387++) {
			local408 = this.anIntArray73[local387];
			local417 = this.anIntArray75[local408];
			this.anIntArrayArray5[local408] = new int[this.anIntArray70[local408]];
			for (local422 = 0; local422 < this.anIntArray70[local408]; local422++) {
				this.anIntArrayArray5[local408][local422] = -1;
			}
			for (local426 = 0; local426 < local417; local426++) {
				if (this.anIntArrayArray6[local408] == null) {
					local434 = local426;
				} else {
					local434 = this.anIntArrayArray6[local408][local426];
				}
				this.anIntArrayArray5[local408][local434] = local12.method5312();
			}
			this.aClass163Array1[local408] = new Class163(this.anIntArrayArray5[local408]);
		}
	}
}

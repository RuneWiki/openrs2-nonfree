import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class250 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "[I")
	public int[] anIntArray532;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[Lclient!ur;")
	public Class338[] aClass338Array1;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	public int anInt6692;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "[I")
	public int[] anIntArray534;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "[I")
	public int[] anIntArray535;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	public int anInt6693;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "[[B")
	public byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "[I")
	public int[] anIntArray536;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[I")
	public int[] anIntArray537;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	public int anInt6696;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!ur;")
	public Class338 aClass338_1;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
	public final int anInt6694;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([BI[B)V")
	public Class250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6694 = Static574.method7620(arg0.length, arg0);
		if (this.anInt6694 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray85 = Static360.method5383(arg0, 0, arg0.length);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray85[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5729(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[B)V")
	private void method5729(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub11 local12 = new Class3_Sub11(Static39.method723(arg0));
		@Pc(16) int local16 = local12.method3118();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6692 = 0;
		} else {
			this.anInt6692 = local12.method3116();
		}
		@Pc(53) int local53 = local12.method3118();
		@Pc(64) boolean local64 = (local53 & 0x1) != 0;
		this.anInt6693 = local12.method3109();
		@Pc(80) boolean local80 = (local53 & 0x2) != 0;
		@Pc(82) int local82 = 0;
		this.anIntArray536 = new int[this.anInt6693];
		@Pc(89) int local89 = -1;
		for (@Pc(91) int local91 = 0; local91 < this.anInt6693; local91++) {
			this.anIntArray536[local91] = local82 += local12.method3109();
			if (local89 < this.anIntArray536[local91]) {
				local89 = this.anIntArray536[local91];
			}
		}
		this.anInt6696 = local89 + 1;
		this.anIntArray532 = new int[this.anInt6696];
		this.anIntArrayArray51 = new int[this.anInt6696][];
		this.anIntArray533 = new int[this.anInt6696];
		this.anIntArray534 = new int[this.anInt6696];
		if (local80) {
			this.aByteArrayArray21 = new byte[this.anInt6696][];
		}
		this.anIntArray537 = new int[this.anInt6696];
		@Pc(174) int local174;
		@Pc(188) int local188;
		if (local64) {
			this.anIntArray535 = new int[this.anInt6696];
			for (local174 = 0; local174 < this.anInt6696; local174++) {
				this.anIntArray535[local174] = -1;
			}
			for (local188 = 0; local188 < this.anInt6693; local188++) {
				this.anIntArray535[this.anIntArray536[local188]] = local12.method3116();
			}
			this.aClass338_1 = new Class338(this.anIntArray535);
		}
		for (local174 = 0; local174 < this.anInt6693; local174++) {
			this.anIntArray533[this.anIntArray536[local174]] = local12.method3116();
		}
		if (local80) {
			for (local188 = 0; local188 < this.anInt6693; local188++) {
				@Pc(248) byte[] local248 = new byte[64];
				local12.method3090(64, local248);
				this.aByteArrayArray21[this.anIntArray536[local188]] = local248;
			}
		}
		for (local188 = 0; local188 < this.anInt6693; local188++) {
			this.anIntArray532[this.anIntArray536[local188]] = local12.method3116();
		}
		for (@Pc(292) int local292 = 0; local292 < this.anInt6693; local292++) {
			this.anIntArray537[this.anIntArray536[local292]] = local12.method3109();
		}
		@Pc(318) int local318;
		@Pc(325) int local325;
		@Pc(327) int local327;
		@Pc(335) int local335;
		@Pc(352) int local352;
		for (@Pc(311) int local311 = 0; local311 < this.anInt6693; local311++) {
			local318 = this.anIntArray536[local311];
			local82 = 0;
			local325 = this.anIntArray537[local318];
			local327 = -1;
			this.anIntArrayArray51[local318] = new int[local325];
			for (local335 = 0; local335 < local325; local335++) {
				local352 = this.anIntArrayArray51[local318][local335] = local82 += local12.method3109();
				if (local327 < local352) {
					local327 = local352;
				}
			}
			this.anIntArray534[local318] = local327 + 1;
			if (local327 + 1 == local325) {
				this.anIntArrayArray51[local318] = null;
			}
		}
		if (!local64) {
			return;
		}
		this.aClass338Array1 = new Class338[local89 + 1];
		this.anIntArrayArray52 = new int[local89 + 1][];
		for (local318 = 0; local318 < this.anInt6693; local318++) {
			local325 = this.anIntArray536[local318];
			local327 = this.anIntArray537[local325];
			this.anIntArrayArray52[local325] = new int[this.anIntArray534[local325]];
			for (local335 = 0; local335 < this.anIntArray534[local325]; local335++) {
				this.anIntArrayArray52[local325][local335] = -1;
			}
			for (local352 = 0; local352 < local327; local352++) {
				@Pc(466) int local466;
				if (this.anIntArrayArray51[local325] == null) {
					local466 = local352;
				} else {
					local466 = this.anIntArrayArray51[local325][local352];
				}
				this.anIntArrayArray52[local325][local466] = local12.method3116();
			}
			this.aClass338Array1[local325] = new Class338(this.anIntArrayArray52[local325]);
		}
	}
}

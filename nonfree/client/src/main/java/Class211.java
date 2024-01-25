import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class211 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public int anInt6280;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!kk;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public int anInt6282;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public int anInt6283;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[Lclient!kk;")
	public Class190[] aClass190Array1;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[[B")
	public byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public final int anInt6278;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([BI[B)V")
	public Class211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6278 = Static361.method5906(arg0, arg0.length);
		if (this.anInt6278 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray70 = Static331.method5406(arg0.length, arg0, 0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray70[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5456(arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B[B)V")
	private void method5456(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub3 local12 = new Class3_Sub3(Static631.method8656(arg0));
		@Pc(16) int local16 = local12.method4225();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6280 = local12.method4207();
		} else {
			this.anInt6280 = 0;
		}
		@Pc(45) int local45 = local12.method4225();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		@Pc(64) boolean local64 = (local45 & 0x2) != 0;
		this.anInt6283 = local12.method4221();
		@Pc(73) int local73 = 0;
		this.anIntArray388 = new int[this.anInt6283];
		@Pc(80) int local80 = -1;
		for (@Pc(87) int local87 = 0; local87 < this.anInt6283; local87++) {
			this.anIntArray388[local87] = local73 += local12.method4221();
			if (local80 < this.anIntArray388[local87]) {
				local80 = this.anIntArray388[local87];
			}
		}
		this.anInt6282 = local80 + 1;
		if (local64) {
			this.aByteArrayArray18 = new byte[this.anInt6282][];
		}
		this.anIntArray386 = new int[this.anInt6282];
		this.anIntArray384 = new int[this.anInt6282];
		this.anIntArrayArray47 = new int[this.anInt6282][];
		this.anIntArray385 = new int[this.anInt6282];
		this.anIntArray387 = new int[this.anInt6282];
		@Pc(164) int local164;
		@Pc(178) int local178;
		if (local53) {
			this.anIntArray383 = new int[this.anInt6282];
			for (local164 = 0; local164 < this.anInt6282; local164++) {
				this.anIntArray383[local164] = -1;
			}
			for (local178 = 0; local178 < this.anInt6283; local178++) {
				this.anIntArray383[this.anIntArray388[local178]] = local12.method4207();
			}
			this.aClass190_1 = new Class190(this.anIntArray383);
		}
		for (local164 = 0; local164 < this.anInt6283; local164++) {
			this.anIntArray385[this.anIntArray388[local164]] = local12.method4207();
		}
		if (local64) {
			for (local178 = 0; local178 < this.anInt6283; local178++) {
				@Pc(230) byte[] local230 = new byte[64];
				local12.method4206(local230, 64, 0);
				this.aByteArrayArray18[this.anIntArray388[local178]] = local230;
			}
		}
		for (local178 = 0; local178 < this.anInt6283; local178++) {
			this.anIntArray386[this.anIntArray388[local178]] = local12.method4207();
		}
		for (@Pc(276) int local276 = 0; local276 < this.anInt6283; local276++) {
			this.anIntArray384[this.anIntArray388[local276]] = local12.method4221();
		}
		@Pc(308) int local308;
		@Pc(315) int local315;
		@Pc(323) int local323;
		@Pc(325) int local325;
		@Pc(342) int local342;
		for (@Pc(301) int local301 = 0; local301 < this.anInt6283; local301++) {
			local308 = this.anIntArray388[local301];
			local73 = 0;
			local315 = this.anIntArray384[local308];
			this.anIntArrayArray47[local308] = new int[local315];
			local323 = -1;
			for (local325 = 0; local325 < local315; local325++) {
				local342 = this.anIntArrayArray47[local308][local325] = local73 += local12.method4221();
				if (local323 < local342) {
					local323 = local342;
				}
			}
			this.anIntArray387[local308] = local323 + 1;
			if (local323 + 1 == local315) {
				this.anIntArrayArray47[local308] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.anIntArrayArray48 = new int[local80 + 1][];
		this.aClass190Array1 = new Class190[local80 + 1];
		for (local308 = 0; local308 < this.anInt6283; local308++) {
			local315 = this.anIntArray388[local308];
			local323 = this.anIntArray384[local315];
			this.anIntArrayArray48[local315] = new int[this.anIntArray387[local315]];
			for (local325 = 0; local325 < this.anIntArray387[local315]; local325++) {
				this.anIntArrayArray48[local315][local325] = -1;
			}
			for (local342 = 0; local342 < local323; local342++) {
				@Pc(456) int local456;
				if (this.anIntArrayArray47[local315] == null) {
					local456 = local342;
				} else {
					local456 = this.anIntArrayArray47[local315][local342];
				}
				this.anIntArrayArray48[local315][local456] = local12.method4207();
			}
			this.aClass190Array1[local315] = new Class190(this.anIntArrayArray48[local315]);
		}
	}
}

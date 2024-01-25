import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class106 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
	public int anInt2406;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "[Lclient!gka;")
	public Class134[] aClass134Array1;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "[[B")
	public byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "Lclient!gka;")
	public Class134 aClass134_1;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	public final int anInt2407;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([BI[B)V")
	public Class106(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt2407 = Static255.method3589(arg0, arg0.length);
		if (arg1 != this.anInt2407) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray14 = Static52.method800(arg0.length, 0, arg0);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (this.aByteArray14[local38] != arg2[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2184(arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[B)V")
	private void method2184(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class5_Sub15 local18 = new Class5_Sub15(Static427.method8767(arg0));
		@Pc(22) int local22 = local18.method3642();
		if (local22 < 5 || local22 > 6) {
			throw new RuntimeException();
		}
		if (local22 < 6) {
			this.anInt2408 = 0;
		} else {
			this.anInt2408 = local18.method3671();
		}
		@Pc(52) int local52 = local18.method3642();
		@Pc(60) boolean local60 = (local52 & 0x1) != 0;
		this.anInt2406 = local18.method3698();
		@Pc(76) boolean local76 = (local52 & 0x2) != 0;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = -1;
		this.anIntArray122 = new int[this.anInt2406];
		for (@Pc(87) int local87 = 0; local87 < this.anInt2406; local87++) {
			this.anIntArray122[local87] = local78 += local18.method3698();
			if (local80 < this.anIntArray122[local87]) {
				local80 = this.anIntArray122[local87];
			}
		}
		this.anInt2411 = local80 + 1;
		if (local76) {
			this.aByteArrayArray7 = new byte[this.anInt2411][];
		}
		this.anIntArray121 = new int[this.anInt2411];
		this.anIntArrayArray19 = new int[this.anInt2411][];
		this.anIntArray123 = new int[this.anInt2411];
		this.anIntArray119 = new int[this.anInt2411];
		this.anIntArray120 = new int[this.anInt2411];
		@Pc(165) int local165;
		@Pc(178) int local178;
		if (local60) {
			this.anIntArray124 = new int[this.anInt2411];
			for (local165 = 0; local165 < this.anInt2411; local165++) {
				this.anIntArray124[local165] = -1;
			}
			for (local178 = 0; local178 < this.anInt2406; local178++) {
				this.anIntArray124[this.anIntArray122[local178]] = local18.method3671();
			}
			this.aClass134_1 = new Class134(this.anIntArray124);
		}
		for (local165 = 0; local165 < this.anInt2406; local165++) {
			this.anIntArray123[this.anIntArray122[local165]] = local18.method3671();
		}
		if (local76) {
			for (local178 = 0; local178 < this.anInt2406; local178++) {
				@Pc(231) byte[] local231 = new byte[64];
				local18.method3650(0, 64, local231);
				this.aByteArrayArray7[this.anIntArray122[local178]] = local231;
			}
		}
		for (local178 = 0; local178 < this.anInt2406; local178++) {
			this.anIntArray121[this.anIntArray122[local178]] = local18.method3671();
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt2406; local278++) {
			this.anIntArray119[this.anIntArray122[local278]] = local18.method3698();
		}
		@Pc(302) int local302;
		@Pc(309) int local309;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(335) int local335;
		for (@Pc(296) int local296 = 0; local296 < this.anInt2406; local296++) {
			local302 = this.anIntArray122[local296];
			local78 = 0;
			local309 = this.anIntArray119[local302];
			this.anIntArrayArray19[local302] = new int[local309];
			local317 = -1;
			for (local319 = 0; local319 < local309; local319++) {
				local335 = this.anIntArrayArray19[local302][local319] = local78 += local18.method3698();
				if (local317 < local335) {
					local317 = local335;
				}
			}
			this.anIntArray120[local302] = local317 + 1;
			if (local317 + 1 == local309) {
				this.anIntArrayArray19[local302] = null;
			}
		}
		if (!local60) {
			return;
		}
		this.anIntArrayArray20 = new int[local80 + 1][];
		this.aClass134Array1 = new Class134[local80 + 1];
		for (local302 = 0; local302 < this.anInt2406; local302++) {
			local309 = this.anIntArray122[local302];
			local317 = this.anIntArray119[local309];
			this.anIntArrayArray20[local309] = new int[this.anIntArray120[local309]];
			for (local319 = 0; local319 < this.anIntArray120[local309]; local319++) {
				this.anIntArrayArray20[local309][local319] = -1;
			}
			for (local335 = 0; local335 < local317; local335++) {
				@Pc(441) int local441;
				if (this.anIntArrayArray19[local309] == null) {
					local441 = local335;
				} else {
					local441 = this.anIntArrayArray19[local309][local335];
				}
				this.anIntArrayArray20[local309][local441] = local18.method3671();
			}
			this.aClass134Array1[local309] = new Class134(this.anIntArrayArray20[local309]);
		}
	}
}

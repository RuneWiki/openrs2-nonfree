import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class284 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
	public int[] anIntArray638;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[Lclient!lc;")
	public Class183[] aClass183Array1;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[[B")
	public byte[][] aByteArrayArray45;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
	public int[] anIntArray639;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public int anInt8223;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
	public int[] anIntArray642;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public int anInt8224;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
	public int[] anIntArray644;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!lc;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	public int anInt8226;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public final int anInt8222;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BI[B)V")
	public Class284(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8222 = Static52.method1101(arg0.length, arg0);
		if (arg1 != this.anInt8222) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray117 = Static263.method4382(arg0.length, arg0, 0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray117[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6639(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[B)V")
	private void method6639(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class5_Sub3 local12 = new Class5_Sub3(Static20.method603(arg0));
		@Pc(16) int local16 = local12.method4220();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt8223 = local12.method4230();
		} else {
			this.anInt8223 = 0;
		}
		@Pc(49) int local49 = local12.method4220();
		@Pc(60) boolean local60 = (local49 & 0x1) != 0;
		@Pc(68) boolean local68 = (local49 & 0x2) != 0;
		this.anInt8226 = local12.method4227();
		@Pc(77) int local77 = 0;
		this.anIntArray642 = new int[this.anInt8226];
		@Pc(84) int local84 = -1;
		for (@Pc(86) int local86 = 0; local86 < this.anInt8226; local86++) {
			this.anIntArray642[local86] = local77 += local12.method4227();
			if (local84 < this.anIntArray642[local86]) {
				local84 = this.anIntArray642[local86];
			}
		}
		this.anInt8224 = local84 + 1;
		this.anIntArray641 = new int[this.anInt8224];
		if (local68) {
			this.aByteArrayArray45 = new byte[this.anInt8224][];
		}
		this.anIntArrayArray70 = new int[this.anInt8224][];
		this.anIntArray644 = new int[this.anInt8224];
		this.anIntArray640 = new int[this.anInt8224];
		this.anIntArray638 = new int[this.anInt8224];
		@Pc(165) int local165;
		@Pc(183) int local183;
		if (local60) {
			this.anIntArray639 = new int[this.anInt8224];
			for (local165 = 0; local165 < this.anInt8224; local165++) {
				this.anIntArray639[local165] = -1;
			}
			for (local183 = 0; local183 < this.anInt8226; local183++) {
				this.anIntArray639[this.anIntArray642[local183]] = local12.method4230();
			}
			this.aClass183_1 = new Class183(this.anIntArray639);
		}
		for (local165 = 0; local165 < this.anInt8226; local165++) {
			this.anIntArray644[this.anIntArray642[local165]] = local12.method4230();
		}
		if (local68) {
			for (local183 = 0; local183 < this.anInt8226; local183++) {
				@Pc(237) byte[] local237 = new byte[64];
				local12.method4177(local237, 64);
				this.aByteArrayArray45[this.anIntArray642[local183]] = local237;
			}
		}
		for (local183 = 0; local183 < this.anInt8226; local183++) {
			this.anIntArray638[this.anIntArray642[local183]] = local12.method4230();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt8226; local281++) {
			this.anIntArray641[this.anIntArray642[local281]] = local12.method4227();
		}
		@Pc(311) int local311;
		@Pc(318) int local318;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(345) int local345;
		for (@Pc(304) int local304 = 0; local304 < this.anInt8226; local304++) {
			local311 = this.anIntArray642[local304];
			local77 = 0;
			local318 = this.anIntArray641[local311];
			this.anIntArrayArray70[local311] = new int[local318];
			local326 = -1;
			for (local328 = 0; local328 < local318; local328++) {
				local345 = this.anIntArrayArray70[local311][local328] = local77 += local12.method4227();
				if (local345 > local326) {
					local326 = local345;
				}
			}
			this.anIntArray640[local311] = local326 + 1;
			if (local326 + 1 == local318) {
				this.anIntArrayArray70[local311] = null;
			}
		}
		if (!local60) {
			return;
		}
		this.anIntArrayArray69 = new int[local84 + 1][];
		this.aClass183Array1 = new Class183[local84 + 1];
		for (local311 = 0; local311 < this.anInt8226; local311++) {
			local318 = this.anIntArray642[local311];
			local326 = this.anIntArray641[local318];
			this.anIntArrayArray69[local318] = new int[this.anIntArray640[local318]];
			for (local328 = 0; local328 < this.anIntArray640[local318]; local328++) {
				this.anIntArrayArray69[local318][local328] = -1;
			}
			for (local345 = 0; local345 < local326; local345++) {
				@Pc(454) int local454;
				if (this.anIntArrayArray70[local318] == null) {
					local454 = local345;
				} else {
					local454 = this.anIntArrayArray70[local318][local345];
				}
				this.anIntArrayArray69[local318][local454] = local12.method4230();
			}
			this.aClass183Array1[local318] = new Class183(this.anIntArrayArray69[local318]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class238 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!vd;")
	public Class346 aClass346_1;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	public int anInt6478;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray146;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "[[B")
	public byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray147;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[Lclient!vd;")
	public Class346[] aClass346Array1;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
	public int[] anIntArray399;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public int anInt6485;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public final int anInt6481;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BI[B)V")
	public Class238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6481 = Static186.method3166(arg0.length, arg0);
		if (this.anInt6481 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray70 = Static175.method3078(arg0, arg0.length, 0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray70[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5536(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[B)V")
	private void method5536(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub11 local12 = new Class3_Sub11(Static69.method1488(arg0));
		@Pc(16) int local16 = local12.method5175();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6480 = local12.method5186();
		} else {
			this.anInt6480 = 0;
		}
		@Pc(45) int local45 = local12.method5175();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		this.anInt6478 = local12.method5198();
		@Pc(66) boolean local66 = (local45 & 0x2) != 0;
		@Pc(68) int local68 = 0;
		this.anIntArray399 = new int[this.anInt6478];
		@Pc(75) int local75 = -1;
		for (@Pc(77) int local77 = 0; local77 < this.anInt6478; local77++) {
			this.anIntArray399[local77] = local68 += local12.method5198();
			if (local75 < this.anIntArray399[local77]) {
				local75 = this.anIntArray399[local77];
			}
		}
		this.anInt6485 = local75 + 1;
		this.anIntArray398 = new int[this.anInt6485];
		this.anIntArray397 = new int[this.anInt6485];
		this.anIntArray396 = new int[this.anInt6485];
		this.anIntArrayArray146 = new int[this.anInt6485][];
		this.anIntArray395 = new int[this.anInt6485];
		if (local66) {
			this.aByteArrayArray19 = new byte[this.anInt6485][];
		}
		@Pc(152) int local152;
		@Pc(170) int local170;
		if (local53) {
			this.anIntArray394 = new int[this.anInt6485];
			for (local152 = 0; local152 < this.anInt6485; local152++) {
				this.anIntArray394[local152] = -1;
			}
			for (local170 = 0; local170 < this.anInt6478; local170++) {
				this.anIntArray394[this.anIntArray399[local170]] = local12.method5186();
			}
			this.aClass346_1 = new Class346(this.anIntArray394);
		}
		for (local152 = 0; local152 < this.anInt6478; local152++) {
			this.anIntArray396[this.anIntArray399[local152]] = local12.method5186();
		}
		if (local66) {
			for (local170 = 0; local170 < this.anInt6478; local170++) {
				@Pc(229) byte[] local229 = new byte[64];
				local12.method5183(64, local229);
				this.aByteArrayArray19[this.anIntArray399[local170]] = local229;
			}
		}
		for (local170 = 0; local170 < this.anInt6478; local170++) {
			this.anIntArray398[this.anIntArray399[local170]] = local12.method5186();
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt6478; local269++) {
			this.anIntArray395[this.anIntArray399[local269]] = local12.method5198();
		}
		@Pc(299) int local299;
		@Pc(306) int local306;
		@Pc(308) int local308;
		@Pc(316) int local316;
		@Pc(333) int local333;
		for (@Pc(292) int local292 = 0; local292 < this.anInt6478; local292++) {
			local299 = this.anIntArray399[local292];
			local68 = 0;
			local306 = this.anIntArray395[local299];
			local308 = -1;
			this.anIntArrayArray146[local299] = new int[local306];
			for (local316 = 0; local316 < local306; local316++) {
				local333 = this.anIntArrayArray146[local299][local316] = local68 += local12.method5198();
				if (local308 < local333) {
					local308 = local333;
				}
			}
			this.anIntArray397[local299] = local308 + 1;
			if (local308 + 1 == local306) {
				this.anIntArrayArray146[local299] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.anIntArrayArray147 = new int[local75 + 1][];
		this.aClass346Array1 = new Class346[local75 + 1];
		for (local299 = 0; local299 < this.anInt6478; local299++) {
			local306 = this.anIntArray399[local299];
			local308 = this.anIntArray395[local306];
			this.anIntArrayArray147[local306] = new int[this.anIntArray397[local306]];
			for (local316 = 0; local316 < this.anIntArray397[local306]; local316++) {
				this.anIntArrayArray147[local306][local316] = -1;
			}
			for (local333 = 0; local333 < local308; local333++) {
				@Pc(447) int local447;
				if (this.anIntArrayArray146[local306] == null) {
					local447 = local333;
				} else {
					local447 = this.anIntArrayArray146[local306][local333];
				}
				this.anIntArrayArray147[local306][local447] = local12.method5186();
			}
			this.aClass346Array1[local306] = new Class346(this.anIntArrayArray147[local306]);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class220 {

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
	public int anInt5735;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "Lclient!cs;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "[Lclient!cs;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "[[B")
	public byte[][] aByteArrayArray105;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	public final int anInt5736;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "([BI[B)V")
	public Class220(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5736 = Static651.method8915(arg0, arg0.length);
		if (this.anInt5736 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray54 = Static269.method4566(arg0.length, 0, arg0);
			for (@Pc(41) int local41 = 0; local41 < 64; local41++) {
				if (this.aByteArray54[local41] != arg2[local41]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5181(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B[B)V")
	private void method5181(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class6_Sub15 local12 = new Class6_Sub15(Static245.method4314(arg0));
		@Pc(16) int local16 = local12.method3030();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt5739 = 0;
		} else {
			this.anInt5739 = local12.method3015();
		}
		@Pc(52) int local52 = local12.method3030();
		@Pc(61) boolean local61 = (local52 & 0x1) != 0;
		@Pc(73) boolean local73 = (local52 & 0x2) != 0;
		this.anInt5738 = local12.method3018();
		@Pc(80) int local80 = 0;
		this.anIntArray336 = new int[this.anInt5738];
		@Pc(87) int local87 = -1;
		for (@Pc(89) int local89 = 0; local89 < this.anInt5738; local89++) {
			this.anIntArray336[local89] = local80 += local12.method3018();
			if (local87 < this.anIntArray336[local89]) {
				local87 = this.anIntArray336[local89];
			}
		}
		this.anInt5735 = local87 + 1;
		this.anIntArray335 = new int[this.anInt5735];
		this.anIntArray338 = new int[this.anInt5735];
		if (local73) {
			this.aByteArrayArray105 = new byte[this.anInt5735][];
		}
		this.anIntArray334 = new int[this.anInt5735];
		this.anIntArrayArray34 = new int[this.anInt5735][];
		this.anIntArray339 = new int[this.anInt5735];
		@Pc(170) int local170;
		@Pc(190) int local190;
		if (local61) {
			this.anIntArray337 = new int[this.anInt5735];
			for (local170 = 0; local170 < this.anInt5735; local170++) {
				this.anIntArray337[local170] = -1;
			}
			for (local190 = 0; local190 < this.anInt5738; local190++) {
				this.anIntArray337[this.anIntArray336[local190]] = local12.method3015();
			}
			this.aClass62_1 = new Class62(this.anIntArray337);
		}
		for (local170 = 0; local170 < this.anInt5738; local170++) {
			this.anIntArray339[this.anIntArray336[local170]] = local12.method3015();
		}
		if (local73) {
			for (local190 = 0; local190 < this.anInt5738; local190++) {
				@Pc(256) byte[] local256 = new byte[64];
				local12.method3019(64, 0, local256);
				this.aByteArrayArray105[this.anIntArray336[local190]] = local256;
			}
		}
		for (local190 = 0; local190 < this.anInt5738; local190++) {
			this.anIntArray335[this.anIntArray336[local190]] = local12.method3015();
		}
		if (75 <= 45) {
			return;
		}
		for (@Pc(311) int local311 = 0; local311 < this.anInt5738; local311++) {
			this.anIntArray338[this.anIntArray336[local311]] = local12.method3018();
		}
		@Pc(343) int local343;
		@Pc(350) int local350;
		@Pc(358) int local358;
		@Pc(360) int local360;
		@Pc(377) int local377;
		for (@Pc(332) int local332 = 0; local332 < this.anInt5738; local332++) {
			local343 = this.anIntArray336[local332];
			local80 = 0;
			local350 = this.anIntArray338[local343];
			this.anIntArrayArray34[local343] = new int[local350];
			local358 = -1;
			for (local360 = 0; local360 < local350; local360++) {
				local377 = this.anIntArrayArray34[local343][local360] = local80 += local12.method3018();
				if (local377 > local358) {
					local358 = local377;
				}
			}
			this.anIntArray334[local343] = local358 + 1;
			if (local350 == local358 + 1) {
				this.anIntArrayArray34[local343] = null;
			}
		}
		if (!local61) {
			return;
		}
		this.anIntArrayArray35 = new int[local87 + 1][];
		this.aClass62Array1 = new Class62[local87 + 1];
		for (local343 = 0; local343 < this.anInt5738; local343++) {
			local350 = this.anIntArray336[local343];
			local358 = this.anIntArray338[local350];
			this.anIntArrayArray35[local350] = new int[this.anIntArray334[local350]];
			for (local360 = 0; local360 < this.anIntArray334[local350]; local360++) {
				this.anIntArrayArray35[local350][local360] = -1;
			}
			for (local377 = 0; local377 < local358; local377++) {
				@Pc(506) int local506;
				if (this.anIntArrayArray34[local350] == null) {
					local506 = local377;
				} else {
					local506 = this.anIntArrayArray34[local350][local377];
				}
				this.anIntArrayArray35[local350][local506] = local12.method3015();
			}
			this.aClass62Array1[local350] = new Class62(this.anIntArrayArray35[local350]);
		}
	}
}

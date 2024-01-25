import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class268 {

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	public int anInt6956;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public int anInt6958;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "[Lclient!rg;")
	public Class219[] aClass219Array1;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "[I")
	public int[] anIntArray506;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
	public int anInt6961;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "Lclient!rg;")
	public Class219 aClass219_1;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
	public final int anInt6957;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "([BI)V")
	public Class268(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6957 = Static263.method3649(arg0.length, arg0);
		if (this.anInt6957 != arg1) {
			throw new RuntimeException();
		}
		this.method5524(arg0);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([BI)V")
	private void method5524(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub19 local12 = new Class1_Sub19(Static73.method931(arg0));
		@Pc(16) int local16 = local12.method2915();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6958 = 0;
		} else {
			this.anInt6958 = local12.method2877();
		}
		@Pc(45) int local45 = local12.method2915();
		this.anInt6961 = local12.method2896();
		@Pc(54) int local54 = 0;
		this.anIntArray508 = new int[this.anInt6961];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt6961; local63++) {
			this.anIntArray508[local63] = local54 += local12.method2896();
			if (this.anIntArray508[local63] > local61) {
				local61 = this.anIntArray508[local63];
			}
		}
		this.anInt6956 = local61 + 1;
		this.anIntArray505 = new int[this.anInt6956];
		this.anIntArray504 = new int[this.anInt6956];
		this.anIntArray503 = new int[this.anInt6956];
		this.anIntArrayArray54 = new int[this.anInt6956][];
		this.anIntArray507 = new int[this.anInt6956];
		@Pc(131) int local131;
		@Pc(149) int local149;
		if (local45 != 0) {
			this.anIntArray506 = new int[this.anInt6956];
			for (local131 = 0; local131 < this.anInt6956; local131++) {
				this.anIntArray506[local131] = -1;
			}
			for (local149 = 0; local149 < this.anInt6961; local149++) {
				this.anIntArray506[this.anIntArray508[local149]] = local12.method2877();
			}
			this.aClass219_1 = new Class219(this.anIntArray506);
		}
		for (local131 = 0; local131 < this.anInt6961; local131++) {
			this.anIntArray505[this.anIntArray508[local131]] = local12.method2877();
		}
		for (local149 = 0; local149 < this.anInt6961; local149++) {
			this.anIntArray507[this.anIntArray508[local149]] = local12.method2877();
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt6961; local217++) {
			this.anIntArray504[this.anIntArray508[local217]] = local12.method2896();
		}
		@Pc(245) int local245;
		@Pc(252) int local252;
		@Pc(254) int local254;
		@Pc(262) int local262;
		@Pc(281) int local281;
		for (@Pc(238) int local238 = 0; local238 < this.anInt6961; local238++) {
			local245 = this.anIntArray508[local238];
			local54 = 0;
			local252 = this.anIntArray504[local245];
			local254 = -1;
			this.anIntArrayArray54[local245] = new int[local252];
			for (local262 = 0; local262 < local252; local262++) {
				local281 = this.anIntArrayArray54[local245][local262] = local54 += local12.method2896();
				if (local281 > local254) {
					local254 = local281;
				}
			}
			this.anIntArray503[local245] = local254 + 1;
			if (local254 + 1 == local252) {
				this.anIntArrayArray54[local245] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass219Array1 = new Class219[local61 + 1];
		this.anIntArrayArray53 = new int[local61 + 1][];
		for (local245 = 0; local245 < this.anInt6961; local245++) {
			local252 = this.anIntArray508[local245];
			local254 = this.anIntArray504[local252];
			this.anIntArrayArray53[local252] = new int[this.anIntArray503[local252]];
			for (local262 = 0; local262 < this.anIntArray503[local252]; local262++) {
				this.anIntArrayArray53[local252][local262] = -1;
			}
			for (local281 = 0; local281 < local254; local281++) {
				@Pc(399) int local399;
				if (this.anIntArrayArray54[local252] == null) {
					local399 = local281;
				} else {
					local399 = this.anIntArrayArray54[local252][local281];
				}
				this.anIntArrayArray53[local252][local399] = local12.method2877();
			}
			this.aClass219Array1[local252] = new Class219(this.anIntArrayArray53[local252]);
		}
	}
}

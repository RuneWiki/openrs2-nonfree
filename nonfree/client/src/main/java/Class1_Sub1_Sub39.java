import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
	private int anInt4493;

	@OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
	private int anInt4497;

	@OriginalMember(owner = "client!wg", name = "ob", descriptor = "I")
	private int anInt4499;

	@OriginalMember(owner = "client!wg", name = "tb", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
	private int anInt4488 = 8;

	@OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
	private int anInt4491 = 1024;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	private int anInt4487 = 1024;

	@OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
	private int anInt4494 = 0;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
	private int anInt4492 = 409;

	@OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
	private int anInt4501 = 204;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
	private int anInt4496 = 4;

	@OriginalMember(owner = "client!wg", name = "sb", descriptor = "I")
	private int anInt4502 = 81;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4496 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt4488 = arg0.method3010();
		} else if (arg1 == 2) {
			this.anInt4492 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt4501 = arg0.method3023();
		} else if (arg1 == 4) {
			this.anInt4487 = arg0.method3023();
		} else if (arg1 == 5) {
			this.anInt4494 = arg0.method3023();
		} else if (arg1 == 6) {
			this.anInt4502 = arg0.method3023();
		} else if (arg1 == 7) {
			this.anInt4491 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt4494 + Static193.anIntArray277[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt4488 && this.anIntArray366[local17] <= local24) {
				local17++;
			}
			@Pc(66) boolean local66 = (local17 & 0x1) == 0;
			@Pc(70) int local70 = local17 - 1;
			@Pc(75) int local75 = this.anIntArray366[local17];
			@Pc(82) int local82 = this.anIntArray366[local17 - 1];
			if (local24 > this.anInt4493 + local82 && local24 < local75 - this.anInt4493) {
				for (@Pc(104) int local104 = 0; local104 < Static107.anInt2321; local104++) {
					@Pc(108) int local108 = 0;
					@Pc(117) int local117 = local66 ? this.anInt4487 : -this.anInt4487;
					@Pc(128) int local128;
					for (local128 = Static204.anIntArray179[local104] + (local117 * this.anInt4499 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt4496 > local108 && local128 >= this.anIntArrayArray35[local70][local108]) {
						local108++;
					}
					@Pc(164) int local164 = local108 - 1;
					@Pc(171) int local171 = this.anIntArrayArray35[local70][local164];
					@Pc(178) int local178 = this.anIntArrayArray35[local70][local108];
					if (local128 > local171 + this.anInt4493 && local128 < local178 - this.anInt4493) {
						local11[local104] = this.anIntArrayArray34[local70][local164];
					} else {
						local11[local104] = 0;
					}
				}
			} else {
				Static216.method2202(local11, 0, Static107.anInt2321, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.method3403();
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
	private void method3403() {
		@Pc(8) Random local8 = new Random((long) this.anInt4488);
		this.anIntArray366 = new int[this.anInt4488 + 1];
		this.anIntArray366[0] = 0;
		this.anIntArrayArray35 = new int[this.anInt4488][this.anInt4496 + 1];
		this.anInt4493 = this.anInt4502 / 2;
		this.anInt4497 = 4096 / this.anInt4488;
		this.anInt4499 = 4096 / this.anInt4496;
		@Pc(56) int local56 = this.anInt4499 / 2;
		this.anIntArrayArray34 = new int[this.anInt4488][this.anInt4496];
		@Pc(68) int local68 = this.anInt4497 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4488; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt4497;
				local89 = (Static192.method3141(4096, local8) - 2048) * this.anInt4501 >> 12;
				@Pc(97) int local97 = local77 + (local68 * local89 >> 12);
				this.anIntArray366[local70] = this.anIntArray366[local70 - 1] + local97;
			}
			this.anIntArrayArray35[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt4496; local77++) {
				if (local77 > 0) {
					local89 = this.anInt4499;
					@Pc(141) int local141 = (Static192.method3141(4096, local8) - 2048) * this.anInt4492 >> 12;
					local89 += local141 * local56 >> 12;
					this.anIntArrayArray35[local70][local77] = this.anIntArrayArray35[local70][local77 - 1] + local89;
				}
				this.anIntArrayArray34[local70][local77] = this.anInt4491 > 0 ? 4096 - Static192.method3141(this.anInt4491, local8) : 4096;
			}
			this.anIntArrayArray35[local70][this.anInt4496] = 4096;
		}
		this.anIntArray366[this.anInt4488] = 4096;
	}
}

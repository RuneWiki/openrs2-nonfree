import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bq", name = "lb", descriptor = "Lclient!ft;")
	public static final Class81 lb = new Class81(22, -2);

	@OriginalMember(owner = "client!bq", name = "qb", descriptor = "[Lclient!ft;")
	private static final Class81[] aClass81Array1 = new Class81[32];

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bq", name = "Y", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!bq", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
	private int anInt579 = 8;

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
	private int anInt586 = 1024;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
	private int anInt583 = 1024;

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
	private int anInt588 = 204;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
	private int anInt582 = 0;

	@OriginalMember(owner = "client!bq", name = "V", descriptor = "I")
	private int anInt590 = 409;

	@OriginalMember(owner = "client!bq", name = "U", descriptor = "I")
	private int anInt589 = 4;

	@OriginalMember(owner = "client!bq", name = "cb", descriptor = "I")
	private int anInt595 = 81;

	static {
		@Pc(97) Class81[] local97 = Static107.method2125();
		for (@Pc(99) int local99 = 0; local99 < local97.length; local99++) {
			aClass81Array1[local97[local99].anInt2486] = local97[local99];
		}
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt582 + Static376.anIntArray531[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt579 > local17 && local24 >= this.anIntArray42[local17]) {
				local17++;
			}
			@Pc(61) int local61 = local17 - 1;
			@Pc(72) boolean local72 = (local17 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray42[local17];
			@Pc(84) int local84 = this.anIntArray42[local17 - 1];
			if (local24 > this.anInt593 + local84 && local77 - this.anInt593 > local24) {
				for (@Pc(110) int local110 = 0; local110 < Static304.anInt5637; local110++) {
					@Pc(114) int local114 = 0;
					@Pc(123) int local123 = local72 ? this.anInt586 : -this.anInt586;
					@Pc(135) int local135;
					for (local135 = Static231.anIntArray368[local110] + (local123 * this.anInt587 >> 12); local135 < 0; local135 += 4096) {
					}
					while (local135 > 4096) {
						local135 -= 4096;
					}
					while (this.anInt589 > local114 && local135 >= this.anIntArrayArray4[local61][local114]) {
						local114++;
					}
					@Pc(171) int local171 = local114 - 1;
					@Pc(178) int local178 = this.anIntArrayArray4[local61][local114];
					@Pc(185) int local185 = this.anIntArrayArray4[local61][local171];
					if (local135 > local185 + this.anInt593 && local178 - this.anInt593 > local135) {
						local11[local110] = this.anIntArrayArray5[local61][local171];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static474.method3330(local11, 0, Static304.anInt5637, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V")
	private void method497() {
		@Pc(12) Random local12 = new Random((long) this.anInt579);
		this.anInt593 = this.anInt595 / 2;
		this.anInt587 = 4096 / this.anInt589;
		this.anInt584 = 4096 / this.anInt579;
		@Pc(35) int local35 = this.anInt587 / 2;
		this.anIntArrayArray5 = new int[this.anInt579][this.anInt589];
		this.anIntArray42 = new int[this.anInt579 + 1];
		@Pc(54) int local54 = this.anInt584 / 2;
		this.anIntArrayArray4 = new int[this.anInt579][this.anInt589 + 1];
		this.anIntArray42[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt579; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt584;
				local89 = (Static127.method2396(local12, 4096) - 2048) * this.anInt588 >> 12;
				@Pc(97) int local97 = local77 + (local54 * local89 >> 12);
				this.anIntArray42[local70] = this.anIntArray42[local70 - 1] + local97;
			}
			this.anIntArrayArray4[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt589; local77++) {
				if (local77 > 0) {
					local89 = this.anInt587;
					@Pc(138) int local138 = (Static127.method2396(local12, 4096) - 2048) * this.anInt590 >> 12;
					local89 += local138 * local35 >> 12;
					this.anIntArrayArray4[local70][local77] = this.anIntArrayArray4[local70][local77 - 1] + local89;
				}
				this.anIntArrayArray5[local70][local77] = this.anInt583 <= 0 ? 4096 : 4096 - Static127.method2396(local12, this.anInt583);
			}
			this.anIntArrayArray4[local70][this.anInt589] = 4096;
		}
		this.anIntArray42[this.anInt579] = 4096;
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.method497();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt589 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt579 = arg1.method4614();
		} else if (arg0 == 2) {
			this.anInt590 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt588 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt586 = arg1.method4560();
		} else if (arg0 == 5) {
			this.anInt582 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt595 = arg1.method4560();
		} else if (arg0 == 7) {
			this.anInt583 = arg1.method4560();
		}
	}
}

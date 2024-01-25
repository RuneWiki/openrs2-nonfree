import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class231 {

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
	public int[] anIntArray472;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
	public int anInt6725;

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "Lclient!av;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "[[B")
	public byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "[Lclient!av;")
	public Class23[] aClass23Array1;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "I")
	public int anInt6730;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
	public final int anInt6729;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([BI[B)V")
	public Class231(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt6729 = Static342.method5248(arg0.length, arg0);
		if (arg1 != this.anInt6729) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray85 = Static557.method7739(arg0.length, arg0, 0);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (this.aByteArray85[local38] != arg2[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5436(arg0);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BZ)V")
	private void method5436(@OriginalArg(0) byte[] arg0) {
		@Pc(18) Class6_Sub12 local18 = new Class6_Sub12(Static175.method2720(arg0));
		@Pc(22) int local22 = local18.method6019();
		if (local22 < 5 || local22 > 6) {
			throw new RuntimeException();
		}
		if (local22 < 6) {
			this.anInt6725 = 0;
		} else {
			this.anInt6725 = local18.method6015();
		}
		@Pc(49) int local49 = local18.method6019();
		@Pc(60) boolean local60 = (local49 & 0x1) != 0;
		@Pc(68) boolean local68 = (local49 & 0x2) != 0;
		this.anInt6730 = local18.method6044();
		@Pc(75) int local75 = 0;
		this.anIntArray474 = new int[this.anInt6730];
		@Pc(82) int local82 = -1;
		for (@Pc(84) int local84 = 0; local84 < this.anInt6730; local84++) {
			this.anIntArray474[local84] = local75 += local18.method6044();
			if (this.anIntArray474[local84] > local82) {
				local82 = this.anIntArray474[local84];
			}
		}
		this.anInt6727 = local82 + 1;
		this.anIntArray472 = new int[this.anInt6727];
		this.anIntArray476 = new int[this.anInt6727];
		if (local68) {
			this.aByteArrayArray18 = new byte[this.anInt6727][];
		}
		this.anIntArray473 = new int[this.anInt6727];
		this.anIntArrayArray58 = new int[this.anInt6727][];
		this.anIntArray477 = new int[this.anInt6727];
		@Pc(159) int local159;
		@Pc(177) int local177;
		if (local60) {
			this.anIntArray475 = new int[this.anInt6727];
			for (local159 = 0; local159 < this.anInt6727; local159++) {
				this.anIntArray475[local159] = -1;
			}
			for (local177 = 0; local177 < this.anInt6730; local177++) {
				this.anIntArray475[this.anIntArray474[local177]] = local18.method6015();
			}
			this.aClass23_1 = new Class23(this.anIntArray475);
		}
		for (local159 = 0; local159 < this.anInt6730; local159++) {
			this.anIntArray472[this.anIntArray474[local159]] = local18.method6015();
		}
		if (local68) {
			for (local177 = 0; local177 < this.anInt6730; local177++) {
				@Pc(237) byte[] local237 = new byte[64];
				local18.method6020(local237, 64);
				this.aByteArrayArray18[this.anIntArray474[local177]] = local237;
			}
		}
		for (local177 = 0; local177 < this.anInt6730; local177++) {
			this.anIntArray476[this.anIntArray474[local177]] = local18.method6015();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt6730; local281++) {
			this.anIntArray473[this.anIntArray474[local281]] = local18.method6044();
		}
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(341) int local341;
		for (@Pc(300) int local300 = 0; local300 < this.anInt6730; local300++) {
			local307 = this.anIntArray474[local300];
			local75 = 0;
			local314 = this.anIntArray473[local307];
			local316 = -1;
			this.anIntArrayArray58[local307] = new int[local314];
			for (local324 = 0; local324 < local314; local324++) {
				local341 = this.anIntArrayArray58[local307][local324] = local75 += local18.method6044();
				if (local341 > local316) {
					local316 = local341;
				}
			}
			this.anIntArray477[local307] = local316 + 1;
			if (local316 + 1 == local314) {
				this.anIntArrayArray58[local307] = null;
			}
		}
		if (!local60) {
			return;
		}
		this.aClass23Array1 = new Class23[local82 + 1];
		this.anIntArrayArray57 = new int[local82 + 1][];
		for (local307 = 0; local307 < this.anInt6730; local307++) {
			local314 = this.anIntArray474[local307];
			local316 = this.anIntArray473[local314];
			this.anIntArrayArray57[local314] = new int[this.anIntArray477[local314]];
			for (local324 = 0; local324 < this.anIntArray477[local314]; local324++) {
				this.anIntArrayArray57[local314][local324] = -1;
			}
			for (local341 = 0; local341 < local316; local341++) {
				@Pc(450) int local450;
				if (this.anIntArrayArray58[local314] == null) {
					local450 = local341;
				} else {
					local450 = this.anIntArrayArray58[local314][local341];
				}
				this.anIntArrayArray57[local314][local450] = local18.method6015();
			}
			this.aClass23Array1[local314] = new Class23(this.anIntArrayArray57[local314]);
		}
	}
}

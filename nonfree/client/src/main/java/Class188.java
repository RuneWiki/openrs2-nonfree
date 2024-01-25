import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class188 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public int anInt4815;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[Lclient!ej;")
	public Class67[] aClass67Array1;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt4817;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Lclient!ej;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public int anInt4823;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public final int anInt4822;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BI)V")
	public Class188(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4822 = Static80.method1469(arg0.length, arg0);
		if (arg1 != this.anInt4822) {
			throw new RuntimeException();
		}
		this.method4274(arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([BI)V")
	private void method4274(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub15 local12 = new Class6_Sub15(Static83.method1502(arg0));
		@Pc(16) int local16 = local12.method3111();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt4823 = local12.method3109();
		} else {
			this.anInt4823 = 0;
		}
		@Pc(43) int local43 = local12.method3111();
		this.anInt4815 = local12.method3108();
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = -1;
		this.anIntArray427 = new int[this.anInt4815];
		for (@Pc(59) int local59 = 0; local59 < this.anInt4815; local59++) {
			this.anIntArray427[local59] = local50 += local12.method3108();
			if (this.anIntArray427[local59] > local52) {
				local52 = this.anIntArray427[local59];
			}
		}
		this.anInt4817 = local52 + 1;
		this.anIntArray430 = new int[this.anInt4817];
		this.anIntArray431 = new int[this.anInt4817];
		this.anIntArray428 = new int[this.anInt4817];
		this.anIntArrayArray40 = new int[this.anInt4817][];
		this.anIntArray429 = new int[this.anInt4817];
		@Pc(133) int local133;
		@Pc(147) int local147;
		if (local43 != 0) {
			this.anIntArray433 = new int[this.anInt4817];
			for (local133 = 0; local133 < this.anInt4817; local133++) {
				this.anIntArray433[local133] = -1;
			}
			for (local147 = 0; local147 < this.anInt4815; local147++) {
				this.anIntArray433[this.anIntArray427[local147]] = local12.method3109();
			}
			this.aClass67_1 = new Class67(this.anIntArray433);
		}
		for (local133 = 0; local133 < this.anInt4815; local133++) {
			this.anIntArray431[this.anIntArray427[local133]] = local12.method3109();
		}
		for (local147 = 0; local147 < this.anInt4815; local147++) {
			this.anIntArray430[this.anIntArray427[local147]] = local12.method3109();
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt4815; local215++) {
			this.anIntArray429[this.anIntArray427[local215]] = local12.method3108();
		}
		@Pc(241) int local241;
		@Pc(246) int local246;
		@Pc(250) int local250;
		@Pc(258) int local258;
		@Pc(275) int local275;
		for (@Pc(234) int local234 = 0; local234 < this.anInt4815; local234++) {
			local241 = this.anIntArray427[local234];
			local246 = this.anIntArray429[local241];
			local50 = 0;
			local250 = -1;
			this.anIntArrayArray40[local241] = new int[local246];
			for (local258 = 0; local258 < local246; local258++) {
				local275 = this.anIntArrayArray40[local241][local258] = local50 += local12.method3108();
				if (local250 < local275) {
					local250 = local275;
				}
			}
			this.anIntArray428[local241] = local250 + 1;
			if (local250 + 1 == local246) {
				this.anIntArrayArray40[local241] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.anIntArrayArray41 = new int[local52 + 1][];
		this.aClass67Array1 = new Class67[local52 + 1];
		for (local241 = 0; local241 < this.anInt4815; local241++) {
			local246 = this.anIntArray427[local241];
			local250 = this.anIntArray429[local246];
			this.anIntArrayArray41[local246] = new int[this.anIntArray428[local246]];
			for (local258 = 0; local258 < this.anIntArray428[local246]; local258++) {
				this.anIntArrayArray41[local246][local258] = -1;
			}
			for (local275 = 0; local275 < local250; local275++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray40[local246] == null) {
					local400 = local275;
				} else {
					local400 = this.anIntArrayArray40[local246][local275];
				}
				this.anIntArrayArray41[local246][local400] = local12.method3109();
			}
			this.aClass67Array1[local246] = new Class67(this.anIntArrayArray41[local246]);
		}
	}
}

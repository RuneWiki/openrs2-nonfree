import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!lf;)V")
	private void method2214(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aStringArray20 = Static308.method4674('<', arg1.method1375());
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg0 == 2) {
			local22 = arg1.method1378();
			this.anIntArray221 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray221[local28] = arg1.method1386();
			}
		} else if (arg0 == 3) {
			local22 = arg1.method1378();
			this.anIntArrayArray19 = new int[local22][];
			this.anIntArray220 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(86) int local86 = arg1.method1386();
				this.anIntArray220[local28] = local86;
				this.anIntArrayArray19[local28] = new int[Static221.anIntArray344[local86]];
				for (@Pc(101) int local101 = 0; local101 < Static221.anIntArray344[local86]; local101++) {
					this.anIntArrayArray19[local28][local101] = arg1.method1386();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean165 = false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
	public int method2215() {
		return this.anIntArray220 == null ? 0 : this.anIntArray220.length;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!lf;I)Ljava/lang/String;")
	public String method2216(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray220 != null) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray220.length; local25++) {
				local10.append(this.aStringArray20[local25]);
				local10.append(Static6.method41(this.anIntArrayArray19[local25], this.anIntArray220[local25], arg0.method1368(Static204.anIntArray314[this.anIntArray220[local25]])));
			}
		}
		local10.append(this.aStringArray20[this.aStringArray20.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lclient!lf;I)V")
	public void method2218(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1378();
			if (local9 == 0) {
				return;
			}
			this.method2214(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)I")
	public int method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray220 == null || arg1 < 0 || arg1 > this.anIntArray220.length) {
			return -1;
		} else if (this.anIntArrayArray19[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray19[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray19[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I")
	public int method2221(@OriginalArg(1) int arg0) {
		return this.anIntArray220 == null || arg0 < 0 || this.anIntArray220.length < arg0 ? -1 : this.anIntArray220[arg0];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([ILclient!lf;B)V")
	public void method2222(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (this.anIntArray220 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; this.anIntArray220.length > local12 && local12 < arg0.length; local12++) {
			@Pc(34) int local34 = Static312.anIntArray507[this.method2221(local12)];
			if (local34 > 0) {
				arg1.method1391((long) arg0[local12], local34);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method2223() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray20 == null) {
			return "";
		}
		local6.append(this.aStringArray20[0]);
		for (@Pc(25) int local25 = 1; local25 < this.aStringArray20.length; local25++) {
			local6.append("...");
			local6.append(this.aStringArray20[local25]);
		}
		return local6.toString();
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	public void method2225() {
		if (this.anIntArray221 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray221.length; local18++) {
				this.anIntArray221[local18] |= 0x8000;
			}
		}
	}
}

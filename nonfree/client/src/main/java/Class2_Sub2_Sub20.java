import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!si", name = "E", descriptor = "[Lclient!i;")
	private Class41[] aClass41Array64;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "[I")
	public int[] anIntArray436;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
	public int method2890(@OriginalArg(1) int arg0) {
		return this.anIntArray435 == null || arg0 < 0 || arg0 > this.anIntArray435.length ? -1 : this.anIntArray435[arg0];
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(B)I")
	public int method2892() {
		return this.anIntArray435 == null ? 0 : this.anIntArray435.length;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!ea;I)V")
	private void method2893(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass41Array64 = arg0.method160().method1389(60);
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method209();
			this.anIntArray436 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray436[local31] = arg0.method163();
			}
		} else if (arg1 == 3) {
			local25 = arg0.method209();
			this.anIntArrayArray36 = new int[local25][];
			this.anIntArray435 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(73) int local73 = arg0.method163();
				this.anIntArray435[local31] = local73;
				this.anIntArrayArray36[local31] = new int[Static80.anIntArray202[local73]];
				for (@Pc(88) int local88 = 0; local88 < Static80.anIntArray202[local73]; local88++) {
					this.anIntArrayArray36[local31][local88] = arg0.method163();
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ea;I)Lclient!i;")
	public Class41 method2894(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(14) Class41 local14 = Static148.method2319(80);
		if (this.anIntArray435 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray435.length; local19++) {
				local14.method1405(this.aClass41Array64[local19]);
				local14.method1405(Static129.method400(arg0.method162(Static68.anIntArray170[this.anIntArray435[local19]]), this.anIntArray435[local19], this.anIntArrayArray36[local19]));
			}
		}
		local14.method1405(this.aClass41Array64[this.aClass41Array64.length - 1]);
		return local14.method1418();
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)Lclient!i;")
	public Class41 method2895() {
		@Pc(9) Class41 local9 = Static148.method2319(80);
		if (this.aClass41Array64 == null) {
			return Static89.aClass41_654;
		}
		local9.method1405(this.aClass41Array64[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aClass41Array64.length; local29++) {
			local9.method1405(Static166.aClass41_956);
			local9.method1405(this.aClass41Array64[local29]);
		}
		return local9.method1418();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ea;B)V")
	public void method2896(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method209();
			if (local17 == 0) {
				return;
			}
			this.method2893(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	public int method2897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray435 == null || arg1 < 0 || this.anIntArray435.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray36[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray36[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray36[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ea;[I)V")
	public void method2899(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray435 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray435.length; local19++) {
			if (local19 >= arg1.length) {
				return;
			}
			@Pc(28) int local28 = Static120.anIntArray309[this.method2890(local19)];
			if (local28 > 0) {
				arg0.method168(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
	public void method2900() {
		if (this.anIntArray436 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray436.length; local12++) {
				this.anIntArray436[local12] |= 0x8000;
			}
		}
	}
}

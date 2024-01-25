import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "Z")
	public boolean aBoolean449 = true;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method4713(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3141();
			if (local7 == 0) {
				return;
			}
			this.method4714(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!eb;IB)V")
	private void method4714(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray36 = Static62.method1317(arg0.method3134(), '<');
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (arg1 == 2) {
			local38 = arg0.method3141();
			this.anIntArray676 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray676[local48] = arg0.method3115();
			}
		} else if (arg1 == 3) {
			local38 = arg0.method3141();
			this.anIntArray677 = new int[local38];
			this.anIntArrayArray54 = new int[local38][];
			for (local48 = 0; local48 < local38; local48++) {
				@Pc(54) int local54 = arg0.method3115();
				this.anIntArray677[local48] = local54;
				this.anIntArrayArray54[local48] = new int[Static345.anIntArray801[local54]];
				for (@Pc(69) int local69 = 0; local69 < Static345.anIntArray801[local54]; local69++) {
					this.anIntArrayArray54[local48][local69] = arg0.method3115();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean449 = false;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!eb;)Ljava/lang/String;")
	public String method4715(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray677 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray677.length; local20++) {
				local10.append(this.aStringArray36[local20]);
				local10.append(Static288.method5430(this.anIntArray677[local20], this.anIntArrayArray54[local20], arg0.method3107(Static180.anIntArray440[this.anIntArray677[local20]])));
			}
		}
		local10.append(this.aStringArray36[this.aStringArray36.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)I")
	public int method4717(@OriginalArg(1) int arg0) {
		return this.anIntArray677 == null || arg0 < 0 || arg0 > this.anIntArray677.length ? -1 : this.anIntArray677[arg0];
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I")
	public int method4718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray677 == null || arg1 < 0 || arg1 > this.anIntArray677.length) {
			return -1;
		} else if (this.anIntArrayArray54[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray54[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray54[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!eb;[II)V")
	public void method4720(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray677 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray677.length && local11 < arg1.length; local11++) {
			@Pc(20) int local20 = Static201.anIntArray483[this.method4717(local11)];
			if (local20 > 0) {
				arg0.method3129((long) arg1[local11], local20);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method4721() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray36 == null) {
			return "";
		}
		local10.append(this.aStringArray36[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray36.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray36[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	public void method4724() {
		if (this.anIntArray676 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray676.length; local6++) {
				this.anIntArray676[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(B)I")
	public int method4727() {
		return this.anIntArray677 == null ? 0 : this.anIntArray677.length;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "Z")
	public boolean aBoolean466 = true;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method4615() {
		@Pc(19) StringBuffer local19 = new StringBuffer(80);
		if (this.aStringArray33 == null) {
			return "";
		}
		local19.append(this.aStringArray33[0]);
		for (@Pc(34) int local34 = 1; local34 < this.aStringArray33.length; local34++) {
			local19.append("...");
			local19.append(this.aStringArray33[local34]);
		}
		return local19.toString();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([ILclient!wm;B)V")
	public void method4616(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		if (this.anIntArray503 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; this.anIntArray503.length > local19 && local19 < arg0.length; local19++) {
			@Pc(35) int local35 = Static88.anIntArray393[this.method4625(local19)];
			if (local35 > 0) {
				arg1.method4267(local35, (long) arg0[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!wm;)V")
	public void method4617(@OriginalArg(1) Class2_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4261();
			if (local9 == 0) {
				return;
			}
			this.method4618(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wm;II)V")
	private void method4618(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray33 = Static216.method3644('<', arg0.method4265());
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg1 == 2) {
			local20 = arg0.method4261();
			this.anIntArray502 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray502[local26] = arg0.method4242();
			}
		} else if (arg1 == 3) {
			local20 = arg0.method4261();
			this.anIntArrayArray51 = new int[local20][];
			this.anIntArray503 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				@Pc(67) int local67 = arg0.method4242();
				this.anIntArray503[local26] = local67;
				this.anIntArrayArray51[local26] = new int[Static218.anIntArray376[local67]];
				for (@Pc(82) int local82 = 0; local82 < Static218.anIntArray376[local67]; local82++) {
					this.anIntArrayArray51[local26][local82] = arg0.method4242();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean466 = false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)I")
	public int method4619() {
		return this.anIntArray503 == null ? 0 : this.anIntArray503.length;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZII)I")
	public int method4621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray503 == null || arg0 < 0 || this.anIntArray503.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray51[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray51[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray51[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	public void method4623() {
		if (this.anIntArray502 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray502.length; local7++) {
				this.anIntArray502[local7] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I")
	public int method4625(@OriginalArg(0) int arg0) {
		return this.anIntArray503 == null || arg0 < 0 || this.anIntArray503.length < arg0 ? -1 : this.anIntArray503[arg0];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!wm;)Ljava/lang/String;")
	public String method4626(@OriginalArg(1) Class2_Sub26 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray503 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray503.length; local22++) {
				local17.append(this.aStringArray33[local22]);
				local17.append(Static14.method308(this.anIntArray503[local22], this.anIntArrayArray51[local22], arg0.method4219(Static205.anIntArray352[this.anIntArray503[local22]])));
			}
		}
		local17.append(this.aStringArray33[this.aStringArray33.length - 1]);
		return local17.toString();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7_Sub1_Sub1 extends Class7_Sub1 {

	@OriginalMember(owner = "client!af", name = "H", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "Z")
	public boolean aBoolean3 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public int method96(@OriginalArg(0) int arg0) {
		return this.anIntArray18 == null || arg0 < 0 || arg0 > this.anIntArray18.length ? -1 : this.anIntArray18[arg0];
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method97() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray1 == null) {
			return "";
		}
		local8.append(this.aStringArray1[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray1.length; local30++) {
			local8.append("...");
			local8.append(this.aStringArray1[local30]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ap;)Ljava/lang/String;")
	public String method98(@OriginalArg(1) Class7_Sub3 arg0) {
		@Pc(13) StringBuffer local13 = new StringBuffer(80);
		if (this.anIntArray18 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray18.length; local18++) {
				local13.append(this.aStringArray1[local18]);
				local13.append(Static135.method2686(this.anIntArray18[local18], this.anIntArrayArray1[local18], arg0.method2737(Static302.anIntArray820[this.anIntArray18[local18]])));
			}
		}
		local13.append(this.aStringArray1[this.aStringArray1.length - 1]);
		return local13.toString();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)I")
	public int method99(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray18 == null || arg0 < 0 || arg0 > this.anIntArray18.length) {
			return -1;
		} else if (this.anIntArrayArray1[arg0] == null || arg1 < 0 || this.anIntArrayArray1[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray1[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!ap;)V")
	private void method100(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.aStringArray1 = Static201.method3708('<', arg1.method2782());
			return;
		}
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg0 == 2) {
			local31 = arg1.method2772();
			this.anIntArray17 = new int[local31];
			for (local37 = 0; local37 < local31; local37++) {
				this.anIntArray17[local37] = arg1.method2764();
			}
		} else if (arg0 == 3) {
			local31 = arg1.method2772();
			this.anIntArray18 = new int[local31];
			this.anIntArrayArray1 = new int[local31][];
			for (local37 = 0; local37 < local31; local37++) {
				@Pc(72) int local72 = arg1.method2764();
				this.anIntArray18[local37] = local72;
				this.anIntArrayArray1[local37] = new int[Static316.anIntArray766[local72]];
				for (@Pc(87) int local87 = 0; local87 < Static316.anIntArray766[local72]; local87++) {
					this.anIntArrayArray1[local37][local87] = arg1.method2764();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean3 = false;
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
	public void method101() {
		if (this.anIntArray17 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray17.length; local11++) {
				this.anIntArray17[local11] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([ILclient!ap;I)V")
	public void method102(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		if (this.anIntArray18 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray18.length; local15++) {
			if (arg0.length <= local15) {
				return;
			}
			@Pc(23) int local23 = Static35.anIntArray151[this.method96(local15)];
			if (local23 > 0) {
				arg1.method2786(local23, (long) arg0[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ap;B)V")
	public void method103(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2772();
			if (local7 == 0) {
				return;
			}
			this.method100(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(B)I")
	public int method104() {
		return this.anIntArray18 == null ? 0 : this.anIntArray18.length;
	}
}

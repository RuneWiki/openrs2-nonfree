import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "Z")
	public boolean aBoolean349 = true;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)I")
	public int method3799(@OriginalArg(0) int arg0) {
		return this.anIntArray444 == null || arg0 < 0 || this.anIntArray444.length < arg0 ? -1 : this.anIntArray444[arg0];
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method3800() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray41 == null) {
			return "";
		}
		local10.append(this.aStringArray41[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray41.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray41[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZ)I")
	public int method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray444 == null || arg1 < 0 || this.anIntArray444.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray37[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray37[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray37[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!sb;I)V")
	private void method3802(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray41 = Static37.method679(arg0.method2605(), '<');
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (arg1 == 2) {
			local40 = arg0.method2595();
			this.anIntArray442 = new int[local40];
			for (local50 = 0; local50 < local40; local50++) {
				this.anIntArray442[local50] = arg0.method2593();
			}
		} else if (arg1 == 3) {
			local40 = arg0.method2595();
			this.anIntArrayArray37 = new int[local40][];
			this.anIntArray444 = new int[local40];
			for (local50 = 0; local50 < local40; local50++) {
				@Pc(61) int local61 = arg0.method2593();
				this.anIntArray444[local50] = local61;
				this.anIntArrayArray37[local50] = new int[Static269.anIntArray35[local61]];
				for (@Pc(76) int local76 = 0; local76 < Static269.anIntArray35[local61]; local76++) {
					this.anIntArrayArray37[local50][local76] = arg0.method2593();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean349 = false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)I")
	public int method3803() {
		return this.anIntArray444 == null ? 0 : this.anIntArray444.length;
	}

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V")
	public void method3806() {
		if (this.anIntArray442 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray442.length; local15++) {
				this.anIntArray442[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([ILclient!sb;Z)V")
	public void method3807(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (this.anIntArray444 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray444.length && arg0.length > local18; local18++) {
			@Pc(34) int local34 = Static165.anIntArray277[this.method3799(local18)];
			if (local34 > 0) {
				arg1.method2622((long) arg0[local18], local34);
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!sb;)Ljava/lang/String;")
	public String method3808(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray444 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray444.length; local22++) {
				local16.append(this.aStringArray41[local22]);
				local16.append(Static268.method4666(this.anIntArrayArray37[local22], arg0.method2633(Static172.anIntArray16[this.anIntArray444[local22]]), this.anIntArray444[local22]));
			}
		}
		local16.append(this.aStringArray41[this.aStringArray41.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!sb;)V")
	public void method3810(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2595();
			if (local15 == 0) {
				return;
			}
			this.method3802(arg0, local15);
		}
	}
}

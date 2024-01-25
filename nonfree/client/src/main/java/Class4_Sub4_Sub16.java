import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class4_Sub4_Sub16 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray66;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray151;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!lf;B[I)V")
	public void method4688(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray442 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray442.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(28) int local28 = Static61.anIntArray92[this.method4689(local19)];
			if (local28 > 0) {
				arg0.method3421((long) arg1[local19], local28);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)I")
	public int method4689(@OriginalArg(0) int arg0) {
		return this.anIntArray442 == null || arg0 < 0 || arg0 > this.anIntArray442.length ? -1 : this.anIntArray442[arg0];
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method4690(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method4698(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public void method4691() {
		if (this.anIntArray445 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray445.length; local6++) {
				this.anIntArray445[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(BII)I")
	public int method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray442 == null || arg1 < 0 || this.anIntArray442.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray151[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray151[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray151[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method4694() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray66 == null) {
			return "";
		}
		local10.append(this.aStringArray66[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray66.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray66[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)I")
	public int method4695() {
		return this.anIntArray442 == null ? 0 : this.anIntArray442.length;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!lf;II)V")
	private void method4698(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray66 = Static212.method2554(arg0.method3446(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method3440();
			this.anIntArray445 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray445[local29] = arg0.method3401();
			}
			return;
		}
		if (arg1 == 3) {
			local23 = arg0.method3440();
			this.anIntArrayArray151 = new int[local23][];
			this.anIntArray442 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(72) int local72 = arg0.method3401();
				this.anIntArray442[local29] = local72;
				this.anIntArrayArray151[local29] = new int[Static72.anIntArray107[local72]];
				for (@Pc(87) int local87 = 0; local87 < Static72.anIntArray107[local72]; local87++) {
					this.anIntArrayArray151[local29][local87] = arg0.method3401();
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean399 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(Lclient!lf;I)Ljava/lang/String;")
	public String method4699(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray442 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray442.length; local15++) {
				local10.append(this.aStringArray66[local15]);
				local10.append(Static338.method5445(arg0.method3432(Static100.anIntArray225[this.anIntArray442[local15]]), this.anIntArrayArray151[local15], this.anIntArray442[local15]));
			}
		}
		local10.append(this.aStringArray66[this.aStringArray66.length - 1]);
		return local10.toString();
	}
}

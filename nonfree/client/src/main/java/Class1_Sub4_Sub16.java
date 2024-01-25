import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub4_Sub16 extends Class1_Sub4 {

	@OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "Z")
	public boolean aBoolean274 = true;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)I")
	public int method3416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray268 == null || arg0 < 0 || this.anIntArray268.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray27[arg0] == null || arg1 < 0 || this.anIntArrayArray27[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray27[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!at;)Ljava/lang/String;")
	public String method3418(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray268 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray268.length; local15++) {
				local10.append(this.aStringArray18[local15]);
				local10.append(Static99.method2188(arg0.method2145(Static5.anIntArray21[this.anIntArray268[local15]]), this.anIntArrayArray27[local15], this.anIntArray268[local15]));
			}
		}
		local10.append(this.aStringArray18[this.aStringArray18.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[ILclient!at;)V")
	public void method3419(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (this.anIntArray268 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray268.length; local17++) {
			if (local17 >= arg0.length) {
				return;
			}
			@Pc(26) int local26 = Static196.anIntArray305[this.method3423(local17)];
			if (local26 > 0) {
				arg1.method2111((long) arg0[local17], local26);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!at;I)V")
	public void method3420(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2132();
			if (local12 == 0) {
				return;
			}
			this.method3424(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)I")
	public int method3421() {
		return this.anIntArray268 == null ? 0 : this.anIntArray268.length;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method3422() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray18 == null) {
			return "";
		}
		local10.append(this.aStringArray18[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray18.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray18[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)I")
	public int method3423(@OriginalArg(0) int arg0) {
		return this.anIntArray268 == null || arg0 < 0 || arg0 > this.anIntArray268.length ? -1 : this.anIntArray268[arg0];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!at;B)V")
	private void method3424(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aStringArray18 = Static143.method2850('<', arg1.method2109());
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method2132();
			this.anIntArray267 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray267[local26] = arg1.method2161();
			}
		} else if (arg0 == 3) {
			local20 = arg1.method2132();
			this.anIntArrayArray27 = new int[local20][];
			this.anIntArray268 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				@Pc(74) int local74 = arg1.method2161();
				this.anIntArray268[local26] = local74;
				this.anIntArrayArray27[local26] = new int[Static326.anIntArray474[local74]];
				for (@Pc(89) int local89 = 0; local89 < Static326.anIntArray474[local74]; local89++) {
					this.anIntArrayArray27[local26][local89] = arg1.method2161();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean274 = false;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
	public void method3425() {
		if (this.anIntArray267 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray267.length; local17++) {
				this.anIntArray267[local17] |= 0x8000;
			}
		}
	}
}

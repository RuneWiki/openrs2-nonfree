import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class14_Sub2_Sub11 extends Class14_Sub2 {

	@OriginalMember(owner = "client!js", name = "v", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!js", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray45;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!js", name = "N", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IBLclient!jg;)V")
	public void method3067(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (this.anIntArray293 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; this.anIntArray293.length > local11 && local11 < arg0.length; local11++) {
			@Pc(20) int local20 = Static328.anIntArray606[this.method3074(local11)];
			if (local20 > 0) {
				arg1.method2542(local20, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLclient!jg;)V")
	public void method3068(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2548();
			if (local5 == 0) {
				return;
			}
			this.method3070(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)I")
	public int method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray293 == null || arg0 < 0 || arg0 > this.anIntArray293.length) {
			return -1;
		} else if (this.anIntArrayArray52[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray52[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray52[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!jg;I)V")
	private void method3070(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray45 = Static105.method2289(arg0.method2496(), '<');
			return;
		}
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg1 == 2) {
			local17 = arg0.method2548();
			this.anIntArray294 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray294[local23] = arg0.method2498();
			}
		} else if (arg1 == 3) {
			local17 = arg0.method2548();
			this.anIntArray293 = new int[local17];
			this.anIntArrayArray52 = new int[local17][];
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(61) int local61 = arg0.method2498();
				this.anIntArray293[local23] = local61;
				this.anIntArrayArray52[local23] = new int[Static143.anIntArray273[local61]];
				for (@Pc(76) int local76 = 0; local76 < Static143.anIntArray273[local61]; local76++) {
					this.anIntArrayArray52[local23][local76] = arg0.method2498();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean216 = false;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)I")
	public int method3074(@OriginalArg(0) int arg0) {
		return this.anIntArray293 == null || arg0 < 0 || this.anIntArray293.length < arg0 ? -1 : this.anIntArray293[arg0];
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method3075() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray45 == null) {
			return "";
		}
		local10.append(this.aStringArray45[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray45.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray45[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
	public void method3076() {
		if (this.anIntArray294 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray294.length; local6++) {
				this.anIntArray294[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(B)I")
	public int method3077() {
		return this.anIntArray293 == null ? 0 : this.anIntArray293.length;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(BLclient!jg;)Ljava/lang/String;")
	public String method3078(@OriginalArg(1) Class14_Sub4 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray293 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray293.length; local23++) {
				local18.append(this.aStringArray45[local23]);
				local18.append(Static304.method5306(this.anIntArrayArray52[local23], this.anIntArray293[local23], arg0.method2536(Static283.anIntArray489[this.anIntArray293[local23]])));
			}
		}
		local18.append(this.aStringArray45[this.aStringArray45.length - 1]);
		return local18.toString();
	}
}

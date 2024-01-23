import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!od", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray32;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Z")
	public boolean aBoolean193 = true;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method2902() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray32 == null) {
			return "";
		}
		local6.append(this.aStringArray32[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray32.length; local24++) {
			local6.append("...");
			local6.append(this.aStringArray32[local24]);
		}
		return local6.toString();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
	public int method2904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray293 == null || arg0 < 0 || this.anIntArray293.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray27[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray27[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray27[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ql;II)V")
	private void method2905(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray32 = Static151.method2721(arg0.method1774());
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method1772();
			this.anIntArray294 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray294[local29] = arg0.method1764();
			}
		} else if (arg1 == 3) {
			local23 = arg0.method1772();
			this.anIntArray293 = new int[local23];
			this.anIntArrayArray27 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(75) int local75 = arg0.method1764();
				this.anIntArray293[local29] = local75;
				this.anIntArrayArray27[local29] = new int[Static188.anIntArray314[local75]];
				for (@Pc(90) int local90 = 0; local90 < Static188.anIntArray314[local75]; local90++) {
					this.anIntArrayArray27[local29][local90] = arg0.method1764();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean193 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ql;I)Ljava/lang/String;")
	public String method2906(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.anIntArray293 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray293.length; local11++) {
				local6.append(this.aStringArray32[local11]);
				local6.append(Static218.method3559(this.anIntArray293[local11], arg0.method1781(Static50.anIntArray109[this.anIntArray293[local11]]), this.anIntArrayArray27[local11]));
			}
		}
		local6.append(this.aStringArray32[this.aStringArray32.length - 1]);
		return local6.toString();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[ILclient!ql;)V")
	public void method2907(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (this.anIntArray293 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray293.length; local21++) {
			if (local21 >= arg0.length) {
				return;
			}
			@Pc(30) int local30 = Static142.anIntArray258[this.method2911(local21)];
			if (local30 > 0) {
				arg1.method1809(local30, (long) arg0[local21]);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(I)I")
	public int method2909() {
		return this.anIntArray293 == null ? 0 : this.anIntArray293.length;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public int method2911(@OriginalArg(1) int arg0) {
		return this.anIntArray293 == null || arg0 < 0 || arg0 > this.anIntArray293.length ? -1 : this.anIntArray293[arg0];
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ql;B)V")
	public void method2912(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1772();
			if (local11 == 0) {
				return;
			}
			this.method2905(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public void method2913() {
		if (this.anIntArray294 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray294.length; local14++) {
				this.anIntArray294[local14] |= 0x8000;
			}
		}
	}
}

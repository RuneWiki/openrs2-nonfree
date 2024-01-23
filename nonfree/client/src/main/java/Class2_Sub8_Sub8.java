import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class2_Sub8_Sub8 extends Class2_Sub8 {

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!oe;B)V")
	private void method1863(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.aStringArray19 = Static227.method3704(arg1.method2158(), '<');
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method2146();
			this.anIntArray218 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray218[local29] = arg1.method2130();
			}
		} else if (arg0 == 3) {
			local23 = arg1.method2146();
			this.anIntArray219 = new int[local23];
			this.anIntArrayArray7 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(85) int local85 = arg1.method2130();
				this.anIntArray219[local29] = local85;
				this.anIntArrayArray7[local29] = new int[Static209.anIntArray432[local85]];
				for (@Pc(100) int local100 = 0; local100 < Static209.anIntArray432[local85]; local100++) {
					this.anIntArrayArray7[local29][local100] = arg1.method2130();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean164 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	public void method1864() {
		if (this.anIntArray218 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray218.length; local17++) {
				this.anIntArray218[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!oe;)Ljava/lang/String;")
	public String method1865(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.anIntArray219 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray219.length; local15++) {
				local6.append(this.aStringArray19[local15]);
				local6.append(Static10.method160(this.anIntArrayArray7[local15], arg0.method2188(Static264.anIntArray497[this.anIntArray219[local15]]), this.anIntArray219[local15]));
			}
		}
		local6.append(this.aStringArray19[this.aStringArray19.length - 1]);
		return local6.toString();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IZLclient!oe;)V")
	public void method1867(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (this.anIntArray219 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray219.length && local11 < arg0.length; local11++) {
			@Pc(31) int local31 = Static107.anIntArray211[this.method1869(local11)];
			if (local31 > 0) {
				arg1.method2192((long) arg0[local11], local31);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1868() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray19 == null) {
			return "";
		}
		local10.append(this.aStringArray19[0]);
		for (@Pc(33) int local33 = 1; local33 < this.aStringArray19.length; local33++) {
			local10.append("...");
			local10.append(this.aStringArray19[local33]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)I")
	public int method1869(@OriginalArg(1) int arg0) {
		return this.anIntArray219 == null || arg0 < 0 || this.anIntArray219.length < arg0 ? -1 : this.anIntArray219[arg0];
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)I")
	public int method1871() {
		return this.anIntArray219 == null ? 0 : this.anIntArray219.length;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(BLclient!oe;)V")
	public void method1875(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2146();
			if (local9 == 0) {
				return;
			}
			this.method1863(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)I")
	public int method1877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray219 == null || arg1 < 0 || this.anIntArray219.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray7[arg1] == null || arg0 < 0 || this.anIntArrayArray7[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray7[arg1][arg0];
		}
	}
}

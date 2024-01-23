import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class4_Sub3_Sub11 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
	public int method1904() {
		return this.anIntArray210 == null ? 0 : this.anIntArray210.length;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public int method1905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray210 == null || arg1 < 0 || arg1 > this.anIntArray210.length) {
			return -1;
		} else if (this.anIntArrayArray20[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray20[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray20[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public int method1906(@OriginalArg(0) int arg0) {
		return this.anIntArray210 == null || arg0 < 0 || arg0 > this.anIntArray210.length ? -1 : this.anIntArray210[arg0];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!fd;)V")
	private void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.aStringArray17 = Static45.method721('<', arg1.method4630());
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg0 == 2) {
			local27 = arg1.method4666();
			this.anIntArray212 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray212[local37] = arg1.method4653();
			}
		} else if (arg0 == 3) {
			local27 = arg1.method4666();
			this.anIntArrayArray20 = new int[local27][];
			this.anIntArray210 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				@Pc(48) int local48 = arg1.method4653();
				this.anIntArray210[local37] = local48;
				this.anIntArrayArray20[local37] = new int[Static222.anIntArray456[local48]];
				for (@Pc(63) int local63 = 0; local63 < Static222.anIntArray456[local48]; local63++) {
					this.anIntArrayArray20[local37][local63] = arg1.method4653();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method1909(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4666();
			if (local14 == 0) {
				return;
			}
			this.method1907(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public String method1910(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray210 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray210.length; local21++) {
				local16.append(this.aStringArray17[local21]);
				local16.append(Static126.method1941(arg0.method4633(Static115.anIntArray191[this.anIntArray210[local21]]), this.anIntArray210[local21], this.anIntArrayArray20[local21]));
			}
		}
		local16.append(this.aStringArray17[this.aStringArray17.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	public void method1911() {
		if (this.anIntArray212 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray212.length; local20++) {
				this.anIntArray212[local20] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBLclient!fd;)V")
	public void method1912(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (this.anIntArray210 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray210.length && local13 < arg0.length; local13++) {
			@Pc(29) int local29 = Static48.anIntArray64[this.method1906(local13)];
			if (local29 > 0) {
				arg1.method4643((long) arg0[local13], local29);
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1914() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray17 == null) {
			return "";
		}
		local6.append(this.aStringArray17[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray17.length; local31++) {
			local6.append("...");
			local6.append(this.aStringArray17[local31]);
		}
		return local6.toString();
	}
}

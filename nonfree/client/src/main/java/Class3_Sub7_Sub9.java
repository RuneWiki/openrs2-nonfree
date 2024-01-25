import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!il", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!il", name = "A", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method2253(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3643();
			if (local12 == 0) {
				return;
			}
			this.method2264(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)I")
	public int method2256(@OriginalArg(1) int arg0) {
		return this.anIntArray187 == null || arg0 < 0 || this.anIntArray187.length < arg0 ? -1 : this.anIntArray187[arg0];
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(B)I")
	public int method2258() {
		return this.anIntArray187 == null ? 0 : this.anIntArray187.length;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I")
	public int method2259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray187 == null || arg1 < 0 || this.anIntArray187.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray17[arg1] == null || arg0 < 0 || this.anIntArrayArray17[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray17[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method2260() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray17 == null) {
			return "";
		}
		local15.append(this.aStringArray17[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray17.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray17[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
	public void method2261() {
		if (this.anIntArray188 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray188.length; local12++) {
				this.anIntArray188[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!fb;[I)V")
	public void method2263(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray187 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray187.length; local15++) {
			if (arg1.length <= local15) {
				return;
			}
			@Pc(24) int local24 = Static24.anIntArray489[this.method2256(local15)];
			if (local24 > 0) {
				arg0.method3628(local24, (long) arg1[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZILclient!fb;)V")
	private void method2264(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aStringArray17 = Static159.method2528('<', arg1.method3671());
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg0 == 2) {
			local35 = arg1.method3643();
			this.anIntArray188 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray188[local45] = arg1.method3649();
			}
		} else if (arg0 == 3) {
			local35 = arg1.method3643();
			this.anIntArray187 = new int[local35];
			this.anIntArrayArray17 = new int[local35][];
			for (local45 = 0; local45 < local35; local45++) {
				@Pc(51) int local51 = arg1.method3649();
				this.anIntArray187[local45] = local51;
				this.anIntArrayArray17[local45] = new int[Static274.anIntArray482[local51]];
				for (@Pc(66) int local66 = 0; local66 < Static274.anIntArray482[local51]; local66++) {
					this.anIntArrayArray17[local45][local66] = arg1.method3649();
				}
			}
			return;
		} else if (arg0 == 4) {
			this.aBoolean156 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Lclient!fb;I)Ljava/lang/String;")
	public String method2266(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray187 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray187.length; local15++) {
				local10.append(this.aStringArray17[local15]);
				local10.append(Static123.method2161(this.anIntArray187[local15], this.anIntArrayArray17[local15], arg0.method3647(Static8.anIntArray9[this.anIntArray187[local15]])));
			}
		}
		local10.append(this.aStringArray17[this.aStringArray17.length - 1]);
		return local10.toString();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray30;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(BI)I")
	public int method2875(@OriginalArg(1) int arg0) {
		return this.anIntArray302 == null || arg0 < 0 || arg0 > this.anIntArray302.length ? -1 : this.anIntArray302[arg0];
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!p;)V")
	public void method2877(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1874();
			if (local10 == 0) {
				return;
			}
			this.method2885(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!p;B)Ljava/lang/String;")
	public String method2879(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.anIntArray302 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray302.length; local12++) {
				local6.append(this.aStringArray30[local12]);
				local6.append(Static93.method1499(arg0.method1870(Static34.anIntArray70[this.anIntArray302[local12]]), this.anIntArray302[local12], this.anIntArrayArray29[local12]));
			}
		}
		local6.append(this.aStringArray30[this.aStringArray30.length - 1]);
		return local6.toString();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)I")
	public int method2880() {
		return this.anIntArray302 == null ? 0 : this.anIntArray302.length;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	public void method2881() {
		if (this.anIntArray303 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray303.length; local15++) {
				this.anIntArray303[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	public int method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray302 == null || arg1 < 0 || arg1 > this.anIntArray302.length) {
			return -1;
		} else if (this.anIntArrayArray29[arg1] == null || arg0 < 0 || this.anIntArrayArray29[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray29[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method2883() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray30 == null) {
			return "";
		}
		local6.append(this.aStringArray30[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray30.length; local31++) {
			local6.append("...");
			local6.append(this.aStringArray30[local31]);
		}
		return local6.toString();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!p;[IB)V")
	public void method2884(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray302 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray302.length && arg1.length > local20; local20++) {
			@Pc(44) int local44 = Static210.anIntArray374[this.method2875(local20)];
			if (local44 > 0) {
				arg0.method1873((long) arg1[local20], local44);
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!p;)V")
	private void method2885(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		if (arg0 == 1) {
			this.aStringArray30 = Static102.method1652(arg1.method1841(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		if (arg0 == 2) {
			local18 = arg1.method1874();
			this.anIntArray303 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray303[local28] = arg1.method1837();
			}
		} else if (arg0 == 3) {
			local18 = arg1.method1874();
			this.anIntArrayArray29 = new int[local18][];
			this.anIntArray302 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				@Pc(37) int local37 = arg1.method1837();
				this.anIntArray302[local28] = local37;
				this.anIntArrayArray29[local28] = new int[Static248.anIntArray429[local37]];
				for (@Pc(52) int local52 = 0; local52 < Static248.anIntArray429[local37]; local52++) {
					this.anIntArrayArray29[local28][local52] = arg1.method1837();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean236 = false;
		}
	}
}

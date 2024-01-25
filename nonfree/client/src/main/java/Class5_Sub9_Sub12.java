import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class5_Sub9_Sub12 extends Class5_Sub9 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
	public static final int[] anIntArray169 = new int[16384];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	public static final int[] anIntArray170 = new int[16384];

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Z")
	public boolean aBoolean187 = true;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray169[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray170[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!bk;Z[I)V")
	public void method2629(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray168 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray168.length; local9++) {
			if (local9 >= arg1.length) {
				return;
			}
			@Pc(20) int local20 = Static173.anIntArray322[this.method2632(local9)];
			if (local20 > 0) {
				arg0.method1842(local20, (long) arg1[local9]);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!bk;I)V")
	private void method2630(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray17 = Static219.method3847('<', arg0.method1840());
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg1 == 2) {
			local19 = arg0.method1832();
			this.anIntArray171 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray171[local25] = arg0.method1845();
			}
			return;
		}
		if (arg1 == 3) {
			local19 = arg0.method1832();
			this.anIntArrayArray18 = new int[local19][];
			this.anIntArray168 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				@Pc(68) int local68 = arg0.method1845();
				this.anIntArray168[local25] = local68;
				this.anIntArrayArray18[local25] = new int[Static114.anIntArray148[local68]];
				for (@Pc(83) int local83 = 0; local83 < Static114.anIntArray148[local68]; local83++) {
					this.anIntArrayArray18[local25][local83] = arg0.method1845();
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean187 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	public int method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray168 == null || arg0 < 0 || arg0 > this.anIntArray168.length) {
			return -1;
		} else if (this.anIntArrayArray18[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray18[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray18[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	public int method2632(@OriginalArg(0) int arg0) {
		return this.anIntArray168 == null || arg0 < 0 || this.anIntArray168.length < arg0 ? -1 : this.anIntArray168[arg0];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!bk;)V")
	public void method2633(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1832();
			if (local5 == 0) {
				return;
			}
			this.method2630(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!bk;)Ljava/lang/String;")
	public String method2634(@OriginalArg(1) Class5_Sub1 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray168 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray168.length; local15++) {
				local10.append(this.aStringArray17[local15]);
				local10.append(Static303.method5143(this.anIntArrayArray18[local15], this.anIntArray168[local15], arg0.method1869(Static163.anIntArray228[this.anIntArray168[local15]])));
			}
		}
		local10.append(this.aStringArray17[this.aStringArray17.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)I")
	public int method2637() {
		return this.anIntArray168 == null ? 0 : this.anIntArray168.length;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public void method2638() {
		if (this.anIntArray171 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray171.length; local10++) {
				this.anIntArray171[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method2640() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray17 == null) {
			return "";
		}
		local10.append(this.aStringArray17[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray17.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray17[local29]);
		}
		return local10.toString();
	}
}

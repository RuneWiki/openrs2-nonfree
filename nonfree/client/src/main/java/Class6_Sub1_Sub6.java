import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "Lclient!jl;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
	public void method1432() {
		if (this.anIntArray161 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray161.length; local15++) {
				this.anIntArray161[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)I")
	public int method1434() {
		return this.anIntArray160 == null ? 0 : this.anIntArray160.length;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1435() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray9 == null) {
			return "";
		}
		local16.append(this.aStringArray9[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray9.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray9[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ha;I)Ljava/lang/String;")
	public String method1436(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray160 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray160.length; local15++) {
				local10.append(this.aStringArray9[local15]);
				local10.append(this.aClass129_1.method2906(this.method1442(local15), this.anIntArrayArray16[local15], arg0.method3096(Static3.method5298(this.anIntArray160[local15]).anInt2624)));
			}
		}
		local10.append(this.aStringArray9[this.aStringArray9.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Lclient!ha;I)V")
	public void method1437(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method1438(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method1438(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray9 = Static109.method1808('<', arg0.method3093());
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (arg1 == 2) {
			local41 = arg0.method3111();
			this.anIntArray161 = new int[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.anIntArray161[local51] = arg0.method3108();
			}
		} else if (arg1 == 3) {
			local41 = arg0.method3111();
			this.anIntArrayArray16 = new int[local41][];
			this.anIntArray160 = new int[local41];
			for (local51 = 0; local51 < local41; local51++) {
				@Pc(57) int local57 = arg0.method3108();
				@Pc(61) Class106 local61 = Static3.method5298(local57);
				if (local61 != null) {
					this.anIntArray160[local51] = local57;
					this.anIntArrayArray16[local51] = new int[local61.anInt2629];
					for (@Pc(77) int local77 = 0; local77 < local61.anInt2629; local77++) {
						this.anIntArrayArray16[local51][local77] = arg0.method3108();
					}
				}
			}
			return;
		} else if (arg1 == 4) {
			this.aBoolean132 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)I")
	public int method1439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray160 == null || arg1 < 0 || this.anIntArray160.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray16[arg1] == null || arg0 < 0 || this.anIntArrayArray16[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray16[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([ILclient!ha;B)V")
	public void method1441(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (this.anIntArray160 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray160.length; local15++) {
			if (local15 >= arg0.length) {
				return;
			}
			@Pc(23) int local23 = this.method1442(local15).anInt2627;
			if (local23 > 0) {
				arg1.method3112(local23, (long) arg0[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)Lclient!hi;")
	public Class106 method1442(@OriginalArg(0) int arg0) {
		return this.anIntArray160 == null || arg0 < 0 || this.anIntArray160.length < arg0 ? null : Static3.method5298(this.anIntArray160[arg0]);
	}
}

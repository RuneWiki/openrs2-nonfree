import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Z")
	public boolean aBoolean171 = true;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)I")
	public int method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray266 == null || arg1 < 0 || this.anIntArray266.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray75[arg1] == null || arg0 < 0 || this.anIntArrayArray75[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray75[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	public void method2149() {
		if (this.anIntArray267 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray267.length; local6++) {
				this.anIntArray267[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ec;Z)Ljava/lang/String;")
	public String method2150(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray266 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray266.length; local20++) {
				local15.append(this.aStringArray12[local20]);
				local15.append(Static220.method3908(arg0.method3998(Static261.anIntArray527[this.anIntArray266[local20]]), this.anIntArrayArray75[local20], this.anIntArray266[local20]));
			}
		}
		local15.append(this.aStringArray12[this.aStringArray12.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ec;I[I)V")
	public void method2154(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray266 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray266.length; local17++) {
			if (local17 >= arg1.length) {
				return;
			}
			@Pc(26) int local26 = Static223.anIntArray475[this.method2158(local17)];
			if (local26 > 0) {
				arg0.method3991(local26, (long) arg1[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ec;)V")
	public void method2156(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3972();
			if (local10 == 0) {
				return;
			}
			this.method2162(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)I")
	public int method2157() {
		return this.anIntArray266 == null ? 0 : this.anIntArray266.length;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(II)I")
	public int method2158(@OriginalArg(0) int arg0) {
		return this.anIntArray266 == null || arg0 < 0 || this.anIntArray266.length < arg0 ? -1 : this.anIntArray266[arg0];
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method2160() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray12 == null) {
			return "";
		}
		local10.append(this.aStringArray12[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray12.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray12[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method2162(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray12 = Static194.method3611(arg0.method4023(), '<');
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method3972();
			this.anIntArray267 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray267[local31] = arg0.method4021();
			}
			return;
		}
		if (arg1 == 3) {
			local25 = arg0.method3972();
			this.anIntArray266 = new int[local25];
			this.anIntArrayArray75 = new int[local25][];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(68) int local68 = arg0.method4021();
				this.anIntArray266[local31] = local68;
				this.anIntArrayArray75[local31] = new int[Static333.anIntArray699[local68]];
				for (@Pc(83) int local83 = 0; local83 < Static333.anIntArray699[local68]; local83++) {
					this.anIntArrayArray75[local31][local83] = arg0.method4021();
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean171 = false;
			return;
		}
	}
}

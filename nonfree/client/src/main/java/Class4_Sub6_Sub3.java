import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8;

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!dn", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!dn", name = "O", descriptor = "Lclient!mea;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!dn", name = "Q", descriptor = "Z")
	public boolean aBoolean193 = true;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I")
	public int method1917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray116 == null || arg1 < 0 || this.anIntArray116.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray10[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray10[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray10[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILclient!ek;I)V")
	private void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aStringArray8 = Static297.method4750(arg1.method7016(), '<');
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method7004();
			this.anIntArray117 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray117[local31] = arg1.method7054();
			}
		} else if (arg0 == 3) {
			local25 = arg1.method7004();
			this.anIntArray116 = new int[local25];
			this.anIntArrayArray10 = new int[local25][];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(75) int local75 = arg1.method7054();
				@Pc(79) Class68 local79 = Static330.method5079(local75);
				if (local79 != null) {
					this.anIntArray116[local31] = local75;
					this.anIntArrayArray10[local31] = new int[local79.anInt2258];
					for (@Pc(95) int local95 = 0; local95 < local79.anInt2258; local95++) {
						this.anIntArrayArray10[local31][local95] = arg1.method7054();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean193 = false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)I")
	public int method1919() {
		return this.anIntArray116 == null ? 0 : this.anIntArray116.length;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V")
	public void method1920() {
		if (this.anIntArray117 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray117.length; local18++) {
				this.anIntArray117[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method1921(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7004();
			if (local11 == 0) {
				return;
			}
			this.method1918(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Lclient!dc;")
	public Class68 method1922(@OriginalArg(0) int arg0) {
		return this.anIntArray116 == null || arg0 < 0 || arg0 > this.anIntArray116.length ? null : Static330.method5079(this.anIntArray116[arg0]);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!ek;[I)V")
	public void method1924(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray116 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray116.length; local11++) {
			if (local11 >= arg1.length) {
				return;
			}
			@Pc(28) int local28 = this.method1922(local11).anInt2254;
			if (local28 > 0) {
				arg0.method7047(local28, (long) arg1[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method1925() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray8 == null) {
			return "";
		}
		local16.append(this.aStringArray8[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray8.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray8[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLclient!ek;)Ljava/lang/String;")
	public String method1926(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray116 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray116.length; local23++) {
				local18.append(this.aStringArray8[local23]);
				local18.append(this.aClass213_1.method4999(arg0.method7014(Static330.method5079(this.anIntArray116[local23]).anInt2253), this.anIntArrayArray10[local23], this.method1922(local23)));
			}
		}
		local18.append(this.aStringArray8[this.aStringArray8.length - 1]);
		return local18.toString();
	}
}

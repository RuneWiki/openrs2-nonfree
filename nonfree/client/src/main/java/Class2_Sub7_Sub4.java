import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
	public boolean aBoolean160 = true;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!vt;I)V")
	private void method1712(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.aStringArray13 = Static71.method1265(arg1.method5744(), '<');
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method5732();
			this.anIntArray170 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray170[local31] = arg1.method5753();
			}
		} else if (arg0 == 3) {
			local25 = arg1.method5732();
			this.anIntArrayArray10 = new int[local25][];
			this.anIntArray172 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(81) int local81 = arg1.method5753();
				this.anIntArray172[local31] = local81;
				this.anIntArrayArray10[local31] = new int[Static115.anIntArray205[local81]];
				for (@Pc(96) int local96 = 0; local96 < Static115.anIntArray205[local81]; local96++) {
					this.anIntArrayArray10[local31][local96] = arg1.method5753();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean160 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[ILclient!vt;)V")
	public void method1713(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (this.anIntArray172 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray172.length; local15++) {
			if (local15 >= arg0.length) {
				return;
			}
			@Pc(24) int local24 = Static106.anIntArray196[this.method1717(local15)];
			if (local24 > 0) {
				arg1.method5764(local24, (long) arg0[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public void method1714() {
		if (this.anIntArray170 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray170.length; local6++) {
				this.anIntArray170[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!vt;)V")
	public void method1715(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method1712(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method1716() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray13 == null) {
			return "";
		}
		local15.append(this.aStringArray13[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray13.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray13[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public int method1717(@OriginalArg(1) int arg0) {
		return this.anIntArray172 == null || arg0 < 0 || arg0 > this.anIntArray172.length ? -1 : this.anIntArray172[arg0];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!vt;B)Ljava/lang/String;")
	public String method1718(@OriginalArg(0) Class2_Sub24 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray172 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray172.length; local22++) {
				local10.append(this.aStringArray13[local22]);
				local10.append(Static250.method4356(arg0.method5758(Static137.anIntArray101[this.anIntArray172[local22]]), this.anIntArrayArray10[local22], this.anIntArray172[local22]));
			}
		}
		local10.append(this.aStringArray13[this.aStringArray13.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)I")
	public int method1719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray172 == null || arg0 < 0 || arg0 > this.anIntArray172.length) {
			return -1;
		} else if (this.anIntArrayArray10[arg0] == null || arg1 < 0 || this.anIntArrayArray10[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray10[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	public int method1720() {
		return this.anIntArray172 == null ? 0 : this.anIntArray172.length;
	}
}

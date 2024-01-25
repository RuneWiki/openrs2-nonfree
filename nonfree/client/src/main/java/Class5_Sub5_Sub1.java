import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!be", name = "F", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Lclient!og;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ib;I)Ljava/lang/String;")
	public String method672(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray38 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray38.length; local15++) {
				local10.append(this.aStringArray5[local15]);
				local10.append(this.aClass259_1.method6239(this.method682(local15), arg0.method8501(Static204.method2929(this.anIntArray38[local15]).anInt1930), this.anIntArrayArray4[local15]));
			}
		}
		local10.append(this.aStringArray5[this.aStringArray5.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method674() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray5 == null) {
			return "";
		}
		local10.append(this.aStringArray5[0]);
		for (@Pc(25) int local25 = 1; local25 < this.aStringArray5.length; local25++) {
			local10.append("...");
			local10.append(this.aStringArray5[local25]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ib;BI)V")
	private void method675(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray5 = Static439.method6502(arg0.method8497(), '<');
			return;
		}
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (arg1 == 2) {
			local53 = arg0.method8529();
			this.anIntArray37 = new int[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.anIntArray37[local63] = arg0.method8519();
			}
		} else if (arg1 == 3) {
			local53 = arg0.method8529();
			this.anIntArrayArray4 = new int[local53][];
			this.anIntArray38 = new int[local53];
			for (local63 = 0; local63 < local53; local63++) {
				@Pc(69) int local69 = arg0.method8519();
				@Pc(73) Class96 local73 = Static204.method2929(local69);
				if (local73 != null) {
					this.anIntArray38[local63] = local69;
					this.anIntArrayArray4[local63] = new int[local73.anInt1935];
					for (@Pc(89) int local89 = 0; local89 < local73.anInt1935; local89++) {
						this.anIntArrayArray4[local63][local89] = arg0.method8519();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean60 = false;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)I")
	public int method676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray38 == null || arg1 < 0 || this.anIntArray38.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray4[arg1] == null || arg0 < 0 || this.anIntArrayArray4[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray4[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([ILclient!ib;B)V")
	public void method677(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (this.anIntArray38 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray38.length; local20++) {
			if (arg0.length <= local20) {
				return;
			}
			@Pc(28) int local28 = this.method682(local20).anInt1931;
			if (local28 > 0) {
				arg1.method8507((long) arg0[local20], local28);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public void method678() {
		if (this.anIntArray37 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray37.length; local6++) {
				this.anIntArray37[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	public int method680() {
		return this.anIntArray38 == null ? 0 : this.anIntArray38.length;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ib;Z)V")
	public void method681(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8529();
			if (local17 == 0) {
				return;
			}
			this.method675(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)Lclient!dv;")
	public Class96 method682(@OriginalArg(1) int arg0) {
		return this.anIntArray38 == null || arg0 < 0 || this.anIntArray38.length < arg0 ? null : Static204.method2929(this.anIntArray38[arg0]);
	}
}

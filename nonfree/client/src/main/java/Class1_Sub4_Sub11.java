import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray22;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
	public int method2082(@OriginalArg(0) int arg0) {
		return this.anIntArray223 == null || arg0 < 0 || arg0 > this.anIntArray223.length ? -1 : this.anIntArray223[arg0];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)I")
	public int method2083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray223 == null || arg0 < 0 || this.anIntArray223.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray25[arg0] == null || arg1 < 0 || this.anIntArrayArray25[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray25[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method2084() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray22 == null) {
			return "";
		}
		local10.append(this.aStringArray22[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray22.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray22[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!bg;[II)V")
	public void method2085(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray223 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray223.length; local18++) {
			if (local18 >= arg1.length) {
				return;
			}
			@Pc(27) int local27 = Static21.anIntArray78[this.method2082(local18)];
			if (local27 > 0) {
				arg0.method4565((long) arg1[local18], local27);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!bg;I)V")
	private void method2086(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray22 = Static309.method5164('<', arg0.method4534());
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 2) {
			local15 = arg0.method4532();
			this.anIntArray224 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray224[local21] = arg0.method4556();
			}
		} else if (arg1 == 3) {
			local15 = arg0.method4532();
			this.anIntArray223 = new int[local15];
			this.anIntArrayArray25 = new int[local15][];
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(65) int local65 = arg0.method4556();
				this.anIntArray223[local21] = local65;
				this.anIntArrayArray25[local21] = new int[Static264.anIntArray523[local65]];
				for (@Pc(80) int local80 = 0; local80 < Static264.anIntArray523[local65]; local80++) {
					this.anIntArrayArray25[local21][local80] = arg0.method4556();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean217 = false;
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
	public void method2087() {
		if (this.anIntArray224 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray224.length; local6++) {
				this.anIntArray224[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!bg;)V")
	public void method2088(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method2086(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!bg;Z)Ljava/lang/String;")
	public String method2089(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray223 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray223.length; local20++) {
				local15.append(this.aStringArray22[local20]);
				local15.append(Static174.method3465(arg0.method4550(Static15.anIntArray61[this.anIntArray223[local20]]), this.anIntArrayArray25[local20], this.anIntArray223[local20]));
			}
		}
		local15.append(this.aStringArray22[this.aStringArray22.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I")
	public int method2090() {
		return this.anIntArray223 == null ? 0 : this.anIntArray223.length;
	}
}

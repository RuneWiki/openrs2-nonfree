import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!rp;[I)V")
	public void method1630(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray195 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; this.anIntArray195.length > local11 && arg1.length > local11; local11++) {
			@Pc(20) int local20 = Static22.anIntArray36[this.method1632(local11)];
			if (local20 > 0) {
				arg0.method2751((long) arg1[local11], local20);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!rp;)Ljava/lang/String;")
	public String method1631(@OriginalArg(1) Class3_Sub5 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray195 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray195.length; local15++) {
				local10.append(this.aStringArray14[local15]);
				local10.append(Static371.method5533(this.anIntArray195[local15], this.anIntArrayArray20[local15], arg0.method2752(Static57.anIntArray106[this.anIntArray195[local15]])));
			}
		}
		local10.append(this.aStringArray14[this.aStringArray14.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
	public int method1632(@OriginalArg(0) int arg0) {
		return this.anIntArray195 == null || arg0 < 0 || this.anIntArray195.length < arg0 ? -1 : this.anIntArray195[arg0];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public int method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray195 == null || arg0 < 0 || arg0 > this.anIntArray195.length) {
			return -1;
		} else if (this.anIntArrayArray20[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray20[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray20[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method1635() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray14 == null) {
			return "";
		}
		local10.append(this.aStringArray14[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray14.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray14[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
	public void method1636() {
		if (this.anIntArray197 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray197.length; local6++) {
				this.anIntArray197[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILclient!rp;)V")
	public void method1637(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method1640(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I")
	public int method1638() {
		return this.anIntArray195 == null ? 0 : this.anIntArray195.length;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!rp;I)V")
	private void method1640(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray14 = Static63.method1103('<', arg0.method2788());
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method2739();
			this.anIntArray197 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray197[local28] = arg0.method2767();
			}
		} else if (arg1 == 3) {
			local22 = arg0.method2739();
			this.anIntArray195 = new int[local22];
			this.anIntArrayArray20 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(72) int local72 = arg0.method2767();
				this.anIntArray195[local28] = local72;
				this.anIntArrayArray20[local28] = new int[Static375.anIntArray683[local72]];
				for (@Pc(87) int local87 = 0; local87 < Static375.anIntArray683[local72]; local87++) {
					this.anIntArrayArray20[local28][local87] = arg0.method2767();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean147 = false;
			return;
		}
	}
}

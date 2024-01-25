import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class6_Sub5_Sub14 extends Class6_Sub5 {

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray32;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "Lclient!qk;")
	public Class266 aClass266_2;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "Z")
	public boolean aBoolean491 = true;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public void method5745() {
		if (this.anIntArray502 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray502.length; local17++) {
				this.anIntArray502[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IILclient!jr;)V")
	public void method5746(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (this.anIntArray503 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray503.length && arg0.length > local11; local11++) {
			@Pc(19) int local19 = this.method5747(local11).anInt5216;
			if (local19 > 0) {
				arg1.method6039(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Lclient!laa;")
	public Class179 method5747(@OriginalArg(0) int arg0) {
		return this.anIntArray503 == null || arg0 < 0 || arg0 > this.anIntArray503.length ? null : Static430.method6117(this.anIntArray503[arg0]);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!jr;I)Ljava/lang/String;")
	public String method5749(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray503 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray503.length; local15++) {
				local10.append(this.aStringArray32[local15]);
				local10.append(this.aClass266_2.method5989(this.method5747(local15), this.anIntArrayArray63[local15], arg0.method6050(Static430.method6117(this.anIntArray503[local15]).anInt5215)));
			}
		}
		local10.append(this.aStringArray32[this.aStringArray32.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!jr;)V")
	public void method5750(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method5752(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method5751() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray32 == null) {
			return "";
		}
		local10.append(this.aStringArray32[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray32.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray32[local30]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!jr;IZ)V")
	private void method5752(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray32 = Static395.method5728(arg0.method6040(), '<');
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local19 = arg0.method6019();
			this.anIntArray502 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray502[local29] = arg0.method6044();
			}
		} else if (arg1 == 3) {
			local19 = arg0.method6019();
			this.anIntArray503 = new int[local19];
			this.anIntArrayArray63 = new int[local19][];
			for (local29 = 0; local29 < local19; local29++) {
				@Pc(35) int local35 = arg0.method6044();
				@Pc(39) Class179 local39 = Static430.method6117(local35);
				if (local39 != null) {
					this.anIntArray503[local29] = local35;
					this.anIntArrayArray63[local29] = new int[local39.anInt5214];
					for (@Pc(55) int local55 = 0; local55 < local39.anInt5214; local55++) {
						this.anIntArrayArray63[local29][local55] = arg0.method6044();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean491 = false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)I")
	public int method5753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray503 == null || arg1 < 0 || this.anIntArray503.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray63[arg1] == null || arg0 < 0 || this.anIntArrayArray63[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray63[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I")
	public int method5754() {
		return this.anIntArray503 == null ? 0 : this.anIntArray503.length;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Lclient!ng;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Lclient!cg;")
	public Class37 method44(@OriginalArg(0) int arg0) {
		return this.anIntArray8 == null || arg0 < 0 || arg0 > this.anIntArray8.length ? null : Static59.method5177(this.anIntArray8[arg0]);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method45() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray2 == null) {
			return "";
		}
		local16.append(this.aStringArray2[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray2.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray2[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!hw;B)V")
	public void method46(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6138();
			if (local17 == 0) {
				return;
			}
			this.method53(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method48() {
		if (this.anIntArray7 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray7.length; local6++) {
				this.anIntArray7[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)I")
	public int method49() {
		return this.anIntArray8 == null ? 0 : this.anIntArray8.length;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!hw;)Ljava/lang/String;")
	public String method50(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray8 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray8.length; local20++) {
				local15.append(this.aStringArray2[local20]);
				local15.append(this.aClass179_1.method3926(this.anIntArrayArray5[local20], arg0.method6139(Static59.method5177(this.anIntArray8[local20]).anInt764), this.method44(local20)));
			}
		}
		local15.append(this.aStringArray2[this.aStringArray2.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	public int method51(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray8 == null || arg0 < 0 || arg0 > this.anIntArray8.length) {
			return -1;
		} else if (this.anIntArrayArray5[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray5[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray5[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[ILclient!hw;)V")
	public void method52(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (this.anIntArray8 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray8.length; local9++) {
			if (arg0.length <= local9) {
				return;
			}
			@Pc(19) int local19 = this.method44(local9).anInt768;
			if (local19 > 0) {
				arg1.method6127(local19, (long) arg0[local9]);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!hw;I)V")
	private void method53(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.aStringArray2 = Static305.method172(arg1.method6141(), '<');
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg0 == 2) {
			local22 = arg1.method6138();
			this.anIntArray7 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray7[local28] = arg1.method6148();
			}
		} else if (arg0 == 3) {
			local22 = arg1.method6138();
			this.anIntArrayArray5 = new int[local22][];
			this.anIntArray8 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(78) int local78 = arg1.method6148();
				@Pc(82) Class37 local82 = Static59.method5177(local78);
				if (local82 != null) {
					this.anIntArray8[local28] = local78;
					this.anIntArrayArray5[local28] = new int[local82.anInt762];
					for (@Pc(98) int local98 = 0; local98 < local82.anInt762; local98++) {
						this.anIntArrayArray5[local28][local98] = arg1.method6148();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean2 = false;
			return;
		}
	}
}

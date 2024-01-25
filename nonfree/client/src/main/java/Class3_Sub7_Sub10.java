import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class3_Sub7_Sub10 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!fn", name = "N", descriptor = "Lclient!im;")
	public Class149 aClass149_4;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "Z")
	public boolean aBoolean256 = true;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
	public int method2876() {
		return this.anIntArray152 == null ? 0 : this.anIntArray152.length;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)Lclient!wd;")
	public Class358 method2877(@OriginalArg(0) int arg0) {
		return this.anIntArray152 == null || arg0 < 0 || arg0 > this.anIntArray152.length ? null : Static258.method6205(this.anIntArray152[arg0]);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method2878() {
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

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!np;Z)V")
	public void method2879(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method2883(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!np;)Ljava/lang/String;")
	public String method2881(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray152 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray152.length; local15++) {
				local10.append(this.aStringArray14[local15]);
				local10.append(this.aClass149_4.method3565(arg0.method5216(Static258.method6205(this.anIntArray152[local15]).anInt9314), this.method2877(local15), this.anIntArrayArray63[local15]));
			}
		}
		local10.append(this.aStringArray14[this.aStringArray14.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([ILclient!np;I)V")
	public void method2882(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (this.anIntArray152 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray152.length; local11++) {
			if (arg0.length <= local11) {
				return;
			}
			@Pc(19) int local19 = this.method2877(local11).anInt9313;
			if (local19 > 0) {
				arg1.method5196((long) arg0[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!np;B)V")
	private void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aStringArray14 = Static572.method7699('<', arg1.method5181());
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg0 == 2) {
			local28 = arg1.method5175();
			this.anIntArray151 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray151[local38] = arg1.method5198();
			}
		} else if (arg0 == 3) {
			local28 = arg1.method5175();
			this.anIntArray152 = new int[local28];
			this.anIntArrayArray63 = new int[local28][];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg1.method5198();
				@Pc(48) Class358 local48 = Static258.method6205(local44);
				if (local48 != null) {
					this.anIntArray152[local38] = local44;
					this.anIntArrayArray63[local38] = new int[local48.anInt9319];
					for (@Pc(64) int local64 = 0; local64 < local48.anInt9319; local64++) {
						this.anIntArrayArray63[local38][local64] = arg1.method5198();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean256 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
	public void method2884() {
		if (this.anIntArray151 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray151.length; local6++) {
				this.anIntArray151[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)I")
	public int method2885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray152 == null || arg1 < 0 || arg1 > this.anIntArray152.length) {
			return -1;
		} else if (this.anIntArrayArray63[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray63[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray63[arg1][arg0];
		}
	}
}

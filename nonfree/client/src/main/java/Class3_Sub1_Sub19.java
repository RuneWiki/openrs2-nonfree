import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Lclient!hv;")
	public Class136 aClass136_2;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
	public int[] anIntArray551;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37;

	@OriginalMember(owner = "client!rk", name = "D", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "Z")
	public boolean aBoolean741 = true;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!tn;I)Ljava/lang/String;")
	public String method7183(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray552 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray552.length; local15++) {
				local10.append(this.aStringArray37[local15]);
				local10.append(this.aClass136_2.method4288(this.anIntArrayArray88[local15], arg0.method8442(Static259.method4850(this.anIntArray552[local15]).anInt3888), this.method7184(local15)));
			}
		}
		local10.append(this.aStringArray37[this.aStringArray37.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lclient!fq;")
	public Class104 method7184(@OriginalArg(1) int arg0) {
		return this.anIntArray552 == null || arg0 < 0 || arg0 > this.anIntArray552.length ? null : Static259.method4850(this.anIntArray552[arg0]);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZI)I")
	public int method7185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray552 == null || arg1 < 0 || this.anIntArray552.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray88[arg1] == null || arg0 < 0 || this.anIntArrayArray88[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray88[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!tn;)V")
	public void method7186(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8401();
			if (local13 == 0) {
				return;
			}
			this.method7188(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([IILclient!tn;)V")
	public void method7187(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (this.anIntArray552 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray552.length; local11++) {
			if (arg0.length <= local11) {
				return;
			}
			@Pc(19) int local19 = this.method7184(local11).anInt3887;
			if (local19 > 0) {
				arg1.method8434(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!tn;)V")
	private void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.aStringArray37 = Static107.method2685('<', arg1.method8413());
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg0 == 2) {
			local28 = arg1.method8401();
			this.anIntArray551 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray551[local38] = arg1.method8414();
			}
		} else if (arg0 == 3) {
			local28 = arg1.method8401();
			this.anIntArray552 = new int[local28];
			this.anIntArrayArray88 = new int[local28][];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg1.method8414();
				@Pc(48) Class104 local48 = Static259.method4850(local44);
				if (local48 != null) {
					this.anIntArray552[local38] = local44;
					this.anIntArrayArray88[local38] = new int[local48.anInt3886];
					for (@Pc(64) int local64 = 0; local64 < local48.anInt3886; local64++) {
						this.anIntArrayArray88[local38][local64] = arg1.method8414();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean741 = false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public void method7189() {
		if (this.anIntArray551 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray551.length; local16++) {
				this.anIntArray551[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I")
	public int method7190() {
		return this.anIntArray552 == null ? 0 : this.anIntArray552.length;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method7191() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray37 == null) {
			return "";
		}
		local10.append(this.aStringArray37[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray37.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray37[local24]);
		}
		return local10.toString();
	}
}

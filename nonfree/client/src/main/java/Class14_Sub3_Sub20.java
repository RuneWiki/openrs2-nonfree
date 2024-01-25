import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class14_Sub3_Sub20 extends Class14_Sub3 {

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "[I")
	private int[] anIntArray774;

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "[I")
	public int[] anIntArray777;

	@OriginalMember(owner = "client!vda", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!vda", name = "U", descriptor = "Lclient!or;")
	public Class266 aClass266_2;

	@OriginalMember(owner = "client!vda", name = "T", descriptor = "Z")
	public boolean aBoolean730 = true;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)Lclient!uh;")
	public Class352 method8784(@OriginalArg(0) int arg0) {
		return this.anIntArray774 == null || arg0 < 0 || arg0 > this.anIntArray774.length ? null : Static587.method8906(this.anIntArray774[arg0]);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public void method8785() {
		if (this.anIntArray777 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray777.length; local13++) {
				this.anIntArray777[local13] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)I")
	public int method8786() {
		return this.anIntArray774 == null ? 0 : this.anIntArray774.length;
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method8787() {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.aStringArray42 == null) {
			return "";
		}
		local17.append(this.aStringArray42[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray42.length; local31++) {
			local17.append("...");
			local17.append(this.aStringArray42[local31]);
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!so;B)Ljava/lang/String;")
	public String method8788(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray774 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray774.length; local15++) {
				local10.append(this.aStringArray42[local15]);
				local10.append(this.aClass266_2.method6435(this.method8784(local15), arg0.method5874(Static587.method8906(this.anIntArray774[local15]).anInt10188), this.anIntArrayArray59[local15]));
			}
		}
		local10.append(this.aStringArray42[this.aStringArray42.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!so;BI)V")
	private void method8789(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray42 = Static111.method1920('<', arg0.method5898());
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local27 = arg0.method5866();
			this.anIntArray777 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray777[local33] = arg0.method5900();
			}
		} else if (arg1 == 3) {
			local27 = arg0.method5866();
			this.anIntArray774 = new int[local27];
			this.anIntArrayArray59 = new int[local27][];
			for (local33 = 0; local33 < local27; local33++) {
				@Pc(75) int local75 = arg0.method5900();
				@Pc(79) Class352 local79 = Static587.method8906(local75);
				if (local79 != null) {
					this.anIntArray774[local33] = local75;
					this.anIntArrayArray59[local33] = new int[local79.anInt10186];
					for (@Pc(95) int local95 = 0; local95 < local79.anInt10186; local95++) {
						this.anIntArrayArray59[local33][local95] = arg0.method5900();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean730 = false;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([ILclient!so;Z)V")
	public void method8791(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class14_Sub29 arg1) {
		if (this.anIntArray774 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray774.length; local15++) {
			if (arg0.length <= local15) {
				return;
			}
			@Pc(23) int local23 = this.method8784(local15).anInt10185;
			if (local23 > 0) {
				arg1.method5852((long) arg0[local15], local23);
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)I")
	public int method8793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray774 == null || arg0 < 0 || arg0 > this.anIntArray774.length) {
			return -1;
		} else if (this.anIntArrayArray59[arg0] == null || arg1 < 0 || this.anIntArrayArray59[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray59[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lclient!so;B)V")
	public void method8794(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method8789(arg0, local9);
		}
	}
}

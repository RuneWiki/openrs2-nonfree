import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
	public int[] anIntArray637;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "Lclient!sh;")
	public Class304 aClass304_1;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[I")
	private int[] anIntArray638;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray165;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "Z")
	public boolean aBoolean679 = true;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!es;)V")
	public void method7358(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4325();
			if (local13 == 0) {
				return;
			}
			this.method7365(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lclient!baa;")
	public Class28 method7359(@OriginalArg(1) int arg0) {
		return this.anIntArray638 == null || arg0 < 0 || this.anIntArray638.length < arg0 ? null : Static245.method3789(this.anIntArray638[arg0]);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([IILclient!es;)V")
	public void method7360(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (this.anIntArray638 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray638.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(19) int local19 = this.method7359(local11).anInt656;
			if (local19 > 0) {
				arg1.method4302(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!es;)Ljava/lang/String;")
	public String method7361(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray638 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray638.length; local15++) {
				local10.append(this.aStringArray165[local15]);
				local10.append(this.aClass304_1.method6808(this.method7359(local15), arg0.method4335(Static245.method3789(this.anIntArray638[local15]).anInt653), this.anIntArrayArray60[local15]));
			}
		}
		local10.append(this.aStringArray165[this.aStringArray165.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I")
	public int method7362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray638 == null || arg1 < 0 || arg1 > this.anIntArray638.length) {
			return -1;
		} else if (this.anIntArrayArray60[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray60[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray60[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method7363() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray165 == null) {
			return "";
		}
		local10.append(this.aStringArray165[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray165.length; local32++) {
			local10.append("...");
			local10.append(this.aStringArray165[local32]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!es;B)V")
	private void method7365(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.aStringArray165 = Static568.method7710(arg1.method4324(), '<');
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg0 == 2) {
			local27 = arg1.method4325();
			this.anIntArray637 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray637[local33] = arg1.method4294();
			}
		} else if (arg0 == 3) {
			local27 = arg1.method4325();
			this.anIntArray638 = new int[local27];
			this.anIntArrayArray60 = new int[local27][];
			for (local33 = 0; local33 < local27; local33++) {
				@Pc(85) int local85 = arg1.method4294();
				@Pc(89) Class28 local89 = Static245.method3789(local85);
				if (local89 != null) {
					this.anIntArray638[local33] = local85;
					this.anIntArrayArray60[local33] = new int[local89.anInt654];
					for (@Pc(105) int local105 = 0; local105 < local89.anInt654; local105++) {
						this.anIntArrayArray60[local33][local105] = arg1.method4294();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V")
	public void method7366() {
		if (this.anIntArray637 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray637.length; local6++) {
				this.anIntArray637[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)I")
	public int method7368() {
		return this.anIntArray638 == null ? 0 : this.anIntArray638.length;
	}
}

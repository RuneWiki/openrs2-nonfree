import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class6_Sub5_Sub14 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "Lclient!rh;")
	public Class291 aClass291_2;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "Z")
	public boolean aBoolean335 = true;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
	public int method3482() {
		return this.anIntArray186 == null ? 0 : this.anIntArray186.length;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
	public void method3483() {
		if (this.anIntArray187 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray187.length; local10++) {
				this.anIntArray187[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!ji;)Ljava/lang/String;")
	public String method3484(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray186 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray186.length; local15++) {
				local10.append(this.aStringArray11[local15]);
				local10.append(this.aClass291_2.method7163(this.method3488(local15), this.anIntArrayArray18[local15], arg0.method8265(Static108.method2481(this.anIntArray186[local15]).anInt10147)));
			}
		}
		local10.append(this.aStringArray11[this.aStringArray11.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!ji;)V")
	private void method3486(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.aStringArray11 = Static206.method3730(arg1.method8221(), '<');
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local30 = arg1.method8246();
			this.anIntArray187 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray187[local40] = arg1.method8220();
			}
		} else if (arg0 == 3) {
			local30 = arg1.method8246();
			this.anIntArrayArray18 = new int[local30][];
			this.anIntArray186 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				@Pc(46) int local46 = arg1.method8220();
				@Pc(50) Class352 local50 = Static108.method2481(local46);
				if (local50 != null) {
					this.anIntArray186[local40] = local46;
					this.anIntArrayArray18[local40] = new int[local50.anInt10151];
					for (@Pc(66) int local66 = 0; local66 < local50.anInt10151; local66++) {
						this.anIntArrayArray18[local40][local66] = arg1.method8220();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean335 = false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ji;[II)V")
	public void method3487(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray186 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray186.length; local18++) {
			if (arg1.length <= local18) {
				return;
			}
			@Pc(28) int local28 = this.method3488(local18).anInt10150;
			if (local28 > 0) {
				arg0.method8230((long) arg1[local18], local28);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lclient!vea;")
	public Class352 method3488(@OriginalArg(0) int arg0) {
		return this.anIntArray186 == null || arg0 < 0 || arg0 > this.anIntArray186.length ? null : Static108.method2481(this.anIntArray186[arg0]);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method3490() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray11 == null) {
			return "";
		}
		local10.append(this.aStringArray11[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray11.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray11[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
	public int method3491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray186 == null || arg1 < 0 || arg1 > this.anIntArray186.length) {
			return -1;
		} else if (this.anIntArrayArray18[arg1] == null || arg0 < 0 || this.anIntArrayArray18[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray18[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BLclient!ji;)V")
	public void method3492(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8246();
			if (local15 == 0) {
				return;
			}
			this.method3486(local15, arg0);
		}
	}
}

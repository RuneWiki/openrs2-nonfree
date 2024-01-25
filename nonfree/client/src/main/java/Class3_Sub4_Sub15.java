import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!vu;")
	public Class262 aClass262_2;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray46;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
	public boolean aBoolean576 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method5176(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method5182(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)I")
	public int method5177() {
		return this.anIntArray448 == null ? 0 : this.anIntArray448.length;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
	public int method5179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray448 == null || arg1 < 0 || arg1 > this.anIntArray448.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray46[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!cu;)Ljava/lang/String;")
	public String method5180(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(13) StringBuffer local13 = new StringBuffer(80);
		if (this.anIntArray448 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray448.length; local18++) {
				local13.append(this.aStringArray46[local18]);
				local13.append(this.aClass262_2.method5747(arg0.method2627(Static452.method5957(this.anIntArray448[local18]).anInt2101), this.anIntArrayArray46[local18], this.method5185(local18)));
			}
		}
		local13.append(this.aStringArray46[this.aStringArray46.length - 1]);
		return local13.toString();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method5181() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray46 == null) {
			return "";
		}
		local8.append(this.aStringArray46[0]);
		for (@Pc(27) int local27 = 1; local27 < this.aStringArray46.length; local27++) {
			local8.append("...");
			local8.append(this.aStringArray46[local27]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method5182(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray46 = Static379.method4945(arg0.method2620(), '<');
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local30 = arg0.method2582();
			this.anIntArray449 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray449[local40] = arg0.method2588();
			}
		} else if (arg1 == 3) {
			local30 = arg0.method2582();
			this.anIntArray448 = new int[local30];
			this.anIntArrayArray46 = new int[local30][];
			for (local40 = 0; local40 < local30; local40++) {
				@Pc(45) int local45 = arg0.method2588();
				@Pc(49) Class61 local49 = Static452.method5957(local45);
				if (local49 != null) {
					this.anIntArray448[local40] = local45;
					this.anIntArrayArray46[local40] = new int[local49.anInt2102];
					for (@Pc(65) int local65 = 0; local65 < local49.anInt2102; local65++) {
						this.anIntArrayArray46[local40][local65] = arg0.method2588();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean576 = false;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method5184() {
		if (this.anIntArray449 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray449.length; local4++) {
				this.anIntArray449[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!ef;")
	public Class61 method5185(@OriginalArg(1) int arg0) {
		return this.anIntArray448 == null || arg0 < 0 || arg0 > this.anIntArray448.length ? null : Static452.method5957(this.anIntArray448[arg0]);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!cu;[I)V")
	public void method5186(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray448 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; this.anIntArray448.length > local9 && local9 < arg1.length; local9++) {
			@Pc(16) int local16 = this.method5185(local9).anInt2099;
			if (local16 > 0) {
				arg0.method2640(local16, (long) arg1[local9]);
			}
		}
	}
}

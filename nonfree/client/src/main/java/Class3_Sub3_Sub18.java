import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub3_Sub18 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!em;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray46;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Z")
	public boolean aBoolean503 = true;

	static {
		new Class174("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method6105() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray46 == null) {
			return "";
		}
		local10.append(this.aStringArray46[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray46.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray46[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!nj;)V")
	public void method6107(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4096();
			if (local17 == 0) {
				return;
			}
			this.method6112(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[ILclient!nj;)V")
	public void method6108(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (this.anIntArray502 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray502.length; local15++) {
			if (arg0.length <= local15) {
				return;
			}
			@Pc(23) int local23 = this.method6110(local15).anInt1957;
			if (local23 > 0) {
				arg1.method4125(local23, (long) arg0[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public int method6109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray502 == null || arg1 < 0 || arg1 > this.anIntArray502.length) {
			return -1;
		} else if (this.anIntArrayArray64[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray64[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray64[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!fg;")
	public Class70 method6110(@OriginalArg(0) int arg0) {
		return this.anIntArray502 == null || arg0 < 0 || this.anIntArray502.length < arg0 ? null : Static66.method1244(this.anIntArray502[arg0]);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLclient!nj;)Ljava/lang/String;")
	public String method6111(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray502 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray502.length; local21++) {
				local16.append(this.aStringArray46[local21]);
				local16.append(this.aClass61_2.method1601(this.method6110(local21), arg0.method4079(Static66.method1244(this.anIntArray502[local21]).anInt1956), this.anIntArrayArray64[local21]));
			}
		}
		local16.append(this.aStringArray46[this.aStringArray46.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method6112(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.aStringArray46 = Static403.method5514(arg1.method4073(), '<');
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		if (arg0 == 2) {
			local24 = arg1.method4096();
			this.anIntArray501 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray501[local34] = arg1.method4083();
			}
		} else if (arg0 == 3) {
			local24 = arg1.method4096();
			this.anIntArray502 = new int[local24];
			this.anIntArrayArray64 = new int[local24][];
			for (local34 = 0; local34 < local24; local34++) {
				@Pc(40) int local40 = arg1.method4083();
				@Pc(44) Class70 local44 = Static66.method1244(local40);
				if (local44 != null) {
					this.anIntArray502[local34] = local40;
					this.anIntArrayArray64[local34] = new int[local44.anInt1950];
					for (@Pc(60) int local60 = 0; local60 < local44.anInt1950; local60++) {
						this.anIntArrayArray64[local34][local60] = arg1.method4083();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean503 = false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
	public int method6113() {
		return this.anIntArray502 == null ? 0 : this.anIntArray502.length;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public void method6114() {
		if (this.anIntArray501 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray501.length; local10++) {
				this.anIntArray501[local10] |= 0x8000;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class2_Sub6_Sub8 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "Lclient!ik;")
	public Class180 aClass180_1;

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "Z")
	public boolean aBoolean409 = true;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(B)I")
	public int method4309() {
		return this.anIntArray341 == null ? 0 : this.anIntArray341.length;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!et;I)V")
	private void method4310(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray19 = Static100.method1530(arg0.method8553(), '<');
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.method8581(-17416);
			this.anIntArray342 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray342[local38] = arg0.method8575();
			}
		} else if (arg1 == 3) {
			local28 = arg0.method8581(-17416);
			this.anIntArrayArray37 = new int[local28][];
			this.anIntArray341 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg0.method8575();
				@Pc(48) Class197 local48 = Static264.method3745(local44);
				if (local48 != null) {
					this.anIntArray341[local38] = local44;
					this.anIntArrayArray37[local38] = new int[local48.anInt4599];
					for (@Pc(64) int local64 = 0; local64 < local48.anInt4599; local64++) {
						this.anIntArrayArray37[local38][local64] = arg0.method8575();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean409 = false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!et;)V")
	public void method4312(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8581(-17416);
			if (local7 == 0) {
				return;
			}
			this.method4310(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method4313() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray19 == null) {
			return "";
		}
		local10.append(this.aStringArray19[0]);
		for (@Pc(25) int local25 = 1; local25 < this.aStringArray19.length; local25++) {
			local10.append("...");
			local10.append(this.aStringArray19[local25]);
		}
		return -73 == -73 ? local10.toString() : null;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V")
	public void method4315() {
		if (this.anIntArray342 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray342.length; local18++) {
				this.anIntArray342[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Lclient!ji;")
	public Class197 method4317(@OriginalArg(1) int arg0) {
		return this.anIntArray341 == null || arg0 < 0 || arg0 > this.anIntArray341.length ? null : Static264.method3745(this.anIntArray341[arg0]);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I")
	public int method4319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray341 == null || arg0 < 0 || arg0 > this.anIntArray341.length) {
			return -1;
		} else if (this.anIntArrayArray37[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray37[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray37[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!et;I)Ljava/lang/String;")
	public String method4320(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray341 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray341.length; local15++) {
				local10.append(this.aStringArray19[local15]);
				local10.append(this.aClass180_1.method3842(arg0.method8596(Static264.method3745(this.anIntArray341[local15]).anInt4598), this.anIntArrayArray37[local15], this.method4317(local15)));
			}
		}
		local10.append(this.aStringArray19[this.aStringArray19.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([IZLclient!et;)V")
	public void method4321(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (this.anIntArray341 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; this.anIntArray341.length > local12 && local12 < arg0.length; local12++) {
			@Pc(20) int local20 = this.method4317(local12).anInt4597;
			if (local20 > 0) {
				arg1.method8542((long) arg0[local12], local20);
			}
		}
		if (false) {
			this.aClass180_1 = null;
		}
	}
}

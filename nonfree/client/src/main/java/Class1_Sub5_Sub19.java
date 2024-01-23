import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class1_Sub5_Sub19 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!qn", name = "P", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
	public boolean aBoolean391 = true;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I")
	public int method3701(@OriginalArg(1) int arg0) {
		return this.anIntArray484 == null || arg0 < 0 || this.anIntArray484.length < arg0 ? -1 : this.anIntArray484[arg0];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method3704(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1853();
			if (local17 == 0) {
				return;
			}
			this.method3707(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLclient!fh;[I)V")
	public void method3705(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray484 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; this.anIntArray484.length > local17 && arg1.length > local17; local17++) {
			@Pc(37) int local37 = Static115.anIntArray168[this.method3701(local17)];
			if (local37 > 0) {
				arg0.method1847((long) arg1[local17], local37);
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method3707(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aStringArray26 = Static107.method2019('<', arg1.method1827());
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (arg0 == 2) {
			local37 = arg1.method1853();
			this.anIntArray485 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray485[local47] = arg1.method1879();
			}
		} else if (arg0 == 3) {
			local37 = arg1.method1853();
			this.anIntArrayArray34 = new int[local37][];
			this.anIntArray484 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				@Pc(58) int local58 = arg1.method1879();
				this.anIntArray484[local47] = local58;
				this.anIntArrayArray34[local47] = new int[Static81.anIntArray139[local58]];
				for (@Pc(73) int local73 = 0; local73 < Static81.anIntArray139[local58]; local73++) {
					this.anIntArrayArray34[local47][local73] = arg1.method1879();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean391 = false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method3708() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray26 == null) {
			return "";
		}
		local10.append(this.aStringArray26[0]);
		for (@Pc(33) int local33 = 1; local33 < this.aStringArray26.length; local33++) {
			local10.append("...");
			local10.append(this.aStringArray26[local33]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;I)Ljava/lang/String;")
	public String method3710(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray484 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray484.length; local23++) {
				local18.append(this.aStringArray26[local23]);
				local18.append(Static172.method2960(arg0.method1826(Static76.anIntArray542[this.anIntArray484[local23]]), this.anIntArrayArray34[local23], this.anIntArray484[local23]));
			}
		}
		local18.append(this.aStringArray26[this.aStringArray26.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	public int method3711() {
		return this.anIntArray484 == null ? 0 : this.anIntArray484.length;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(III)I")
	public int method3712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray484 == null || arg0 < 0 || this.anIntArray484.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray34[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray34[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray34[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)V")
	public void method3714() {
		if (this.anIntArray485 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray485.length; local7++) {
				this.anIntArray485[local7] |= 0x8000;
			}
		}
	}
}

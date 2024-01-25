import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub3_Sub18 extends Class3_Sub3 {

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray138;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Lclient!we;")
	public Class259 aClass259_2;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "Z")
	public boolean aBoolean414 = true;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
	public int method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray431 == null || arg1 < 0 || this.anIntArray431.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray45[arg1] == null || arg0 < 0 || this.anIntArrayArray45[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray45[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!bt;[I)V")
	public void method4650(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray431 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; this.anIntArray431.length > local9 && arg1.length > local9; local9++) {
			@Pc(16) int local16 = this.method4654(local9).anInt3752;
			if (local16 > 0) {
				arg0.method6022(local16, (long) arg1[local9]);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
	public void method4651() {
		if (this.anIntArray430 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray430.length; local4++) {
				this.anIntArray430[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!bt;B)V")
	private void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aStringArray138 = Static365.method5139('<', arg1.method6027());
			return;
		}
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (arg0 == 2) {
			local24 = arg1.method6053();
			this.anIntArray430 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray430[local30] = arg1.method6004();
			}
		} else if (arg0 == 3) {
			local24 = arg1.method6053();
			this.anIntArrayArray45 = new int[local24][];
			this.anIntArray431 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				@Pc(78) int local78 = arg1.method6004();
				@Pc(82) Class119 local82 = Static188.method3130(local78);
				if (local82 != null) {
					this.anIntArray431[local30] = local78;
					this.anIntArrayArray45[local30] = new int[local82.anInt3751];
					for (@Pc(98) int local98 = 0; local98 < local82.anInt3751; local98++) {
						this.anIntArrayArray45[local30][local98] = arg1.method6004();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean414 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lclient!jd;")
	public Class119 method4654(@OriginalArg(1) int arg0) {
		return this.anIntArray431 == null || arg0 < 0 || this.anIntArray431.length < arg0 ? null : Static188.method3130(this.anIntArray431[arg0]);
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method4655() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray138 == null) {
			return "";
		}
		local8.append(this.aStringArray138[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray138.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray138[local22]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
	public int method4656() {
		return this.anIntArray431 == null ? 0 : this.anIntArray431.length;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!bt;)Ljava/lang/String;")
	public String method4657(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.anIntArray431 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray431.length; local20++) {
				local8.append(this.aStringArray138[local20]);
				local8.append(this.aClass259_2.method5867(this.anIntArrayArray45[local20], arg0.method6052(Static188.method3130(this.anIntArray431[local20]).anInt3755), this.method4654(local20)));
			}
		}
		local8.append(this.aStringArray138[this.aStringArray138.length - 1]);
		return local8.toString();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method4658(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6053();
			if (local5 == 0) {
				return;
			}
			this.method4652(local5, arg0);
		}
	}
}

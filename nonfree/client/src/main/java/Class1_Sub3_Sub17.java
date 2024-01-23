import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
	public int[] anIntArray400;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "Z")
	public boolean aBoolean281 = true;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)I")
	public int method3291() {
		return this.anIntArray399 == null ? 0 : this.anIntArray399.length;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IBLclient!qm;)V")
	public void method3292(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (this.anIntArray399 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray399.length && arg0.length > local20; local20++) {
			@Pc(40) int local40 = Static68.anIntArray169[this.method3300(local20)];
			if (local40 > 0) {
				arg1.method2224((long) arg0[local20], local40);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)I")
	public int method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray399 == null || arg0 < 0 || arg0 > this.anIntArray399.length) {
			return -1;
		} else if (this.anIntArrayArray54[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray54[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray54[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)I")
	public int method3300(@OriginalArg(1) int arg0) {
		return this.anIntArray399 == null || arg0 < 0 || this.anIntArray399.length < arg0 ? -1 : this.anIntArray399[arg0];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qm;B)Ljava/lang/String;")
	public String method3301(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray399 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray399.length; local22++) {
				local16.append(this.aStringArray36[local22]);
				local16.append(Static170.method2762(arg0.method2222(Static208.anIntArray401[this.anIntArray399[local22]]), this.anIntArrayArray54[local22], this.anIntArray399[local22]));
			}
		}
		local16.append(this.aStringArray36[this.aStringArray36.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method3302(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2199();
			if (local9 == 0) {
				return;
			}
			this.method3305(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public void method3303() {
		if (this.anIntArray400 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray400.length; local15++) {
				this.anIntArray400[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method3304() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray36 == null) {
			return "";
		}
		local16.append(this.aStringArray36[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray36.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray36[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!qm;I)V")
	private void method3305(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray36 = Static3.method35(arg0.method2237(), '<');
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (arg1 == 2) {
			local20 = arg0.method2199();
			this.anIntArray400 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray400[local30] = arg0.method2244();
			}
		} else if (arg1 == 3) {
			local20 = arg0.method2199();
			this.anIntArrayArray54 = new int[local20][];
			this.anIntArray399 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				@Pc(37) int local37 = arg0.method2244();
				this.anIntArray399[local30] = local37;
				this.anIntArrayArray54[local30] = new int[Static228.anIntArray446[local37]];
				for (@Pc(52) int local52 = 0; local52 < Static228.anIntArray446[local37]; local52++) {
					this.anIntArrayArray54[local30][local52] = arg0.method2244();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean281 = false;
		}
	}
}

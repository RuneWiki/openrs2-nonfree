import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class2_Sub5_Sub17 extends Class2_Sub5 {

	@OriginalMember(owner = "client!om", name = "x", descriptor = "Lclient!fk;")
	public Class111 aClass111_2;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
	private int[] anIntArray509;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Z")
	public boolean aBoolean568 = true;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([ILclient!ud;B)V")
	public void method6303(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		if (this.anIntArray509 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray509.length; local9++) {
			if (arg0.length <= local9) {
				return;
			}
			@Pc(21) int local21 = this.method6310(local9).anInt7929;
			if (local21 > 0) {
				arg1.method6899((long) arg0[local9], local21);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Lclient!ud;I)V")
	public void method6304(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6904();
			if (local13 == 0) {
				return;
			}
			this.method6313(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method6305() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray28 == null) {
			return "";
		}
		local8.append(this.aStringArray28[0]);
		for (@Pc(27) int local27 = 1; local27 < this.aStringArray28.length; local27++) {
			local8.append("...");
			local8.append(this.aStringArray28[local27]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public void method6306() {
		if (this.anIntArray508 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray508.length; local14++) {
				this.anIntArray508[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I")
	public int method6308() {
		return this.anIntArray509 == null ? 0 : this.anIntArray509.length;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lclient!qca;")
	public Class271 method6310(@OriginalArg(1) int arg0) {
		return this.anIntArray509 == null || arg0 < 0 || arg0 > this.anIntArray509.length ? null : Static572.method7868(this.anIntArray509[arg0]);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)I")
	public int method6311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray509 == null || arg1 < 0 || this.anIntArray509.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray66[arg1] == null || arg0 < 0 || this.anIntArrayArray66[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray66[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!ud;)Ljava/lang/String;")
	public String method6312(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray509 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray509.length; local15++) {
				local10.append(this.aStringArray28[local15]);
				local10.append(this.aClass111_2.method2927(arg0.method6907(Static572.method7868(this.anIntArray509[local15]).anInt7926), this.anIntArrayArray66[local15], this.method6310(local15)));
			}
		}
		local10.append(this.aStringArray28[this.aStringArray28.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!ud;)V")
	private void method6313(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.aStringArray28 = Static218.method3754('<', arg1.method6903());
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		if (arg0 == 2) {
			local25 = arg1.method6904();
			this.anIntArray508 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray508[local35] = arg1.method6884();
			}
		} else if (arg0 == 3) {
			local25 = arg1.method6904();
			this.anIntArray509 = new int[local25];
			this.anIntArrayArray66 = new int[local25][];
			for (local35 = 0; local35 < local25; local35++) {
				@Pc(40) int local40 = arg1.method6884();
				@Pc(44) Class271 local44 = Static572.method7868(local40);
				if (local44 != null) {
					this.anIntArray509[local35] = local40;
					this.anIntArrayArray66[local35] = new int[local44.anInt7927];
					for (@Pc(60) int local60 = 0; local60 < local44.anInt7927; local60++) {
						this.anIntArrayArray66[local35][local60] = arg1.method6884();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean568 = false;
		}
	}
}

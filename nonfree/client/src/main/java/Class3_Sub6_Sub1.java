import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!bda", name = "y", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!bda", name = "I", descriptor = "Lclient!ok;")
	public Class263 aClass263_1;

	@OriginalMember(owner = "client!bda", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10;

	@OriginalMember(owner = "client!bda", name = "L", descriptor = "Z")
	public boolean aBoolean103 = true;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Lclient!wg;")
	public Class387 method1157(@OriginalArg(0) int arg0) {
		return this.anIntArray43 == null || arg0 < 0 || arg0 > this.anIntArray43.length ? null : Static430.method6357(this.anIntArray43[arg0]);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IBI)I")
	public int method1158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray43 == null || arg0 < 0 || arg0 > this.anIntArray43.length) {
			return -1;
		} else if (this.anIntArrayArray11[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray11[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray11[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
	public int method1161() {
		return this.anIntArray43 == null ? 0 : this.anIntArray43.length;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!fca;B[I)V")
	public void method1163(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray43 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray43.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(27) int local27 = this.method1157(local19).anInt10231;
			if (local27 > 0) {
				arg0.method4834(local27, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!fca;)Ljava/lang/String;")
	public String method1164(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray43 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray43.length; local21++) {
				local10.append(this.aStringArray10[local21]);
				local10.append(this.aClass263_1.method6367(arg0.method4846(Static430.method6357(this.anIntArray43[local21]).anInt10232), this.method1157(local21), this.anIntArrayArray11[local21]));
			}
		}
		local10.append(this.aStringArray10[this.aStringArray10.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method1165() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray10 == null) {
			return "";
		}
		local10.append(this.aStringArray10[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray10.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray10[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILclient!fca;)V")
	private void method1166(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.aStringArray10 = Static325.method5062(arg1.method4847(), '<');
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (arg0 == 2) {
			local31 = arg1.method4888();
			this.anIntArray44 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray44[local41] = arg1.method4858();
			}
		} else if (arg0 == 3) {
			local31 = arg1.method4888();
			this.anIntArrayArray11 = new int[local31][];
			this.anIntArray43 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				@Pc(47) int local47 = arg1.method4858();
				@Pc(51) Class387 local51 = Static430.method6357(local47);
				if (local51 != null) {
					this.anIntArray43[local41] = local47;
					this.anIntArrayArray11[local41] = new int[local51.anInt10227];
					for (@Pc(67) int local67 = 0; local67 < local51.anInt10227; local67++) {
						this.anIntArrayArray11[local41][local67] = arg1.method4858();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean103 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(ILclient!fca;)V")
	public void method1167(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method1166(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)V")
	public void method1168() {
		if (this.anIntArray44 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray44.length; local6++) {
				this.anIntArray44[local6] |= 0x8000;
			}
		}
	}
}

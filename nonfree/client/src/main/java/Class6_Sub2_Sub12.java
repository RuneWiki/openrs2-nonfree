import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray30;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "Lclient!lb;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "Z")
	public boolean aBoolean322 = true;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method4354() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray30 == null) {
			return "";
		}
		local10.append(this.aStringArray30[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray30.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray30[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method4355() {
		if (this.anIntArray345 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray345.length; local6++) {
				this.anIntArray345[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ae;)Ljava/lang/String;")
	public String method4356(@OriginalArg(1) Class6_Sub1 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray346 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray346.length; local23++) {
				local18.append(this.aStringArray30[local23]);
				local18.append(this.aClass149_1.method3360(this.anIntArrayArray28[local23], arg0.method6483(Static87.method1590(this.anIntArray346[local23]).anInt353), this.method4359(local23)));
			}
		}
		local18.append(this.aStringArray30[this.aStringArray30.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)I")
	public int method4358() {
		return this.anIntArray346 == null ? 0 : this.anIntArray346.length;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Lclient!ak;")
	public Class10 method4359(@OriginalArg(0) int arg0) {
		return this.anIntArray346 == null || arg0 < 0 || arg0 > this.anIntArray346.length ? null : Static87.method1590(this.anIntArray346[arg0]);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method4360(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6433();
			if (local9 == 0) {
				return;
			}
			this.method4361(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ae;II)V")
	private void method4361(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray30 = Static142.method2449(arg0.method6473(), '<');
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method6433();
			this.anIntArray345 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray345[local36] = arg0.method6485();
			}
		} else if (arg1 == 3) {
			local26 = arg0.method6433();
			this.anIntArray346 = new int[local26];
			this.anIntArrayArray28 = new int[local26][];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(42) int local42 = arg0.method6485();
				@Pc(46) Class10 local46 = Static87.method1590(local42);
				if (local46 != null) {
					this.anIntArray346[local36] = local42;
					this.anIntArrayArray28[local36] = new int[local46.anInt355];
					for (@Pc(62) int local62 = 0; local62 < local46.anInt355; local62++) {
						this.anIntArrayArray28[local36][local62] = arg0.method6485();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean322 = false;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ae;I[I)V")
	public void method4363(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray346 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray346.length; local19++) {
			if (local19 >= arg1.length) {
				return;
			}
			@Pc(27) int local27 = this.method4359(local19).anInt356;
			if (local27 > 0) {
				arg0.method6465((long) arg1[local19], local27);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZ)I")
	public int method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray346 == null || arg1 < 0 || arg1 > this.anIntArray346.length) {
			return -1;
		} else if (this.anIntArrayArray28[arg1] == null || arg0 < 0 || this.anIntArrayArray28[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray28[arg1][arg0];
		}
	}
}

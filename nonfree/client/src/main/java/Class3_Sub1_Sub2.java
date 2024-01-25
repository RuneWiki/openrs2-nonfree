import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "[I")
	public static final int[] anIntArray84 = new int[16384];

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "[I")
	public static final int[] anIntArray85 = new int[16384];

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!cw", name = "B", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!cw", name = "F", descriptor = "[I")
	public int[] anIntArray86;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray84[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray85[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(CI)I")
	public int method2186(@OriginalArg(0) char arg0) {
		if (this.anIntArray86 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray86.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray86[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	public void method2187() {
		@Pc(6) int local6;
		if (this.anIntArray86 != null) {
			for (local6 = 0; local6 < this.anIntArray86.length; local6++) {
				this.anIntArray86[local6] |= 0x8000;
			}
		}
		if (this.anIntArray83 != null) {
			for (local6 = 0; local6 < this.anIntArray83.length; local6++) {
				this.anIntArray83[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(CB)I")
	public int method2188(@OriginalArg(0) char arg0) {
		if (this.anIntArray83 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray83.length; local20++) {
			if (this.aCharArray2[local20] == arg0) {
				return this.anIntArray83[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!tn;)V")
	public void method2189(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8401();
			if (local17 == 0) {
				return;
			}
			this.method2191(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tn;IZ)V")
	private void method2191(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString15 = arg0.method8413();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(49) byte local49;
		if (arg1 == 2) {
			local26 = arg0.method8401();
			this.anIntArray83 = new int[local26];
			this.aCharArray2 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray83[local36] = arg0.method8414();
				local49 = arg0.method8440();
				this.aCharArray2[local36] = local49 == 0 ? 0 : Static278.method6290(local49);
			}
		} else if (arg1 == 3) {
			local26 = arg0.method8401();
			this.anIntArray86 = new int[local26];
			this.aCharArray3 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray86[local36] = arg0.method8414();
				local49 = arg0.method8440();
				this.aCharArray3[local36] = local49 == 0 ? 0 : Static278.method6290(local49);
			}
		}
	}
}

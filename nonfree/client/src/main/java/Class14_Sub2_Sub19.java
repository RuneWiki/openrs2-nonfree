import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class14_Sub2_Sub19 extends Class14_Sub2 {

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "Ljava/lang/String;")
	public String aString185;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
	public int[] anIntArray447;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(CZ)I")
	public int method4426(@OriginalArg(0) char arg0) {
		if (this.anIntArray447 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray447.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray447[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!jg;)V")
	private void method4430(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 1) {
			this.aString185 = arg1.method2496();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(57) byte local57;
		if (arg0 == 2) {
			local34 = arg1.method2548();
			this.aCharArray5 = new char[local34];
			this.anIntArray447 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray447[local44] = arg1.method2498();
				local57 = arg1.method2553();
				this.aCharArray5[local44] = local57 == 0 ? 0 : Static85.method2093(local57);
			}
		} else if (arg0 == 3) {
			local34 = arg1.method2548();
			this.anIntArray446 = new int[local34];
			this.aCharArray4 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray446[local44] = arg1.method2498();
				local57 = arg1.method2553();
				this.aCharArray4[local44] = local57 == 0 ? 0 : Static85.method2093(local57);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(CZ)I")
	public int method4431(@OriginalArg(0) char arg0) {
		if (this.anIntArray446 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray446.length; local18++) {
			if (this.aCharArray4[local18] == arg0) {
				return this.anIntArray446[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public void method4434() {
		if (this.anIntArray446 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray446.length; local6++) {
				this.anIntArray446[local6] |= 0x8000;
			}
		}
		if (this.anIntArray447 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray447.length; local45++) {
				this.anIntArray447[local45] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!jg;)V")
	public void method4436(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2548();
			if (local5 == 0) {
				return;
			}
			this.method4430(local5, arg0);
		}
	}
}

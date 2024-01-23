import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IC)I")
	public int method470(@OriginalArg(1) char arg0) {
		if (this.anIntArray53 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray53.length; local21++) {
			if (this.aCharArray2[local21] == arg0) {
				return this.anIntArray53[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
	public void method473() {
		@Pc(17) int local17;
		if (this.anIntArray52 != null) {
			for (local17 = 0; local17 < this.anIntArray52.length; local17++) {
				this.anIntArray52[local17] |= 0x8000;
			}
		}
		if (this.anIntArray53 != null) {
			for (local17 = 0; local17 < this.anIntArray53.length; local17++) {
				this.anIntArray53[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!qm;I)V")
	private void method475(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString40 = arg0.method2237();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(57) byte local57;
		if (arg1 == 2) {
			local31 = arg0.method2199();
			this.anIntArray53 = new int[local31];
			this.aCharArray2 = new char[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray53[local41] = arg0.method2244();
				local57 = arg0.method2212();
				this.aCharArray2[local41] = local57 == 0 ? 0 : Static23.method506(local57);
			}
		} else if (arg1 == 3) {
			local31 = arg0.method2199();
			this.aCharArray3 = new char[local31];
			this.anIntArray52 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray52[local41] = arg0.method2244();
				local57 = arg0.method2212();
				this.aCharArray3[local41] = local57 == 0 ? 0 : Static23.method506(local57);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IC)I")
	public int method477(@OriginalArg(1) char arg0) {
		if (this.anIntArray52 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray52.length; local18++) {
			if (arg0 == this.aCharArray3[local18]) {
				return this.anIntArray52[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!qm;)V")
	public void method478(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method475(arg0, local5);
		}
	}
}

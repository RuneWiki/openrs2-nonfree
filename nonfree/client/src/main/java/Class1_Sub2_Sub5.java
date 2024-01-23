import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method1456(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1378();
			if (local15 == 0) {
				return;
			}
			this.method1464(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(CI)I")
	public int method1459(@OriginalArg(0) char arg0) {
		if (this.anIntArray123 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray123.length; local18++) {
			if (arg0 == this.aCharArray1[local18]) {
				return this.anIntArray123[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public void method1462() {
		@Pc(12) int local12;
		if (this.anIntArray123 != null) {
			for (local12 = 0; local12 < this.anIntArray123.length; local12++) {
				this.anIntArray123[local12] |= 0x8000;
			}
		}
		if (this.anIntArray122 != null) {
			for (local12 = 0; local12 < this.anIntArray122.length; local12++) {
				this.anIntArray122[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(CB)I")
	public int method1463(@OriginalArg(0) char arg0) {
		if (this.anIntArray122 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray122.length; local19++) {
			if (arg0 == this.aCharArray2[local19]) {
				return this.anIntArray122[local19];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!lf;I)V")
	private void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aString92 = arg1.method1375();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		@Pc(49) byte local49;
		if (arg0 == 2) {
			local21 = arg1.method1378();
			this.anIntArray122 = new int[local21];
			this.aCharArray2 = new char[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray122[local31] = arg1.method1386();
				local49 = arg1.method1363();
				this.aCharArray2[local31] = local49 == 0 ? 0 : Static242.method3805(local49);
			}
		} else if (arg0 == 3) {
			local21 = arg1.method1378();
			this.anIntArray123 = new int[local21];
			this.aCharArray1 = new char[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray123[local31] = arg1.method1386();
				local49 = arg1.method1363();
				this.aCharArray1[local31] = local49 == 0 ? 0 : Static242.method3805(local49);
			}
		} else if (arg0 == 4) {
		}
	}
}

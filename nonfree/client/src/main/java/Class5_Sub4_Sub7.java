import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class5_Sub4_Sub7 extends Class5_Sub4 {

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!fba", name = "D", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!fba", name = "G", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!fba", name = "L", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!ee;)V")
	private void method2147(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aString38 = arg1.method8617();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(52) byte local52;
		if (arg0 == 2) {
			local27 = arg1.method8645();
			this.anIntArray190 = new int[local27];
			this.aCharArray2 = new char[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray190[local37] = arg1.method8631();
				local52 = arg1.method8635();
				this.aCharArray2[local37] = local52 == 0 ? 0 : Static382.method8494(local52);
			}
		} else if (arg0 == 3) {
			local27 = arg1.method8645();
			this.aCharArray1 = new char[local27];
			this.anIntArray189 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray189[local37] = arg1.method8631();
				local52 = arg1.method8635();
				this.aCharArray1[local37] = local52 == 0 ? 0 : Static382.method8494(local52);
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(CI)I")
	public int method2149(@OriginalArg(0) char arg0) {
		if (this.anIntArray190 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray190.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray190[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BC)I")
	public int method2152(@OriginalArg(1) char arg0) {
		if (this.anIntArray189 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray189.length; local20++) {
			if (this.aCharArray1[local20] == arg0) {
				return this.anIntArray189[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(B)V")
	public void method2153() {
		@Pc(6) int local6;
		if (this.anIntArray189 != null) {
			for (local6 = 0; local6 < this.anIntArray189.length; local6++) {
				this.anIntArray189[local6] |= 0x8000;
			}
		}
		if (this.anIntArray190 != null) {
			for (local6 = 0; local6 < this.anIntArray190.length; local6++) {
				this.anIntArray190[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method2156(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8645();
			if (local9 == 0) {
				return;
			}
			this.method2147(local9, arg0);
		}
	}
}

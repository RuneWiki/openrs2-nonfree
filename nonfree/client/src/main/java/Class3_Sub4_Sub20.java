import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class3_Sub4_Sub20 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "[I")
	public int[] anIntArray543;

	@OriginalMember(owner = "client!sba", name = "w", descriptor = "[I")
	public int[] anIntArray544;

	@OriginalMember(owner = "client!sba", name = "A", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(CI)I")
	public int method7618(@OriginalArg(0) char arg0) {
		if (this.anIntArray544 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray544.length; local17++) {
			if (arg0 == this.aCharArray6[local17]) {
				return this.anIntArray544[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(CB)I")
	public int method7619(@OriginalArg(0) char arg0) {
		if (this.anIntArray543 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray543.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray543[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!sl;BI)V")
	private void method7620(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString100 = arg0.method4233();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(48) byte local48;
		if (arg1 == 2) {
			local25 = arg0.method4225();
			this.anIntArray543 = new int[local25];
			this.aCharArray5 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray543[local35] = arg0.method4221();
				local48 = arg0.method4254();
				this.aCharArray5[local35] = local48 == 0 ? 0 : Static242.method3969(local48);
			}
		} else if (arg1 == 3) {
			local25 = arg0.method4225();
			this.aCharArray6 = new char[local25];
			this.anIntArray544 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray544[local35] = arg0.method4221();
				local48 = arg0.method4254();
				this.aCharArray6[local35] = local48 == 0 ? 0 : Static242.method3969(local48);
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V")
	public void method7621() {
		@Pc(9) int local9;
		if (this.anIntArray544 != null) {
			for (local9 = 0; local9 < this.anIntArray544.length; local9++) {
				this.anIntArray544[local9] |= 0x8000;
			}
		}
		if (this.anIntArray543 != null) {
			for (local9 = 0; local9 < this.anIntArray543.length; local9++) {
				this.anIntArray543[local9] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method7623(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4225();
			if (local11 == 0) {
				return;
			}
			this.method7620(arg0, local11);
		}
	}
}

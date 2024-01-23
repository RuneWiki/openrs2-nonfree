import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "Ljava/lang/String;")
	public String aString284;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
	public void method3173() {
		@Pc(6) int local6;
		if (this.anIntArray316 != null) {
			for (local6 = 0; local6 < this.anIntArray316.length; local6++) {
				this.anIntArray316[local6] |= 0x8000;
			}
		}
		if (this.anIntArray315 != null) {
			for (local6 = 0; local6 < this.anIntArray315.length; local6++) {
				this.anIntArray315[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ql;Z)V")
	private void method3174(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString284 = arg1.method1774();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg0 == 2) {
			local24 = arg1.method1772();
			this.anIntArray315 = new int[local24];
			this.aCharArray2 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray315[local34] = arg1.method1764();
				local47 = arg1.method1756();
				this.aCharArray2[local34] = local47 == 0 ? 0 : Static139.method4196(local47);
			}
		} else if (arg0 == 3) {
			local24 = arg1.method1772();
			this.anIntArray316 = new int[local24];
			this.aCharArray3 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray316[local34] = arg1.method1764();
				local47 = arg1.method1756();
				this.aCharArray3[local34] = local47 == 0 ? 0 : Static139.method4196(local47);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IC)I")
	public int method3176(@OriginalArg(1) char arg0) {
		if (this.anIntArray315 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray315.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray315[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(CZ)I")
	public int method3177(@OriginalArg(0) char arg0) {
		if (this.anIntArray316 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray316.length; local17++) {
			if (arg0 == this.aCharArray3[local17]) {
				return this.anIntArray316[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ql;I)V")
	public void method3178(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1772();
			if (local9 == 0) {
				return;
			}
			this.method3174(local9, arg0);
		}
	}
}

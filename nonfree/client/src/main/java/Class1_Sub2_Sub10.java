import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!lh;Z)V")
	public void method2301(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4130();
			if (local15 == 0) {
				return;
			}
			this.method2303(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!lh;)V")
	private void method2303(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.aString18 = arg1.method4137();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(45) byte local45;
		if (arg0 == 2) {
			local22 = arg1.method4130();
			this.aCharArray2 = new char[local22];
			this.anIntArray250 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray250[local32] = arg1.method4093();
				local45 = arg1.method4112();
				this.aCharArray2[local32] = local45 == 0 ? 0 : Static423.method5682(local45);
			}
		} else if (arg0 == 3) {
			local22 = arg1.method4130();
			this.aCharArray3 = new char[local22];
			this.anIntArray251 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray251[local32] = arg1.method4093();
				local45 = arg1.method4112();
				this.aCharArray3[local32] = local45 == 0 ? 0 : Static423.method5682(local45);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(CI)I")
	public int method2304(@OriginalArg(0) char arg0) {
		if (this.anIntArray250 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray250.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray250[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZC)I")
	public int method2305(@OriginalArg(1) char arg0) {
		if (this.anIntArray251 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray251.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray251[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
	public void method2308() {
		@Pc(9) int local9;
		if (this.anIntArray251 != null) {
			for (local9 = 0; local9 < this.anIntArray251.length; local9++) {
				this.anIntArray251[local9] |= 0x8000;
			}
		}
		if (this.anIntArray250 != null) {
			for (local9 = 0; local9 < this.anIntArray250.length; local9++) {
				this.anIntArray250[local9] |= 0x8000;
			}
		}
	}
}

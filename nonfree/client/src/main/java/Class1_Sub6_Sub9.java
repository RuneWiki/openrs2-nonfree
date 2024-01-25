import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class1_Sub6_Sub9 extends Class1_Sub6 {

	@OriginalMember(owner = "client!mga", name = "t", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!mga", name = "u", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!mga", name = "z", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!mga", name = "B", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!mga", name = "E", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method4466(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5750();
			if (local15 == 0) {
				return;
			}
			this.method4469(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	public void method4468() {
		@Pc(14) int local14;
		if (this.anIntArray431 != null) {
			for (local14 = 0; local14 < this.anIntArray431.length; local14++) {
				this.anIntArray431[local14] |= 0x8000;
			}
		}
		if (this.anIntArray430 != null) {
			for (local14 = 0; local14 < this.anIntArray430.length; local14++) {
				this.anIntArray430[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!mo;IB)V")
	private void method4469(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString51 = arg0.method5760();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(53) byte local53;
		if (arg1 == 2) {
			local30 = arg0.method5750();
			this.aCharArray3 = new char[local30];
			this.anIntArray430 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray430[local40] = arg0.method5771();
				local53 = arg0.method5751();
				this.aCharArray3[local40] = local53 == 0 ? 0 : Static546.method7462(local53);
			}
		} else if (arg1 == 3) {
			local30 = arg0.method5750();
			this.anIntArray431 = new int[local30];
			this.aCharArray2 = new char[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray431[local40] = arg0.method5771();
				local53 = arg0.method5751();
				this.aCharArray2[local40] = local53 == 0 ? 0 : Static546.method7462(local53);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IC)I")
	public int method4470(@OriginalArg(1) char arg0) {
		if (this.anIntArray430 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray430.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray430[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(IC)I")
	public int method4472(@OriginalArg(1) char arg0) {
		if (this.anIntArray431 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray431.length; local17++) {
			if (arg0 == this.aCharArray2[local17]) {
				return this.anIntArray431[local17];
			}
		}
		return -1;
	}
}

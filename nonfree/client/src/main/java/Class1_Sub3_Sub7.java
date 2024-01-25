import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!co", name = "y", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CB)I")
	public int method1606(@OriginalArg(0) char arg0) {
		if (this.anIntArray103 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray103.length; local12++) {
			if (this.aCharArray3[local12] == arg0) {
				return this.anIntArray103[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
	public void method1607() {
		@Pc(18) int local18;
		if (this.anIntArray103 != null) {
			for (local18 = 0; local18 < this.anIntArray103.length; local18++) {
				this.anIntArray103[local18] |= 0x8000;
			}
		}
		if (this.anIntArray102 != null) {
			for (local18 = 0; local18 < this.anIntArray102.length; local18++) {
				this.anIntArray102[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!io;I)V")
	public void method1608(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4393();
			if (local9 == 0) {
				return;
			}
			this.method1612(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(CI)I")
	public int method1611(@OriginalArg(0) char arg0) {
		if (this.anIntArray102 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray102.length; local10++) {
			if (arg0 == this.aCharArray2[local10]) {
				return this.anIntArray102[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!io;)V")
	private void method1612(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString16 = arg1.method4388();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(54) byte local54;
		if (arg0 == 2) {
			local31 = arg1.method4393();
			this.anIntArray102 = new int[local31];
			this.aCharArray2 = new char[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray102[local41] = arg1.method4426();
				local54 = arg1.method4432();
				this.aCharArray2[local41] = local54 == 0 ? 0 : Static344.method5095(local54);
			}
		} else if (arg0 == 3) {
			local31 = arg1.method4393();
			this.anIntArray103 = new int[local31];
			this.aCharArray3 = new char[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray103[local41] = arg1.method4426();
				local54 = arg1.method4432();
				this.aCharArray3[local41] = local54 == 0 ? 0 : Static344.method5095(local54);
			}
		}
	}
}

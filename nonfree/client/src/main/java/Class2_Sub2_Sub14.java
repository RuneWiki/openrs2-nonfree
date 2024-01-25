import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(CI)I")
	public int method4884(@OriginalArg(0) char arg0) {
		if (this.anIntArray415 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray415.length; local12++) {
			if (arg0 == this.aCharArray4[local12]) {
				return this.anIntArray415[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!vj;)V")
	public void method4888(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method4890(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(CI)I")
	public int method4889(@OriginalArg(0) char arg0) {
		if (this.anIntArray416 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray416.length; local20++) {
			if (arg0 == this.aCharArray5[local20]) {
				return this.anIntArray416[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!vj;BI)V")
	private void method4890(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString74 = arg0.method8549();
			return;
		}
		@Pc(14) int local14;
		@Pc(24) int local24;
		@Pc(37) byte local37;
		if (arg1 == 2) {
			local14 = arg0.method8547();
			this.aCharArray5 = new char[local14];
			this.anIntArray416 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray416[local24] = arg0.method8546();
				local37 = arg0.method8548();
				this.aCharArray5[local24] = local37 == 0 ? 0 : Static212.method2950(local37);
			}
		} else if (arg1 == 3) {
			local14 = arg0.method8547();
			this.aCharArray4 = new char[local14];
			this.anIntArray415 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray415[local24] = arg0.method8546();
				local37 = arg0.method8548();
				this.aCharArray4[local24] = local37 == 0 ? 0 : Static212.method2950(local37);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)V")
	public void method4891() {
		@Pc(10) int local10;
		if (this.anIntArray415 != null) {
			for (local10 = 0; local10 < this.anIntArray415.length; local10++) {
				this.anIntArray415[local10] |= 0x8000;
			}
		}
		if (this.anIntArray416 != null) {
			for (local10 = 0; local10 < this.anIntArray416.length; local10++) {
				this.anIntArray416[local10] |= 0x8000;
			}
		}
	}
}

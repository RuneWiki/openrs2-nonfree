import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(CB)I")
	public int method1470(@OriginalArg(0) char arg0) {
		if (this.anIntArray207 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray207.length; local20++) {
			if (this.aCharArray2[local20] == arg0) {
				return this.anIntArray207[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
	public void method1471() {
		@Pc(10) int local10;
		if (this.anIntArray207 != null) {
			for (local10 = 0; local10 < this.anIntArray207.length; local10++) {
				this.anIntArray207[local10] |= 0x8000;
			}
		}
		if (this.anIntArray208 != null) {
			for (local10 = 0; local10 < this.anIntArray208.length; local10++) {
				this.anIntArray208[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IC)I")
	public int method1473(@OriginalArg(1) char arg0) {
		if (this.anIntArray208 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray208.length; local21++) {
			if (arg0 == this.aCharArray3[local21]) {
				return this.anIntArray208[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!im;II)V")
	private void method1474(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString56 = arg0.method2611();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(52) byte local52;
		if (arg1 == 2) {
			local24 = arg0.method2655();
			this.aCharArray3 = new char[local24];
			this.anIntArray208 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray208[local34] = arg0.method2652();
				local52 = arg0.method2633();
				this.aCharArray3[local34] = local52 == 0 ? 0 : Static8.method3513(local52);
			}
		} else if (arg1 == 3) {
			local24 = arg0.method2655();
			this.anIntArray207 = new int[local24];
			this.aCharArray2 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray207[local34] = arg0.method2652();
				local52 = arg0.method2633();
				this.aCharArray2[local34] = local52 == 0 ? 0 : Static8.method3513(local52);
			}
		} else if (arg1 != 4) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!im;)V")
	public void method1475(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method2655();
			if (local19 == 0) {
				return;
			}
			this.method1474(arg0, local19);
		}
	}
}

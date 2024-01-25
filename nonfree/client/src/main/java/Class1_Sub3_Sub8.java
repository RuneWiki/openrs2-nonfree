import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!dh;IB)V")
	private void method2141(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString23 = arg0.method4484();
			return;
		}
		@Pc(11) int local11;
		@Pc(21) int local21;
		@Pc(34) byte local34;
		if (arg1 == 2) {
			local11 = arg0.method4463();
			this.aCharArray2 = new char[local11];
			this.anIntArray128 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray128[local21] = arg0.method4485();
				local34 = arg0.method4452();
				this.aCharArray2[local21] = local34 == 0 ? 0 : Static276.method3514(local34);
			}
		} else if (arg1 == 3) {
			local11 = arg0.method4463();
			this.aCharArray1 = new char[local11];
			this.anIntArray129 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray129[local21] = arg0.method4485();
				local34 = arg0.method4452();
				this.aCharArray1[local21] = local34 == 0 ? 0 : Static276.method3514(local34);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BC)I")
	public int method2142(@OriginalArg(1) char arg0) {
		if (this.anIntArray128 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray128.length; local20++) {
			if (this.aCharArray2[local20] == arg0) {
				return this.anIntArray128[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method2144() {
		@Pc(10) int local10;
		if (this.anIntArray129 != null) {
			for (local10 = 0; local10 < this.anIntArray129.length; local10++) {
				this.anIntArray129[local10] |= 0x8000;
			}
		}
		if (this.anIntArray128 != null) {
			for (local10 = 0; local10 < this.anIntArray128.length; local10++) {
				this.anIntArray128[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)I")
	public int method2145(@OriginalArg(0) char arg0) {
		if (this.anIntArray129 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray129.length; local12++) {
			if (this.aCharArray1[local12] == arg0) {
				return this.anIntArray129[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method2147(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4463();
			if (local17 == 0) {
				return;
			}
			this.method2141(arg0, local17);
		}
	}
}

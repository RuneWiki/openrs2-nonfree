import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class6_Sub4_Sub7 extends Class6_Sub4 {

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(CI)I")
	public int method4093(@OriginalArg(0) char arg0) {
		if (this.anIntArray313 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray313.length; local20++) {
			if (this.aCharArray3[local20] == arg0) {
				return this.anIntArray313[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(CI)I")
	public int method4096(@OriginalArg(0) char arg0) {
		if (this.anIntArray312 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray312.length; local12++) {
			if (this.aCharArray2[local12] == arg0) {
				return this.anIntArray312[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method4097(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4966();
			if (local13 == 0) {
				return;
			}
			this.method4099(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)V")
	public void method4098() {
		@Pc(6) int local6;
		if (this.anIntArray313 != null) {
			for (local6 = 0; local6 < this.anIntArray313.length; local6++) {
				this.anIntArray313[local6] |= 0x8000;
			}
		}
		if (this.anIntArray312 != null) {
			for (local6 = 0; local6 < this.anIntArray312.length; local6++) {
				this.anIntArray312[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZILclient!iaa;)V")
	private void method4099(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.aString54 = arg1.method4941();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(51) byte local51;
		if (arg0 == 2) {
			local28 = arg1.method4966();
			this.anIntArray312 = new int[local28];
			this.aCharArray2 = new char[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray312[local38] = arg1.method4999();
				local51 = arg1.method4972();
				this.aCharArray2[local38] = local51 == 0 ? 0 : Static60.method1329(local51);
			}
		} else if (arg0 == 3) {
			local28 = arg1.method4966();
			this.anIntArray313 = new int[local28];
			this.aCharArray3 = new char[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray313[local38] = arg1.method4999();
				local51 = arg1.method4972();
				this.aCharArray3[local38] = local51 == 0 ? 0 : Static60.method1329(local51);
			}
		}
	}
}

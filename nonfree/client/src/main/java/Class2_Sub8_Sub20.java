import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class2_Sub8_Sub20 extends Class2_Sub8 {

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "Ljava/lang/String;")
	public String aString158;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!oe;BI)V")
	private void method3733(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString158 = arg0.method2158();
			return;
		}
		@Pc(11) int local11;
		@Pc(21) int local21;
		@Pc(41) byte local41;
		if (arg1 == 2) {
			local11 = arg0.method2146();
			this.aCharArray9 = new char[local11];
			this.anIntArray456 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray456[local21] = arg0.method2130();
				local41 = arg0.method2170();
				this.aCharArray9[local21] = local41 == 0 ? 0 : Static84.method1511(local41);
			}
		} else if (arg1 == 3) {
			local11 = arg0.method2146();
			this.aCharArray8 = new char[local11];
			this.anIntArray457 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray457[local21] = arg0.method2130();
				local41 = arg0.method2170();
				this.aCharArray8[local21] = local41 == 0 ? 0 : Static84.method1511(local41);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
	public void method3736() {
		@Pc(15) int local15;
		if (this.anIntArray457 != null) {
			for (local15 = 0; local15 < this.anIntArray457.length; local15++) {
				this.anIntArray457[local15] |= 0x8000;
			}
		}
		if (this.anIntArray456 != null) {
			for (local15 = 0; local15 < this.anIntArray456.length; local15++) {
				this.anIntArray456[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IC)I")
	public int method3737(@OriginalArg(1) char arg0) {
		if (this.anIntArray456 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray456.length; local21++) {
			if (this.aCharArray9[local21] == arg0) {
				return this.anIntArray456[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(CB)I")
	public int method3739(@OriginalArg(0) char arg0) {
		if (this.anIntArray457 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray457.length; local13++) {
			if (this.aCharArray8[local13] == arg0) {
				return this.anIntArray457[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!oe;B)V")
	public void method3740(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2146();
			if (local9 == 0) {
				return;
			}
			this.method3733(arg0, local9);
		}
	}
}

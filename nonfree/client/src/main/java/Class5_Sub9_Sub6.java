import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class5_Sub9_Sub6 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Ljava/lang/String;")
	public String aString121;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!bk;)V")
	public void method1899(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1832();
			if (local14 == 0) {
				return;
			}
			this.method1905(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IC)I")
	public int method1900(@OriginalArg(1) char arg0) {
		if (this.anIntArray117 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray117.length; local12++) {
			if (arg0 == this.aCharArray9[local12]) {
				return this.anIntArray117[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(IC)I")
	public int method1903(@OriginalArg(1) char arg0) {
		if (this.anIntArray115 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray115.length; local12++) {
			if (arg0 == this.aCharArray8[local12]) {
				return this.anIntArray115[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public void method1904() {
		@Pc(6) int local6;
		if (this.anIntArray115 != null) {
			for (local6 = 0; local6 < this.anIntArray115.length; local6++) {
				this.anIntArray115[local6] |= 0x8000;
			}
		}
		if (this.anIntArray117 != null) {
			for (local6 = 0; local6 < this.anIntArray117.length; local6++) {
				this.anIntArray117[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!bk;I)V")
	private void method1905(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString121 = arg0.method1840();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(36) byte local36;
		if (arg1 == 2) {
			local13 = arg0.method1832();
			this.aCharArray9 = new char[local13];
			this.anIntArray117 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray117[local23] = arg0.method1845();
				local36 = arg0.method1863();
				this.aCharArray9[local23] = local36 == 0 ? 0 : Static88.method1387(local36);
			}
		} else if (arg1 == 3) {
			local13 = arg0.method1832();
			this.aCharArray8 = new char[local13];
			this.anIntArray115 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray115[local23] = arg0.method1845();
				local36 = arg0.method1863();
				this.aCharArray8[local23] = local36 == 0 ? 0 : Static88.method1387(local36);
			}
		}
	}
}

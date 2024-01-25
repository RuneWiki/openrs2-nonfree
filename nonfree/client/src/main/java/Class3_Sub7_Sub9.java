import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(CI)I")
	public int method2592(@OriginalArg(0) char arg0) {
		if (this.anIntArray190 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray190.length; local12++) {
			if (arg0 == this.aCharArray6[local12]) {
				return this.anIntArray190[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.aString20 = arg1.method5607();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(55) byte local55;
		if (arg0 == 2) {
			local32 = arg1.method5633();
			this.aCharArray7 = new char[local32];
			this.anIntArray188 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray188[local42] = arg1.method5610();
				local55 = arg1.method5619();
				this.aCharArray7[local42] = local55 == 0 ? 0 : Static408.method6346(local55);
			}
		} else if (arg0 == 3) {
			local32 = arg1.method5633();
			this.anIntArray190 = new int[local32];
			this.aCharArray6 = new char[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray190[local42] = arg1.method5610();
				local55 = arg1.method5619();
				this.aCharArray6[local42] = local55 == 0 ? 0 : Static408.method6346(local55);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public void method2595() {
		@Pc(10) int local10;
		if (this.anIntArray190 != null) {
			for (local10 = 0; local10 < this.anIntArray190.length; local10++) {
				this.anIntArray190[local10] |= 0x8000;
			}
		}
		if (this.anIntArray188 != null) {
			for (local10 = 0; local10 < this.anIntArray188.length; local10++) {
				this.anIntArray188[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(CI)I")
	public int method2598(@OriginalArg(0) char arg0) {
		if (this.anIntArray188 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray188.length; local12++) {
			if (this.aCharArray7[local12] == arg0) {
				return this.anIntArray188[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(ILclient!dc;)V")
	public void method2599(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5633();
			if (local9 == 0) {
				return;
			}
			this.method2594(local9, arg0);
		}
	}
}

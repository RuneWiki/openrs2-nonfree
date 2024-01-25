import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class3_Sub5_Sub12 extends Class3_Sub5 {

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!lca", name = "A", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!lca", name = "B", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(CI)I")
	public int method4698(@OriginalArg(0) char arg0) {
		if (this.anIntArray308 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray308.length; local12++) {
			if (arg0 == this.aCharArray6[local12]) {
				return this.anIntArray308[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!dt;I)V")
	private void method4699(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString72 = arg0.method7922();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(51) byte local51;
		if (arg1 == 2) {
			local28 = arg0.method7954();
			this.aCharArray5 = new char[local28];
			this.anIntArray309 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray309[local38] = arg0.method7951();
				local51 = arg0.method7960();
				this.aCharArray5[local38] = local51 == 0 ? 0 : Static363.method8911(local51);
			}
		} else if (arg1 == 3) {
			local28 = arg0.method7954();
			this.anIntArray308 = new int[local28];
			this.aCharArray6 = new char[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray308[local38] = arg0.method7951();
				local51 = arg0.method7960();
				this.aCharArray6[local38] = local51 == 0 ? 0 : Static363.method8911(local51);
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLclient!dt;)V")
	public void method4702(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7954();
			if (local13 == 0) {
				return;
			}
			this.method4699(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IC)I")
	public int method4703(@OriginalArg(1) char arg0) {
		if (this.anIntArray309 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray309.length; local17++) {
			if (arg0 == this.aCharArray5[local17]) {
				return this.anIntArray309[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)V")
	public void method4705() {
		@Pc(10) int local10;
		if (this.anIntArray308 != null) {
			for (local10 = 0; local10 < this.anIntArray308.length; local10++) {
				this.anIntArray308[local10] |= 0x8000;
			}
		}
		if (this.anIntArray309 != null) {
			for (local10 = 0; local10 < this.anIntArray309.length; local10++) {
				this.anIntArray309[local10] |= 0x8000;
			}
		}
	}
}

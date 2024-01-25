import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "[I")
	public int[] anIntArray448;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(CB)I")
	public int method4541(@OriginalArg(0) char arg0) {
		if (this.anIntArray449 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray449.length; local12++) {
			if (arg0 == this.aCharArray5[local12]) {
				return this.anIntArray449[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method4542(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method4543(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!wn;B)V")
	private void method4543(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString49 = arg1.method4624();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(57) byte local57;
		if (arg0 == 2) {
			local32 = arg1.method4614();
			this.aCharArray5 = new char[local32];
			this.anIntArray449 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray449[local42] = arg1.method4560();
				local57 = arg1.method4576();
				this.aCharArray5[local42] = local57 == 0 ? 0 : Static154.method2864(local57);
			}
		} else if (arg0 == 3) {
			local32 = arg1.method4614();
			this.anIntArray448 = new int[local32];
			this.aCharArray4 = new char[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray448[local42] = arg1.method4560();
				local57 = arg1.method4576();
				this.aCharArray4[local42] = local57 == 0 ? 0 : Static154.method2864(local57);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)V")
	public void method4545() {
		@Pc(6) int local6;
		if (this.anIntArray448 != null) {
			for (local6 = 0; local6 < this.anIntArray448.length; local6++) {
				this.anIntArray448[local6] |= 0x8000;
			}
		}
		if (this.anIntArray449 != null) {
			for (local6 = 0; local6 < this.anIntArray449.length; local6++) {
				this.anIntArray449[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IC)I")
	public int method4548(@OriginalArg(1) char arg0) {
		if (this.anIntArray448 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray448.length; local12++) {
			if (this.aCharArray4[local12] == arg0) {
				return this.anIntArray448[local12];
			}
		}
		return -1;
	}
}

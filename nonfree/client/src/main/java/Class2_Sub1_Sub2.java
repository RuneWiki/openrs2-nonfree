import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method398(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString4 = arg0.method5178();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(58) byte local58;
		if (arg1 == 2) {
			local33 = arg0.method5203();
			this.anIntArray36 = new int[local33];
			this.aCharArray2 = new char[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray36[local43] = arg0.method5211();
				local58 = arg0.method5175();
				this.aCharArray2[local43] = local58 == 0 ? 0 : Static386.method6507(local58);
			}
		} else if (arg1 == 3) {
			local33 = arg0.method5203();
			this.anIntArray35 = new int[local33];
			this.aCharArray1 = new char[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray35[local43] = arg0.method5211();
				local58 = arg0.method5175();
				this.aCharArray1[local43] = local58 == 0 ? 0 : Static386.method6507(local58);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)I")
	public int method399(@OriginalArg(0) char arg0) {
		if (this.anIntArray35 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray35.length; local12++) {
			if (this.aCharArray1[local12] == arg0) {
				return this.anIntArray35[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ol;B)V")
	public void method401(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5203();
			if (local9 == 0) {
				return;
			}
			this.method398(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BC)I")
	public int method402(@OriginalArg(1) char arg0) {
		if (this.anIntArray36 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray36.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray36[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method403() {
		@Pc(10) int local10;
		if (this.anIntArray35 != null) {
			for (local10 = 0; local10 < this.anIntArray35.length; local10++) {
				this.anIntArray35[local10] |= 0x8000;
			}
		}
		if (this.anIntArray36 != null) {
			for (local10 = 0; local10 < this.anIntArray36.length; local10++) {
				this.anIntArray36[local10] |= 0x8000;
			}
		}
	}
}

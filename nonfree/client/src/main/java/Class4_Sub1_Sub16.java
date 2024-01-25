import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!np", name = "z", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!np", name = "D", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!np", name = "I", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!np", name = "L", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!np", name = "O", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(CB)I")
	public int method3867(@OriginalArg(0) char arg0) {
		if (this.anIntArray325 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray325.length; local12++) {
			if (this.aCharArray4[local12] == arg0) {
				return this.anIntArray325[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(CB)I")
	public int method3869(@OriginalArg(0) char arg0) {
		if (this.anIntArray326 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray326.length; local18++) {
			if (this.aCharArray3[local18] == arg0) {
				return this.anIntArray326[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(B)V")
	public void method3870() {
		@Pc(15) int local15;
		if (this.anIntArray325 != null) {
			for (local15 = 0; local15 < this.anIntArray325.length; local15++) {
				this.anIntArray325[local15] |= 0x8000;
			}
		}
		if (this.anIntArray326 != null) {
			for (local15 = 0; local15 < this.anIntArray326.length; local15++) {
				this.anIntArray326[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method3872(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString49 = arg0.method2537();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(36) byte local36;
		if (arg1 == 2) {
			local13 = arg0.method2490();
			this.aCharArray3 = new char[local13];
			this.anIntArray326 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray326[local23] = arg0.method2536();
				local36 = arg0.method2542();
				this.aCharArray3[local23] = local36 == 0 ? 0 : Static260.method3771(local36);
			}
		} else if (arg1 == 3) {
			local13 = arg0.method2490();
			this.aCharArray4 = new char[local13];
			this.anIntArray325 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray325[local23] = arg0.method2536();
				local36 = arg0.method2542();
				this.aCharArray4[local23] = local36 == 0 ? 0 : Static260.method3771(local36);
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method3873(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method3872(arg0, local5);
		}
	}
}

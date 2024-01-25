import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ps;IB)V")
	private void method1098(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString36 = arg0.method5194();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(47) byte local47;
		if (arg1 == 2) {
			local22 = arg0.method5170();
			this.aCharArray4 = new char[local22];
			this.anIntArray106 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray106[local32] = arg0.method5229();
				local47 = arg0.method5179();
				this.aCharArray4[local32] = local47 == 0 ? 0 : Static431.method6618(local47);
			}
		} else if (arg1 == 3) {
			local22 = arg0.method5170();
			this.anIntArray105 = new int[local22];
			this.aCharArray3 = new char[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray105[local32] = arg0.method5229();
				local47 = arg0.method5179();
				this.aCharArray3[local32] = local47 == 0 ? 0 : Static431.method6618(local47);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(CI)I")
	public int method1099(@OriginalArg(0) char arg0) {
		if (this.anIntArray106 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray106.length; local20++) {
			if (arg0 == this.aCharArray4[local20]) {
				return this.anIntArray106[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method1100(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5170();
			if (local15 == 0) {
				return;
			}
			this.method1098(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BC)I")
	public int method1101(@OriginalArg(1) char arg0) {
		if (this.anIntArray105 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray105.length; local10++) {
			if (this.aCharArray3[local10] == arg0) {
				return this.anIntArray105[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
	public void method1103() {
		@Pc(14) int local14;
		if (this.anIntArray105 != null) {
			for (local14 = 0; local14 < this.anIntArray105.length; local14++) {
				this.anIntArray105[local14] |= 0x8000;
			}
		}
		if (this.anIntArray106 != null) {
			for (local14 = 0; local14 < this.anIntArray106.length; local14++) {
				this.anIntArray106[local14] |= 0x8000;
			}
		}
	}
}

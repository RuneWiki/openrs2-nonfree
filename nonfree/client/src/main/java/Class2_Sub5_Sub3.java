import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public void method1051() {
		@Pc(10) int local10;
		if (this.anIntArray117 != null) {
			for (local10 = 0; local10 < this.anIntArray117.length; local10++) {
				this.anIntArray117[local10] |= 0x8000;
			}
		}
		if (this.anIntArray116 != null) {
			for (local10 = 0; local10 < this.anIntArray116.length; local10++) {
				this.anIntArray116[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BC)I")
	public int method1052(@OriginalArg(1) char arg0) {
		if (this.anIntArray116 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray116.length; local12++) {
			if (arg0 == this.aCharArray3[local12]) {
				return this.anIntArray116[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IC)I")
	public int method1054(@OriginalArg(1) char arg0) {
		if (this.anIntArray117 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray117.length; local12++) {
			if (this.aCharArray4[local12] == arg0) {
				return this.anIntArray117[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!sv;I)V")
	private void method1056(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString43 = arg0.method3582();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg1 == 2) {
			local24 = arg0.method3580();
			this.anIntArray116 = new int[local24];
			this.aCharArray3 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray116[local34] = arg0.method3555();
				local47 = arg0.method3605();
				this.aCharArray3[local34] = local47 == 0 ? 0 : Static336.method4491(local47);
			}
		} else if (arg1 == 3) {
			local24 = arg0.method3580();
			this.anIntArray117 = new int[local24];
			this.aCharArray4 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray117[local34] = arg0.method3555();
				local47 = arg0.method3605();
				this.aCharArray4[local34] = local47 == 0 ? 0 : Static336.method4491(local47);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!sv;)V")
	public void method1058(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3580();
			if (local9 == 0) {
				return;
			}
			this.method1056(arg0, local9);
		}
	}
}

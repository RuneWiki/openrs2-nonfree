import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public void method2313() {
		@Pc(6) int local6;
		if (this.anIntArray152 != null) {
			for (local6 = 0; local6 < this.anIntArray152.length; local6++) {
				this.anIntArray152[local6] |= 0x8000;
			}
		}
		if (this.anIntArray153 != null) {
			for (local6 = 0; local6 < this.anIntArray153.length; local6++) {
				this.anIntArray153[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(CB)I")
	public int method2318(@OriginalArg(0) char arg0) {
		if (this.anIntArray152 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray152.length; local20++) {
			if (arg0 == this.aCharArray4[local20]) {
				return this.anIntArray152[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!fh;)V")
	public void method2319(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method2321(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BC)I")
	public int method2320(@OriginalArg(1) char arg0) {
		if (this.anIntArray153 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray153.length; local12++) {
			if (this.aCharArray3[local12] == arg0) {
				return this.anIntArray153[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method2321(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString31 = arg0.method5549();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(50) byte local50;
		if (arg1 == 2) {
			local27 = arg0.method5539();
			this.aCharArray3 = new char[local27];
			this.anIntArray153 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray153[local37] = arg0.method5598();
				local50 = arg0.method5600();
				this.aCharArray3[local37] = local50 == 0 ? 0 : Static372.method4863(local50);
			}
		} else if (arg1 == 3) {
			local27 = arg0.method5539();
			this.anIntArray152 = new int[local27];
			this.aCharArray4 = new char[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray152[local37] = arg0.method5598();
				local50 = arg0.method5600();
				this.aCharArray4[local37] = local50 == 0 ? 0 : Static372.method4863(local50);
			}
		}
	}
}

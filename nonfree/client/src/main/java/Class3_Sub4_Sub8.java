import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "[C")
	public char[] aCharArray13;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "[C")
	public char[] aCharArray14;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
	public void method1407() {
		@Pc(12) int local12;
		if (this.anIntArray168 != null) {
			for (local12 = 0; local12 < this.anIntArray168.length; local12++) {
				this.anIntArray168[local12] |= 0x8000;
			}
		}
		if (this.anIntArray170 != null) {
			for (local12 = 0; local12 < this.anIntArray170.length; local12++) {
				this.anIntArray170[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CB)I")
	public int method1409(@OriginalArg(0) char arg0) {
		if (this.anIntArray170 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray170.length; local21++) {
			if (this.aCharArray14[local21] == arg0) {
				return this.anIntArray170[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!ug;)V")
	public void method1410(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3915();
			if (local5 == 0) {
				return;
			}
			this.method1411(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!ug;B)V")
	private void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aString73 = arg1.method3931();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(59) byte local59;
		if (arg0 == 2) {
			local31 = arg1.method3915();
			this.aCharArray14 = new char[local31];
			this.anIntArray170 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray170[local41] = arg1.method3948();
				local59 = arg1.method3920();
				this.aCharArray14[local41] = local59 == 0 ? 0 : Static270.method4464(local59);
			}
		} else if (arg0 == 3) {
			local31 = arg1.method3915();
			this.anIntArray168 = new int[local31];
			this.aCharArray13 = new char[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray168[local41] = arg1.method3948();
				local59 = arg1.method3920();
				this.aCharArray13[local41] = local59 == 0 ? 0 : Static270.method4464(local59);
			}
		} else if (arg0 == 4) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CI)I")
	public int method1413(@OriginalArg(0) char arg0) {
		if (this.anIntArray168 == null) {
			return -1;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray168.length; local22++) {
			if (this.aCharArray13[local22] == arg0) {
				return this.anIntArray168[local22];
			}
		}
		return -1;
	}
}

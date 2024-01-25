import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(CI)I")
	public int method2116(@OriginalArg(0) char arg0) {
		if (this.anIntArray246 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray246.length; local17++) {
			if (this.aCharArray2[local17] == arg0) {
				return this.anIntArray246[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(CB)I")
	public int method2117(@OriginalArg(0) char arg0) {
		if (this.anIntArray247 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray247.length; local12++) {
			if (this.aCharArray3[local12] == arg0) {
				return this.anIntArray247[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!tq;)V")
	public void method2118(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2380();
			if (local13 == 0) {
				return;
			}
			this.method2119(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!tq;)V")
	private void method2119(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString86 = arg1.method2379();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(41) byte local41;
		if (arg0 == 2) {
			local18 = arg1.method2380();
			this.anIntArray246 = new int[local18];
			this.aCharArray2 = new char[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray246[local28] = arg1.method2404();
				local41 = arg1.method2393();
				this.aCharArray2[local28] = local41 == 0 ? 0 : Static58.method1043(local41);
			}
		} else if (arg0 == 3) {
			local18 = arg1.method2380();
			this.aCharArray3 = new char[local18];
			this.anIntArray247 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray247[local28] = arg1.method2404();
				local41 = arg1.method2393();
				this.aCharArray3[local28] = local41 == 0 ? 0 : Static58.method1043(local41);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	public void method2123() {
		@Pc(6) int local6;
		if (this.anIntArray247 != null) {
			for (local6 = 0; local6 < this.anIntArray247.length; local6++) {
				this.anIntArray247[local6] |= 0x8000;
			}
		}
		if (this.anIntArray246 != null) {
			for (local6 = 0; local6 < this.anIntArray246.length; local6++) {
				this.anIntArray246[local6] |= 0x8000;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
	public void method1005() {
		@Pc(14) int local14;
		if (this.anIntArray125 != null) {
			for (local14 = 0; local14 < this.anIntArray125.length; local14++) {
				this.anIntArray125[local14] |= 0x8000;
			}
		}
		if (this.anIntArray124 != null) {
			for (local14 = 0; local14 < this.anIntArray124.length; local14++) {
				this.anIntArray124[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!wm;I)V")
	private void method1009(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString11 = arg0.method2914();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(51) byte local51;
		if (arg1 == 2) {
			local28 = arg0.method2915();
			this.aCharArray1 = new char[local28];
			this.anIntArray124 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray124[local38] = arg0.method2896();
				local51 = arg0.method2917();
				this.aCharArray1[local38] = local51 == 0 ? 0 : Static95.method5199(local51);
			}
		} else if (arg1 == 3) {
			local28 = arg0.method2915();
			this.aCharArray2 = new char[local28];
			this.anIntArray125 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray125[local38] = arg0.method2896();
				local51 = arg0.method2917();
				this.aCharArray2[local38] = local51 == 0 ? 0 : Static95.method5199(local51);
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!wm;)V")
	public void method1010(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method1009(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BC)I")
	public int method1011(@OriginalArg(1) char arg0) {
		if (this.anIntArray125 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray125.length; local20++) {
			if (this.aCharArray2[local20] == arg0) {
				return this.anIntArray125[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(CI)I")
	public int method1012(@OriginalArg(0) char arg0) {
		if (this.anIntArray124 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray124.length; local12++) {
			if (this.aCharArray1[local12] == arg0) {
				return this.anIntArray124[local12];
			}
		}
		return -1;
	}
}

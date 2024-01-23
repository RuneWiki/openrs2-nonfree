import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class8_Sub1_Sub10 extends Class8_Sub1 {

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!aj;B)V")
	public void method2274(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2334();
			if (local17 == 0) {
				return;
			}
			this.method2281(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(CB)I")
	public int method2278(@OriginalArg(0) char arg0) {
		if (this.anIntArray234 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray234.length; local14++) {
			if (this.aCharArray2[local14] == arg0) {
				return this.anIntArray234[local14];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BC)I")
	public int method2279(@OriginalArg(1) char arg0) {
		if (this.anIntArray232 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray232.length; local21++) {
			if (this.aCharArray3[local21] == arg0) {
				return this.anIntArray232[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!aj;)V")
	private void method2281(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 1) {
			this.aString102 = arg1.method2372();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(50) byte local50;
		if (arg0 == 2) {
			local20 = arg1.method2334();
			this.aCharArray3 = new char[local20];
			this.anIntArray232 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray232[local30] = arg1.method2375();
				local50 = arg1.method2374();
				this.aCharArray3[local30] = local50 == 0 ? 0 : Static274.method4077(local50);
			}
		} else if (arg0 == 3) {
			local20 = arg1.method2334();
			this.aCharArray2 = new char[local20];
			this.anIntArray234 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray234[local30] = arg1.method2375();
				local50 = arg1.method2374();
				this.aCharArray2[local30] = local50 == 0 ? 0 : Static274.method4077(local50);
			}
		} else if (arg0 != 4) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public void method2283() {
		@Pc(17) int local17;
		if (this.anIntArray234 != null) {
			for (local17 = 0; local17 < this.anIntArray234.length; local17++) {
				this.anIntArray234[local17] |= 0x8000;
			}
		}
		if (this.anIntArray232 != null) {
			for (local17 = 0; local17 < this.anIntArray232.length; local17++) {
				this.anIntArray232[local17] |= 0x8000;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "[C")
	public char[] aCharArray15;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "[C")
	public char[] aCharArray16;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BC)I")
	public int method1243(@OriginalArg(1) char arg0) {
		if (this.anIntArray169 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray169.length; local18++) {
			if (arg0 == this.aCharArray16[local18]) {
				return this.anIntArray169[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILclient!p;)V")
	private void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		if (arg0 == 1) {
			this.aString41 = arg1.method1841();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg0 == 2) {
			local15 = arg1.method1874();
			this.anIntArray169 = new int[local15];
			this.aCharArray16 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray169[local25] = arg1.method1837();
				local39 = arg1.method1892();
				this.aCharArray16[local25] = local39 == 0 ? 0 : Static259.method3916(local39);
			}
		} else if (arg0 == 3) {
			local15 = arg1.method1874();
			this.aCharArray15 = new char[local15];
			this.anIntArray168 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray168[local25] = arg1.method1837();
				local39 = arg1.method1892();
				this.aCharArray15[local25] = local39 == 0 ? 0 : Static259.method3916(local39);
			}
		} else if (arg0 == 4) {
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	public void method1246() {
		if (this.anIntArray168 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray168.length; local8++) {
				this.anIntArray168[local8] |= 0x8000;
			}
		}
		if (this.anIntArray169 != null) {
			for (@Pc(39) int local39 = 0; local39 < this.anIntArray169.length; local39++) {
				this.anIntArray169[local39] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!p;)V")
	public void method1248(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1874();
			if (local17 == 0) {
				return;
			}
			this.method1244(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(CI)I")
	public int method1249(@OriginalArg(0) char arg0) {
		if (this.anIntArray168 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray168.length; local12++) {
			if (arg0 == this.aCharArray15[local12]) {
				return this.anIntArray168[local12];
			}
		}
		return -1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class3_Sub3_Sub6 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!qh;)V")
	public void method740(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method741(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method741(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString21 = arg1.method3133();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(52) byte local52;
		if (arg0 == 2) {
			local29 = arg1.method3118();
			this.aCharArray4 = new char[local29];
			this.anIntArray88 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray88[local39] = arg1.method3109();
				local52 = arg1.method3096();
				this.aCharArray4[local39] = local52 == 0 ? 0 : Static88.method1974(local52);
			}
		} else if (arg0 == 3) {
			local29 = arg1.method3118();
			this.aCharArray3 = new char[local29];
			this.anIntArray89 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray89[local39] = arg1.method3109();
				local52 = arg1.method3096();
				this.aCharArray3[local39] = local52 == 0 ? 0 : Static88.method1974(local52);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BC)I")
	public int method742(@OriginalArg(1) char arg0) {
		if (this.anIntArray89 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray89.length; local17++) {
			if (this.aCharArray3[local17] == arg0) {
				return this.anIntArray89[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public void method744() {
		@Pc(18) int local18;
		if (this.anIntArray89 != null) {
			for (local18 = 0; local18 < this.anIntArray89.length; local18++) {
				this.anIntArray89[local18] |= 0x8000;
			}
		}
		if (this.anIntArray88 != null) {
			for (local18 = 0; local18 < this.anIntArray88.length; local18++) {
				this.anIntArray88[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(CI)I")
	public int method745(@OriginalArg(0) char arg0) {
		if (this.anIntArray88 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray88.length; local17++) {
			if (this.aCharArray4[local17] == arg0) {
				return this.anIntArray88[local17];
			}
		}
		return -1;
	}
}

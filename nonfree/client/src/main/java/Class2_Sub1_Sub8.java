import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method3514(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4240();
			if (local9 == 0) {
				return;
			}
			this.method3516(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CI)I")
	public int method3515(@OriginalArg(0) char arg0) {
		if (this.anIntArray477 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray477.length; local17++) {
			if (arg0 == this.aCharArray6[local17]) {
				return this.anIntArray477[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!lk;I)V")
	private void method3516(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString32 = arg0.method4201();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(49) byte local49;
		if (arg1 == 2) {
			local26 = arg0.method4240();
			this.anIntArray478 = new int[local26];
			this.aCharArray5 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray478[local36] = arg0.method4245();
				local49 = arg0.method4217();
				this.aCharArray5[local36] = local49 == 0 ? 0 : Static223.method3757(local49);
			}
		} else if (arg1 == 3) {
			local26 = arg0.method4240();
			this.aCharArray6 = new char[local26];
			this.anIntArray477 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray477[local36] = arg0.method4245();
				local49 = arg0.method4217();
				this.aCharArray6[local36] = local49 == 0 ? 0 : Static223.method3757(local49);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IC)I")
	public int method3520(@OriginalArg(1) char arg0) {
		if (this.anIntArray478 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray478.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray478[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
	public void method3521() {
		@Pc(14) int local14;
		if (this.anIntArray477 != null) {
			for (local14 = 0; local14 < this.anIntArray477.length; local14++) {
				this.anIntArray477[local14] |= 0x8000;
			}
		}
		if (this.anIntArray478 != null) {
			for (local14 = 0; local14 < this.anIntArray478.length; local14++) {
				this.anIntArray478[local14] |= 0x8000;
			}
		}
	}
}

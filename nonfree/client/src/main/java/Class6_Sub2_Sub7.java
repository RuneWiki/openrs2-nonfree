import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!fs", name = "A", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!fs", name = "G", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!fs", name = "K", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IC)I")
	public int method3097(@OriginalArg(1) char arg0) {
		if (this.anIntArray210 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray210.length; local12++) {
			if (arg0 == this.aCharArray4[local12]) {
				return this.anIntArray210[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(CI)I")
	public int method3098(@OriginalArg(0) char arg0) {
		if (this.anIntArray211 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray211.length; local17++) {
			if (this.aCharArray5[local17] == arg0) {
				return this.anIntArray211[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!rg;)V")
	public void method3099(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8604();
			if (local14 == 0) {
				return;
			}
			this.method3102(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method3102(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.aString36 = arg1.method8611();
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(60) byte local60;
		if (arg0 == 2) {
			local37 = arg1.method8604();
			this.aCharArray4 = new char[local37];
			this.anIntArray210 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray210[local47] = arg1.method8571();
				local60 = arg1.method8602();
				this.aCharArray4[local47] = local60 == 0 ? 0 : Static494.method7395(local60);
			}
		} else if (arg0 == 3) {
			local37 = arg1.method8604();
			this.anIntArray211 = new int[local37];
			this.aCharArray5 = new char[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray211[local47] = arg1.method8571();
				local60 = arg1.method8602();
				this.aCharArray5[local47] = local60 == 0 ? 0 : Static494.method7395(local60);
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)V")
	public void method3104() {
		@Pc(18) int local18;
		if (this.anIntArray211 != null) {
			for (local18 = 0; local18 < this.anIntArray211.length; local18++) {
				this.anIntArray211[local18] |= 0x8000;
			}
		}
		if (this.anIntArray210 != null) {
			for (local18 = 0; local18 < this.anIntArray210.length; local18++) {
				this.anIntArray210[local18] |= 0x8000;
			}
		}
	}
}

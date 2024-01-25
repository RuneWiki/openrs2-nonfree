import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class14_Sub3_Sub18 extends Class14_Sub3 {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
	public int[] anIntArray742;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
	public int[] anIntArray743;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public void method8506() {
		@Pc(10) int local10;
		if (this.anIntArray742 != null) {
			for (local10 = 0; local10 < this.anIntArray742.length; local10++) {
				this.anIntArray742[local10] |= 0x8000;
			}
		}
		if (this.anIntArray743 != null) {
			for (local10 = 0; local10 < this.anIntArray743.length; local10++) {
				this.anIntArray743[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(CI)I")
	public int method8507(@OriginalArg(0) char arg0) {
		if (this.anIntArray743 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray743.length; local20++) {
			if (arg0 == this.aCharArray6[local20]) {
				return this.anIntArray743[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZC)I")
	public int method8508(@OriginalArg(1) char arg0) {
		if (this.anIntArray742 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray742.length; local17++) {
			if (arg0 == this.aCharArray7[local17]) {
				return this.anIntArray742[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!so;IB)V")
	private void method8510(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString112 = arg0.method5898();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(57) byte local57;
		if (arg1 == 2) {
			local34 = arg0.method5866();
			this.anIntArray743 = new int[local34];
			this.aCharArray6 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray743[local44] = arg0.method5900();
				local57 = arg0.method5845();
				this.aCharArray6[local44] = local57 == 0 ? 0 : Static462.method6790(local57);
			}
		} else if (arg1 == 3) {
			local34 = arg0.method5866();
			this.aCharArray7 = new char[local34];
			this.anIntArray742 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray742[local44] = arg0.method5900();
				local57 = arg0.method5845();
				this.aCharArray7[local44] = local57 == 0 ? 0 : Static462.method6790(local57);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!so;)V")
	public void method8511(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5866();
			if (local17 == 0) {
				return;
			}
			this.method8510(arg0, local17);
		}
	}
}

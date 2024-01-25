import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "[I")
	public int[] anIntArray590;

	@OriginalMember(owner = "client!tm", name = "K", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(CB)I")
	public int method5454(@OriginalArg(0) char arg0) {
		if (this.anIntArray590 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray590.length; local18++) {
			if (this.aCharArray4[local18] == arg0) {
				return this.anIntArray590[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!rg;)V")
	public void method5455(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5115();
			if (local13 == 0) {
				return;
			}
			this.method5458(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(CB)I")
	public int method5456(@OriginalArg(0) char arg0) {
		if (this.anIntArray589 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray589.length; local18++) {
			if (arg0 == this.aCharArray5[local18]) {
				return this.anIntArray589[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
	public void method5457() {
		@Pc(8) int local8;
		if (this.anIntArray589 != null) {
			for (local8 = 0; local8 < this.anIntArray589.length; local8++) {
				this.anIntArray589[local8] |= 0x8000;
			}
		}
		if (this.anIntArray590 != null) {
			for (local8 = 0; local8 < this.anIntArray590.length; local8++) {
				this.anIntArray590[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method5458(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString58 = arg0.method5064();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(46) byte local46;
		if (arg1 == 2) {
			local24 = arg0.method5115();
			this.aCharArray4 = new char[local24];
			this.anIntArray590 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray590[local34] = arg0.method5106();
				local46 = arg0.method5098();
				this.aCharArray4[local34] = local46 == 0 ? 0 : Static224.method4079(local46);
			}
		} else if (arg1 == 3) {
			local24 = arg0.method5115();
			this.aCharArray5 = new char[local24];
			this.anIntArray589 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray589[local34] = arg0.method5106();
				local46 = arg0.method5098();
				this.aCharArray5[local34] = local46 == 0 ? 0 : Static224.method4079(local46);
			}
		}
	}
}

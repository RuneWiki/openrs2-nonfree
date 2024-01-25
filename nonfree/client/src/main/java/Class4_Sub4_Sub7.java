import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(CZ)I")
	public int method2989(@OriginalArg(0) char arg0) {
		if (this.anIntArray282 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray282.length; local17++) {
			if (arg0 == this.aCharArray7[local17]) {
				return this.anIntArray282[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!lf;)V")
	public void method2990(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3440();
			if (local13 == 0) {
				return;
			}
			this.method2991(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!lf;)V")
	private void method2991(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString31 = arg1.method3446();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(48) byte local48;
		if (arg0 == 2) {
			local25 = arg1.method3440();
			this.anIntArray281 = new int[local25];
			this.aCharArray6 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray281[local35] = arg1.method3401();
				local48 = arg1.method3426();
				this.aCharArray6[local35] = local48 == 0 ? 0 : Static36.method745(local48);
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		local25 = arg1.method3440();
		this.anIntArray282 = new int[local25];
		this.aCharArray7 = new char[local25];
		for (local35 = 0; local35 < local25; local35++) {
			this.anIntArray282[local35] = arg1.method3401();
			local48 = arg1.method3426();
			this.aCharArray7[local35] = local48 == 0 ? 0 : Static36.method745(local48);
		}
		return;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IC)I")
	public int method2994(@OriginalArg(1) char arg0) {
		if (this.anIntArray281 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray281.length; local12++) {
			if (this.aCharArray6[local12] == arg0) {
				return this.anIntArray281[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method2995() {
		@Pc(10) int local10;
		if (this.anIntArray282 != null) {
			for (local10 = 0; local10 < this.anIntArray282.length; local10++) {
				this.anIntArray282[local10] |= 0x8000;
			}
		}
		if (this.anIntArray281 != null) {
			for (local10 = 0; local10 < this.anIntArray281.length; local10++) {
				this.anIntArray281[local10] |= 0x8000;
			}
		}
	}
}

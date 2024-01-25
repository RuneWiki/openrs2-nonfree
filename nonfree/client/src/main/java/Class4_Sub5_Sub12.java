import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class4_Sub5_Sub12 extends Class4_Sub5 {

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public void method5567() {
		@Pc(16) int local16;
		if (this.anIntArray339 != null) {
			for (local16 = 0; local16 < this.anIntArray339.length; local16++) {
				this.anIntArray339[local16] |= 0x8000;
			}
		}
		if (this.anIntArray340 != null) {
			for (local16 = 0; local16 < this.anIntArray340.length; local16++) {
				this.anIntArray340[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!un;I)V")
	private void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString69 = arg1.method4920();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(38) byte local38;
		if (arg0 == 2) {
			local13 = arg1.method4905();
			this.anIntArray340 = new int[local13];
			this.aCharArray6 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray340[local23] = arg1.method4936();
				local38 = arg1.method4925();
				this.aCharArray6[local23] = local38 == 0 ? 0 : Static103.method2211(local38);
			}
		} else if (arg0 == 3) {
			local13 = arg1.method4905();
			this.anIntArray339 = new int[local13];
			this.aCharArray5 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray339[local23] = arg1.method4936();
				local38 = arg1.method4925();
				this.aCharArray5[local23] = local38 == 0 ? 0 : Static103.method2211(local38);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BC)I")
	public int method5569(@OriginalArg(1) char arg0) {
		if (this.anIntArray340 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray340.length; local18++) {
			if (this.aCharArray6[local18] == arg0) {
				return this.anIntArray340[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(CB)I")
	public int method5571(@OriginalArg(0) char arg0) {
		if (this.anIntArray339 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray339.length; local20++) {
			if (arg0 == this.aCharArray5[local20]) {
				return this.anIntArray339[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!un;)V")
	public void method5574(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method5568(local5, arg0);
		}
	}
}

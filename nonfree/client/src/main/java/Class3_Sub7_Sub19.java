import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class3_Sub7_Sub19 extends Class3_Sub7 {

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "[I")
	public int[] anIntArray588;

	@OriginalMember(owner = "client!vr", name = "C", descriptor = "[C")
	public char[] aCharArray17;

	@OriginalMember(owner = "client!vr", name = "F", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!vr", name = "H", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!vr", name = "J", descriptor = "[C")
	public char[] aCharArray18;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(CI)I")
	public int method7617(@OriginalArg(0) char arg0) {
		if (this.anIntArray589 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray589.length; local19++) {
			if (arg0 == this.aCharArray18[local19]) {
				return this.anIntArray589[local19];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLclient!np;)V")
	public void method7618(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5175();
			if (local13 == 0) {
				return;
			}
			this.method7619(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILclient!np;)V")
	private void method7619(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString86 = arg1.method5181();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg0 == 2) {
			local24 = arg1.method5175();
			this.aCharArray18 = new char[local24];
			this.anIntArray589 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray589[local34] = arg1.method5198();
				local47 = arg1.method5212();
				this.aCharArray18[local34] = local47 == 0 ? 0 : Static231.method3591(local47);
			}
		} else if (arg0 == 3) {
			local24 = arg1.method5175();
			this.aCharArray17 = new char[local24];
			this.anIntArray588 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray588[local34] = arg1.method5198();
				local47 = arg1.method5212();
				this.aCharArray17[local34] = local47 == 0 ? 0 : Static231.method3591(local47);
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(CB)I")
	public int method7621(@OriginalArg(0) char arg0) {
		if (this.anIntArray588 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray588.length; local12++) {
			if (arg0 == this.aCharArray17[local12]) {
				return this.anIntArray588[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V")
	public void method7623() {
		@Pc(6) int local6;
		if (this.anIntArray588 != null) {
			for (local6 = 0; local6 < this.anIntArray588.length; local6++) {
				this.anIntArray588[local6] |= 0x8000;
			}
		}
		if (this.anIntArray589 != null) {
			for (local6 = 0; local6 < this.anIntArray589.length; local6++) {
				this.anIntArray589[local6] |= 0x8000;
			}
		}
	}
}

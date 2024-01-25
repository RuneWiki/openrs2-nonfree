import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class3_Sub4_Sub21 extends Class3_Sub4 {

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "[I")
	public int[] anIntArray596;

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IC)I")
	public int method8851(@OriginalArg(1) char arg0) {
		if (this.anIntArray595 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray595.length; local21++) {
			if (arg0 == this.aCharArray4[local21]) {
				return this.anIntArray595[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V")
	public void method8852() {
		@Pc(18) int local18;
		if (this.anIntArray595 != null) {
			for (local18 = 0; local18 < this.anIntArray595.length; local18++) {
				this.anIntArray595[local18] |= 0x8000;
			}
		}
		if (this.anIntArray596 != null) {
			for (local18 = 0; local18 < this.anIntArray596.length; local18++) {
				this.anIntArray596[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BC)I")
	public int method8853(@OriginalArg(1) char arg0) {
		if (this.anIntArray596 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray596.length; local21++) {
			if (arg0 == this.aCharArray5[local21]) {
				return this.anIntArray596[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method8855(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5322(-56);
			if (local11 == 0) {
				return;
			}
			this.method8856(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!rba;I)V")
	private void method8856(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString128 = arg0.method5295();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(38) byte local38;
		if (arg1 == 2) {
			local13 = arg0.method5322(-101);
			this.anIntArray596 = new int[local13];
			this.aCharArray5 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray596[local23] = arg0.method5272();
				local38 = arg0.method5288();
				this.aCharArray5[local23] = local38 == 0 ? 0 : Static265.method4094(local38);
			}
		} else if (arg1 == 3) {
			local13 = arg0.method5322(-47);
			this.anIntArray595 = new int[local13];
			this.aCharArray4 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray595[local23] = arg0.method5272();
				local38 = arg0.method5288();
				this.aCharArray4[local23] = local38 == 0 ? 0 : Static265.method4094(local38);
			}
		}
	}
}

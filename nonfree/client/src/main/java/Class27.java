import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class27 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "Lclient!gq;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "[I")
	private final int[] anIntArray47 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class15(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Lclient!mb;")
	public Class166 method466() {
		if (this.anIntArray48 == null) {
			return null;
		}
		@Pc(15) Class166[] local15 = new Class166[this.anIntArray48.length];
		@Pc(19) Class211 local19 = this.aClass101_1.aClass211_38;
		@Pc(23) int local23;
		synchronized (this.aClass101_1.aClass211_38) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray48.length) {
					break;
				}
				local15[local23] = Static305.method3992(this.anIntArray48[local23], this.aClass101_1.aClass211_38);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray48.length; local56++) {
			if (local15[local56].anInt4010 < 13) {
				local15[local56].method3203();
			}
		}
		@Pc(92) Class166 local92;
		if (local15.length == 1) {
			local92 = local15[0];
		} else {
			local92 = new Class166(local15, local15.length);
		}
		if (local92 == null) {
			return null;
		}
		if (this.aShortArray6 != null) {
			for (local23 = 0; local23 < this.aShortArray6.length; local23++) {
				local92.method3194(this.aShortArray8[local23], this.aShortArray6[local23]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local23 = 0; local23 < this.aShortArray5.length; local23++) {
				local92.method3191(this.aShortArray5[local23], this.aShortArray7[local23]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!fh;B)V")
	private void method467(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			arg1.method5007();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local32 = arg1.method5007();
			this.anIntArray48 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray48[local42] = arg1.method5028();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local32 = arg1.method5007();
				this.aShortArray6 = new short[local32];
				this.aShortArray8 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray6[local42] = (short) arg1.method5028();
					this.aShortArray8[local42] = (short) arg1.method5028();
				}
			} else if (arg0 == 41) {
				local32 = arg1.method5007();
				this.aShortArray5 = new short[local32];
				this.aShortArray7 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray5[local42] = (short) arg1.method5028();
					this.aShortArray7[local42] = (short) arg1.method5028();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray47[arg0 - 60] = arg1.method5028();
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Z")
	public boolean method469() {
		if (this.anIntArray48 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class211 local16 = this.aClass101_1.aClass211_38;
		synchronized (this.aClass101_1.aClass211_38) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray48.length; local20++) {
				if (!this.aClass101_1.aClass211_38.method4367(this.anIntArray48[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Lclient!mb;")
	public Class166 method470() {
		@Pc(8) Class166[] local8 = new Class166[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class211 local14 = this.aClass101_1.aClass211_38;
		@Pc(18) int local18;
		synchronized (this.aClass101_1.aClass211_38) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray47[local18] != -1) {
					local8[local10++] = Static305.method3992(this.anIntArray47[local18], this.aClass101_1.aClass211_38);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt4010 < 13) {
				local8[local55].method3203();
			}
		}
		@Pc(85) Class166 local85 = new Class166(local8, local10);
		if (this.aShortArray6 != null) {
			for (local18 = 0; local18 < this.aShortArray6.length; local18++) {
				local85.method3194(this.aShortArray8[local18], this.aShortArray6[local18]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local18 = 0; local18 < this.aShortArray5.length; local18++) {
				local85.method3191(this.aShortArray5[local18], this.aShortArray7[local18]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method472(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5007();
			if (local17 == 0) {
				return;
			}
			this.method467(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)Z")
	public boolean method473() {
		@Pc(13) boolean local13 = true;
		@Pc(17) Class211 local17 = this.aClass101_1.aClass211_38;
		synchronized (this.aClass101_1.aClass211_38) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray47[local21] != -1 && !this.aClass101_1.aClass211_38.method4367(this.anIntArray47[local21], 0)) {
					local13 = false;
				}
			}
			return local13;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class300 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!sg;")
	public Class285 aClass285_1;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[S")
	private short[] aShortArray152;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "[S")
	private short[] aShortArray153;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
	private int[] anIntArray776;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
	private final int[] anIntArray775 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lclient!qda;")
	public Class260 method7371() {
		@Pc(8) Class260[] local8 = new Class260[5];
		@Pc(10) int local10 = 0;
		@Pc(21) Class168 local21 = this.aClass285_1.aClass168_106;
		@Pc(25) int local25;
		synchronized (this.aClass285_1.aClass168_106) {
			local25 = 0;
			while (true) {
				if (local25 >= 5) {
					break;
				}
				if (this.anIntArray775[local25] != -1) {
					local8[local10++] = Static198.method3731(this.anIntArray775[local25], this.aClass285_1.aClass168_106);
				}
				local25++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < 5; local62++) {
			if (local8[local62] != null && local8[local62].anInt7693 < 13) {
				local8[local62].method6423();
			}
		}
		@Pc(92) Class260 local92 = new Class260(local8, local10);
		if (this.aShortArray152 != null) {
			for (local25 = 0; local25 < this.aShortArray152.length; local25++) {
				local92.method6422(this.aShortArray152[local25], this.aShortArray153[local25]);
			}
		}
		if (this.aShortArray155 != null) {
			for (local25 = 0; local25 < this.aShortArray155.length; local25++) {
				local92.method6433(this.aShortArray154[local25], this.aShortArray155[local25]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Z")
	public boolean method7372() {
		if (this.anIntArray776 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class168 local16 = this.aClass285_1.aClass168_106;
		synchronized (this.aClass285_1.aClass168_106) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray776.length; local20++) {
				if (!this.aClass285_1.aClass168_106.method4455(this.anIntArray776[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
	public boolean method7373() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class168 local11 = this.aClass285_1.aClass168_106;
		synchronized (this.aClass285_1.aClass168_106) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray775[local15] != -1 && !this.aClass285_1.aClass168_106.method4455(this.anIntArray775[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!iaa;I)V")
	private void method7374(@OriginalArg(1) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4966();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 2) {
			local15 = arg0.method4966();
			this.anIntArray776 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray776[local21] = arg0.method4999();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local15 = arg0.method4966();
				this.aShortArray153 = new short[local15];
				this.aShortArray152 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray152[local21] = (short) arg0.method4999();
					this.aShortArray153[local21] = (short) arg0.method4999();
				}
			} else if (arg1 == 41) {
				local15 = arg0.method4966();
				this.aShortArray154 = new short[local15];
				this.aShortArray155 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray155[local21] = (short) arg0.method4999();
					this.aShortArray154[local21] = (short) arg0.method4999();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray775[arg1 - 60] = arg0.method4999();
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lclient!qda;")
	public Class260 method7375() {
		if (this.anIntArray776 == null) {
			return null;
		}
		@Pc(15) Class260[] local15 = new Class260[this.anIntArray776.length];
		@Pc(19) Class168 local19 = this.aClass285_1.aClass168_106;
		@Pc(23) int local23;
		synchronized (this.aClass285_1.aClass168_106) {
			local23 = 0;
			while (true) {
				if (this.anIntArray776.length <= local23) {
					break;
				}
				local15[local23] = Static198.method3731(this.anIntArray776[local23], this.aClass285_1.aClass168_106);
				local23++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < this.anIntArray776.length; local62++) {
			if (local15[local62].anInt7693 < 13) {
				local15[local62].method6423();
			}
		}
		@Pc(98) Class260 local98;
		if (local15.length == 1) {
			local98 = local15[0];
		} else {
			local98 = new Class260(local15, local15.length);
		}
		if (local98 == null) {
			return null;
		}
		if (this.aShortArray152 != null) {
			for (local23 = 0; local23 < this.aShortArray152.length; local23++) {
				local98.method6422(this.aShortArray152[local23], this.aShortArray153[local23]);
			}
		}
		if (this.aShortArray155 != null) {
			for (local23 = 0; local23 < this.aShortArray155.length; local23++) {
				local98.method6433(this.aShortArray154[local23], this.aShortArray155[local23]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!iaa;)V")
	public void method7376(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4966();
			if (local13 == 0) {
				return;
			}
			this.method7374(arg0, local13);
		}
	}
}

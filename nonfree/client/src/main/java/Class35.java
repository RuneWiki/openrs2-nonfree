import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class35 {

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Lclient!io;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "[I")
	private final int[] anIntArray40 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Lclient!lo;")
	public Class155 method521() {
		@Pc(8) Class155[] local8 = new Class155[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class109 local19 = this.aClass122_1.aClass109_41;
		@Pc(23) int local23;
		synchronized (this.aClass122_1.aClass109_41) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray40[local23] != -1) {
					local8[local15++] = Static106.method1704(this.anIntArray40[local23], this.aClass122_1.aClass109_41);
				}
				local23++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt4075 < 13) {
				local8[local60].method3405();
			}
		}
		@Pc(90) Class155 local90 = new Class155(local8, local15);
		if (this.aShortArray8 != null) {
			for (local23 = 0; local23 < this.aShortArray8.length; local23++) {
				local90.method3402(this.aShortArray7[local23], this.aShortArray8[local23]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local23 = 0; local23 < this.aShortArray5.length; local23++) {
				local90.method3389(this.aShortArray5[local23], this.aShortArray6[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method522(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			arg1.method4548();
			return;
		}
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (arg0 == 2) {
			local53 = arg1.method4548();
			this.anIntArray41 = new int[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.anIntArray41[local63] = arg1.method4498();
			}
		} else if (arg0 != 3) {
			if (arg0 != 40) {
				if (arg0 == 41) {
					local53 = arg1.method4548();
					this.aShortArray5 = new short[local53];
					this.aShortArray6 = new short[local53];
					for (local63 = 0; local63 < local53; local63++) {
						this.aShortArray5[local63] = (short) arg1.method4498();
						this.aShortArray6[local63] = (short) arg1.method4498();
					}
				} else if (arg0 >= 60 && arg0 < 70) {
					this.anIntArray40[arg0 - 60] = arg1.method4498();
					return;
				}
				return;
			}
			local53 = arg1.method4548();
			this.aShortArray7 = new short[local53];
			this.aShortArray8 = new short[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.aShortArray8[local63] = (short) arg1.method4498();
				this.aShortArray7[local63] = (short) arg1.method4498();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Z")
	public boolean method523() {
		if (this.anIntArray41 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class109 local16 = this.aClass122_1.aClass109_41;
		synchronized (this.aClass122_1.aClass109_41) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray41.length; local20++) {
				if (!this.aClass122_1.aClass109_41.method2354(this.anIntArray41[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z")
	public boolean method524() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class109 local11 = this.aClass122_1.aClass109_41;
		synchronized (this.aClass122_1.aClass109_41) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray40[local15] != -1 && !this.aClass122_1.aClass109_41.method2354(this.anIntArray40[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Lclient!lo;")
	public Class155 method525() {
		if (this.anIntArray41 == null) {
			return null;
		}
		@Pc(15) Class155[] local15 = new Class155[this.anIntArray41.length];
		@Pc(19) Class109 local19 = this.aClass122_1.aClass109_41;
		synchronized (this.aClass122_1.aClass109_41) {
			@Pc(32) int local32 = 0;
			while (true) {
				if (local32 >= this.anIntArray41.length) {
					break;
				}
				local15[local32] = Static106.method1704(this.anIntArray41[local32], this.aClass122_1.aClass109_41);
				local32++;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anIntArray41.length; local65++) {
			if (local15[local65].anInt4075 < 13) {
				local15[local65].method3405();
			}
		}
		@Pc(98) Class155 local98;
		if (local15.length == 1) {
			local98 = local15[0];
		} else {
			local98 = new Class155(local15, local15.length);
		}
		if (local98 == null) {
			return null;
		}
		@Pc(112) int local112;
		if (this.aShortArray8 != null) {
			for (local112 = 0; local112 < this.aShortArray8.length; local112++) {
				local98.method3402(this.aShortArray7[local112], this.aShortArray8[local112]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local112 = 0; local112 < this.aShortArray5.length; local112++) {
				local98.method3389(this.aShortArray5[local112], this.aShortArray6[local112]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method526(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method522(local13, arg0);
		}
	}
}

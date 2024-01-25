import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class115 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!wh;")
	public Class386 aClass386_1;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
	private final int[] anIntArray322 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method3450(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8632();
			if (local9 == 0) {
				return;
			}
			this.method3451(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILclient!jp;)V")
	private void method3451(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			arg1.method8632();
			return;
		}
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 2) {
			local11 = arg1.method8632();
			this.anIntArray321 = new int[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray321[local17] = arg1.method8593();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local11 = arg1.method8632();
				this.aShortArray47 = new short[local11];
				this.aShortArray49 = new short[local11];
				for (local17 = 0; local17 < local11; local17++) {
					this.aShortArray49[local17] = (short) arg1.method8593();
					this.aShortArray47[local17] = (short) arg1.method8593();
				}
			} else if (arg0 == 41) {
				local11 = arg1.method8632();
				this.aShortArray48 = new short[local11];
				this.aShortArray46 = new short[local11];
				for (local17 = 0; local17 < local11; local17++) {
					this.aShortArray46[local17] = (short) arg1.method8593();
					this.aShortArray48[local17] = (short) arg1.method8593();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray322[arg0 - 60] = arg1.method8593();
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	public boolean method3452() {
		if (this.anIntArray321 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class15 local16 = this.aClass386_1.aClass15_164;
		synchronized (this.aClass386_1.aClass15_164) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray321.length; local26++) {
				if (!this.aClass386_1.aClass15_164.method542(0, this.anIntArray321[local26])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Lclient!gfa;")
	public Class117 method3456() {
		@Pc(8) Class117[] local8 = new Class117[5];
		@Pc(16) int local16 = 0;
		@Pc(20) Class15 local20 = this.aClass386_1.aClass15_164;
		@Pc(24) int local24;
		synchronized (this.aClass386_1.aClass15_164) {
			local24 = 0;
			while (true) {
				if (local24 >= 5) {
					break;
				}
				if (this.anIntArray322[local24] != -1) {
					local8[local16++] = Static98.method1747(this.aClass386_1.aClass15_164, this.anIntArray322[local24]);
				}
				local24++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < 5; local58++) {
			if (local8[local58] != null && local8[local58].anInt3824 < 13) {
				local8[local58].method3478();
			}
		}
		@Pc(88) Class117 local88 = new Class117(local8, local16);
		if (this.aShortArray49 != null) {
			for (local24 = 0; local24 < this.aShortArray49.length; local24++) {
				local88.method3496(this.aShortArray47[local24], this.aShortArray49[local24]);
			}
		}
		if (this.aShortArray46 != null) {
			for (local24 = 0; local24 < this.aShortArray46.length; local24++) {
				local88.method3484(this.aShortArray48[local24], this.aShortArray46[local24]);
			}
		}
		return local88;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
	public boolean method3457() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class15 local11 = this.aClass386_1.aClass15_164;
		synchronized (this.aClass386_1.aClass15_164) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray322[local15] != -1 && !this.aClass386_1.aClass15_164.method542(0, this.anIntArray322[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Lclient!gfa;")
	public Class117 method3458() {
		if (this.anIntArray321 == null) {
			return null;
		}
		@Pc(15) Class117[] local15 = new Class117[this.anIntArray321.length];
		@Pc(19) Class15 local19 = this.aClass386_1.aClass15_164;
		@Pc(23) int local23;
		synchronized (this.aClass386_1.aClass15_164) {
			local23 = 0;
			while (true) {
				if (this.anIntArray321.length <= local23) {
					break;
				}
				local15[local23] = Static98.method1747(this.aClass386_1.aClass15_164, this.anIntArray321[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray321.length; local52++) {
			if (local15[local52].anInt3824 < 13) {
				local15[local52].method3478();
			}
		}
		@Pc(88) Class117 local88;
		if (local15.length == 1) {
			local88 = local15[0];
		} else {
			local88 = new Class117(local15, local15.length);
		}
		if (local88 == null) {
			return null;
		}
		if (this.aShortArray49 != null) {
			for (local23 = 0; local23 < this.aShortArray49.length; local23++) {
				local88.method3496(this.aShortArray47[local23], this.aShortArray49[local23]);
			}
		}
		if (this.aShortArray46 != null) {
			for (local23 = 0; local23 < this.aShortArray46.length; local23++) {
				local88.method3484(this.aShortArray48[local23], this.aShortArray46[local23]);
			}
		}
		return local88;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class325 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Lclient!jf;")
	public Class177 aClass177_1;

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "[I")
	private int[] anIntArray646;

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "[I")
	private final int[] anIntArray645 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method7487(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2859();
			if (local7 == 0) {
				return;
			}
			this.method7493(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lclient!lga;")
	public Class212 method7488() {
		if (this.anIntArray646 == null) {
			return null;
		}
		@Pc(20) Class212[] local20 = new Class212[this.anIntArray646.length];
		@Pc(24) Class238 local24 = this.aClass177_1.aClass238_120;
		@Pc(28) int local28;
		synchronized (this.aClass177_1.aClass238_120) {
			local28 = 0;
			while (true) {
				if (local28 >= this.anIntArray646.length) {
					break;
				}
				local20[local28] = Static532.method7368(this.aClass177_1.aClass238_120, this.anIntArray646[local28]);
				local28++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray646.length; local60++) {
			if (local20[local60].anInt5662 < 13) {
				local20[local60].method4920();
			}
		}
		@Pc(92) Class212 local92;
		if (local20.length == 1) {
			local92 = local20[0];
		} else {
			local92 = new Class212(local20, local20.length);
		}
		if (local92 == null) {
			return null;
		}
		if (this.aShortArray132 != null) {
			for (local28 = 0; local28 < this.aShortArray132.length; local28++) {
				local92.method4915(this.aShortArray133[local28], this.aShortArray132[local28]);
			}
		}
		if (this.aShortArray134 != null) {
			for (local28 = 0; local28 < this.aShortArray134.length; local28++) {
				local92.method4928(this.aShortArray131[local28], this.aShortArray134[local28]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Z")
	public boolean method7489() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class238 local9 = this.aClass177_1.aClass238_120;
		synchronized (this.aClass177_1.aClass238_120) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray645[local13] != -1 && !this.aClass177_1.aClass238_120.method5571(0, this.anIntArray645[local13])) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Lclient!lga;")
	public Class212 method7490() {
		@Pc(6) Class212[] local6 = new Class212[5];
		@Pc(8) int local8 = 0;
		@Pc(12) Class238 local12 = this.aClass177_1.aClass238_120;
		@Pc(16) int local16;
		synchronized (this.aClass177_1.aClass238_120) {
			local16 = 0;
			while (true) {
				if (local16 >= 5) {
					break;
				}
				if (this.anIntArray645[local16] != -1) {
					local6[local8++] = Static532.method7368(this.aClass177_1.aClass238_120, this.anIntArray645[local16]);
				}
				local16++;
			}
		}
		for (@Pc(51) int local51 = 0; local51 < 5; local51++) {
			if (local6[local51] != null && local6[local51].anInt5662 < 13) {
				local6[local51].method4920();
			}
		}
		@Pc(87) Class212 local87 = new Class212(local6, local8);
		if (this.aShortArray132 != null) {
			for (local16 = 0; local16 < this.aShortArray132.length; local16++) {
				local87.method4915(this.aShortArray133[local16], this.aShortArray132[local16]);
			}
		}
		if (this.aShortArray134 != null) {
			for (local16 = 0; local16 < this.aShortArray134.length; local16++) {
				local87.method4928(this.aShortArray131[local16], this.aShortArray134[local16]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)Z")
	public boolean method7492() {
		if (this.anIntArray646 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class238 local14 = this.aClass177_1.aClass238_120;
		synchronized (this.aClass177_1.aClass238_120) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray646.length; local18++) {
				if (!this.aClass177_1.aClass238_120.method5571(0, this.anIntArray646[local18])) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!sl;I)V")
	private void method7493(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method2859();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (arg1 == 2) {
			local33 = arg0.method2859();
			this.anIntArray646 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray646[local43] = arg0.method2825();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local33 = arg0.method2859();
				this.aShortArray132 = new short[local33];
				this.aShortArray133 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray132[local43] = (short) arg0.method2825();
					this.aShortArray133[local43] = (short) arg0.method2825();
				}
			} else if (arg1 == 41) {
				local33 = arg0.method2859();
				this.aShortArray131 = new short[local33];
				this.aShortArray134 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray134[local43] = (short) arg0.method2825();
					this.aShortArray131[local43] = (short) arg0.method2825();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray645[arg1 - 60] = arg0.method2825();
			}
		}
	}
}

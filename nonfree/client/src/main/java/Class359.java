import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class359 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "[I")
	private int[] anIntArray661;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!fg;")
	public Class107 aClass107_2;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "[I")
	private final int[] anIntArray662 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
	public boolean method8482() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class8 local11 = this.aClass107_2.aClass8_47;
		synchronized (this.aClass107_2.aClass8_47) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray662[local21] != -1 && !this.aClass107_2.aClass8_47.method275(0, this.anIntArray662[local21])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lclient!ao;")
	public Class22 method8485() {
		@Pc(8) Class22[] local8 = new Class22[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class8 local14 = this.aClass107_2.aClass8_47;
		@Pc(18) int local18;
		synchronized (this.aClass107_2.aClass8_47) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray662[local18] != -1) {
					local8[local10++] = Static308.method4413(this.anIntArray662[local18], this.aClass107_2.aClass8_47);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt512 < 13) {
				local8[local53].method534();
			}
		}
		@Pc(81) Class22 local81 = new Class22(local8, local10);
		if (this.aShortArray143 != null) {
			for (local18 = 0; local18 < this.aShortArray143.length; local18++) {
				local81.method542(this.aShortArray140[local18], this.aShortArray143[local18]);
			}
		}
		if (this.aShortArray141 != null) {
			for (local18 = 0; local18 < this.aShortArray141.length; local18++) {
				local81.method538(this.aShortArray142[local18], this.aShortArray141[local18]);
			}
		}
		return local81;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)Z")
	public boolean method8486() {
		if (this.anIntArray661 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		@Pc(22) Class8 local22 = this.aClass107_2.aClass8_47;
		synchronized (this.aClass107_2.aClass8_47) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray661.length; local26++) {
				if (!this.aClass107_2.aClass8_47.method275(0, this.anIntArray661[local26])) {
					local18 = false;
				}
			}
			return local18;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZLclient!gga;)V")
	private void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			arg1.method8374();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg0 == 2) {
			local26 = arg1.method8374();
			this.anIntArray661 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray661[local36] = arg1.method8363();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local26 = arg1.method8374();
				this.aShortArray140 = new short[local26];
				this.aShortArray143 = new short[local26];
				for (local36 = 0; local36 < local26; local36++) {
					this.aShortArray143[local36] = (short) arg1.method8363();
					this.aShortArray140[local36] = (short) arg1.method8363();
				}
			} else if (arg0 == 41) {
				local26 = arg1.method8374();
				this.aShortArray142 = new short[local26];
				this.aShortArray141 = new short[local26];
				for (local36 = 0; local36 < local26; local36++) {
					this.aShortArray141[local36] = (short) arg1.method8363();
					this.aShortArray142[local36] = (short) arg1.method8363();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray662[arg0 - 60] = arg1.method8363();
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Lclient!ao;")
	public Class22 method8488() {
		if (this.anIntArray661 == null) {
			return null;
		}
		@Pc(15) Class22[] local15 = new Class22[this.anIntArray661.length];
		@Pc(19) Class8 local19 = this.aClass107_2.aClass8_47;
		@Pc(23) int local23;
		synchronized (this.aClass107_2.aClass8_47) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray661.length) {
					break;
				}
				local15[local23] = Static308.method4413(this.anIntArray661[local23], this.aClass107_2.aClass8_47);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray661.length; local56++) {
			if (local15[local56].anInt512 < 13) {
				local15[local56].method534();
			}
		}
		@Pc(91) Class22 local91;
		if (local15.length == 1) {
			local91 = local15[0];
		} else {
			local91 = new Class22(local15, local15.length);
		}
		if (local91 == null) {
			return null;
		}
		if (this.aShortArray143 != null) {
			for (local23 = 0; local23 < this.aShortArray143.length; local23++) {
				local91.method542(this.aShortArray140[local23], this.aShortArray143[local23]);
			}
		}
		if (this.aShortArray141 != null) {
			for (local23 = 0; local23 < this.aShortArray141.length; local23++) {
				local91.method538(this.aShortArray142[local23], this.aShortArray141[local23]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!gga;Z)V")
	public void method8491(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method8487(local5, arg0);
		}
	}
}

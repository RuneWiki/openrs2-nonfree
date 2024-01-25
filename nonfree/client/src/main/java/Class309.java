import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class309 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!ea;")
	public Class78 aClass78_2;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
	private int[] anIntArray682;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
	private final int[] anIntArray681 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	public boolean method7741() {
		if (this.anIntArray682 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class16 local16 = this.aClass78_2.aClass16_24;
		synchronized (this.aClass78_2.aClass16_24) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray682.length; local20++) {
				if (!this.aClass78_2.aClass16_24.method397(this.anIntArray682[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Lclient!ln;")
	public Class192 method7742() {
		if (this.anIntArray682 == null) {
			return null;
		}
		@Pc(15) Class192[] local15 = new Class192[this.anIntArray682.length];
		@Pc(19) Class16 local19 = this.aClass78_2.aClass16_24;
		@Pc(30) int local30;
		synchronized (this.aClass78_2.aClass16_24) {
			local30 = 0;
			while (true) {
				if (this.anIntArray682.length <= local30) {
					break;
				}
				local15[local30] = Static510.method7591(this.anIntArray682[local30], this.aClass78_2.aClass16_24);
				local30++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anIntArray682.length; local63++) {
			if (local15[local63].anInt5552 < 13) {
				local15[local63].method4657();
			}
		}
		@Pc(93) Class192 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class192(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray139 != null) {
			for (local30 = 0; local30 < this.aShortArray139.length; local30++) {
				local93.method4669(this.aShortArray139[local30], this.aShortArray138[local30]);
			}
		}
		if (this.aShortArray140 != null) {
			for (local30 = 0; local30 < this.aShortArray140.length; local30++) {
				local93.method4667(this.aShortArray137[local30], this.aShortArray140[local30]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILclient!daa;)V")
	private void method7745(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			arg1.method5216();
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method5216();
			this.anIntArray682 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray682[local26] = arg1.method5199();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local20 = arg1.method5216();
				this.aShortArray138 = new short[local20];
				this.aShortArray139 = new short[local20];
				for (local26 = 0; local26 < local20; local26++) {
					this.aShortArray139[local26] = (short) arg1.method5199();
					this.aShortArray138[local26] = (short) arg1.method5199();
				}
			} else if (arg0 == 41) {
				local20 = arg1.method5216();
				this.aShortArray140 = new short[local20];
				this.aShortArray137 = new short[local20];
				for (local26 = 0; local26 < local20; local26++) {
					this.aShortArray140[local26] = (short) arg1.method5199();
					this.aShortArray137[local26] = (short) arg1.method5199();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray681[arg0 - 60] = arg1.method5199();
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!daa;)V")
	public void method7746(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method7745(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Lclient!ln;")
	public Class192 method7748() {
		@Pc(8) Class192[] local8 = new Class192[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class16 local14 = this.aClass78_2.aClass16_24;
		@Pc(26) int local26;
		synchronized (this.aClass78_2.aClass16_24) {
			local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray681[local26] != -1) {
					local8[local10++] = Static510.method7591(this.anIntArray681[local26], this.aClass78_2.aClass16_24);
				}
				local26++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < 5; local63++) {
			if (local8[local63] != null && local8[local63].anInt5552 < 13) {
				local8[local63].method4657();
			}
		}
		@Pc(93) Class192 local93 = new Class192(local8, local10);
		if (this.aShortArray139 != null) {
			for (local26 = 0; local26 < this.aShortArray139.length; local26++) {
				local93.method4669(this.aShortArray139[local26], this.aShortArray138[local26]);
			}
		}
		if (this.aShortArray140 != null) {
			for (local26 = 0; local26 < this.aShortArray140.length; local26++) {
				local93.method4667(this.aShortArray137[local26], this.aShortArray140[local26]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z")
	public boolean method7750() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class16 local11 = this.aClass78_2.aClass16_24;
		synchronized (this.aClass78_2.aClass16_24) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray681[local15] != -1 && !this.aClass78_2.aClass16_24.method397(this.anIntArray681[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}

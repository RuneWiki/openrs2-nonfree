import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class178 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[S")
	private short[] aShortArray180;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!in;")
	public Class109 aClass109_1;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[S")
	private short[] aShortArray181;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "[S")
	private short[] aShortArray182;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "[S")
	private short[] aShortArray183;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
	private final int[] anIntArray355 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!iv;)V")
	public void method4091(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2490();
			if (local11 == 0) {
				return;
			}
			this.method4098(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z")
	public boolean method4093() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class76 local19 = this.aClass109_1.aClass76_41;
		synchronized (this.aClass109_1.aClass76_41) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray355[local23] != -1 && !this.aClass109_1.aClass76_41.method2098(0, this.anIntArray355[local23])) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Z")
	public boolean method4095() {
		if (this.anIntArray356 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class76 local23 = this.aClass109_1.aClass76_41;
		synchronized (this.aClass109_1.aClass76_41) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray356.length; local27++) {
				if (!this.aClass109_1.aClass76_41.method2098(0, this.anIntArray356[local27])) {
					local19 = false;
				}
			}
			return local19;
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Lclient!jq;")
	public Class122 method4096() {
		if (this.anIntArray356 == null) {
			return null;
		}
		@Pc(15) Class122[] local15 = new Class122[this.anIntArray356.length];
		@Pc(19) Class76 local19 = this.aClass109_1.aClass76_41;
		@Pc(23) int local23;
		synchronized (this.aClass109_1.aClass76_41) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray356.length) {
					break;
				}
				local15[local23] = Static370.method4948(this.aClass109_1.aClass76_41, this.anIntArray356[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray356.length; local56++) {
			if (local15[local56].anInt3681 < 13) {
				local15[local56].method3039();
			}
		}
		@Pc(92) Class122 local92;
		if (local15.length == 1) {
			local92 = local15[0];
		} else {
			local92 = new Class122(local15, local15.length);
		}
		if (local92 == null) {
			return null;
		}
		if (this.aShortArray181 != null) {
			for (local23 = 0; local23 < this.aShortArray181.length; local23++) {
				local92.method3055(this.aShortArray181[local23], this.aShortArray183[local23]);
			}
		}
		if (this.aShortArray182 != null) {
			for (local23 = 0; local23 < this.aShortArray182.length; local23++) {
				local92.method3038(this.aShortArray180[local23], this.aShortArray182[local23]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLclient!iv;)V")
	private void method4098(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			arg1.method2490();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0 == 2) {
			local15 = arg1.method2490();
			this.anIntArray356 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray356[local21] = arg1.method2536();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local15 = arg1.method2490();
				this.aShortArray181 = new short[local15];
				this.aShortArray183 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray181[local21] = (short) arg1.method2536();
					this.aShortArray183[local21] = (short) arg1.method2536();
				}
			} else if (arg0 == 41) {
				local15 = arg1.method2490();
				this.aShortArray180 = new short[local15];
				this.aShortArray182 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray182[local21] = (short) arg1.method2536();
					this.aShortArray180[local21] = (short) arg1.method2536();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray355[arg0 - 60] = arg1.method2536();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Lclient!jq;")
	public Class122 method4099() {
		@Pc(8) Class122[] local8 = new Class122[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class76 local14 = this.aClass109_1.aClass76_41;
		@Pc(18) int local18;
		synchronized (this.aClass109_1.aClass76_41) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray355[local18] != -1) {
					local8[local10++] = Static370.method4948(this.aClass109_1.aClass76_41, this.anIntArray355[local18]);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt3681 < 13) {
				local8[local53].method3039();
			}
		}
		@Pc(83) Class122 local83 = new Class122(local8, local10);
		if (this.aShortArray181 != null) {
			for (local18 = 0; local18 < this.aShortArray181.length; local18++) {
				local83.method3055(this.aShortArray181[local18], this.aShortArray183[local18]);
			}
		}
		if (this.aShortArray182 != null) {
			for (local18 = 0; local18 < this.aShortArray182.length; local18++) {
				local83.method3038(this.aShortArray180[local18], this.aShortArray182[local18]);
			}
		}
		return local83;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class125 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!au;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	private final int[] anIntArray191 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!np;II)V")
	private void method3258(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method5175();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local32 = arg0.method5175();
			this.anIntArray192 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray192[local42] = arg0.method5198();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local32 = arg0.method5175();
				this.aShortArray49 = new short[local32];
				this.aShortArray48 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray49[local42] = (short) arg0.method5198();
					this.aShortArray48[local42] = (short) arg0.method5198();
				}
				return;
			}
			if (arg1 == 41) {
				local32 = arg0.method5175();
				this.aShortArray47 = new short[local32];
				this.aShortArray50 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray47[local42] = (short) arg0.method5198();
					this.aShortArray50[local42] = (short) arg0.method5198();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray191[arg1 - 60] = arg0.method5198();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Z")
	public boolean method3261() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class322 local11 = this.aClass23_2.aClass322_6;
		synchronized (this.aClass23_2.aClass322_6) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray191[local20] != -1 && !this.aClass23_2.aClass322_6.method6808(0, this.anIntArray191[local20])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!np;)V")
	public void method3262(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5175();
			if (local5 == 0) {
				return;
			}
			this.method3258(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Lclient!ef;")
	public Class84 method3263() {
		if (this.anIntArray192 == null) {
			return null;
		}
		@Pc(15) Class84[] local15 = new Class84[this.anIntArray192.length];
		@Pc(19) Class322 local19 = this.aClass23_2.aClass322_6;
		@Pc(23) int local23;
		synchronized (this.aClass23_2.aClass322_6) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray192.length) {
					break;
				}
				local15[local23] = Static416.method5935(this.aClass23_2.aClass322_6, this.anIntArray192[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray192.length; local52++) {
			if (local15[local52].anInt2725 < 13) {
				local15[local52].method2433();
			}
		}
		@Pc(80) Class84 local80;
		if (local15.length == 1) {
			local80 = local15[0];
		} else {
			local80 = new Class84(local15, local15.length);
		}
		if (local80 == null) {
			return null;
		}
		if (this.aShortArray49 != null) {
			for (local23 = 0; local23 < this.aShortArray49.length; local23++) {
				local80.method2432(this.aShortArray49[local23], this.aShortArray48[local23]);
			}
		}
		if (this.aShortArray47 != null) {
			for (local23 = 0; local23 < this.aShortArray47.length; local23++) {
				local80.method2442(this.aShortArray47[local23], this.aShortArray50[local23]);
			}
		}
		return local80;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Lclient!ef;")
	public Class84 method3264() {
		@Pc(8) Class84[] local8 = new Class84[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class322 local14 = this.aClass23_2.aClass322_6;
		synchronized (this.aClass23_2.aClass322_6) {
			@Pc(18) int local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray191[local18] != -1) {
					local8[local10++] = Static416.method5935(this.aClass23_2.aClass322_6, this.anIntArray191[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt2725 < 13) {
				local8[local55].method2433();
			}
		}
		@Pc(93) Class84 local93 = new Class84(local8, local10);
		@Pc(98) int local98;
		if (this.aShortArray49 != null) {
			for (local98 = 0; local98 < this.aShortArray49.length; local98++) {
				local93.method2432(this.aShortArray49[local98], this.aShortArray48[local98]);
			}
		}
		if (this.aShortArray47 != null) {
			for (local98 = 0; local98 < this.aShortArray47.length; local98++) {
				local93.method2442(this.aShortArray47[local98], this.aShortArray50[local98]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
	public boolean method3265() {
		if (this.anIntArray192 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class322 local16 = this.aClass23_2.aClass322_6;
		synchronized (this.aClass23_2.aClass322_6) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray192.length; local20++) {
				if (!this.aClass23_2.aClass322_6.method6808(0, this.anIntArray192[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}

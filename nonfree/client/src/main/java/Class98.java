import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class98 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!cw;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
	private final int[] anIntArray201 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class134("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lclient!qq;")
	public Class205 method2138() {
		@Pc(8) Class205[] local8 = new Class205[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class54 local14 = this.aClass47_1.aClass54_22;
		@Pc(18) int local18;
		synchronized (this.aClass47_1.aClass54_22) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray201[local18] != -1) {
					local8[local10++] = Static278.method3725(this.aClass47_1.aClass54_22, this.anIntArray201[local18]);
				}
				local18++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < 5; local56++) {
			if (local8[local56] != null && local8[local56].anInt5616 < 13) {
				local8[local56].method4443();
			}
		}
		@Pc(99) Class205 local99 = new Class205(local8, local10);
		if (this.aShortArray14 != null) {
			for (local18 = 0; local18 < this.aShortArray14.length; local18++) {
				local99.method4446(this.aShortArray13[local18], this.aShortArray14[local18]);
			}
		}
		if (this.aShortArray12 != null) {
			for (local18 = 0; local18 < this.aShortArray12.length; local18++) {
				local99.method4451(this.aShortArray11[local18], this.aShortArray12[local18]);
			}
		}
		return local99;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	public boolean method2140() {
		if (this.anIntArray202 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class54 local16 = this.aClass47_1.aClass54_22;
		synchronized (this.aClass47_1.aClass54_22) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray202.length; local20++) {
				if (!this.aClass47_1.aClass54_22.method1112(this.anIntArray202[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!sv;)V")
	public void method2141(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3580();
			if (local13 == 0) {
				return;
			}
			this.method2142(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLclient!sv;)V")
	private void method2142(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			arg1.method3580();
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (arg0 == 2) {
			local39 = arg1.method3580();
			this.anIntArray202 = new int[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray202[local49] = arg1.method3555();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local39 = arg1.method3580();
				this.aShortArray13 = new short[local39];
				this.aShortArray14 = new short[local39];
				for (local49 = 0; local49 < local39; local49++) {
					this.aShortArray14[local49] = (short) arg1.method3555();
					this.aShortArray13[local49] = (short) arg1.method3555();
				}
			} else if (arg0 == 41) {
				local39 = arg1.method3580();
				this.aShortArray12 = new short[local39];
				this.aShortArray11 = new short[local39];
				for (local49 = 0; local49 < local39; local49++) {
					this.aShortArray12[local49] = (short) arg1.method3555();
					this.aShortArray11[local49] = (short) arg1.method3555();
				}
				return;
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray201[arg0 - 60] = arg1.method3555();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Lclient!qq;")
	public Class205 method2143() {
		if (this.anIntArray202 == null) {
			return null;
		}
		@Pc(22) Class205[] local22 = new Class205[this.anIntArray202.length];
		@Pc(26) Class54 local26 = this.aClass47_1.aClass54_22;
		@Pc(30) int local30;
		synchronized (this.aClass47_1.aClass54_22) {
			local30 = 0;
			while (true) {
				if (this.anIntArray202.length <= local30) {
					break;
				}
				local22[local30] = Static278.method3725(this.aClass47_1.aClass54_22, this.anIntArray202[local30]);
				local30++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anIntArray202.length; local63++) {
			if (local22[local63].anInt5616 < 13) {
				local22[local63].method4443();
			}
		}
		@Pc(98) Class205 local98;
		if (local22.length == 1) {
			local98 = local22[0];
		} else {
			local98 = new Class205(local22, local22.length);
		}
		if (local98 == null) {
			return null;
		}
		if (this.aShortArray14 != null) {
			for (local30 = 0; local30 < this.aShortArray14.length; local30++) {
				local98.method4446(this.aShortArray13[local30], this.aShortArray14[local30]);
			}
		}
		if (this.aShortArray12 != null) {
			for (local30 = 0; local30 < this.aShortArray12.length; local30++) {
				local98.method4451(this.aShortArray11[local30], this.aShortArray12[local30]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Z")
	public boolean method2147() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class54 local19 = this.aClass47_1.aClass54_22;
		synchronized (this.aClass47_1.aClass54_22) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray201[local23] != -1 && !this.aClass47_1.aClass54_22.method1112(this.anIntArray201[local23], 0)) {
					local15 = false;
				}
			}
			return local15;
		}
	}
}

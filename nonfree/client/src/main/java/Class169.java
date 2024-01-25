import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class169 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!mg;")
	public Class158 aClass158_2;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	private final int[] anIntArray403 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLclient!hp;)V")
	public void method3867(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method3874(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Lclient!tp;")
	public Class236 method3868() {
		if (this.anIntArray402 == null) {
			return null;
		}
		@Pc(13) Class236[] local13 = new Class236[this.anIntArray402.length];
		@Pc(17) Class246 local17 = this.aClass158_2.aClass246_135;
		@Pc(21) int local21;
		synchronized (this.aClass158_2.aClass246_135) {
			local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray402.length) {
					break;
				}
				local13[local21] = Static74.method1492(this.anIntArray402[local21], this.aClass158_2.aClass246_135);
				local21++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray402.length; local53++) {
			if (local13[local53].anInt6297 < 13) {
				local13[local53].method5247();
			}
		}
		@Pc(84) Class236 local84;
		if (local13.length == 1) {
			local84 = local13[0];
		} else {
			local84 = new Class236(local13, local13.length);
		}
		if (local84 == null) {
			return null;
		}
		if (this.aShortArray78 != null) {
			for (local21 = 0; local21 < this.aShortArray78.length; local21++) {
				local84.method5237(this.aShortArray81[local21], this.aShortArray78[local21]);
			}
		}
		if (this.aShortArray80 != null) {
			for (local21 = 0; local21 < this.aShortArray80.length; local21++) {
				local84.method5243(this.aShortArray79[local21], this.aShortArray80[local21]);
			}
		}
		return local84;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
	public boolean method3869() {
		if (this.anIntArray402 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(21) Class246 local21 = this.aClass158_2.aClass246_135;
		synchronized (this.aClass158_2.aClass246_135) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray402.length; local25++) {
				if (!this.aClass158_2.aClass246_135.method5490(0, this.anIntArray402[local25])) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Z")
	public boolean method3870() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class246 local11 = this.aClass158_2.aClass246_135;
		synchronized (this.aClass158_2.aClass246_135) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray403[local15] != -1 && !this.aClass158_2.aClass246_135.method5490(0, this.anIntArray403[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lclient!tp;")
	public Class236 method3872() {
		@Pc(8) Class236[] local8 = new Class236[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class246 local14 = this.aClass158_2.aClass246_135;
		@Pc(18) int local18;
		synchronized (this.aClass158_2.aClass246_135) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray403[local18] != -1) {
					local8[local10++] = Static74.method1492(this.anIntArray403[local18], this.aClass158_2.aClass246_135);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt6297 < 13) {
				local8[local53].method5247();
			}
		}
		@Pc(83) Class236 local83 = new Class236(local8, local10);
		if (this.aShortArray78 != null) {
			for (local18 = 0; local18 < this.aShortArray78.length; local18++) {
				local83.method5237(this.aShortArray81[local18], this.aShortArray78[local18]);
			}
		}
		if (this.aShortArray80 != null) {
			for (local18 = 0; local18 < this.aShortArray80.length; local18++) {
				local83.method5243(this.aShortArray79[local18], this.aShortArray80[local18]);
			}
		}
		return local83;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!hp;)V")
	private void method3874(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			arg1.method5366();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		if (arg0 == 2) {
			local24 = arg1.method5366();
			this.anIntArray402 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray402[local34] = arg1.method5362();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local24 = arg1.method5366();
				this.aShortArray78 = new short[local24];
				this.aShortArray81 = new short[local24];
				for (local34 = 0; local34 < local24; local34++) {
					this.aShortArray78[local34] = (short) arg1.method5362();
					this.aShortArray81[local34] = (short) arg1.method5362();
				}
			} else if (arg0 == 41) {
				local24 = arg1.method5366();
				this.aShortArray79 = new short[local24];
				this.aShortArray80 = new short[local24];
				for (local34 = 0; local34 < local24; local34++) {
					this.aShortArray80[local34] = (short) arg1.method5362();
					this.aShortArray79[local34] = (short) arg1.method5362();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray403[arg0 - 60] = arg1.method5362();
			}
		}
	}
}

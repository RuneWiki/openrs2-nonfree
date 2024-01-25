import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class253 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Lclient!raa;")
	public Class286 aClass286_3;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
	private final int[] anIntArray461 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!sl;)V")
	public void method6517(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method4225();
			if (local20 == 0) {
				return;
			}
			this.method6524(arg0, local20);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!fu;")
	public Class118 method6518() {
		@Pc(8) Class118[] local8 = new Class118[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class196 local14 = this.aClass286_3.aClass196_100;
		@Pc(18) int local18;
		synchronized (this.aClass286_3.aClass196_100) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray461[local18] != -1) {
					local8[local10++] = Static330.method5390(this.aClass286_3.aClass196_100, this.anIntArray461[local18]);
				}
				local18++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < 5; local52++) {
			if (local8[local52] != null && local8[local52].anInt3246 < 13) {
				local8[local52].method2926();
			}
		}
		@Pc(82) Class118 local82 = new Class118(local8, local10);
		if (this.aShortArray115 != null) {
			for (local18 = 0; local18 < this.aShortArray115.length; local18++) {
				local82.method2930(this.aShortArray116[local18], this.aShortArray115[local18]);
			}
		}
		if (this.aShortArray114 != null) {
			for (local18 = 0; local18 < this.aShortArray114.length; local18++) {
				local82.method2934(this.aShortArray114[local18], this.aShortArray113[local18]);
			}
		}
		return local82;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Lclient!fu;")
	public Class118 method6520() {
		if (this.anIntArray460 == null) {
			return null;
		}
		@Pc(15) Class118[] local15 = new Class118[this.anIntArray460.length];
		@Pc(19) Class196 local19 = this.aClass286_3.aClass196_100;
		@Pc(23) int local23;
		synchronized (this.aClass286_3.aClass196_100) {
			local23 = 0;
			while (true) {
				if (this.anIntArray460.length <= local23) {
					break;
				}
				local15[local23] = Static330.method5390(this.aClass286_3.aClass196_100, this.anIntArray460[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray460.length; local56++) {
			if (local15[local56].anInt3246 < 13) {
				local15[local56].method2926();
			}
		}
		@Pc(96) Class118 local96;
		if (local15.length == 1) {
			local96 = local15[0];
		} else {
			local96 = new Class118(local15, local15.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray115 != null) {
			for (local23 = 0; local23 < this.aShortArray115.length; local23++) {
				local96.method2930(this.aShortArray116[local23], this.aShortArray115[local23]);
			}
		}
		if (this.aShortArray114 != null) {
			for (local23 = 0; local23 < this.aShortArray114.length; local23++) {
				local96.method2934(this.aShortArray114[local23], this.aShortArray113[local23]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
	public boolean method6522() {
		if (this.anIntArray460 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class196 local16 = this.aClass286_3.aClass196_100;
		synchronized (this.aClass286_3.aClass196_100) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray460.length; local20++) {
				if (!this.aClass286_3.aClass196_100.method5115(0, this.anIntArray460[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method6524(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4225();
			return;
		}
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg1 == 2) {
			local17 = arg0.method4225();
			this.anIntArray460 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray460[local23] = arg0.method4221();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local17 = arg0.method4225();
				this.aShortArray116 = new short[local17];
				this.aShortArray115 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray115[local23] = (short) arg0.method4221();
					this.aShortArray116[local23] = (short) arg0.method4221();
				}
			} else if (arg1 == 41) {
				local17 = arg0.method4225();
				this.aShortArray114 = new short[local17];
				this.aShortArray113 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray114[local23] = (short) arg0.method4221();
					this.aShortArray113[local23] = (short) arg0.method4221();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray461[arg1 - 60] = arg0.method4221();
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z")
	public boolean method6525() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class196 local11 = this.aClass286_3.aClass196_100;
		synchronized (this.aClass286_3.aClass196_100) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray461[local15] != -1 && !this.aClass286_3.aClass196_100.method5115(0, this.anIntArray461[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}

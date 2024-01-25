import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class189 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
	private final int[] anIntArray484 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	public int anInt5950 = -1;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lclient!d;")
	public Class40 method5065() {
		@Pc(8) Class40[] local8 = new Class40[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class100 local12 = Static121.aClass100_56;
		synchronized (Static121.aClass100_56) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray484[local16] != -1) {
					local8[local10++] = Static26.method559(Static121.aClass100_56, this.anIntArray484[local16]);
				}
			}
		}
		@Pc(55) Class40 local55 = new Class40(local8, local10);
		@Pc(60) int local60;
		if (this.aShortArray108 != null) {
			for (local60 = 0; local60 < this.aShortArray108.length; local60++) {
				local55.method913(this.aShortArray107[local60], this.aShortArray108[local60]);
			}
		}
		if (this.aShortArray106 != null) {
			for (local60 = 0; local60 < this.aShortArray106.length; local60++) {
				local55.method910(this.aShortArray106[local60], this.aShortArray105[local60]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
	public boolean method5066() {
		if (this.anIntArray485 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class100 local14 = Static121.aClass100_56;
		synchronized (Static121.aClass100_56) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray485.length; local25++) {
				if (!Static121.aClass100_56.method2298(this.anIntArray485[local25], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!fb;I)V")
	private void method5067(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5950 = arg0.method3643();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		if (arg1 == 2) {
			local25 = arg0.method3643();
			this.anIntArray485 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray485[local35] = arg0.method3649();
			}
		} else if (arg1 == 3) {
			this.aBoolean409 = true;
		} else if (arg1 == 40) {
			local25 = arg0.method3643();
			this.aShortArray107 = new short[local25];
			this.aShortArray108 = new short[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.aShortArray108[local35] = (short) arg0.method3649();
				this.aShortArray107[local35] = (short) arg0.method3649();
			}
		} else if (arg1 == 41) {
			local25 = arg0.method3643();
			this.aShortArray105 = new short[local25];
			this.aShortArray106 = new short[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.aShortArray106[local35] = (short) arg0.method3649();
				this.aShortArray105[local35] = (short) arg0.method3649();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray484[arg1 - 60] = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Z")
	public boolean method5068() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class100 local9 = Static121.aClass100_56;
		synchronized (Static121.aClass100_56) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray484[local13] != -1 && !Static121.aClass100_56.method2298(this.anIntArray484[local13], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!fb;B)V")
	public void method5069(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3643();
			if (local10 == 0) {
				return;
			}
			this.method5067(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Lclient!d;")
	public Class40 method5070() {
		if (this.anIntArray485 == null) {
			return null;
		}
		@Pc(15) Class40[] local15 = new Class40[this.anIntArray485.length];
		@Pc(17) Class100 local17 = Static121.aClass100_56;
		@Pc(21) int local21;
		synchronized (Static121.aClass100_56) {
			local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray485.length) {
					break;
				}
				local15[local21] = Static26.method559(Static121.aClass100_56, this.anIntArray485[local21]);
				local21++;
			}
		}
		@Pc(69) Class40 local69;
		if (local15.length == 1) {
			local69 = local15[0];
		} else {
			local69 = new Class40(local15, local15.length);
		}
		if (local69 == null) {
			return null;
		}
		if (this.aShortArray108 != null) {
			for (local21 = 0; local21 < this.aShortArray108.length; local21++) {
				local69.method913(this.aShortArray107[local21], this.aShortArray108[local21]);
			}
		}
		if (this.aShortArray106 != null) {
			for (local21 = 0; local21 < this.aShortArray106.length; local21++) {
				local69.method910(this.aShortArray106[local21], this.aShortArray105[local21]);
			}
		}
		return local69;
	}
}

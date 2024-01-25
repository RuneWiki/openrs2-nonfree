import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class132 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
	private final int[] anIntArray342 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public int anInt4126 = -1;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Lclient!qf;")
	public Class165 method3726() {
		if (this.anIntArray343 == null) {
			return null;
		}
		@Pc(15) Class165[] local15 = new Class165[this.anIntArray343.length];
		@Pc(17) Class193 local17 = Static170.aClass193_61;
		synchronized (Static170.aClass193_61) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (this.anIntArray343.length <= local21) {
					break;
				}
				local15[local21] = Static170.method3292(this.anIntArray343[local21], Static170.aClass193_61);
				local21++;
			}
		}
		@Pc(67) Class165 local67;
		if (local15.length == 1) {
			local67 = local15[0];
		} else {
			local67 = new Class165(local15, local15.length);
		}
		if (local67 == null) {
			return null;
		}
		@Pc(84) int local84;
		if (this.aShortArray50 != null) {
			for (local84 = 0; local84 < this.aShortArray50.length; local84++) {
				local67.method4481(this.aShortArray50[local84], this.aShortArray52[local84]);
			}
		}
		if (this.aShortArray51 != null) {
			for (local84 = 0; local84 < this.aShortArray51.length; local84++) {
				local67.method4476(this.aShortArray51[local84], this.aShortArray49[local84]);
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Z")
	public boolean method3728() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class193 local9 = Static170.aClass193_61;
		synchronized (Static170.aClass193_61) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray342[local13] != -1 && !Static170.aClass193_61.method5065(this.anIntArray342[local13], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!lf;B)V")
	private void method3729(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt4126 = arg1.method3440();
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (arg0 == 2) {
			local41 = arg1.method3440();
			this.anIntArray343 = new int[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.anIntArray343[local51] = arg1.method3401();
			}
		} else if (arg0 == 3) {
			this.aBoolean316 = true;
		} else if (arg0 == 40) {
			local41 = arg1.method3440();
			this.aShortArray52 = new short[local41];
			this.aShortArray50 = new short[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.aShortArray50[local51] = (short) arg1.method3401();
				this.aShortArray52[local51] = (short) arg1.method3401();
			}
		} else if (arg0 == 41) {
			local41 = arg1.method3440();
			this.aShortArray51 = new short[local41];
			this.aShortArray49 = new short[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.aShortArray51[local51] = (short) arg1.method3401();
				this.aShortArray49[local51] = (short) arg1.method3401();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray342[arg0 - 60] = arg1.method3401();
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!lf;)V")
	public void method3731(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3440();
			if (local15 == 0) {
				return;
			}
			this.method3729(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Lclient!qf;")
	public Class165 method3732() {
		@Pc(8) Class165[] local8 = new Class165[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class193 local12 = Static170.aClass193_61;
		synchronized (Static170.aClass193_61) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray342[local16] != -1) {
					local8[local10++] = Static170.method3292(this.anIntArray342[local16], Static170.aClass193_61);
				}
			}
		}
		@Pc(53) Class165 local53 = new Class165(local8, local10);
		@Pc(58) int local58;
		if (this.aShortArray50 != null) {
			for (local58 = 0; local58 < this.aShortArray50.length; local58++) {
				local53.method4481(this.aShortArray50[local58], this.aShortArray52[local58]);
			}
		}
		if (this.aShortArray51 != null) {
			for (local58 = 0; local58 < this.aShortArray51.length; local58++) {
				local53.method4476(this.aShortArray51[local58], this.aShortArray49[local58]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
	public boolean method3734() {
		if (this.anIntArray343 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class193 local14 = Static170.aClass193_61;
		synchronized (Static170.aClass193_61) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray343.length; local18++) {
				if (!Static170.aClass193_61.method5065(this.anIntArray343[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class148 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!ti;")
	public Class223 aClass223_2;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "[I")
	private final int[] anIntArray394 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
	public boolean method3187() {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class20 local16 = this.aClass223_2.aClass20_84;
		synchronized (this.aClass223_2.aClass20_84) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray394[local20] != -1 && !this.aClass223_2.aClass20_84.method233(this.anIntArray394[local20], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Z")
	public boolean method3191() {
		if (this.anIntArray392 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class20 local16 = this.aClass223_2.aClass20_84;
		synchronized (this.aClass223_2.aClass20_84) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray392.length; local20++) {
				if (!this.aClass223_2.aClass20_84.method233(this.anIntArray392[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)Lclient!vn;")
	public Class239 method3192() {
		if (this.anIntArray392 == null) {
			return null;
		}
		@Pc(20) Class239[] local20 = new Class239[this.anIntArray392.length];
		@Pc(24) Class20 local24 = this.aClass223_2.aClass20_84;
		synchronized (this.aClass223_2.aClass20_84) {
			@Pc(28) int local28 = 0;
			while (true) {
				if (local28 >= this.anIntArray392.length) {
					break;
				}
				local20[local28] = Static214.method3327(this.aClass223_2.aClass20_84, this.anIntArray392[local28]);
				local28++;
			}
		}
		@Pc(65) Class239 local65;
		if (local20.length == 1) {
			local65 = local20[0];
		} else {
			local65 = new Class239(local20, local20.length);
		}
		if (local65 == null) {
			return null;
		}
		@Pc(82) int local82;
		if (this.aShortArray66 != null) {
			for (local82 = 0; local82 < this.aShortArray66.length; local82++) {
				local65.method5563(this.aShortArray66[local82], this.aShortArray65[local82]);
			}
		}
		if (this.aShortArray64 != null) {
			for (local82 = 0; local82 < this.aShortArray64.length; local82++) {
				local65.method5573(this.aShortArray64[local82], this.aShortArray67[local82]);
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!rp;)V")
	public void method3193(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method3195(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Lclient!vn;")
	public Class239 method3194() {
		@Pc(8) Class239[] local8 = new Class239[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class20 local14 = this.aClass223_2.aClass20_84;
		synchronized (this.aClass223_2.aClass20_84) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray394[local18] != -1) {
					local8[local10++] = Static214.method3327(this.aClass223_2.aClass20_84, this.anIntArray394[local18]);
				}
			}
		}
		@Pc(57) Class239 local57 = new Class239(local8, local10);
		@Pc(62) int local62;
		if (this.aShortArray66 != null) {
			for (local62 = 0; local62 < this.aShortArray66.length; local62++) {
				local57.method5563(this.aShortArray66[local62], this.aShortArray65[local62]);
			}
		}
		if (this.aShortArray64 != null) {
			for (local62 = 0; local62 < this.aShortArray64.length; local62++) {
				local57.method5573(this.aShortArray64[local62], this.aShortArray67[local62]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!rp;)V")
	private void method3195(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			arg1.method2739();
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method2739();
			this.anIntArray392 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray392[local31] = arg1.method2767();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local25 = arg1.method2739();
				this.aShortArray66 = new short[local25];
				this.aShortArray65 = new short[local25];
				for (local31 = 0; local31 < local25; local31++) {
					this.aShortArray66[local31] = (short) arg1.method2767();
					this.aShortArray65[local31] = (short) arg1.method2767();
				}
			} else if (arg0 == 41) {
				local25 = arg1.method2739();
				this.aShortArray67 = new short[local25];
				this.aShortArray64 = new short[local25];
				for (local31 = 0; local31 < local25; local31++) {
					this.aShortArray64[local31] = (short) arg1.method2767();
					this.aShortArray67[local31] = (short) arg1.method2767();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray394[arg0 - 60] = arg1.method2767();
			}
		}
	}
}

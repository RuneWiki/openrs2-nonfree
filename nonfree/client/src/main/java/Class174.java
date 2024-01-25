import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class174 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!ii;")
	public Class109 aClass109_6;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
	private final int[] anIntArray399 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lclient!uu;")
	public Class242 method4166() {
		@Pc(16) Class242[] local16 = new Class242[5];
		@Pc(18) int local18 = 0;
		@Pc(22) Class56 local22 = this.aClass109_6.aClass56_43;
		@Pc(26) int local26;
		synchronized (this.aClass109_6.aClass56_43) {
			local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray399[local26] != -1) {
					local16[local18++] = Static275.method4093(this.anIntArray399[local26], this.aClass109_6.aClass56_43);
				}
				local26++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < 5; local62++) {
			if (local16[local62] != null && local16[local62].anInt7154 < 13) {
				local16[local62].method5546();
			}
		}
		@Pc(92) Class242 local92 = new Class242(local16, local18);
		if (this.aShortArray64 != null) {
			for (local26 = 0; local26 < this.aShortArray64.length; local26++) {
				local92.method5548(this.aShortArray64[local26], this.aShortArray66[local26]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local26 = 0; local26 < this.aShortArray67.length; local26++) {
				local92.method5547(this.aShortArray65[local26], this.aShortArray67[local26]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
	public boolean method4167() {
		if (this.anIntArray400 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(24) Class56 local24 = this.aClass109_6.aClass56_43;
		synchronized (this.aClass109_6.aClass56_43) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray400.length; local28++) {
				if (!this.aClass109_6.aClass56_43.method1388(this.anIntArray400[local28], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lclient!uu;")
	public Class242 method4168() {
		if (this.anIntArray400 == null) {
			return null;
		}
		@Pc(15) Class242[] local15 = new Class242[this.anIntArray400.length];
		@Pc(19) Class56 local19 = this.aClass109_6.aClass56_43;
		@Pc(23) int local23;
		synchronized (this.aClass109_6.aClass56_43) {
			local23 = 0;
			while (true) {
				if (this.anIntArray400.length <= local23) {
					break;
				}
				local15[local23] = Static275.method4093(this.anIntArray400[local23], this.aClass109_6.aClass56_43);
				local23++;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < this.anIntArray400.length; local66++) {
			if (local15[local66].anInt7154 < 13) {
				local15[local66].method5546();
			}
		}
		@Pc(96) Class242 local96;
		if (local15.length == 1) {
			local96 = local15[0];
		} else {
			local96 = new Class242(local15, local15.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray64 != null) {
			for (local23 = 0; local23 < this.aShortArray64.length; local23++) {
				local96.method5548(this.aShortArray64[local23], this.aShortArray66[local23]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local23 = 0; local23 < this.aShortArray67.length; local23++) {
				local96.method5547(this.aShortArray65[local23], this.aShortArray67[local23]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method4169(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6053();
			if (local15 == 0) {
				return;
			}
			this.method4171(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z")
	public boolean method4170() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class56 local11 = this.aClass109_6.aClass56_43;
		synchronized (this.aClass109_6.aClass56_43) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray399[local15] != -1 && !this.aClass109_6.aClass56_43.method1388(this.anIntArray399[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method4171(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method6053();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method6053();
			this.anIntArray400 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray400[local29] = arg0.method6004();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method6053();
				this.aShortArray66 = new short[local23];
				this.aShortArray64 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray64[local29] = (short) arg0.method6004();
					this.aShortArray66[local29] = (short) arg0.method6004();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method6053();
				this.aShortArray65 = new short[local23];
				this.aShortArray67 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray67[local29] = (short) arg0.method6004();
					this.aShortArray65[local29] = (short) arg0.method6004();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray399[arg1 - 60] = arg0.method6004();
				return;
			}
		}
	}
}

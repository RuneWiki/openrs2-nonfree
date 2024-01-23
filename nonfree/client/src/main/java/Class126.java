import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class126 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt3812;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	private int anInt3810 = 128;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	private int anInt3807 = 0;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	public int anInt3816 = -1;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	private int anInt3817 = 128;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	private int anInt3815 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	private int anInt3806 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Lclient!uc;")
	public Class12_Sub2 method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class12_Sub2 local19 = (Class12_Sub2) Static116.aClass33_21.method841((long) this.anInt3812);
		if (local19 == null) {
			@Pc(28) Class12_Sub7 local28 = Static208.method3332(Static63.aClass98_36, this.anInt3809);
			if (local28 == null) {
				return null;
			}
			@Pc(40) int local40;
			if (this.aShortArray46 != null) {
				for (local40 = 0; local40 < this.aShortArray46.length; local40++) {
					local28.method3327(this.aShortArray46[local40], this.aShortArray47[local40]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local40 = 0; local40 < this.aShortArray49.length; local40++) {
					local28.method3334(this.aShortArray49[local40], this.aShortArray48[local40]);
				}
			}
			local19 = local28.method3325(this.anInt3807 + 64, this.anInt3806 + 850, -30, -50, -30);
			Static116.aClass33_21.method845(local19, (long) this.anInt3812);
		}
		@Pc(129) Class12_Sub2 local129;
		if (this.anInt3816 == -1 || arg1 == -1) {
			local129 = local19.method3156(true, true, true);
		} else {
			local129 = Static296.method1376(this.anInt3816).method3519(local19, arg2, arg1, arg0);
		}
		if (this.anInt3817 != 128 || this.anInt3810 != 128) {
			local129.method3151(this.anInt3817, this.anInt3810, this.anInt3817);
		}
		if (this.anInt3815 != 0) {
			if (this.anInt3815 == 90) {
				local129.method3141();
			}
			if (this.anInt3815 == 180) {
				local129.method3164();
			}
			if (this.anInt3815 == 270) {
				local129.method3140();
			}
		}
		return local129;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!p;)V")
	private void method3026(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3809 = arg1.method1837();
		} else if (arg0 == 2) {
			this.anInt3816 = arg1.method1837();
		} else if (arg0 == 4) {
			this.anInt3817 = arg1.method1837();
		} else if (arg0 == 5) {
			this.anInt3810 = arg1.method1837();
		} else if (arg0 == 6) {
			this.anInt3815 = arg1.method1837();
		} else if (arg0 == 7) {
			this.anInt3807 = arg1.method1874();
		} else if (arg0 == 8) {
			this.anInt3806 = arg1.method1874();
		} else if (arg0 == 9) {
			this.aBoolean246 = true;
		} else if (arg0 == 10) {
			this.aBoolean245 = true;
		} else {
			@Pc(77) int local77;
			@Pc(87) int local87;
			if (arg0 == 40) {
				local77 = arg1.method1874();
				this.aShortArray47 = new short[local77];
				this.aShortArray46 = new short[local77];
				for (local87 = 0; local87 < local77; local87++) {
					this.aShortArray46[local87] = (short) arg1.method1837();
					this.aShortArray47[local87] = (short) arg1.method1837();
				}
			} else if (arg0 == 41) {
				local77 = arg1.method1874();
				this.aShortArray49 = new short[local77];
				this.aShortArray48 = new short[local77];
				for (local87 = 0; local87 < local77; local87++) {
					this.aShortArray49[local87] = (short) arg1.method1837();
					this.aShortArray48[local87] = (short) arg1.method1837();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!p;I)V")
	public void method3027(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1874();
			if (local9 == 0) {
				return;
			}
			this.method3026(local9, arg0);
		}
	}
}

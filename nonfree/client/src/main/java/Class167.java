import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class167 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	private int anInt5404;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public int anInt5405 = -1;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
	public boolean aBoolean434 = false;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	private int anInt5410 = 0;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private int anInt5408 = 0;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	private int anInt5415 = 128;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	private int anInt5407 = 128;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "Z")
	public boolean aBoolean436 = false;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private int anInt5423 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!wm;)V")
	private void method4335(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5404 = arg1.method4242();
		} else if (arg0 == 2) {
			this.anInt5405 = arg1.method4242();
		} else if (arg0 == 4) {
			this.anInt5415 = arg1.method4242();
		} else if (arg0 == 5) {
			this.anInt5407 = arg1.method4242();
		} else if (arg0 == 6) {
			this.anInt5410 = arg1.method4242();
		} else if (arg0 == 7) {
			this.anInt5423 = arg1.method4261();
		} else if (arg0 == 8) {
			this.anInt5408 = arg1.method4261();
		} else if (arg0 == 9) {
			this.aBoolean434 = true;
		} else if (arg0 == 10) {
			this.aBoolean436 = true;
		} else {
			@Pc(100) int local100;
			@Pc(110) int local110;
			if (arg0 == 40) {
				local100 = arg1.method4261();
				this.aShortArray83 = new short[local100];
				this.aShortArray82 = new short[local100];
				for (local110 = 0; local110 < local100; local110++) {
					this.aShortArray82[local110] = (short) arg1.method4242();
					this.aShortArray83[local110] = (short) arg1.method4242();
				}
			} else if (arg0 == 41) {
				local100 = arg1.method4261();
				this.aShortArray84 = new short[local100];
				this.aShortArray85 = new short[local100];
				for (local110 = 0; local110 < local100; local110++) {
					this.aShortArray84[local110] = (short) arg1.method4242();
					this.aShortArray85[local110] = (short) arg1.method4242();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)Lclient!r;")
	public Class36_Sub2 method4337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class36_Sub2 local13 = (Class36_Sub2) Static279.aClass46_40.method1074((long) this.anInt5420);
		if (local13 == null) {
			@Pc(23) Class36_Sub6 local23 = Static252.method4038(Static173.aClass84_70, this.anInt5404);
			if (local23 == null) {
				return null;
			}
			@Pc(34) int local34;
			if (this.aShortArray82 != null) {
				for (local34 = 0; local34 < this.aShortArray82.length; local34++) {
					local23.method4060(this.aShortArray82[local34], this.aShortArray83[local34]);
				}
			}
			if (this.aShortArray84 != null) {
				for (local34 = 0; local34 < this.aShortArray84.length; local34++) {
					local23.method4052(this.aShortArray84[local34], this.aShortArray85[local34]);
				}
			}
			local13 = local23.method4049(this.anInt5423 + 64, this.anInt5408 + 850, -30, -50, -30);
			Static279.aClass46_40.method1071(local13, (long) this.anInt5420);
		}
		@Pc(113) Class36_Sub2 local113;
		if (this.anInt5405 == -1 || arg2 == -1) {
			local113 = local13.method3856(true, true, true);
		} else {
			local113 = Static35.method706(this.anInt5405).method354(arg0, arg1, arg2, local13);
		}
		if (this.anInt5415 != 128 || this.anInt5407 != 128) {
			local113.method3853(this.anInt5415, this.anInt5407, this.anInt5415);
		}
		if (this.anInt5410 != 0) {
			if (this.anInt5410 == 90) {
				local113.method3840();
			}
			if (this.anInt5410 == 180) {
				local113.method3839();
			}
			if (this.anInt5410 == 270) {
				local113.method3837();
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!wm;Z)V")
	public void method4338(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4261();
			if (local14 == 0) {
				return;
			}
			this.method4335(local14, arg0);
		}
	}
}

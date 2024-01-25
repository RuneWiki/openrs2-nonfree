import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class240 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!qi;")
	public Class286 aClass286_2;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "[I")
	private final int[] anIntArray404 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lclient!ak;")
	public Class13 method5125() {
		if (this.anIntArray403 == null) {
			return null;
		}
		@Pc(15) Class13[] local15 = new Class13[this.anIntArray403.length];
		@Pc(19) Class229 local19 = this.aClass286_2.aClass229_99;
		@Pc(23) int local23;
		synchronized (this.aClass286_2.aClass229_99) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray403.length) {
					break;
				}
				local15[local23] = Static25.method356(this.anIntArray403[local23], this.aClass286_2.aClass229_99);
				local23++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray403.length; local60++) {
			if (local15[local60].anInt319 < 13) {
				local15[local60].method245();
			}
		}
		@Pc(90) Class13 local90;
		if (local15.length == 1) {
			local90 = local15[0];
		} else {
			local90 = new Class13(local15, local15.length);
		}
		if (local90 == null) {
			return null;
		}
		if (this.aShortArray100 != null) {
			for (local23 = 0; local23 < this.aShortArray100.length; local23++) {
				local90.method235(this.aShortArray100[local23], this.aShortArray103[local23]);
			}
		}
		if (this.aShortArray102 != null) {
			for (local23 = 0; local23 < this.aShortArray102.length; local23++) {
				local90.method241(this.aShortArray102[local23], this.aShortArray101[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Z")
	public boolean method5128() {
		if (this.anIntArray403 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class229 local21 = this.aClass286_2.aClass229_99;
		synchronized (this.aClass286_2.aClass229_99) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray403.length; local25++) {
				if (!this.aClass286_2.aClass229_99.method4979(this.anIntArray403[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!gk;Z)V")
	public void method5129(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method5132(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)Lclient!ak;")
	public Class13 method5130() {
		@Pc(8) Class13[] local8 = new Class13[5];
		@Pc(10) int local10 = 0;
		@Pc(19) Class229 local19 = this.aClass286_2.aClass229_99;
		@Pc(23) int local23;
		synchronized (this.aClass286_2.aClass229_99) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray404[local23] != -1) {
					local8[local10++] = Static25.method356(this.anIntArray404[local23], this.aClass286_2.aClass229_99);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local8[local57] != null && local8[local57].anInt319 < 13) {
				local8[local57].method245();
			}
		}
		@Pc(87) Class13 local87 = new Class13(local8, local10);
		if (this.aShortArray100 != null) {
			for (local23 = 0; local23 < this.aShortArray100.length; local23++) {
				local87.method235(this.aShortArray100[local23], this.aShortArray103[local23]);
			}
		}
		if (this.aShortArray102 != null) {
			for (local23 = 0; local23 < this.aShortArray102.length; local23++) {
				local87.method241(this.aShortArray102[local23], this.aShortArray101[local23]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)Z")
	public boolean method5131() {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class229 local17 = this.aClass286_2.aClass229_99;
		synchronized (this.aClass286_2.aClass229_99) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray404[local21] != -1 && !this.aClass286_2.aClass229_99.method4979(this.anIntArray404[local21], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method5132(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4464();
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (arg1 == 2) {
			local40 = arg0.method4464();
			this.anIntArray403 = new int[local40];
			for (local50 = 0; local50 < local40; local50++) {
				this.anIntArray403[local50] = arg0.method4518();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local40 = arg0.method4464();
				this.aShortArray100 = new short[local40];
				this.aShortArray103 = new short[local40];
				for (local50 = 0; local50 < local40; local50++) {
					this.aShortArray100[local50] = (short) arg0.method4518();
					this.aShortArray103[local50] = (short) arg0.method4518();
				}
				return;
			}
			if (arg1 == 41) {
				local40 = arg0.method4464();
				this.aShortArray102 = new short[local40];
				this.aShortArray101 = new short[local40];
				for (local50 = 0; local50 < local40; local50++) {
					this.aShortArray102[local50] = (short) arg0.method4518();
					this.aShortArray101[local50] = (short) arg0.method4518();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray404[arg1 - 60] = arg0.method4518();
				return;
			}
			return;
		}
	}
}

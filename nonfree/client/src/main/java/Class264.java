import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class264 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!aj;")
	public Class7 aClass7_2;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
	private final int[] anIntArray500 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!nd;")
	public Class160 method6086() {
		if (this.anIntArray499 == null) {
			return null;
		}
		@Pc(15) Class160[] local15 = new Class160[this.anIntArray499.length];
		@Pc(19) Class250 local19 = this.aClass7_2.aClass250_3;
		@Pc(23) int local23;
		synchronized (this.aClass7_2.aClass250_3) {
			local23 = 0;
			while (true) {
				if (this.anIntArray499.length <= local23) {
					break;
				}
				local15[local23] = Static16.method320(this.aClass7_2.aClass250_3, this.anIntArray499[local23]);
				local23++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray499.length; local58++) {
			if (local15[local58].anInt4540 < 13) {
				local15[local58].method3772();
			}
		}
		@Pc(95) Class160 local95;
		if (local15.length == 1) {
			local95 = local15[0];
		} else {
			local95 = new Class160(local15, local15.length);
		}
		if (local95 == null) {
			return null;
		}
		if (this.aShortArray118 != null) {
			for (local23 = 0; local23 < this.aShortArray118.length; local23++) {
				local95.method3778(this.aShortArray115[local23], this.aShortArray118[local23]);
			}
		}
		if (this.aShortArray116 != null) {
			for (local23 = 0; local23 < this.aShortArray116.length; local23++) {
				local95.method3784(this.aShortArray116[local23], this.aShortArray117[local23]);
			}
		}
		return local95;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!nd;")
	public Class160 method6087() {
		@Pc(8) Class160[] local8 = new Class160[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class250 local14 = this.aClass7_2.aClass250_3;
		@Pc(18) int local18;
		synchronized (this.aClass7_2.aClass250_3) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray500[local18] != -1) {
					local8[local10++] = Static16.method320(this.aClass7_2.aClass250_3, this.anIntArray500[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt4540 < 13) {
				local8[local55].method3772();
			}
		}
		@Pc(92) Class160 local92 = new Class160(local8, local10);
		if (this.aShortArray118 != null) {
			for (local18 = 0; local18 < this.aShortArray118.length; local18++) {
				local92.method3778(this.aShortArray115[local18], this.aShortArray118[local18]);
			}
		}
		if (this.aShortArray116 != null) {
			for (local18 = 0; local18 < this.aShortArray116.length; local18++) {
				local92.method3784(this.aShortArray116[local18], this.aShortArray117[local18]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
	public boolean method6088() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class250 local9 = this.aClass7_2.aClass250_3;
		synchronized (this.aClass7_2.aClass250_3) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray500[local13] != -1 && !this.aClass7_2.aClass250_3.method5796(0, this.anIntArray500[local13])) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!nj;B)V")
	private void method6090(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			arg1.method4096();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local30 = arg1.method4096();
			this.anIntArray499 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray499[local40] = arg1.method4083();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local30 = arg1.method4096();
				this.aShortArray115 = new short[local30];
				this.aShortArray118 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray118[local40] = (short) arg1.method4083();
					this.aShortArray115[local40] = (short) arg1.method4083();
				}
			} else if (arg0 == 41) {
				local30 = arg1.method4096();
				this.aShortArray116 = new short[local30];
				this.aShortArray117 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray116[local40] = (short) arg1.method4083();
					this.aShortArray117[local40] = (short) arg1.method4083();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray500[arg0 - 60] = arg1.method4083();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method6093(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4096();
			if (local16 == 0) {
				return;
			}
			this.method6090(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Z")
	public boolean method6094() {
		if (this.anIntArray499 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class250 local16 = this.aClass7_2.aClass250_3;
		synchronized (this.aClass7_2.aClass250_3) {
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray499.length; local29++) {
				if (!this.aClass7_2.aClass250_3.method5796(0, this.anIntArray499[local29])) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}

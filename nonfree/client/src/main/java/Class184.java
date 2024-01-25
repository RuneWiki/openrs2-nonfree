import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class184 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Lclient!tu;")
	public Class233 aClass233_2;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "[I")
	private final int[] anIntArray438 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!lh;B)V")
	public void method4438(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method4444(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Lclient!wk;")
	public Class264 method4439() {
		if (this.anIntArray436 == null) {
			return null;
		}
		@Pc(15) Class264[] local15 = new Class264[this.anIntArray436.length];
		@Pc(19) Class250 local19 = this.aClass233_2.aClass250_81;
		@Pc(23) int local23;
		synchronized (this.aClass233_2.aClass250_81) {
			local23 = 0;
			while (true) {
				if (this.anIntArray436.length <= local23) {
					break;
				}
				local15[local23] = Static358.method4932(this.aClass233_2.aClass250_81, this.anIntArray436[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray436.length; local52++) {
			if (local15[local52].anInt7617 < 13) {
				local15[local52].method5909();
			}
		}
		@Pc(91) Class264 local91;
		if (local15.length == 1) {
			local91 = local15[0];
		} else {
			local91 = new Class264(local15, local15.length);
		}
		if (local91 == null) {
			return null;
		}
		if (this.aShortArray80 != null) {
			for (local23 = 0; local23 < this.aShortArray80.length; local23++) {
				local91.method5907(this.aShortArray78[local23], this.aShortArray80[local23]);
			}
		}
		if (this.aShortArray79 != null) {
			for (local23 = 0; local23 < this.aShortArray79.length; local23++) {
				local91.method5914(this.aShortArray79[local23], this.aShortArray77[local23]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z")
	public boolean method4440() {
		if (this.anIntArray436 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class250 local16 = this.aClass233_2.aClass250_81;
		synchronized (this.aClass233_2.aClass250_81) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray436.length; local20++) {
				if (!this.aClass233_2.aClass250_81.method5660(this.anIntArray436[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Lclient!wk;")
	public Class264 method4441() {
		@Pc(8) Class264[] local8 = new Class264[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class250 local14 = this.aClass233_2.aClass250_81;
		@Pc(18) int local18;
		synchronized (this.aClass233_2.aClass250_81) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray438[local18] != -1) {
					local8[local10++] = Static358.method4932(this.aClass233_2.aClass250_81, this.anIntArray438[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt7617 < 13) {
				local8[local55].method5909();
			}
		}
		@Pc(83) Class264 local83 = new Class264(local8, local10);
		if (this.aShortArray80 != null) {
			for (local18 = 0; local18 < this.aShortArray80.length; local18++) {
				local83.method5907(this.aShortArray78[local18], this.aShortArray80[local18]);
			}
		}
		if (this.aShortArray79 != null) {
			for (local18 = 0; local18 < this.aShortArray79.length; local18++) {
				local83.method5914(this.aShortArray79[local18], this.aShortArray77[local18]);
			}
		}
		return local83;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	public boolean method4443() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class250 local11 = this.aClass233_2.aClass250_81;
		synchronized (this.aClass233_2.aClass250_81) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray438[local15] != -1 && !this.aClass233_2.aClass250_81.method5660(this.anIntArray438[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!lh;IB)V")
	private void method4444(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method4130();
			return;
		}
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local30 = arg0.method4130();
			this.anIntArray436 = new int[local30];
			for (local36 = 0; local36 < local30; local36++) {
				this.anIntArray436[local36] = arg0.method4093();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local30 = arg0.method4130();
				this.aShortArray78 = new short[local30];
				this.aShortArray80 = new short[local30];
				for (local36 = 0; local36 < local30; local36++) {
					this.aShortArray80[local36] = (short) arg0.method4093();
					this.aShortArray78[local36] = (short) arg0.method4093();
				}
			} else if (arg1 == 41) {
				local30 = arg0.method4130();
				this.aShortArray77 = new short[local30];
				this.aShortArray79 = new short[local30];
				for (local36 = 0; local36 < local30; local36++) {
					this.aShortArray79[local36] = (short) arg0.method4093();
					this.aShortArray77[local36] = (short) arg0.method4093();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray438[arg1 - 60] = arg0.method4093();
			}
		}
	}
}

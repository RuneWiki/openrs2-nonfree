import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class120 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!bi;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
	private final int[] anIntArray172 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Lclient!iq;")
	public Class178 method2834(@OriginalArg(0) int arg0) {
		@Pc(8) Class178[] local8 = new Class178[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class221 local14 = this.aClass29_1.aClass221_9;
		@Pc(18) int local18;
		synchronized (this.aClass29_1.aClass221_9) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					if (arg0 > -5) {
						this.aShortArray50 = null;
					}
					break;
				}
				if (this.anIntArray172[local18] != -1) {
					local8[local10++] = Static542.method7606(this.aClass29_1.aClass221_9, 0, true, this.anIntArray172[local18]);
				}
				local18++;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < 5; local68++) {
			if (local8[local68] != null && local8[local68].anInt5137 < 13) {
				local8[local68].method4270();
			}
		}
		@Pc(104) Class178 local104 = new Class178(local8, local10);
		if (this.aShortArray51 != null) {
			for (local18 = 0; local18 < this.aShortArray51.length; local18++) {
				local104.method4271(this.aShortArray51[local18], this.aShortArray49[local18]);
			}
		}
		if (this.aShortArray50 != null) {
			for (local18 = 0; local18 < this.aShortArray50.length; local18++) {
				local104.method4278(this.aShortArray52[local18], this.aShortArray50[local18]);
			}
		}
		return local104;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rba;IZ)V")
	private void method2835(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method5322(-68);
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (arg1 == 2) {
			local43 = arg0.method5322(-123);
			this.anIntArray171 = new int[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.anIntArray171[local53] = arg0.method5272();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local43 = arg0.method5322(-26);
				this.aShortArray51 = new short[local43];
				this.aShortArray49 = new short[local43];
				for (local53 = 0; local53 < local43; local53++) {
					this.aShortArray51[local53] = (short) arg0.method5272();
					this.aShortArray49[local53] = (short) arg0.method5272();
				}
			} else if (arg1 == 41) {
				local43 = arg0.method5322(-115);
				this.aShortArray52 = new short[local43];
				this.aShortArray50 = new short[local43];
				for (local53 = 0; local53 < local43; local53++) {
					this.aShortArray50[local53] = (short) arg0.method5272();
					this.aShortArray52[local53] = (short) arg0.method5272();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray172[arg1 - 60] = arg0.method5272();
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z")
	public boolean method2836() {
		if (this.anIntArray171 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		@Pc(17) Class221 local17 = this.aClass29_1.aClass221_9;
		synchronized (this.aClass29_1.aClass221_9) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray171.length; local21++) {
				if (!this.aClass29_1.aClass221_9.method5093(0, this.anIntArray171[local21])) {
					local13 = false;
				}
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
	public boolean method2837() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class221 local11 = this.aClass29_1.aClass221_9;
		synchronized (this.aClass29_1.aClass221_9) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray172[local15] != -1 && !this.aClass29_1.aClass221_9.method5093(0, this.anIntArray172[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!rba;)V")
	public void method2838(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5322(-72);
			if (local16 == 0) {
				return;
			}
			this.method2835(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)Lclient!iq;")
	public Class178 method2839() {
		if (this.anIntArray171 == null) {
			return null;
		}
		@Pc(16) Class178[] local16 = new Class178[this.anIntArray171.length];
		@Pc(20) Class221 local20 = this.aClass29_1.aClass221_9;
		@Pc(30) int local30;
		synchronized (this.aClass29_1.aClass221_9) {
			local30 = 0;
			while (true) {
				if (local30 >= this.anIntArray171.length) {
					break;
				}
				local16[local30] = Static542.method7606(this.aClass29_1.aClass221_9, 0, true, this.anIntArray171[local30]);
				local30++;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anIntArray171.length; local67++) {
			if (local16[local67].anInt5137 < 13) {
				local16[local67].method4270();
			}
		}
		@Pc(110) Class178 local110;
		if (local16.length == 1) {
			local110 = local16[0];
		} else {
			local110 = new Class178(local16, local16.length);
		}
		if (local110 == null) {
			return null;
		}
		if (this.aShortArray51 != null) {
			for (local30 = 0; local30 < this.aShortArray51.length; local30++) {
				local110.method4271(this.aShortArray51[local30], this.aShortArray49[local30]);
			}
		}
		if (this.aShortArray50 != null) {
			for (local30 = 0; local30 < this.aShortArray50.length; local30++) {
				local110.method4278(this.aShortArray52[local30], this.aShortArray50[local30]);
			}
		}
		return local110;
	}
}

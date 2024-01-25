import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class303 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!we;")
	public Class356 aClass356_2;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
	private final int[] anIntArray502 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ie;)V")
	public void method6596(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method6814();
			if (local18 == 0) {
				return;
			}
			this.method6599(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lclient!uo;")
	public Class332 method6597() {
		@Pc(14) Class332[] local14 = new Class332[5];
		@Pc(16) int local16 = 0;
		@Pc(20) Class284 local20 = this.aClass356_2.aClass284_168;
		@Pc(24) int local24;
		synchronized (this.aClass356_2.aClass284_168) {
			local24 = 0;
			while (true) {
				if (local24 >= 5) {
					break;
				}
				if (this.anIntArray502[local24] != -1) {
					local14[local16++] = Static326.method4807(this.anIntArray502[local24], this.aClass356_2.aClass284_168);
				}
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local14[local61] != null && local14[local61].anInt9539 < 13) {
				local14[local61].method7503();
			}
		}
		@Pc(91) Class332 local91 = new Class332(local14, local16);
		if (this.aShortArray128 != null) {
			for (local24 = 0; local24 < this.aShortArray128.length; local24++) {
				local91.method7498(this.aShortArray128[local24], this.aShortArray129[local24]);
			}
		}
		if (this.aShortArray127 != null) {
			for (local24 = 0; local24 < this.aShortArray127.length; local24++) {
				local91.method7496(this.aShortArray126[local24], this.aShortArray127[local24]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ie;BI)V")
	private void method6599(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method6814();
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (arg1 == 2) {
			local51 = arg0.method6814();
			this.anIntArray503 = new int[local51];
			for (local61 = 0; local61 < local51; local61++) {
				this.anIntArray503[local61] = arg0.method6811();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local51 = arg0.method6814();
				this.aShortArray128 = new short[local51];
				this.aShortArray129 = new short[local51];
				for (local61 = 0; local61 < local51; local61++) {
					this.aShortArray128[local61] = (short) arg0.method6811();
					this.aShortArray129[local61] = (short) arg0.method6811();
				}
			} else if (arg1 == 41) {
				local51 = arg0.method6814();
				this.aShortArray126 = new short[local51];
				this.aShortArray127 = new short[local51];
				for (local61 = 0; local61 < local51; local61++) {
					this.aShortArray127[local61] = (short) arg0.method6811();
					this.aShortArray126[local61] = (short) arg0.method6811();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray502[arg1 - 60] = arg0.method6811();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)Z")
	public boolean method6600() {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class284 local16 = this.aClass356_2.aClass284_168;
		synchronized (this.aClass356_2.aClass284_168) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray502[local20] != -1 && !this.aClass356_2.aClass284_168.method6336(this.anIntArray502[local20], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	public boolean method6602() {
		if (this.anIntArray503 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class284 local16 = this.aClass356_2.aClass284_168;
		synchronized (this.aClass356_2.aClass284_168) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray503.length; local20++) {
				if (!this.aClass356_2.aClass284_168.method6336(this.anIntArray503[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Lclient!uo;")
	public Class332 method6603() {
		if (this.anIntArray503 == null) {
			return null;
		}
		@Pc(15) Class332[] local15 = new Class332[this.anIntArray503.length];
		@Pc(19) Class284 local19 = this.aClass356_2.aClass284_168;
		@Pc(23) int local23;
		synchronized (this.aClass356_2.aClass284_168) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray503.length) {
					break;
				}
				local15[local23] = Static326.method4807(this.anIntArray503[local23], this.aClass356_2.aClass284_168);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray503.length; local56++) {
			if (local15[local56].anInt9539 < 13) {
				local15[local56].method7503();
			}
		}
		@Pc(88) Class332 local88;
		if (local15.length == 1) {
			local88 = local15[0];
		} else {
			local88 = new Class332(local15, local15.length);
		}
		if (local88 == null) {
			return null;
		}
		if (this.aShortArray128 != null) {
			for (local23 = 0; local23 < this.aShortArray128.length; local23++) {
				local88.method7498(this.aShortArray128[local23], this.aShortArray129[local23]);
			}
		}
		if (this.aShortArray127 != null) {
			for (local23 = 0; local23 < this.aShortArray127.length; local23++) {
				local88.method7496(this.aShortArray126[local23], this.aShortArray127[local23]);
			}
		}
		return local88;
	}
}

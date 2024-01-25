import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class290 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "[I")
	private int[] anIntArray669;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!ib;")
	public Class125 aClass125_2;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
	private final int[] anIntArray668 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class202("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZLclient!ps;)V")
	public void method7325(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method7331(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Lclient!bt;")
	public Class29 method7326() {
		@Pc(8) Class29[] local8 = new Class29[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class53 local14 = this.aClass125_2.aClass53_64;
		@Pc(18) int local18;
		synchronized (this.aClass125_2.aClass53_64) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray668[local18] != -1) {
					local8[local10++] = Static342.method5377(this.anIntArray668[local18], this.aClass125_2.aClass53_64);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt849 < 13) {
				local8[local55].method868();
			}
		}
		@Pc(85) Class29 local85 = new Class29(local8, local10);
		if (this.aShortArray113 != null) {
			for (local18 = 0; local18 < this.aShortArray113.length; local18++) {
				local85.method867(this.aShortArray111[local18], this.aShortArray113[local18]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local18 = 0; local18 < this.aShortArray112.length; local18++) {
				local85.method872(this.aShortArray114[local18], this.aShortArray112[local18]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)Lclient!bt;")
	public Class29 method7328() {
		if (this.anIntArray669 == null) {
			return null;
		}
		@Pc(15) Class29[] local15 = new Class29[this.anIntArray669.length];
		@Pc(19) Class53 local19 = this.aClass125_2.aClass53_64;
		@Pc(23) int local23;
		synchronized (this.aClass125_2.aClass53_64) {
			local23 = 0;
			while (true) {
				if (this.anIntArray669.length <= local23) {
					break;
				}
				local15[local23] = Static342.method5377(this.anIntArray669[local23], this.aClass125_2.aClass53_64);
				local23++;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anIntArray669.length; local67++) {
			if (local15[local67].anInt849 < 13) {
				local15[local67].method868();
			}
		}
		@Pc(101) Class29 local101;
		if (local15.length == 1) {
			local101 = local15[0];
		} else {
			local101 = new Class29(local15, local15.length);
		}
		if (local101 == null) {
			return null;
		}
		if (this.aShortArray113 != null) {
			for (local23 = 0; local23 < this.aShortArray113.length; local23++) {
				local101.method867(this.aShortArray111[local23], this.aShortArray113[local23]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local23 = 0; local23 < this.aShortArray112.length; local23++) {
				local101.method872(this.aShortArray114[local23], this.aShortArray112[local23]);
			}
		}
		return local101;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Z")
	public boolean method7329() {
		if (this.anIntArray669 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class53 local16 = this.aClass125_2.aClass53_64;
		synchronized (this.aClass125_2.aClass53_64) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray669.length; local20++) {
				if (!this.aClass125_2.aClass53_64.method1591(this.anIntArray669[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	public boolean method7330() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class53 local11 = this.aClass125_2.aClass53_64;
		synchronized (this.aClass125_2.aClass53_64) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray668[local15] != -1 && !this.aClass125_2.aClass53_64.method1591(this.anIntArray668[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method7331(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29 arg1) {
		if (arg0 == 1) {
			arg1.method5170();
			return;
		}
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (arg0 == 2) {
			local26 = arg1.method5170();
			this.anIntArray669 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.anIntArray669[local32] = arg1.method5229();
			}
			return;
		}
		if (arg0 == 3) {
			return;
		}
		if (arg0 == 40) {
			local26 = arg1.method5170();
			this.aShortArray113 = new short[local26];
			this.aShortArray111 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray113[local32] = (short) arg1.method5229();
				this.aShortArray111[local32] = (short) arg1.method5229();
			}
		} else if (arg0 == 41) {
			local26 = arg1.method5170();
			this.aShortArray114 = new short[local26];
			this.aShortArray112 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray112[local32] = (short) arg1.method5229();
				this.aShortArray114[local32] = (short) arg1.method5229();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray668[arg0 - 60] = arg1.method5229();
			return;
		}
		return;
	}
}

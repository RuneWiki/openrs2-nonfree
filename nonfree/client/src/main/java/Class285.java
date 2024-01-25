import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class285 {

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Lclient!cl;")
	public Class55 aClass55_2;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public int anInt8180 = 0;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	private int anInt8178 = -1;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public int anInt8184 = 0;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private int anInt8189 = -1;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
	private String aString110 = "";

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int anInt8186 = -1;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public int anInt8185 = 16777215;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt8177 = -1;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
	public int anInt8192 = -1;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt8182 = 0;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	private int anInt8194 = -1;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	private int anInt8181 = -1;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public int anInt8196 = 70;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!ha;)Lclient!ho;")
	public Class9 method6975(@OriginalArg(1) Class132 arg0) {
		if (this.anInt8178 < 0) {
			return null;
		}
		@Pc(26) Class9 local26 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8178);
		if (local26 == null) {
			this.method6980(arg0);
			local26 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8178);
		}
		return local26;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ha;)Lclient!ho;")
	public Class9 method6976(@OriginalArg(1) Class132 arg0) {
		if (this.anInt8189 < 0) {
			return null;
		}
		@Pc(29) Class9 local29 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8189);
		if (local29 == null) {
			this.method6980(arg0);
			local29 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8189);
		}
		return local29;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6977(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = this.aString110;
		while (true) {
			@Pc(17) int local17 = local8.indexOf("%1");
			if (local17 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local17) + Static260.method8772(arg0, false) + local8.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method6978(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt8192 = arg1.method8363();
		} else if (arg0 == 2) {
			this.anInt8185 = arg1.method8344();
		} else if (arg0 == 3) {
			this.anInt8178 = arg1.method8363();
		} else if (arg0 == 4) {
			this.anInt8189 = arg1.method8363();
		} else if (arg0 == 5) {
			this.anInt8194 = arg1.method8363();
		} else if (arg0 == 6) {
			this.anInt8181 = arg1.method8363();
		} else if (arg0 == 7) {
			this.anInt8184 = arg1.method8395();
		} else if (arg0 == 8) {
			this.aString110 = arg1.method8379();
		} else if (arg0 == 9) {
			this.anInt8196 = arg1.method8363();
		} else if (arg0 == 10) {
			this.anInt8182 = arg1.method8395();
		} else if (arg0 == 11) {
			this.anInt8177 = 0;
		} else if (arg0 == 12) {
			this.anInt8186 = arg1.method8374();
		} else if (arg0 == 13) {
			this.anInt8180 = arg1.method8395();
		} else if (arg0 == 14) {
			this.anInt8177 = arg1.method8363();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ha;B)Lclient!ho;")
	public Class9 method6979(@OriginalArg(0) Class132 arg0) {
		if (this.anInt8194 < 0) {
			return null;
		}
		@Pc(23) Class9 local23 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8194);
		if (local23 == null) {
			this.method6980(arg0);
			local23 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8194);
		}
		return local23;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!ha;B)V")
	private void method6980(@OriginalArg(0) Class132 arg0) {
		@Pc(13) Class8 local13 = this.aClass55_2.aClass8_24;
		@Pc(39) Class112 local39;
		if (this.anInt8178 >= 0 && this.aClass55_2.aClass10_2.method373((long) this.anInt8178) == null && local13.method273(this.anInt8178)) {
			local39 = Static681.method2317(local13, this.anInt8178);
			this.aClass55_2.aClass10_2.method366(arg0.method7488(local39, true), (long) this.anInt8178);
		}
		if (this.anInt8194 >= 0 && this.aClass55_2.aClass10_2.method373((long) this.anInt8194) == null && local13.method273(this.anInt8194)) {
			local39 = Static681.method2317(local13, this.anInt8194);
			this.aClass55_2.aClass10_2.method366(arg0.method7488(local39, true), (long) this.anInt8194);
		}
		if (this.anInt8189 >= 0 && this.aClass55_2.aClass10_2.method373((long) this.anInt8189) == null && local13.method273(this.anInt8189)) {
			local39 = Static681.method2317(local13, this.anInt8189);
			this.aClass55_2.aClass10_2.method366(arg0.method7488(local39, true), (long) this.anInt8189);
		}
		if (this.anInt8181 >= 0 && this.aClass55_2.aClass10_2.method373((long) this.anInt8181) == null && local13.method273(this.anInt8181)) {
			local39 = Static681.method2317(local13, this.anInt8181);
			this.aClass55_2.aClass10_2.method366(arg0.method7488(local39, true), (long) this.anInt8181);
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lclient!ha;B)Lclient!ho;")
	public Class9 method6981(@OriginalArg(0) Class132 arg0) {
		if (this.anInt8181 < 0) {
			return null;
		}
		@Pc(18) Class9 local18 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8181);
		if (local18 == null) {
			this.method6980(arg0);
			local18 = (Class9) this.aClass55_2.aClass10_2.method373((long) this.anInt8181);
		}
		return local18;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gga;Z)V")
	public void method6982(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method6978(local9, arg0);
		}
	}
}

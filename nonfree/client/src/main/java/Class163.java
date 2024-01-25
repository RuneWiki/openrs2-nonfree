import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class163 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!wc;")
	public Class372 aClass372_1;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public int anInt4300 = 70;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	private int anInt4303 = -1;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int anInt4309 = -1;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	public int anInt4310 = -1;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
	public int anInt4311 = -1;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	public int anInt4307 = 16777215;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	private int anInt4312 = -1;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
	public int anInt4308 = 0;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Ljava/lang/String;")
	private String aString45 = "";

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
	public int anInt4317 = 0;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public int anInt4301 = -1;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	private int anInt4315 = -1;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	public int anInt4319 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ha;B)Lclient!it;")
	public Class28 method3901(@OriginalArg(0) Class133 arg0) {
		if (this.anInt4309 < 0) {
			return null;
		}
		@Pc(26) Class28 local26 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4309);
		if (local26 == null) {
			this.method3909(arg0);
			local26 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4309);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lclient!ha;B)Lclient!it;")
	public Class28 method3902(@OriginalArg(0) Class133 arg0) {
		if (this.anInt4312 < 0) {
			return null;
		}
		@Pc(27) Class28 local27 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4312);
		if (local27 == null) {
			this.method3909(arg0);
			local27 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4312);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(Lclient!ha;B)Lclient!it;")
	public Class28 method3903(@OriginalArg(0) Class133 arg0) {
		if (this.anInt4303 < 0) {
			return null;
		}
		@Pc(26) Class28 local26 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4303);
		if (local26 == null) {
			this.method3909(arg0);
			local26 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4303);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ha;I)Lclient!it;")
	public Class28 method3904(@OriginalArg(0) Class133 arg0) {
		if (this.anInt4315 < 0) {
			return null;
		}
		@Pc(21) Class28 local21 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4315);
		if (local21 == null) {
			this.method3909(arg0);
			local21 = (Class28) this.aClass372_1.aClass87_246.method1805((long) this.anInt4315);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ofa;Z)V")
	public void method3905(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5966();
			if (local17 == 0) {
				return;
			}
			this.method3906(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZILclient!ofa;)V")
	private void method3906(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt4310 = arg1.method5968();
		} else if (arg0 == 2) {
			this.anInt4307 = arg1.method5931();
		} else if (arg0 == 3) {
			this.anInt4315 = arg1.method5968();
		} else if (arg0 == 4) {
			this.anInt4303 = arg1.method5968();
		} else if (arg0 == 5) {
			this.anInt4309 = arg1.method5968();
		} else if (arg0 == 6) {
			this.anInt4312 = arg1.method5968();
		} else if (arg0 == 7) {
			this.anInt4317 = arg1.method5956();
		} else if (arg0 == 8) {
			this.aString45 = arg1.method5923();
		} else if (arg0 == 9) {
			this.anInt4300 = arg1.method5968();
		} else if (arg0 == 10) {
			this.anInt4308 = arg1.method5956();
		} else if (arg0 == 11) {
			this.anInt4311 = 0;
			return;
		} else if (arg0 == 12) {
			this.anInt4301 = arg1.method5966();
			return;
		} else if (arg0 == 13) {
			this.anInt4319 = arg1.method5956();
			return;
		} else if (arg0 == 14) {
			this.anInt4311 = arg1.method5968();
			return;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3907(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString45;
		while (true) {
			@Pc(20) int local20 = local8.indexOf("%1");
			if (local20 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local20) + Static410.method6311(arg0, false) + local8.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ha;)V")
	private void method3909(@OriginalArg(1) Class133 arg0) {
		@Pc(7) Class207 local7 = this.aClass372_1.aClass207_128;
		@Pc(33) Class131 local33;
		if (this.anInt4315 >= 0 && this.aClass372_1.aClass87_246.method1805((long) this.anInt4315) == null && local7.method4678(this.anInt4315)) {
			local33 = Static649.method2900(local7, this.anInt4315);
			this.aClass372_1.aClass87_246.method1792((long) this.anInt4315, arg0.method7297(local33, true));
		}
		if (this.anInt4309 >= 0 && this.aClass372_1.aClass87_246.method1805((long) this.anInt4309) == null && local7.method4678(this.anInt4309)) {
			local33 = Static649.method2900(local7, this.anInt4309);
			this.aClass372_1.aClass87_246.method1792((long) this.anInt4309, arg0.method7297(local33, true));
		}
		if (this.anInt4303 >= 0 && this.aClass372_1.aClass87_246.method1805((long) this.anInt4303) == null && local7.method4678(this.anInt4303)) {
			local33 = Static649.method2900(local7, this.anInt4303);
			this.aClass372_1.aClass87_246.method1792((long) this.anInt4303, arg0.method7297(local33, true));
		}
		if (this.anInt4312 >= 0 && this.aClass372_1.aClass87_246.method1805((long) this.anInt4312) == null && local7.method4678(this.anInt4312)) {
			local33 = Static649.method2900(local7, this.anInt4312);
			this.aClass372_1.aClass87_246.method1792((long) this.anInt4312, arg0.method7297(local33, true));
		}
	}
}

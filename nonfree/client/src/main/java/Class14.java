import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class14 {

	@OriginalMember(owner = "client!aha", name = "o", descriptor = "Lclient!rg;")
	public Class313 aClass313_1;

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
	private int anInt196 = -1;

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
	public int anInt197 = -1;

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
	private int anInt205 = -1;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
	public int anInt193 = 0;

	@OriginalMember(owner = "client!aha", name = "u", descriptor = "I")
	public int anInt209 = 70;

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
	public int anInt208 = 0;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
	public int anInt213 = -1;

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
	private int anInt212 = -1;

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "I")
	private int anInt215 = -1;

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "I")
	public int anInt216 = 0;

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "I")
	public int anInt202 = 16777215;

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
	public int anInt201 = -1;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(BLclient!ha;)Lclient!tb;")
	public Class49 method185(@OriginalArg(1) Class75 arg0) {
		if (this.anInt205 < 0) {
			return null;
		}
		@Pc(28) Class49 local28 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt205);
		if (local28 == null) {
			this.method195(arg0);
			local28 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt205);
		}
		return local28;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method186(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString7;
		while (true) {
			@Pc(20) int local20 = local8.indexOf("%1");
			if (local20 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local20) + Static240.method4225(false, arg0) + local8.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLclient!ha;)Lclient!tb;")
	public Class49 method187(@OriginalArg(1) Class75 arg0) {
		if (this.anInt196 < 0) {
			return null;
		}
		@Pc(27) Class49 local27 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt196);
		if (local27 == null) {
			this.method195(arg0);
			local27 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt196);
		}
		return local27;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method188(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3030();
			if (local17 == 0) {
				return;
			}
			this.method191(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	public Class49 method190(@OriginalArg(0) Class75 arg0) {
		if (this.anInt212 < 0) {
			return null;
		}
		@Pc(30) Class49 local30 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt212);
		if (local30 == null) {
			this.method195(arg0);
			local30 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt212);
		}
		return local30;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ILclient!jc;B)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt213 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt202 = arg1.method2987();
		} else if (arg0 == 3) {
			this.anInt205 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt196 = arg1.method3018();
		} else if (arg0 == 5) {
			this.anInt212 = arg1.method3018();
		} else if (arg0 == 6) {
			this.anInt215 = arg1.method3018();
		} else if (arg0 == 7) {
			this.anInt193 = arg1.method2989();
		} else if (arg0 == 8) {
			this.aString7 = arg1.method2998();
		} else if (arg0 == 9) {
			this.anInt209 = arg1.method3018();
		} else if (arg0 == 10) {
			this.anInt208 = arg1.method2989();
		} else if (arg0 == 11) {
			this.anInt201 = 0;
		} else if (arg0 == 12) {
			this.anInt197 = arg1.method3030();
		} else if (arg0 == 13) {
			this.anInt216 = arg1.method2989();
		} else if (arg0 == 14) {
			this.anInt201 = arg1.method3018();
			return;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!ha;B)Lclient!tb;")
	public Class49 method192(@OriginalArg(0) Class75 arg0) {
		if (this.anInt215 < 0) {
			return null;
		}
		@Pc(29) Class49 local29 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt215);
		if (local29 == null) {
			this.method195(arg0);
			local29 = (Class49) this.aClass313_1.aClass359_59.method8517((long) this.anInt215);
		}
		return local29;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(BLclient!ha;)V")
	private void method195(@OriginalArg(1) Class75 arg0) {
		@Pc(7) Class223 local7 = this.aClass313_1.aClass223_101;
		@Pc(37) Class64 local37;
		if (this.anInt205 >= 0 && this.aClass313_1.aClass359_59.method8517((long) this.anInt205) == null && local7.method5285(this.anInt205)) {
			local37 = Static691.method1246(local7, this.anInt205);
			this.aClass313_1.aClass359_59.method8515((long) this.anInt205, arg0.method6714(local37, true));
		}
		if (this.anInt212 >= 0 && this.aClass313_1.aClass359_59.method8517((long) this.anInt212) == null && local7.method5285(this.anInt212)) {
			local37 = Static691.method1246(local7, this.anInt212);
			this.aClass313_1.aClass359_59.method8515((long) this.anInt212, arg0.method6714(local37, true));
		}
		if (this.anInt196 >= 0 && this.aClass313_1.aClass359_59.method8517((long) this.anInt196) == null && local7.method5285(this.anInt196)) {
			local37 = Static691.method1246(local7, this.anInt196);
			this.aClass313_1.aClass359_59.method8515((long) this.anInt196, arg0.method6714(local37, true));
		}
		if (this.anInt215 >= 0 && this.aClass313_1.aClass359_59.method8517((long) this.anInt215) == null && local7.method5285(this.anInt215)) {
			local37 = Static691.method1246(local7, this.anInt215);
			this.aClass313_1.aClass359_59.method8515((long) this.anInt215, arg0.method6714(local37, true));
		}
	}
}

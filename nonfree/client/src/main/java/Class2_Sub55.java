import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class2_Sub55 extends Class2 {

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	private int anInt11424;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
	private int anInt11426;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
	private String aString131;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	private int anInt11428;

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
	private int anInt11429;

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "Ljava/lang/String;")
	private String aString132;

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
	private int anInt11430;

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
	private int anInt11431;

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
	private int anInt11432;

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "Z")
	private boolean aBoolean807;

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
	private int anInt11438;

	@OriginalMember(owner = "client!wv", name = "G", descriptor = "Ljava/lang/String;")
	private String aString133;

	@OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
	private int anInt11439;

	@OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
	private int anInt11440;

	@OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
	private int anInt11441;

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
	private int anInt11442;

	@OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
	private int anInt11443;

	@OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
	public int anInt11444;

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "Z")
	private boolean aBoolean809;

	@OriginalMember(owner = "client!wv", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString134;

	@OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
	private int anInt11446;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	private Class2_Sub55() {
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ZLclient!cea;)V")
	public Class2_Sub55(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		if (Static72.aString13.startsWith("win")) {
			this.anInt11446 = 1;
		} else if (Static72.aString13.startsWith("mac")) {
			this.anInt11446 = 2;
		} else if (Static72.aString13.startsWith("linux")) {
			this.anInt11446 = 3;
		} else {
			this.anInt11446 = 4;
		}
		if (Static72.aString16.startsWith("amd64") || Static72.aString16.startsWith("x86_64")) {
			this.aBoolean807 = true;
		} else {
			this.aBoolean807 = false;
		}
		if (this.anInt11446 == 1) {
			if (Static72.aString17.indexOf("4.0") != -1) {
				this.anInt11428 = 1;
			} else if (Static72.aString17.indexOf("4.1") != -1) {
				this.anInt11428 = 2;
			} else if (Static72.aString17.indexOf("4.9") != -1) {
				this.anInt11428 = 3;
			} else if (Static72.aString17.indexOf("5.0") != -1) {
				this.anInt11428 = 4;
			} else if (Static72.aString17.indexOf("5.1") != -1) {
				this.anInt11428 = 5;
			} else if (Static72.aString17.indexOf("6.0") != -1) {
				this.anInt11428 = 6;
			} else if (Static72.aString17.indexOf("6.1") != -1) {
				this.anInt11428 = 7;
			}
		} else if (this.anInt11446 == 2) {
			if (Static72.aString17.indexOf("10.4") != -1) {
				this.anInt11428 = 20;
			} else if (Static72.aString17.indexOf("10.5") != -1) {
				this.anInt11428 = 21;
			} else if (Static72.aString17.indexOf("10.6") != -1) {
				this.anInt11428 = 22;
			}
		}
		if (Static72.aString14.toLowerCase().indexOf("sun") != -1) {
			this.anInt11424 = 1;
		} else if (Static72.aString14.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt11424 = 2;
		} else if (Static72.aString14.toLowerCase().indexOf("apple") == -1) {
			this.anInt11424 = 4;
		} else {
			this.anInt11424 = 3;
		}
		@Pc(208) int local208 = 2;
		@Pc(210) int local210 = 0;
		@Pc(216) char local216;
		try {
			while (Static72.aString15.length() > local208) {
				local216 = Static72.aString15.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local210 = local216 + local210 * 10 - 48;
				local208++;
			}
		} catch (@Pc(243) Exception local243) {
		}
		this.anInt11439 = local210;
		local210 = 0;
		local208 = Static72.aString15.indexOf(46, 2) + 1;
		try {
			while (Static72.aString15.length() > local208) {
				local216 = Static72.aString15.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local208++;
				local210 = local210 * 10 + local216 - 48;
			}
		} catch (@Pc(293) Exception local293) {
		}
		this.anInt11432 = local210;
		local208 = Static72.aString15.indexOf(95, 4) + 1;
		local210 = 0;
		try {
			while (local208 < Static72.aString15.length()) {
				local216 = Static72.aString15.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local208++;
				local210 = local210 * 10 + local216 - 48;
			}
		} catch (@Pc(334) Exception local334) {
		}
		this.anInt11441 = local210;
		if (arg1.aBoolean75) {
			this.aBoolean809 = false;
		} else {
			this.aBoolean809 = true;
		}
		if (this.anInt11439 > 3) {
			this.anInt11429 = Static38.anInt792;
		} else {
			this.anInt11429 = 0;
		}
		this.anInt11442 = Static65.anInt1229;
		try {
			@Pc(367) int[] local367 = HardwareInfo.getCPUInfo();
			if (local367 != null && local367.length == 7) {
				this.anInt11426 = local367[4];
				this.anInt11444 = local367[6];
				this.anInt11440 = local367[5];
				this.anInt11443 = local367[3];
				this.anInt11431 = local367[2];
			}
		} catch (@Pc(400) Throwable local400) {
			this.anInt11444 = 0;
		}
		if (this.aString134 == null) {
			this.aString134 = "";
		}
		if (this.aString133 == null) {
			this.aString133 = "";
		}
		if (this.aString132 == null) {
			this.aString132 = "";
		}
		if (this.aString131 == null) {
			this.aString131 = "";
		}
		this.method9815();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)I")
	public int method9814() {
		@Pc(12) int local12 = Static14.method7644(this.aString131) + 23;
		@Pc(19) int local19 = local12 + Static14.method7644(this.aString132);
		@Pc(26) int local26 = local19 + Static14.method7644(this.aString133);
		return local26 + Static14.method7644(this.aString134);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	private void method9815() {
		if (this.aString131.length() > 40) {
			this.aString131 = this.aString131.substring(0, 40);
		}
		if (this.aString132.length() > 40) {
			this.aString132 = this.aString132.substring(0, 40);
		}
		if (this.aString133.length() > 10) {
			this.aString133 = this.aString133.substring(0, 10);
		}
		if (this.aString134.length() > 10) {
			this.aString134 = this.aString134.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ol;Z)V")
	public void method9816(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method5170(5);
		arg0.method5170(this.anInt11446);
		arg0.method5170(this.aBoolean807 ? 1 : 0);
		arg0.method5170(this.anInt11428);
		arg0.method5170(this.anInt11424);
		arg0.method5170(this.anInt11439);
		arg0.method5170(this.anInt11432);
		arg0.method5170(this.anInt11441);
		arg0.method5170(this.aBoolean809 ? 1 : 0);
		arg0.method5192(this.anInt11442);
		arg0.method5170(this.anInt11429);
		arg0.method5181(this.anInt11444);
		arg0.method5192(this.anInt11431);
		arg0.method5170(this.anInt11443);
		arg0.method5170(this.anInt11426);
		arg0.method5170(this.anInt11440);
		arg0.method5191(this.aString131);
		arg0.method5191(this.aString132);
		arg0.method5191(this.aString133);
		arg0.method5191(this.aString134);
		arg0.method5170(this.anInt11438);
		arg0.method5192(this.anInt11430);
	}
}

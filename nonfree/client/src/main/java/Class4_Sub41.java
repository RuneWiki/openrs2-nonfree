import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	private int anInt7523;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Z")
	private boolean aBoolean589;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	private int anInt7525;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Ljava/lang/String;")
	private String aString91;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	private int anInt7527;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
	private int anInt7528;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
	private int anInt7529;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	private int anInt7530;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
	private int anInt7532;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
	private int anInt7534;

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "Ljava/lang/String;")
	private String aString94;

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
	private int anInt7537;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
	private int anInt7538;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
	private int anInt7539;

	@OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
	private int anInt7540;

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
	private int anInt7543;

	@OriginalMember(owner = "client!pv", name = "H", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	private Class4_Sub41() {
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ZLclient!lc;)V")
	public Class4_Sub41(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class207 arg1) {
		if (Static332.aString65.startsWith("win")) {
			this.anInt7527 = 1;
		} else if (Static332.aString65.startsWith("mac")) {
			this.anInt7527 = 2;
		} else if (Static332.aString65.startsWith("linux")) {
			this.anInt7527 = 3;
		} else {
			this.anInt7527 = 4;
		}
		if (Static332.aString64.startsWith("amd64") || Static332.aString64.startsWith("x86_64")) {
			this.aBoolean589 = true;
		} else {
			this.aBoolean589 = false;
		}
		if (this.anInt7527 == 1) {
			if (Static332.aString62.indexOf("4.0") != -1) {
				this.anInt7543 = 1;
			} else if (Static332.aString62.indexOf("4.1") != -1) {
				this.anInt7543 = 2;
			} else if (Static332.aString62.indexOf("4.9") != -1) {
				this.anInt7543 = 3;
			} else if (Static332.aString62.indexOf("5.0") != -1) {
				this.anInt7543 = 4;
			} else if (Static332.aString62.indexOf("5.1") != -1) {
				this.anInt7543 = 5;
			} else if (Static332.aString62.indexOf("6.0") != -1) {
				this.anInt7543 = 6;
			} else if (Static332.aString62.indexOf("6.1") != -1) {
				this.anInt7543 = 7;
			}
		} else if (this.anInt7527 == 2) {
			if (Static332.aString62.indexOf("10.4") != -1) {
				this.anInt7543 = 20;
			} else if (Static332.aString62.indexOf("10.5") != -1) {
				this.anInt7543 = 21;
			} else if (Static332.aString62.indexOf("10.6") != -1) {
				this.anInt7543 = 22;
			}
		}
		if (Static332.aString67.toLowerCase().indexOf("sun") != -1) {
			this.anInt7530 = 1;
		} else if (Static332.aString67.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7530 = 2;
		} else if (Static332.aString67.toLowerCase().indexOf("apple") == -1) {
			this.anInt7530 = 4;
		} else {
			this.anInt7530 = 3;
		}
		@Pc(207) int local207 = 2;
		@Pc(209) int local209 = 0;
		@Pc(215) char local215;
		try {
			while (Static332.aString66.length() > local207) {
				local215 = Static332.aString66.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local207++;
				local209 = local215 + local209 * 10 - 48;
			}
		} catch (@Pc(239) Exception local239) {
		}
		this.anInt7528 = local209;
		local209 = 0;
		local207 = Static332.aString66.indexOf(46, 2) + 1;
		try {
			while (Static332.aString66.length() > local207) {
				local215 = Static332.aString66.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local207++;
				local209 = local215 + local209 * 10 - 48;
			}
		} catch (@Pc(281) Exception local281) {
		}
		this.anInt7532 = local209;
		local209 = 0;
		local207 = Static332.aString66.indexOf(95, 4) + 1;
		try {
			while (local207 < Static332.aString66.length()) {
				local215 = Static332.aString66.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local209 = local209 * 10 + local215 - 48;
				local207++;
			}
		} catch (@Pc(326) Exception local326) {
		}
		if (this.anInt7528 > 3) {
			this.anInt7540 = Static346.anInt5281;
		} else {
			this.anInt7540 = 0;
		}
		if (arg1.aBoolean399) {
			this.aBoolean590 = false;
		} else {
			this.aBoolean590 = true;
		}
		this.anInt7539 = Static197.anInt5439;
		this.anInt7534 = local209;
		try {
			@Pc(359) int[] local359 = HardwareInfo.getCPUInfo();
			if (local359 != null && local359.length == 7) {
				this.anInt7538 = local359[3];
				this.anInt7529 = local359[2];
				this.anInt7533 = local359[6];
				this.anInt7523 = local359[4];
				this.anInt7542 = local359[5];
			}
		} catch (@Pc(394) Throwable local394) {
			this.anInt7533 = 0;
		}
		if (this.aString94 == null) {
			this.aString94 = "";
		}
		if (this.aString92 == null) {
			this.aString92 = "";
		}
		if (this.aString91 == null) {
			this.aString91 = "";
		}
		if (this.aString93 == null) {
			this.aString93 = "";
		}
		this.method6545();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	private void method6545() {
		if (this.aString94.length() > 40) {
			this.aString94 = this.aString94.substring(0, 40);
		}
		if (this.aString91.length() > 40) {
			this.aString91 = this.aString91.substring(0, 40);
		}
		if (this.aString93.length() > 10) {
			this.aString93 = this.aString93.substring(0, 10);
		}
		if (this.aString92.length() > 10) {
			this.aString92 = this.aString92.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)I")
	public int method6547() {
		@Pc(12) int local12 = Static557.method7403(this.aString94) + 23;
		@Pc(19) int local19 = local12 + Static557.method7403(this.aString91);
		@Pc(33) int local33 = local19 + Static557.method7403(this.aString93);
		return local33 + Static557.method7403(this.aString92);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLclient!es;)V")
	public void method6548(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.method8822(5);
		arg0.method8822(this.anInt7527);
		arg0.method8822(this.aBoolean589 ? 1 : 0);
		arg0.method8822(this.anInt7543);
		arg0.method8822(this.anInt7530);
		arg0.method8822(this.anInt7528);
		arg0.method8822(this.anInt7532);
		arg0.method8822(this.anInt7534);
		arg0.method8822(this.aBoolean590 ? 1 : 0);
		arg0.method8838(this.anInt7539);
		arg0.method8822(this.anInt7540);
		arg0.method8892(this.anInt7533);
		arg0.method8838(this.anInt7529);
		arg0.method8822(this.anInt7538);
		arg0.method8822(this.anInt7523);
		arg0.method8822(this.anInt7542);
		arg0.method8858(this.aString94);
		arg0.method8858(this.aString91);
		arg0.method8858(this.aString93);
		arg0.method8858(this.aString92);
		arg0.method8822(this.anInt7537);
		arg0.method8838(this.anInt7525);
	}
}

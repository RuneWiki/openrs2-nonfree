import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!ija", name = "l", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!ija", name = "n", descriptor = "I")
	public int anInt4762;

	@OriginalMember(owner = "client!ija", name = "o", descriptor = "I")
	private int anInt4763;

	@OriginalMember(owner = "client!ija", name = "p", descriptor = "I")
	private int anInt4764;

	@OriginalMember(owner = "client!ija", name = "q", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!ija", name = "s", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!ija", name = "u", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!ija", name = "v", descriptor = "I")
	private int anInt4768;

	@OriginalMember(owner = "client!ija", name = "w", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
	private int anInt4769;

	@OriginalMember(owner = "client!ija", name = "A", descriptor = "I")
	private int anInt4772;

	@OriginalMember(owner = "client!ija", name = "B", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!ija", name = "D", descriptor = "I")
	private int anInt4775;

	@OriginalMember(owner = "client!ija", name = "E", descriptor = "I")
	private int anInt4776;

	@OriginalMember(owner = "client!ija", name = "F", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!ija", name = "G", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!ija", name = "H", descriptor = "I")
	private int anInt4777;

	@OriginalMember(owner = "client!ija", name = "J", descriptor = "I")
	private int anInt4778;

	@OriginalMember(owner = "client!ija", name = "K", descriptor = "I")
	private int anInt4779;

	@OriginalMember(owner = "client!ija", name = "M", descriptor = "I")
	private int anInt4781;

	@OriginalMember(owner = "client!ija", name = "O", descriptor = "I")
	private int anInt4783;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(ZLclient!oq;)V")
	public Class5_Sub30(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class268 arg1) {
		if (Static429.aString64.startsWith("win")) {
			this.anInt4783 = 1;
		} else if (Static429.aString64.startsWith("mac")) {
			this.anInt4783 = 2;
		} else if (Static429.aString64.startsWith("linux")) {
			this.anInt4783 = 3;
		} else {
			this.anInt4783 = 4;
		}
		if (Static429.aString65.startsWith("amd64") || Static429.aString65.startsWith("x86_64")) {
			this.aBoolean400 = true;
		} else {
			this.aBoolean400 = false;
		}
		if (this.anInt4783 == 1) {
			if (Static429.aString69.indexOf("4.0") != -1) {
				this.anInt4773 = 1;
			} else if (Static429.aString69.indexOf("4.1") != -1) {
				this.anInt4773 = 2;
			} else if (Static429.aString69.indexOf("4.9") != -1) {
				this.anInt4773 = 3;
			} else if (Static429.aString69.indexOf("5.0") != -1) {
				this.anInt4773 = 4;
			} else if (Static429.aString69.indexOf("5.1") != -1) {
				this.anInt4773 = 5;
			} else if (Static429.aString69.indexOf("6.0") != -1) {
				this.anInt4773 = 6;
			} else if (Static429.aString69.indexOf("6.1") != -1) {
				this.anInt4773 = 7;
			}
		} else if (this.anInt4783 == 2) {
			if (Static429.aString69.indexOf("10.4") != -1) {
				this.anInt4773 = 20;
			} else if (Static429.aString69.indexOf("10.5") != -1) {
				this.anInt4773 = 21;
			} else if (Static429.aString69.indexOf("10.6") != -1) {
				this.anInt4773 = 22;
			}
		}
		if (Static429.aString71.toLowerCase().indexOf("sun") != -1) {
			this.anInt4779 = 1;
		} else if (Static429.aString71.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4779 = 2;
		} else if (Static429.aString71.toLowerCase().indexOf("apple") == -1) {
			this.anInt4779 = 4;
		} else {
			this.anInt4779 = 3;
		}
		@Pc(210) int local210 = 2;
		@Pc(212) int local212 = 0;
		@Pc(218) char local218;
		try {
			while (local210 < Static429.aString66.length()) {
				local218 = Static429.aString66.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local210++;
				local212 = local212 * 10 + local218 - 48;
			}
		} catch (@Pc(246) Exception local246) {
		}
		this.anInt4777 = local212;
		local212 = 0;
		local210 = Static429.aString66.indexOf(46, 2) + 1;
		try {
			while (local210 < Static429.aString66.length()) {
				local218 = Static429.aString66.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local210++;
				local212 = local212 * 10 + local218 - 48;
			}
		} catch (@Pc(290) Exception local290) {
		}
		this.anInt4772 = local212;
		local210 = Static429.aString66.indexOf(95, 4) + 1;
		local212 = 0;
		try {
			while (local210 < Static429.aString66.length()) {
				local218 = Static429.aString66.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local212 = local218 + local212 * 10 - 48;
				local210++;
			}
		} catch (@Pc(333) Exception local333) {
		}
		if (arg1.aBoolean644) {
			this.aBoolean401 = false;
		} else {
			this.aBoolean401 = true;
		}
		this.anInt4763 = Static631.anInt10279;
		this.anInt4764 = local212;
		if (this.anInt4777 > 3) {
			this.anInt4776 = Static378.anInt6757;
		} else {
			this.anInt4776 = 0;
		}
		try {
			@Pc(364) int[] local364 = HardwareInfo.getCPUInfo();
			if (local364 != null && local364.length == 7) {
				this.anInt4768 = local364[3];
				this.anInt4766 = local364[4];
				this.anInt4762 = local364[6];
				this.anInt4781 = local364[5];
				this.anInt4769 = local364[2];
			}
		} catch (@Pc(397) Throwable local397) {
			this.anInt4762 = 0;
		}
		if (this.aString38 == null) {
			this.aString38 = "";
		}
		if (this.aString36 == null) {
			this.aString36 = "";
		}
		if (this.aString37 == null) {
			this.aString37 = "";
		}
		if (this.aString35 == null) {
			this.aString35 = "";
		}
		this.method4030();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)I")
	public int method4025() {
		@Pc(14) int local14 = Static458.method6570(this.aString36) + 23;
		@Pc(21) int local21 = local14 + Static458.method6570(this.aString38);
		@Pc(33) int local33 = local21 + Static458.method6570(this.aString37);
		return local33 + Static458.method6570(this.aString35);
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)V")
	private void method4030() {
		if (this.aString36.length() > 40) {
			this.aString36 = this.aString36.substring(0, 40);
		}
		if (this.aString38.length() > 40) {
			this.aString38 = this.aString38.substring(0, 40);
		}
		if (this.aString37.length() > 10) {
			this.aString37 = this.aString37.substring(0, 10);
		}
		if (this.aString35.length() > 10) {
			this.aString35 = this.aString35.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method4031(@OriginalArg(0) Class5_Sub41 arg0) {
		arg0.method7798(5);
		arg0.method7798(this.anInt4783);
		arg0.method7798(this.aBoolean400 ? 1 : 0);
		arg0.method7798(this.anInt4773);
		arg0.method7798(this.anInt4779);
		arg0.method7798(this.anInt4777);
		arg0.method7798(this.anInt4772);
		arg0.method7798(this.anInt4764);
		arg0.method7798(this.aBoolean401 ? 1 : 0);
		arg0.method7848(this.anInt4763);
		arg0.method7798(this.anInt4776);
		arg0.method7843(this.anInt4762);
		arg0.method7848(this.anInt4769);
		arg0.method7798(this.anInt4768);
		arg0.method7798(this.anInt4766);
		arg0.method7798(this.anInt4781);
		arg0.method7826(this.aString36);
		arg0.method7826(this.aString38);
		arg0.method7826(this.aString37);
		arg0.method7826(this.aString35);
		arg0.method7798(this.anInt4778);
		arg0.method7848(this.anInt4775);
	}
}

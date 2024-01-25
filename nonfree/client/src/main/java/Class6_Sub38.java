import jaclib.hardware_info.HardwareInfo;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	private int anInt7893;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	private int anInt7894;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	private int anInt7895;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Ljava/lang/String;")
	private String aString80;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	private int anInt7897;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	private int anInt7898;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
	private int anInt7899;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
	private int anInt7900;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	private int anInt7901;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	private int anInt7902;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	private int anInt7903;

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
	private int anInt7905;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
	private int anInt7906;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	private int anInt7907;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	private Class6_Sub38() {
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ZLclient!fl;)V")
	public Class6_Sub38(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class104 arg1) {
		if (Static161.aString38.startsWith("win")) {
			this.anInt7903 = 1;
		} else if (Static161.aString38.startsWith("mac")) {
			this.anInt7903 = 2;
		} else if (Static161.aString38.startsWith("linux")) {
			this.anInt7903 = 3;
		} else {
			this.anInt7903 = 4;
		}
		if (Static161.aString34.startsWith("amd64") || Static161.aString34.startsWith("x86_64")) {
			this.aBoolean626 = true;
		} else {
			this.aBoolean626 = false;
		}
		if (this.anInt7903 == 1) {
			if (Static161.aString31.indexOf("4.0") != -1) {
				this.anInt7894 = 1;
			} else if (Static161.aString31.indexOf("4.1") != -1) {
				this.anInt7894 = 2;
			} else if (Static161.aString31.indexOf("4.9") != -1) {
				this.anInt7894 = 3;
			} else if (Static161.aString31.indexOf("5.0") != -1) {
				this.anInt7894 = 4;
			} else if (Static161.aString31.indexOf("5.1") != -1) {
				this.anInt7894 = 5;
			} else if (Static161.aString31.indexOf("6.0") != -1) {
				this.anInt7894 = 6;
			} else if (Static161.aString31.indexOf("6.1") != -1) {
				this.anInt7894 = 7;
			}
		} else if (this.anInt7903 == 2) {
			if (Static161.aString31.indexOf("10.4") != -1) {
				this.anInt7894 = 20;
			} else if (Static161.aString31.indexOf("10.5") != -1) {
				this.anInt7894 = 21;
			} else if (Static161.aString31.indexOf("10.6") != -1) {
				this.anInt7894 = 22;
			}
		}
		if (Static161.aString37.toLowerCase().indexOf("sun") != -1) {
			this.anInt7896 = 1;
		} else if (Static161.aString37.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7896 = 2;
		} else if (Static161.aString37.toLowerCase().indexOf("apple") == -1) {
			this.anInt7896 = 4;
		} else {
			this.anInt7896 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (local203 < Static161.aString35.length()) {
				local211 = Static161.aString35.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local205 * 10 + local211 - '0';
			}
		} catch (@Pc(233) Exception local233) {
		}
		this.anInt7897 = local205;
		local203 = Static161.aString35.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (Static161.aString35.length() > local203) {
				local211 = Static161.aString35.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(277) Exception local277) {
		}
		this.anInt7905 = local205;
		local203 = Static161.aString35.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (Static161.aString35.length() > local203) {
				local211 = Static161.aString35.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(319) Exception local319) {
		}
		this.anInt7901 = local205;
		this.anInt7898 = Static510.anInt8806;
		if (arg1.aBoolean290) {
			this.aBoolean627 = false;
		} else {
			this.aBoolean627 = true;
		}
		if (this.anInt7897 <= 3) {
			this.anInt7902 = 0;
		} else {
			this.anInt7902 = Static356.anInt6904;
		}
		try {
			@Pc(350) int[] local350 = HardwareInfo.getCPUInfo();
			if (local350 != null && local350.length == 7) {
				this.anInt7906 = local350[4];
				this.anInt7899 = local350[5];
				this.anInt7900 = local350[3];
				this.anInt7891 = local350[6];
				this.anInt7907 = local350[2];
			}
		} catch (@Pc(385) Throwable local385) {
			Static358.method5809(local385, local385.getMessage() + " (Recovered)");
			this.anInt7891 = 0;
		}
		if (this.aString80 == null) {
			this.aString80 = "";
		}
		if (this.aString81 == null) {
			this.aString81 = "";
		}
		if (this.aString79 == null) {
			this.aString79 = "";
		}
		if (this.aString82 == null) {
			this.aString82 = "";
		}
		this.method6655();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!ji;)V")
	public void method6654(@OriginalArg(1) Class6_Sub8 arg0) {
		arg0.method8211(5);
		arg0.method8211(this.anInt7903);
		arg0.method8211(this.aBoolean626 ? 1 : 0);
		arg0.method8211(this.anInt7894);
		arg0.method8211(this.anInt7896);
		arg0.method8211(this.anInt7897);
		arg0.method8211(this.anInt7905);
		arg0.method8211(this.anInt7901);
		arg0.method8211(this.aBoolean627 ? 1 : 0);
		arg0.method8241(this.anInt7898);
		arg0.method8211(this.anInt7902);
		arg0.method8242(this.anInt7891);
		arg0.method8241(this.anInt7907);
		arg0.method8211(this.anInt7900);
		arg0.method8211(this.anInt7906);
		arg0.method8211(this.anInt7899);
		arg0.method8198(this.aString79);
		arg0.method8198(this.aString81);
		arg0.method8198(this.aString82);
		arg0.method8198(this.aString80);
		arg0.method8211(this.anInt7893);
		arg0.method8241(this.anInt7895);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	private void method6655() {
		if (this.aString79.length() > 40) {
			this.aString79 = this.aString79.substring(0, 40);
		}
		if (this.aString81.length() > 40) {
			this.aString81 = this.aString81.substring(0, 40);
		}
		if (this.aString82.length() > 10) {
			this.aString82 = this.aString82.substring(0, 10);
		}
		if (this.aString80.length() > 10) {
			this.aString80 = this.aString80.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I")
	public int method6656() {
		@Pc(17) int local17 = Static284.method4954(this.aString79) + 23;
		@Pc(24) int local24 = local17 + Static284.method4954(this.aString81);
		@Pc(31) int local31 = local24 + Static284.method4954(this.aString82);
		return local31 + Static284.method4954(this.aString80);
	}
}

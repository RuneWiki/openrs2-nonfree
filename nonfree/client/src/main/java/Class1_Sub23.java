import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private int anInt2892;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt2893;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	private int anInt2896;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	private int anInt2897;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	private int anInt2898;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt2899;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	private int anInt2902;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private int anInt2903;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	private int anInt2904;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt2907;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private Class1_Sub23() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ZLclient!laa;)V")
	public Class1_Sub23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class198 arg1) {
		if (Static285.aString59.startsWith("win")) {
			this.anInt2899 = 1;
		} else if (Static285.aString59.startsWith("mac")) {
			this.anInt2899 = 2;
		} else if (Static285.aString59.startsWith("linux")) {
			this.anInt2899 = 3;
		} else {
			this.anInt2899 = 4;
		}
		if (Static285.aString57.startsWith("amd64") || Static285.aString57.startsWith("x86_64")) {
			this.aBoolean221 = true;
		} else {
			this.aBoolean221 = false;
		}
		if (this.anInt2899 == 1) {
			if (Static285.aString63.indexOf("4.0") != -1) {
				this.anInt2903 = 1;
			} else if (Static285.aString63.indexOf("4.1") != -1) {
				this.anInt2903 = 2;
			} else if (Static285.aString63.indexOf("4.9") != -1) {
				this.anInt2903 = 3;
			} else if (Static285.aString63.indexOf("5.0") != -1) {
				this.anInt2903 = 4;
			} else if (Static285.aString63.indexOf("5.1") != -1) {
				this.anInt2903 = 5;
			} else if (Static285.aString63.indexOf("6.0") != -1) {
				this.anInt2903 = 6;
			} else if (Static285.aString63.indexOf("6.1") != -1) {
				this.anInt2903 = 7;
			}
		} else if (this.anInt2899 == 2) {
			if (Static285.aString63.indexOf("10.4") != -1) {
				this.anInt2903 = 20;
			} else if (Static285.aString63.indexOf("10.5") != -1) {
				this.anInt2903 = 21;
			} else if (Static285.aString63.indexOf("10.6") != -1) {
				this.anInt2903 = 22;
			}
		}
		if (Static285.aString62.toLowerCase().indexOf("sun") != -1) {
			this.anInt2910 = 1;
		} else if (Static285.aString62.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt2910 = 2;
		} else if (Static285.aString62.toLowerCase().indexOf("apple") == -1) {
			this.anInt2910 = 4;
		} else {
			this.anInt2910 = 3;
		}
		@Pc(198) int local198 = 2;
		@Pc(200) int local200 = 0;
		@Pc(206) char local206;
		try {
			while (local198 < Static285.aString64.length()) {
				local206 = Static285.aString64.charAt(local198);
				if (local206 < '0' || local206 > '9') {
					break;
				}
				local198++;
				local200 = local200 * 10 + local206 - '0';
			}
		} catch (@Pc(230) Exception local230) {
		}
		this.anInt2897 = local200;
		local200 = 0;
		local198 = Static285.aString64.indexOf(46, 2) + 1;
		try {
			while (Static285.aString64.length() > local198) {
				local206 = Static285.aString64.charAt(local198);
				if (local206 < '0' || local206 > '9') {
					break;
				}
				local198++;
				local200 = local200 * 10 + local206 - 48;
			}
		} catch (@Pc(274) Exception local274) {
		}
		this.anInt2904 = local200;
		local198 = Static285.aString64.indexOf(95, 4) + 1;
		local200 = 0;
		try {
			while (local198 < Static285.aString64.length()) {
				local206 = Static285.aString64.charAt(local198);
				if (local206 < '0' || local206 > '9') {
					break;
				}
				local198++;
				local200 = local206 + local200 * 10 - 48;
			}
		} catch (@Pc(320) Exception local320) {
		}
		if (arg1.aBoolean401) {
			this.aBoolean220 = false;
		} else {
			this.aBoolean220 = true;
		}
		this.anInt2898 = local200;
		if (this.anInt2897 <= 3) {
			this.anInt2900 = 0;
		} else {
			this.anInt2900 = Static107.anInt1802;
		}
		this.anInt2908 = Static221.anInt4095;
		try {
			this.anInt2893 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(359) Throwable local359) {
			this.anInt2893 = 0;
		}
		if (this.aString28 == null) {
			this.aString28 = "";
		}
		if (this.aString29 == null) {
			this.aString29 = "";
		}
		if (this.aString31 == null) {
			this.aString31 = "";
		}
		if (this.aString30 == null) {
			this.aString30 = "";
		}
		this.method2527();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)I")
	public int method2525() {
		@Pc(12) int local12 = Static368.method5402(this.aString30) + 23;
		@Pc(19) int local19 = local12 + Static368.method5402(this.aString31);
		@Pc(32) int local32 = local19 + Static368.method5402(this.aString29);
		return local32 + Static368.method5402(this.aString28);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	private void method2527() {
		if (this.aString30.length() > 40) {
			this.aString30 = this.aString30.substring(0, 40);
		}
		if (this.aString31.length() > 40) {
			this.aString31 = this.aString31.substring(0, 40);
		}
		if (this.aString29.length() > 10) {
			this.aString29 = this.aString29.substring(0, 10);
		}
		if (this.aString28.length() > 10) {
			this.aString28 = this.aString28.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method2528(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method7917(5);
		arg0.method7917(this.anInt2899);
		arg0.method7917(this.aBoolean221 ? 1 : 0);
		arg0.method7917(this.anInt2903);
		arg0.method7917(this.anInt2910);
		arg0.method7917(this.anInt2897);
		arg0.method7917(this.anInt2904);
		arg0.method7917(this.anInt2898);
		arg0.method7917(this.aBoolean220 ? 1 : 0);
		arg0.method7937(this.anInt2908);
		arg0.method7917(this.anInt2900);
		arg0.method7932(this.anInt2893);
		arg0.method7937(this.anInt2907);
		arg0.method7917(this.anInt2896);
		arg0.method7917(this.anInt2902);
		arg0.method7917(this.anInt2901);
		arg0.method7950(this.aString30);
		arg0.method7950(this.aString31);
		arg0.method7950(this.aString29);
		arg0.method7950(this.aString28);
		arg0.method7917(this.anInt2892);
		arg0.method7937(this.anInt2905);
	}
}

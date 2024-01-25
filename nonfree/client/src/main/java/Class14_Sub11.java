import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class14_Sub11 extends Class14 {

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
	private int anInt1964;

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
	private int anInt1965;

	@OriginalMember(owner = "client!daa", name = "s", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!daa", name = "t", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
	private int anInt1966;

	@OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
	private int anInt1968;

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!daa", name = "A", descriptor = "I")
	private int anInt1971;

	@OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!daa", name = "F", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!daa", name = "K", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!daa", name = "L", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
	public int anInt1980;

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	private Class14_Sub11() {
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(ZLclient!td;)V")
	public Class14_Sub11(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class333 arg1) {
		if (Static565.aString98.startsWith("win")) {
			this.anInt1979 = 1;
		} else if (Static565.aString98.startsWith("mac")) {
			this.anInt1979 = 2;
		} else if (Static565.aString98.startsWith("linux")) {
			this.anInt1979 = 3;
		} else {
			this.anInt1979 = 4;
		}
		if (Static565.aString96.startsWith("amd64") || Static565.aString96.startsWith("x86_64")) {
			this.aBoolean166 = true;
		} else {
			this.aBoolean166 = false;
		}
		if (this.anInt1979 == 1) {
			if (Static565.aString100.indexOf("4.0") != -1) {
				this.anInt1971 = 1;
			} else if (Static565.aString100.indexOf("4.1") != -1) {
				this.anInt1971 = 2;
			} else if (Static565.aString100.indexOf("4.9") != -1) {
				this.anInt1971 = 3;
			} else if (Static565.aString100.indexOf("5.0") != -1) {
				this.anInt1971 = 4;
			} else if (Static565.aString100.indexOf("5.1") != -1) {
				this.anInt1971 = 5;
			} else if (Static565.aString100.indexOf("6.0") != -1) {
				this.anInt1971 = 6;
			} else if (Static565.aString100.indexOf("6.1") != -1) {
				this.anInt1971 = 7;
			}
		} else if (this.anInt1979 == 2) {
			if (Static565.aString100.indexOf("10.4") != -1) {
				this.anInt1971 = 20;
			} else if (Static565.aString100.indexOf("10.5") != -1) {
				this.anInt1971 = 21;
			} else if (Static565.aString100.indexOf("10.6") != -1) {
				this.anInt1971 = 22;
			}
		}
		if (Static565.aString94.toLowerCase().indexOf("sun") != -1) {
			this.anInt1968 = 1;
		} else if (Static565.aString94.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt1968 = 2;
		} else if (Static565.aString94.toLowerCase().indexOf("apple") == -1) {
			this.anInt1968 = 4;
		} else {
			this.anInt1968 = 3;
		}
		@Pc(208) int local208 = 2;
		@Pc(210) int local210 = 0;
		@Pc(216) char local216;
		try {
			while (local208 < Static565.aString95.length()) {
				local216 = Static565.aString95.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local210 = local210 * 10 + local216 - 48;
				local208++;
			}
		} catch (@Pc(245) Exception local245) {
		}
		this.anInt1966 = local210;
		local210 = 0;
		local208 = Static565.aString95.indexOf(46, 2) + 1;
		try {
			while (Static565.aString95.length() > local208) {
				local216 = Static565.aString95.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local208++;
				local210 = local216 + local210 * 10 - 48;
			}
		} catch (@Pc(289) Exception local289) {
		}
		this.anInt1965 = local210;
		local210 = 0;
		local208 = Static565.aString95.indexOf(95, 4) + 1;
		try {
			while (local208 < Static565.aString95.length()) {
				local216 = Static565.aString95.charAt(local208);
				if (local216 < '0' || local216 > '9') {
					break;
				}
				local210 = local216 + local210 * 10 - 48;
				local208++;
			}
		} catch (@Pc(331) Exception local331) {
		}
		this.anInt1962 = local210;
		if (arg1.aBoolean693) {
			this.aBoolean167 = false;
		} else {
			this.aBoolean167 = true;
		}
		this.anInt1975 = Static189.anInt3553;
		if (this.anInt1966 > 3) {
			this.anInt1982 = Static503.anInt8873;
		} else {
			this.anInt1982 = 0;
		}
		try {
			@Pc(364) int[] local364 = HardwareInfo.getCPUInfo();
			if (local364 != null && local364.length == 7) {
				this.anInt1976 = local364[3];
				this.anInt1969 = local364[2];
				this.anInt1978 = local364[4];
				this.anInt1974 = local364[5];
				this.anInt1980 = local364[6];
			}
		} catch (@Pc(399) Throwable local399) {
			this.anInt1980 = 0;
		}
		if (this.aString25 == null) {
			this.aString25 = "";
		}
		if (this.aString24 == null) {
			this.aString24 = "";
		}
		if (this.aString22 == null) {
			this.aString22 = "";
		}
		if (this.aString21 == null) {
			this.aString21 = "";
		}
		this.method1691();
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)I")
	public int method1686() {
		@Pc(12) int local12 = Static256.method3743(this.aString24) + 23;
		@Pc(19) int local19 = local12 + Static256.method3743(this.aString21);
		@Pc(26) int local26 = local19 + Static256.method3743(this.aString22);
		return local26 + Static256.method3743(this.aString25);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!so;I)V")
	public void method1688(@OriginalArg(0) Class14_Sub29 arg0) {
		arg0.method5854(5);
		arg0.method5854(this.anInt1979);
		arg0.method5854(this.aBoolean166 ? 1 : 0);
		arg0.method5854(this.anInt1971);
		arg0.method5854(this.anInt1968);
		arg0.method5854(this.anInt1966);
		arg0.method5854(this.anInt1965);
		arg0.method5854(this.anInt1962);
		arg0.method5854(this.aBoolean167 ? 1 : 0);
		arg0.method5859(this.anInt1975);
		arg0.method5854(this.anInt1982);
		arg0.method5897(this.anInt1980);
		arg0.method5859(this.anInt1969);
		arg0.method5854(this.anInt1976);
		arg0.method5854(this.anInt1978);
		arg0.method5854(this.anInt1974);
		arg0.method5868(this.aString24);
		arg0.method5868(this.aString21);
		arg0.method5868(this.aString22);
		arg0.method5868(this.aString25);
		arg0.method5854(this.anInt1967);
		arg0.method5859(this.anInt1964);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)V")
	private void method1691() {
		if (this.aString24.length() > 40) {
			this.aString24 = this.aString24.substring(0, 40);
		}
		if (this.aString21.length() > 40) {
			this.aString21 = this.aString21.substring(0, 40);
		}
		if (this.aString22.length() > 10) {
			this.aString22 = this.aString22.substring(0, 10);
		}
		if (this.aString25.length() > 10) {
			this.aString25 = this.aString25.substring(0, 10);
		}
	}
}

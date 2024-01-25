import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "G", descriptor = "Z")
	private boolean aBoolean2;

	@OriginalMember(owner = "client!aca", name = "D", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
	private int anInt35;

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
	private int anInt38;

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
	private int anInt42;

	@OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
	private int anInt43;

	@OriginalMember(owner = "client!aca", name = "C", descriptor = "I")
	private int anInt45;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
	private int anInt50;

	@OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
	private Class6_Sub1() {
	}

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(ZLclient!ft;)V")
	public Class6_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class122 arg1) {
		if (Static174.aString36.startsWith("win")) {
			this.anInt45 = 1;
		} else if (Static174.aString36.startsWith("mac")) {
			this.anInt45 = 2;
		} else if (Static174.aString36.startsWith("linux")) {
			this.anInt45 = 3;
		} else {
			this.anInt45 = 4;
		}
		if (Static174.aString34.startsWith("amd64") || Static174.aString34.startsWith("x86_64")) {
			this.aBoolean3 = true;
		} else {
			this.aBoolean3 = false;
		}
		if (this.anInt45 == 1) {
			if (Static174.aString33.indexOf("4.0") != -1) {
				this.anInt52 = 1;
			} else if (Static174.aString33.indexOf("4.1") != -1) {
				this.anInt52 = 2;
			} else if (Static174.aString33.indexOf("4.9") != -1) {
				this.anInt52 = 3;
			} else if (Static174.aString33.indexOf("5.0") != -1) {
				this.anInt52 = 4;
			} else if (Static174.aString33.indexOf("5.1") != -1) {
				this.anInt52 = 5;
			} else if (Static174.aString33.indexOf("6.0") != -1) {
				this.anInt52 = 6;
			} else if (Static174.aString33.indexOf("6.1") != -1) {
				this.anInt52 = 7;
			}
		} else if (this.anInt45 == 2) {
			if (Static174.aString33.indexOf("10.4") != -1) {
				this.anInt52 = 20;
			} else if (Static174.aString33.indexOf("10.5") != -1) {
				this.anInt52 = 21;
			} else if (Static174.aString33.indexOf("10.6") != -1) {
				this.anInt52 = 22;
			} else if (Static174.aString33.indexOf("10.7") != -1) {
				this.anInt52 = 23;
			}
		}
		if (Static174.aString38.toLowerCase().indexOf("sun") != -1) {
			this.anInt42 = 1;
		} else if (Static174.aString38.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt42 = 2;
		} else if (Static174.aString38.toLowerCase().indexOf("apple") == -1) {
			this.anInt42 = 4;
		} else {
			this.anInt42 = 3;
		}
		@Pc(326) int local326 = 2;
		@Pc(328) int local328 = 0;
		@Pc(334) char local334;
		try {
			while (Static174.aString37.length() > local326) {
				local334 = Static174.aString37.charAt(local326);
				if (local334 < '0' || local334 > '9') {
					break;
				}
				local328 = local328 * 10 + local334 - 48;
				local326++;
			}
		} catch (@Pc(366) Exception local366) {
		}
		this.anInt49 = local328;
		local326 = Static174.aString37.indexOf(46, 2) + 1;
		local328 = 0;
		try {
			while (Static174.aString37.length() > local326) {
				local334 = Static174.aString37.charAt(local326);
				if (local334 < '0' || local334 > '9') {
					break;
				}
				local328 = local328 * 10 + local334 - 48;
				local326++;
			}
		} catch (@Pc(419) Exception local419) {
		}
		this.anInt40 = local328;
		local328 = 0;
		local326 = Static174.aString37.indexOf(95, 4) + 1;
		try {
			while (Static174.aString37.length() > local326) {
				local334 = Static174.aString37.charAt(local326);
				if (local334 < '0' || local334 > '9') {
					break;
				}
				local326++;
				local328 = local334 + local328 * 10 - '0';
			}
		} catch (@Pc(471) Exception local471) {
		}
		if (this.anInt49 > 3) {
			this.anInt47 = Static573.anInt9174;
		} else {
			this.anInt47 = 0;
		}
		this.anInt43 = Static532.anInt8714;
		if (arg1.aBoolean281) {
			this.aBoolean2 = false;
		} else {
			this.aBoolean2 = true;
		}
		this.anInt41 = local328;
		try {
			@Pc(512) int[] local512 = HardwareInfo.getCPUInfo();
			if (local512 != null && local512.length == 7) {
				this.anInt36 = local512[5];
				this.anInt39 = local512[6];
				this.anInt48 = local512[2];
				this.anInt38 = local512[4];
				this.anInt50 = local512[3];
			}
		} catch (@Pc(549) Throwable local549) {
			this.anInt39 = 0;
		}
		if (this.aString4 == null) {
			this.aString4 = "";
		}
		if (this.aString3 == null) {
			this.aString3 = "";
		}
		if (this.aString2 == null) {
			this.aString2 = "";
		}
		if (this.aString1 == null) {
			this.aString1 = "";
		}
		this.method42();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)I")
	public int method40() {
		@Pc(18) int local18 = Static202.method3748(this.aString4) + 23;
		@Pc(25) int local25 = local18 + Static202.method3748(this.aString1);
		@Pc(32) int local32 = local25 + Static202.method3748(this.aString2);
		return local32 + Static202.method3748(this.aString3);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	private void method42() {
		if (this.aString4.length() > 40) {
			this.aString4 = this.aString4.substring(0, 40);
		}
		if (this.aString1.length() > 40) {
			this.aString1 = this.aString1.substring(0, 40);
		}
		if (this.aString2.length() > 10) {
			this.aString2 = this.aString2.substring(0, 10);
		}
		if (this.aString3.length() > 10) {
			this.aString3 = this.aString3.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!jc;)V")
	public void method43(@OriginalArg(1) Class6_Sub15 arg0) {
		arg0.method3016(5);
		arg0.method3016(this.anInt45);
		arg0.method3016(this.aBoolean3 ? 1 : 0);
		arg0.method3016(this.anInt52);
		arg0.method3016(this.anInt42);
		arg0.method3016(this.anInt49);
		arg0.method3016(this.anInt40);
		arg0.method3016(this.anInt41);
		arg0.method3016(this.aBoolean2 ? 1 : 0);
		arg0.method3040(this.anInt43);
		arg0.method3016(this.anInt47);
		arg0.method3009(this.anInt39);
		arg0.method3040(this.anInt48);
		arg0.method3016(this.anInt50);
		arg0.method3016(this.anInt38);
		arg0.method3016(this.anInt36);
		arg0.method3035(this.aString4);
		arg0.method3035(this.aString1);
		arg0.method3035(this.aString2);
		arg0.method3035(this.aString3);
		arg0.method3016(this.anInt46);
		arg0.method3040(this.anInt35);
	}
}

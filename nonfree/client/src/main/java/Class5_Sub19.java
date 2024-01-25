import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
	public int anInt3442;

	@OriginalMember(owner = "client!hba", name = "I", descriptor = "I")
	private int anInt3443;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
	private int anInt3444;

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
	private int anInt3446;

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
	private int anInt3448;

	@OriginalMember(owner = "client!hba", name = "F", descriptor = "I")
	private int anInt3449;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "I")
	public int anInt3451;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	private int anInt3453;

	@OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
	private int anInt3454;

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
	public int anInt3455;

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
	private int anInt3456;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!hba", name = "L", descriptor = "I")
	private int anInt3459;

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
	private int anInt3460;

	@OriginalMember(owner = "client!hba", name = "z", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
	private Class5_Sub19() {
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(ZLclient!mca;)V")
	public Class5_Sub19(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class230 arg1) {
		if (Static359.aString85.startsWith("win")) {
			this.anInt3454 = 1;
		} else if (Static359.aString85.startsWith("mac")) {
			this.anInt3454 = 2;
		} else if (Static359.aString85.startsWith("linux")) {
			this.anInt3454 = 3;
		} else {
			this.anInt3454 = 4;
		}
		if (Static359.aString82.startsWith("amd64") || Static359.aString82.startsWith("x86_64")) {
			this.aBoolean276 = true;
		} else {
			this.aBoolean276 = false;
		}
		if (this.anInt3454 == 1) {
			if (Static359.aString84.indexOf("4.0") != -1) {
				this.anInt3444 = 1;
			} else if (Static359.aString84.indexOf("4.1") != -1) {
				this.anInt3444 = 2;
			} else if (Static359.aString84.indexOf("4.9") != -1) {
				this.anInt3444 = 3;
			} else if (Static359.aString84.indexOf("5.0") != -1) {
				this.anInt3444 = 4;
			} else if (Static359.aString84.indexOf("5.1") != -1) {
				this.anInt3444 = 5;
			} else if (Static359.aString84.indexOf("6.0") != -1) {
				this.anInt3444 = 6;
			} else if (Static359.aString84.indexOf("6.1") != -1) {
				this.anInt3444 = 7;
			}
		} else if (this.anInt3454 == 2) {
			if (Static359.aString84.indexOf("10.4") != -1) {
				this.anInt3444 = 20;
			} else if (Static359.aString84.indexOf("10.5") != -1) {
				this.anInt3444 = 21;
			} else if (Static359.aString84.indexOf("10.6") != -1) {
				this.anInt3444 = 22;
			}
		}
		if (Static359.aString87.toLowerCase().indexOf("sun") != -1) {
			this.anInt3446 = 1;
		} else if (Static359.aString87.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3446 = 2;
		} else if (Static359.aString87.toLowerCase().indexOf("apple") == -1) {
			this.anInt3446 = 4;
		} else {
			this.anInt3446 = 3;
		}
		@Pc(315) int local315 = 2;
		@Pc(317) int local317 = 0;
		@Pc(323) char local323;
		try {
			while (local315 < Static359.aString83.length()) {
				local323 = Static359.aString83.charAt(local315);
				if (local323 < '0' || local323 > '9') {
					break;
				}
				local317 = local323 + local317 * 10 - 48;
				local315++;
			}
		} catch (@Pc(359) Exception local359) {
		}
		this.anInt3451 = local317;
		local315 = Static359.aString83.indexOf(46, 2) + 1;
		local317 = 0;
		try {
			while (Static359.aString83.length() > local315) {
				local323 = Static359.aString83.charAt(local315);
				if (local323 < '0' || local323 > '9') {
					break;
				}
				local315++;
				local317 = local317 * 10 + local323 - 48;
			}
		} catch (@Pc(409) Exception local409) {
		}
		this.anInt3458 = local317;
		local315 = Static359.aString83.indexOf(95, 4) + 1;
		local317 = 0;
		try {
			while (local315 < Static359.aString83.length()) {
				local323 = Static359.aString83.charAt(local315);
				if (local323 < '0' || local323 > '9') {
					break;
				}
				local315++;
				local317 = local317 * 10 + local323 - 48;
			}
		} catch (@Pc(459) Exception local459) {
		}
		this.anInt3456 = Static329.anInt5875;
		if (arg1.aBoolean471) {
			this.aBoolean275 = false;
		} else {
			this.aBoolean275 = true;
		}
		this.anInt3455 = local317;
		if (this.anInt3451 > 3) {
			this.anInt3459 = Static28.anInt9247;
		} else {
			this.anInt3459 = 0;
		}
		try {
			@Pc(498) int[] local498 = HardwareInfo.getCPUInfo();
			if (local498 != null && local498.length == 7) {
				this.anInt3453 = local498[2];
				this.anInt3450 = local498[5];
				this.anInt3449 = local498[4];
				this.anInt3443 = local498[3];
				this.anInt3442 = local498[6];
			}
		} catch (@Pc(535) Throwable local535) {
			this.anInt3442 = 0;
		}
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString50 == null) {
			this.aString50 = "";
		}
		if (this.aString52 == null) {
			this.aString52 = "";
		}
		if (this.aString51 == null) {
			this.aString51 = "";
		}
		this.method3043();
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)I")
	public int method3042() {
		@Pc(12) int local12 = Static198.method2857(this.aString50) + 23;
		@Pc(19) int local19 = local12 + Static198.method2857(this.aString53);
		@Pc(26) int local26 = local19 + Static198.method2857(this.aString51);
		return local26 + Static198.method2857(this.aString52);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	private void method3043() {
		if (this.aString50.length() > 40) {
			this.aString50 = this.aString50.substring(0, 40);
		}
		if (this.aString53.length() > 40) {
			this.aString53 = this.aString53.substring(0, 40);
		}
		if (this.aString51.length() > 10) {
			this.aString51 = this.aString51.substring(0, 10);
		}
		if (this.aString52.length() > 10) {
			this.aString52 = this.aString52.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!ib;)V")
	public void method3044(@OriginalArg(1) Class5_Sub23 arg0) {
		arg0.method8502(5);
		arg0.method8502(this.anInt3454);
		arg0.method8502(this.aBoolean276 ? 1 : 0);
		arg0.method8502(this.anInt3444);
		arg0.method8502(this.anInt3446);
		arg0.method8502(this.anInt3451);
		arg0.method8502(this.anInt3458);
		arg0.method8502(this.anInt3455);
		arg0.method8502(this.aBoolean275 ? 1 : 0);
		arg0.method8480(this.anInt3456);
		arg0.method8502(this.anInt3459);
		arg0.method8522(this.anInt3442);
		arg0.method8480(this.anInt3453);
		arg0.method8502(this.anInt3443);
		arg0.method8502(this.anInt3449);
		arg0.method8502(this.anInt3450);
		arg0.method8537(this.aString50);
		arg0.method8537(this.aString53);
		arg0.method8537(this.aString51);
		arg0.method8537(this.aString52);
		arg0.method8502(this.anInt3460);
		arg0.method8480(this.anInt3448);
	}
}

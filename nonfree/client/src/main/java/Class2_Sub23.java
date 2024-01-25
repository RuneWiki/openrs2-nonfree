import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	private int anInt3676;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	private int anInt3677;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	private int anInt3678;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	private int anInt3679;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	private int anInt3680;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "Ljava/lang/String;")
	private String aString39;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
	private int anInt3685;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
	private int anInt3686;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
	private int anInt3689;

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
	private int anInt3690;

	@OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
	private int anInt3691;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
	private int anInt3692;

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
	private int anInt3695;

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
	private int anInt3696;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	private Class2_Sub23() {
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ZLclient!vk;)V")
	public Class2_Sub23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class359 arg1) {
		if (Static604.aString98.startsWith("win")) {
			this.anInt3689 = 1;
		} else if (Static604.aString98.startsWith("mac")) {
			this.anInt3689 = 2;
		} else if (Static604.aString98.startsWith("linux")) {
			this.anInt3689 = 3;
		} else {
			this.anInt3689 = 4;
		}
		if (Static604.aString91.startsWith("amd64") || Static604.aString91.startsWith("x86_64")) {
			this.aBoolean308 = true;
		} else {
			this.aBoolean308 = false;
		}
		if (this.anInt3689 == 1) {
			if (Static604.aString94.indexOf("4.0") != -1) {
				this.anInt3676 = 1;
			} else if (Static604.aString94.indexOf("4.1") != -1) {
				this.anInt3676 = 2;
			} else if (Static604.aString94.indexOf("4.9") != -1) {
				this.anInt3676 = 3;
			} else if (Static604.aString94.indexOf("5.0") != -1) {
				this.anInt3676 = 4;
			} else if (Static604.aString94.indexOf("5.1") != -1) {
				this.anInt3676 = 5;
			} else if (Static604.aString94.indexOf("6.0") != -1) {
				this.anInt3676 = 6;
			} else if (Static604.aString94.indexOf("6.1") != -1) {
				this.anInt3676 = 7;
			}
		} else if (this.anInt3689 == 2) {
			if (Static604.aString94.indexOf("10.4") != -1) {
				this.anInt3676 = 20;
			} else if (Static604.aString94.indexOf("10.5") != -1) {
				this.anInt3676 = 21;
			} else if (Static604.aString94.indexOf("10.6") != -1) {
				this.anInt3676 = 22;
			}
		}
		if (Static604.aString95.toLowerCase().indexOf("sun") != -1) {
			this.anInt3694 = 1;
		} else if (Static604.aString95.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3694 = 2;
		} else if (Static604.aString95.toLowerCase().indexOf("apple") == -1) {
			this.anInt3694 = 4;
		} else {
			this.anInt3694 = 3;
		}
		@Pc(189) int local189 = 2;
		@Pc(191) int local191 = 0;
		@Pc(196) char local196;
		try {
			while (local189 < Static604.aString96.length()) {
				local196 = Static604.aString96.charAt(local189);
				if (local196 < '0' || local196 > '9') {
					break;
				}
				local191 = local191 * 10 + local196 - 48;
				local189++;
			}
		} catch (@Pc(218) Exception local218) {
		}
		this.anInt3677 = local191;
		local189 = Static604.aString96.indexOf(46, 2) + 1;
		local191 = 0;
		try {
			while (Static604.aString96.length() > local189) {
				local196 = Static604.aString96.charAt(local189);
				if (local196 < '0' || local196 > '9') {
					break;
				}
				local191 = local196 + local191 * 10 - 48;
				local189++;
			}
		} catch (@Pc(261) Exception local261) {
		}
		this.anInt3684 = local191;
		local191 = 0;
		local189 = Static604.aString96.indexOf(95, 4) + 1;
		try {
			while (Static604.aString96.length() > local189) {
				local196 = Static604.aString96.charAt(local189);
				if (local196 < '0' || local196 > '9') {
					break;
				}
				local191 = local191 * 10 + local196 - 48;
				local189++;
			}
		} catch (@Pc(300) Exception local300) {
		}
		this.anInt3695 = Static545.anInt9053;
		if (arg1.aBoolean729) {
			this.aBoolean309 = false;
		} else {
			this.aBoolean309 = true;
		}
		this.anInt3678 = local191;
		if (this.anInt3677 <= 3) {
			this.anInt3696 = 0;
		} else {
			this.anInt3696 = Static314.anInt5702;
		}
		try {
			this.anInt3679 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(339) Throwable local339) {
			this.anInt3679 = 0;
		}
		if (this.aString42 == null) {
			this.aString42 = "";
		}
		if (this.aString41 == null) {
			this.aString41 = "";
		}
		if (this.aString39 == null) {
			this.aString39 = "";
		}
		if (this.aString40 == null) {
			this.aString40 = "";
		}
		this.method3048();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	private void method3048() {
		if (this.aString40.length() > 40) {
			this.aString40 = this.aString40.substring(0, 40);
		}
		if (this.aString39.length() > 40) {
			this.aString39 = this.aString39.substring(0, 40);
		}
		if (this.aString42.length() > 10) {
			this.aString42 = this.aString42.substring(0, 10);
		}
		if (this.aString41.length() > 10) {
			this.aString41 = this.aString41.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ud;Z)V")
	public void method3051(@OriginalArg(0) Class2_Sub34 arg0) {
		arg0.method6894(5);
		arg0.method6894(this.anInt3689);
		arg0.method6894(this.aBoolean308 ? 1 : 0);
		arg0.method6894(this.anInt3676);
		arg0.method6894(this.anInt3694);
		arg0.method6894(this.anInt3677);
		arg0.method6894(this.anInt3684);
		arg0.method6894(this.anInt3678);
		arg0.method6894(this.aBoolean309 ? 1 : 0);
		arg0.method6854(this.anInt3695);
		arg0.method6894(this.anInt3696);
		arg0.method6876(this.anInt3679);
		arg0.method6854(this.anInt3691);
		arg0.method6894(this.anInt3690);
		arg0.method6894(this.anInt3692);
		arg0.method6894(this.anInt3686);
		arg0.method6883(this.aString40);
		arg0.method6883(this.aString39);
		arg0.method6883(this.aString42);
		arg0.method6883(this.aString41);
		arg0.method6894(this.anInt3685);
		arg0.method6854(this.anInt3680);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I")
	public int method3054() {
		@Pc(12) int local12 = Static306.method4189(this.aString40) + 23;
		@Pc(19) int local19 = local12 + Static306.method4189(this.aString39);
		@Pc(26) int local26 = local19 + Static306.method4189(this.aString42);
		return local26 + Static306.method4189(this.aString41);
	}
}

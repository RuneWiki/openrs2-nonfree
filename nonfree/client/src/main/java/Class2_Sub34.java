import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	private int anInt5994;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	private int anInt5996;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
	private int anInt5997;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt6000;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "Ljava/lang/String;")
	private String aString80;

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	private int anInt6003;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	private int anInt6004;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	private int anInt6007;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "Z")
	private boolean aBoolean437;

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	private int anInt6009;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
	private int anInt6010;

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
	private int anInt6011;

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
	private int anInt6012;

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
	private int anInt6013;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	private Class2_Sub34() {
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ZLclient!mr;)V")
	public Class2_Sub34(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class226 arg1) {
		if (Static359.aString67.startsWith("win")) {
			this.anInt6002 = 1;
		} else if (Static359.aString67.startsWith("mac")) {
			this.anInt6002 = 2;
		} else if (Static359.aString67.startsWith("linux")) {
			this.anInt6002 = 3;
		} else {
			this.anInt6002 = 4;
		}
		if (Static359.aString69.startsWith("amd64") || Static359.aString69.startsWith("x86_64")) {
			this.aBoolean436 = true;
		} else {
			this.aBoolean436 = false;
		}
		if (this.anInt6002 == 1) {
			if (Static359.aString72.indexOf("4.0") != -1) {
				this.anInt6012 = 1;
			} else if (Static359.aString72.indexOf("4.1") != -1) {
				this.anInt6012 = 2;
			} else if (Static359.aString72.indexOf("4.9") != -1) {
				this.anInt6012 = 3;
			} else if (Static359.aString72.indexOf("5.0") != -1) {
				this.anInt6012 = 4;
			} else if (Static359.aString72.indexOf("5.1") != -1) {
				this.anInt6012 = 5;
			} else if (Static359.aString72.indexOf("6.0") != -1) {
				this.anInt6012 = 6;
			} else if (Static359.aString72.indexOf("6.1") != -1) {
				this.anInt6012 = 7;
			}
		} else if (this.anInt6002 == 2) {
			if (Static359.aString72.indexOf("10.4") != -1) {
				this.anInt6012 = 20;
			} else if (Static359.aString72.indexOf("10.5") != -1) {
				this.anInt6012 = 21;
			} else if (Static359.aString72.indexOf("10.6") != -1) {
				this.anInt6012 = 22;
			}
		}
		if (Static359.aString71.toLowerCase().indexOf("sun") != -1) {
			this.anInt6007 = 1;
		} else if (Static359.aString71.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt6007 = 2;
		} else if (Static359.aString71.toLowerCase().indexOf("apple") == -1) {
			this.anInt6007 = 4;
		} else {
			this.anInt6007 = 3;
		}
		@Pc(202) int local202 = 2;
		@Pc(204) int local204 = 0;
		@Pc(210) char local210;
		try {
			while (local202 < Static359.aString70.length()) {
				local210 = Static359.aString70.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local202++;
				local204 = local204 * 10 + local210 - 48;
			}
		} catch (@Pc(239) Exception local239) {
		}
		this.anInt6003 = local204;
		local204 = 0;
		local202 = Static359.aString70.indexOf(46, 2) + 1;
		try {
			while (local202 < Static359.aString70.length()) {
				local210 = Static359.aString70.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local204 * 10 + local210 - 48;
				local202++;
			}
		} catch (@Pc(285) Exception local285) {
		}
		this.anInt6009 = local204;
		local202 = Static359.aString70.indexOf(95, 4) + 1;
		local204 = 0;
		try {
			while (local202 < Static359.aString70.length()) {
				local210 = Static359.aString70.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local204 * 10 + local210 - 48;
				local202++;
			}
		} catch (@Pc(327) Exception local327) {
		}
		if (arg1.aBoolean416) {
			this.aBoolean437 = false;
		} else {
			this.aBoolean437 = true;
		}
		this.anInt6011 = Static234.anInt10094;
		if (this.anInt6003 > 3) {
			this.anInt6008 = Static512.anInt8554;
		} else {
			this.anInt6008 = 0;
		}
		this.anInt6001 = local204;
		try {
			this.anInt6000 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(368) Throwable local368) {
			this.anInt6000 = 0;
		}
		if (this.aString79 == null) {
			this.aString79 = "";
		}
		if (this.aString80 == null) {
			this.aString80 = "";
		}
		if (this.aString82 == null) {
			this.aString82 = "";
		}
		if (this.aString81 == null) {
			this.aString81 = "";
		}
		this.method5126();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method5123(@OriginalArg(0) Class2_Sub22 arg0) {
		arg0.method8537(5);
		arg0.method8537(this.anInt6002);
		arg0.method8537(this.aBoolean436 ? 1 : 0);
		arg0.method8537(this.anInt6012);
		arg0.method8537(this.anInt6007);
		arg0.method8537(this.anInt6003);
		arg0.method8537(this.anInt6009);
		arg0.method8537(this.anInt6001);
		arg0.method8537(this.aBoolean437 ? 1 : 0);
		arg0.method8500(this.anInt6011);
		arg0.method8537(this.anInt6008);
		arg0.method8529(this.anInt6000);
		arg0.method8500(this.anInt5996);
		arg0.method8537(this.anInt6010);
		arg0.method8537(this.anInt5997);
		arg0.method8537(this.anInt6004);
		arg0.method8538(this.aString82);
		arg0.method8538(this.aString79);
		arg0.method8538(this.aString80);
		arg0.method8538(this.aString81);
		arg0.method8537(this.anInt5994);
		arg0.method8500(this.anInt6013);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	private void method5126() {
		if (this.aString82.length() > 40) {
			this.aString82 = this.aString82.substring(0, 40);
		}
		if (this.aString79.length() > 40) {
			this.aString79 = this.aString79.substring(0, 40);
		}
		if (this.aString80.length() > 10) {
			this.aString80 = this.aString80.substring(0, 10);
		}
		if (this.aString81.length() > 10) {
			this.aString81 = this.aString81.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I")
	public int method5127() {
		@Pc(12) int local12 = Static15.method231(this.aString82) + 23;
		@Pc(19) int local19 = local12 + Static15.method231(this.aString79);
		@Pc(31) int local31 = local19 + Static15.method231(this.aString80);
		return local31 + Static15.method231(this.aString81);
	}
}

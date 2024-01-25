import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub49 extends Class2 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Z")
	private boolean aBoolean763;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt9039;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/lang/String;")
	private String aString133;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Ljava/lang/String;")
	private String aString134;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt9041;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt9042;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt9043;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	private int anInt9044;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
	private boolean aBoolean764;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	private int anInt9045;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	private int anInt9046;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	private int anInt9047;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	private int anInt9048;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	private int anInt9050;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Ljava/lang/String;")
	private String aString135;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
	private int anInt9051;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	private int anInt9052;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	private int anInt9054;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	private int anInt9055;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Ljava/lang/String;")
	private String aString136;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	private int anInt9059;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	private Class2_Sub49() {
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ZLclient!ew;)V")
	public Class2_Sub49(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class99 arg1) {
		if (Static132.aString29.startsWith("win")) {
			this.anInt9052 = 1;
		} else if (Static132.aString29.startsWith("mac")) {
			this.anInt9052 = 2;
		} else if (Static132.aString29.startsWith("linux")) {
			this.anInt9052 = 3;
		} else {
			this.anInt9052 = 4;
		}
		if (Static132.aString25.startsWith("amd64") || Static132.aString25.startsWith("x86_64")) {
			this.aBoolean763 = true;
		} else {
			this.aBoolean763 = false;
		}
		if (this.anInt9052 == 1) {
			if (Static132.aString30.indexOf("4.0") != -1) {
				this.anInt9041 = 1;
			} else if (Static132.aString30.indexOf("4.1") != -1) {
				this.anInt9041 = 2;
			} else if (Static132.aString30.indexOf("4.9") != -1) {
				this.anInt9041 = 3;
			} else if (Static132.aString30.indexOf("5.0") != -1) {
				this.anInt9041 = 4;
			} else if (Static132.aString30.indexOf("5.1") != -1) {
				this.anInt9041 = 5;
			} else if (Static132.aString30.indexOf("6.0") != -1) {
				this.anInt9041 = 6;
			} else if (Static132.aString30.indexOf("6.1") != -1) {
				this.anInt9041 = 7;
			}
		} else if (this.anInt9052 == 2) {
			if (Static132.aString30.indexOf("10.4") != -1) {
				this.anInt9041 = 20;
			} else if (Static132.aString30.indexOf("10.5") != -1) {
				this.anInt9041 = 21;
			} else if (Static132.aString30.indexOf("10.6") != -1) {
				this.anInt9041 = 22;
			}
		}
		if (Static132.aString32.toLowerCase().indexOf("sun") != -1) {
			this.anInt9051 = 1;
		} else if (Static132.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt9051 = 2;
		} else if (Static132.aString32.toLowerCase().indexOf("apple") == -1) {
			this.anInt9051 = 4;
		} else {
			this.anInt9051 = 3;
		}
		@Pc(204) int local204 = 2;
		@Pc(206) int local206 = 0;
		@Pc(212) char local212;
		try {
			while (local204 < Static132.aString26.length()) {
				local212 = Static132.aString26.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local212 + local206 * 10 - 48;
			}
		} catch (@Pc(240) Exception local240) {
		}
		this.anInt9055 = local206;
		local204 = Static132.aString26.indexOf(46, 2) + 1;
		local206 = 0;
		try {
			while (Static132.aString26.length() > local204) {
				local212 = Static132.aString26.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local206 * 10 + local212 - 48;
			}
		} catch (@Pc(282) Exception local282) {
		}
		this.anInt9046 = local206;
		local204 = Static132.aString26.indexOf(95, 4) + 1;
		local206 = 0;
		try {
			while (Static132.aString26.length() > local204) {
				local212 = Static132.aString26.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local212 + local206 * 10 - 48;
			}
		} catch (@Pc(330) Exception local330) {
		}
		if (this.anInt9055 > 3) {
			this.anInt9050 = Static346.anInt5966;
		} else {
			this.anInt9050 = 0;
		}
		this.anInt9043 = Static326.anInt7462;
		this.anInt9045 = local206;
		if (arg1.aBoolean151) {
			this.aBoolean764 = false;
		} else {
			this.aBoolean764 = true;
		}
		try {
			this.anInt9048 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(371) Throwable local371) {
			this.anInt9048 = 0;
		}
		if (this.aString134 == null) {
			this.aString134 = "";
		}
		if (this.aString136 == null) {
			this.aString136 = "";
		}
		if (this.aString135 == null) {
			this.aString135 = "";
		}
		if (this.aString133 == null) {
			this.aString133 = "";
		}
		this.method7241();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method7236(@OriginalArg(1) Class2_Sub7 arg0) {
		arg0.method4459(5);
		arg0.method4459(this.anInt9052);
		arg0.method4459(this.aBoolean763 ? 1 : 0);
		arg0.method4459(this.anInt9041);
		arg0.method4459(this.anInt9051);
		arg0.method4459(this.anInt9055);
		arg0.method4459(this.anInt9046);
		arg0.method4459(this.anInt9045);
		arg0.method4459(this.aBoolean764 ? 1 : 0);
		arg0.method4511(this.anInt9043);
		arg0.method4459(this.anInt9050);
		arg0.method4462(this.anInt9048);
		arg0.method4511(this.anInt9039);
		arg0.method4459(this.anInt9059);
		arg0.method4459(this.anInt9044);
		arg0.method4459(this.anInt9054);
		arg0.method4510(this.aString134);
		arg0.method4510(this.aString133);
		arg0.method4510(this.aString136);
		arg0.method4510(this.aString135);
		arg0.method4459(this.anInt9042);
		arg0.method4511(this.anInt9047);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	public int method7239() {
		@Pc(20) int local20 = Static50.method865(this.aString134) + 23;
		@Pc(27) int local27 = local20 + Static50.method865(this.aString133);
		@Pc(34) int local34 = local27 + Static50.method865(this.aString136);
		return local34 + Static50.method865(this.aString135);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	private void method7241() {
		if (this.aString134.length() > 40) {
			this.aString134 = this.aString134.substring(0, 40);
		}
		if (this.aString133.length() > 40) {
			this.aString133 = this.aString133.substring(0, 40);
		}
		if (this.aString136.length() > 10) {
			this.aString136 = this.aString136.substring(0, 10);
		}
		if (this.aString135.length() > 10) {
			this.aString135 = this.aString135.substring(0, 10);
		}
	}
}

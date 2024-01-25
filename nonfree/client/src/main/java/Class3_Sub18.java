import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	private int anInt3478;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	private int anInt3479;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	private int anInt3480;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	private int anInt3481;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
	private int anInt3482;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	private int anInt3484;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "Ljava/lang/String;")
	private String aString80;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	private int anInt3485;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	private int anInt3486;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
	private int anInt3488;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "Z")
	private boolean aBoolean249;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	private int anInt3492;

	@OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
	private int anInt3495;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	private int anInt3496;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
	private int anInt3497;

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
	private int anInt3498;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ZLclient!k;)V")
	public Class3_Sub18(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class168 arg1) {
		if (Static268.aString130.startsWith("win")) {
			this.anInt3488 = 1;
		} else if (Static268.aString130.startsWith("mac")) {
			this.anInt3488 = 2;
		} else if (Static268.aString130.startsWith("linux")) {
			this.anInt3488 = 3;
		} else {
			this.anInt3488 = 4;
		}
		if (Static268.aString129.startsWith("amd64") || Static268.aString129.startsWith("x86_64")) {
			this.aBoolean248 = true;
		} else {
			this.aBoolean248 = false;
		}
		if (this.anInt3488 == 1) {
			if (Static268.aString132.indexOf("4.0") != -1) {
				this.anInt3480 = 1;
			} else if (Static268.aString132.indexOf("4.1") != -1) {
				this.anInt3480 = 2;
			} else if (Static268.aString132.indexOf("4.9") != -1) {
				this.anInt3480 = 3;
			} else if (Static268.aString132.indexOf("5.0") != -1) {
				this.anInt3480 = 4;
			} else if (Static268.aString132.indexOf("5.1") != -1) {
				this.anInt3480 = 5;
			} else if (Static268.aString132.indexOf("6.0") != -1) {
				this.anInt3480 = 6;
			} else if (Static268.aString132.indexOf("6.1") != -1) {
				this.anInt3480 = 7;
			}
		} else if (this.anInt3488 == 2) {
			if (Static268.aString132.indexOf("10.4") != -1) {
				this.anInt3480 = 20;
			} else if (Static268.aString132.indexOf("10.5") != -1) {
				this.anInt3480 = 21;
			} else if (Static268.aString132.indexOf("10.6") != -1) {
				this.anInt3480 = 22;
			}
		}
		if (Static268.aString131.toLowerCase().indexOf("sun") != -1) {
			this.anInt3478 = 1;
		} else if (Static268.aString131.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3478 = 2;
		} else if (Static268.aString131.toLowerCase().indexOf("apple") == -1) {
			this.anInt3478 = 4;
		} else {
			this.anInt3478 = 3;
		}
		@Pc(207) int local207 = 2;
		@Pc(209) int local209 = 0;
		@Pc(215) char local215;
		try {
			while (local207 < Static268.aString134.length()) {
				local215 = Static268.aString134.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local209 = local215 + local209 * 10 - 48;
				local207++;
			}
		} catch (@Pc(240) Exception local240) {
		}
		this.anInt3479 = local209;
		local209 = 0;
		local207 = Static268.aString134.indexOf(46, 2) + 1;
		try {
			while (local207 < Static268.aString134.length()) {
				local215 = Static268.aString134.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local207++;
				local209 = local215 + local209 * 10 - 48;
			}
		} catch (@Pc(284) Exception local284) {
		}
		this.anInt3481 = local209;
		local209 = 0;
		local207 = Static268.aString134.indexOf(95, 4) + 1;
		try {
			while (Static268.aString134.length() > local207) {
				local215 = Static268.aString134.charAt(local207);
				if (local215 < '0' || local215 > '9') {
					break;
				}
				local209 = local209 * 10 + local215 - 48;
				local207++;
			}
		} catch (@Pc(332) Exception local332) {
		}
		this.anInt3495 = local209;
		if (arg1.aBoolean334) {
			this.aBoolean249 = false;
		} else {
			this.aBoolean249 = true;
		}
		this.anInt3496 = Static372.anInt6489;
		if (this.anInt3479 > 3) {
			this.anInt3484 = Static248.anInt4912;
		} else {
			this.anInt3484 = 0;
		}
		try {
			this.anInt3482 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(371) Throwable local371) {
			this.anInt3482 = 0;
		}
		if (this.aString81 == null) {
			this.aString81 = "";
		}
		if (this.aString80 == null) {
			this.aString80 = "";
		}
		if (this.aString82 == null) {
			this.aString82 = "";
		}
		if (this.aString79 == null) {
			this.aString79 = "";
		}
		this.method2835();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
	public int method2834() {
		@Pc(12) int local12 = Static401.method5672(this.aString82) + 23;
		@Pc(26) int local26 = local12 + Static401.method5672(this.aString81);
		@Pc(33) int local33 = local26 + Static401.method5672(this.aString79);
		return local33 + Static401.method5672(this.aString80);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	private void method2835() {
		if (this.aString82.length() > 40) {
			this.aString82 = this.aString82.substring(0, 40);
		}
		if (this.aString81.length() > 40) {
			this.aString81 = this.aString81.substring(0, 40);
		}
		if (this.aString79.length() > 10) {
			this.aString79 = this.aString79.substring(0, 10);
		}
		if (this.aString80.length() > 10) {
			this.aString80 = this.aString80.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!ie;)V")
	public void method2837(@OriginalArg(1) Class3_Sub26 arg0) {
		arg0.method6809(5);
		arg0.method6809(this.anInt3488);
		arg0.method6809(this.aBoolean248 ? 1 : 0);
		arg0.method6809(this.anInt3480);
		arg0.method6809(this.anInt3478);
		arg0.method6809(this.anInt3479);
		arg0.method6809(this.anInt3481);
		arg0.method6809(this.anInt3495);
		arg0.method6809(this.aBoolean249 ? 1 : 0);
		arg0.method6769(this.anInt3496);
		arg0.method6809(this.anInt3484);
		arg0.method6791(this.anInt3482);
		arg0.method6769(this.anInt3498);
		arg0.method6809(this.anInt3492);
		arg0.method6809(this.anInt3489);
		arg0.method6809(this.anInt3497);
		arg0.method6834(this.aString82);
		arg0.method6834(this.aString81);
		arg0.method6834(this.aString79);
		arg0.method6834(this.aString80);
		arg0.method6809(this.anInt3486);
		arg0.method6769(this.anInt3485);
	}
}

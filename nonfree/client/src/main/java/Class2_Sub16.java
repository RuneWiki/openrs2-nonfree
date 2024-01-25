import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	private int anInt3424;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	private int anInt3425;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	private int anInt3427;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	private int anInt3428;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	private int anInt3430;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	private int anInt3431;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Z")
	private boolean aBoolean258;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "Z")
	private boolean aBoolean259;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public int anInt3436;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	private int anInt3438;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
	private int anInt3439;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
	private int anInt3441;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
	private int anInt3442;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	private Class2_Sub16() {
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ZLclient!wea;)V")
	public Class2_Sub16(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class370 arg1) {
		if (Static623.aString117.startsWith("win")) {
			this.anInt3439 = 1;
		} else if (Static623.aString117.startsWith("mac")) {
			this.anInt3439 = 2;
		} else if (Static623.aString117.startsWith("linux")) {
			this.anInt3439 = 3;
		} else {
			this.anInt3439 = 4;
		}
		if (Static623.aString111.startsWith("amd64") || Static623.aString111.startsWith("x86_64")) {
			this.aBoolean259 = true;
		} else {
			this.aBoolean259 = false;
		}
		if (this.anInt3439 == 1) {
			if (Static623.aString110.indexOf("4.0") != -1) {
				this.anInt3428 = 1;
			} else if (Static623.aString110.indexOf("4.1") != -1) {
				this.anInt3428 = 2;
			} else if (Static623.aString110.indexOf("4.9") != -1) {
				this.anInt3428 = 3;
			} else if (Static623.aString110.indexOf("5.0") != -1) {
				this.anInt3428 = 4;
			} else if (Static623.aString110.indexOf("5.1") != -1) {
				this.anInt3428 = 5;
			} else if (Static623.aString110.indexOf("6.0") != -1) {
				this.anInt3428 = 6;
			} else if (Static623.aString110.indexOf("6.1") != -1) {
				this.anInt3428 = 7;
			}
		} else if (this.anInt3439 == 2) {
			if (Static623.aString110.indexOf("10.4") != -1) {
				this.anInt3428 = 20;
			} else if (Static623.aString110.indexOf("10.5") != -1) {
				this.anInt3428 = 21;
			} else if (Static623.aString110.indexOf("10.6") != -1) {
				this.anInt3428 = 22;
			}
		}
		if (Static623.aString112.toLowerCase().indexOf("sun") != -1) {
			this.anInt3427 = 1;
		} else if (Static623.aString112.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3427 = 2;
		} else if (Static623.aString112.toLowerCase().indexOf("apple") == -1) {
			this.anInt3427 = 4;
		} else {
			this.anInt3427 = 3;
		}
		@Pc(206) int local206 = 2;
		@Pc(208) int local208 = 0;
		@Pc(214) char local214;
		try {
			while (local206 < Static623.aString115.length()) {
				local214 = Static623.aString115.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local206++;
				local208 = local208 * 10 + local214 - 48;
			}
		} catch (@Pc(246) Exception local246) {
		}
		this.anInt3441 = local208;
		local206 = Static623.aString115.indexOf(46, 2) + 1;
		local208 = 0;
		try {
			while (Static623.aString115.length() > local206) {
				local214 = Static623.aString115.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local208 = local208 * 10 + local214 - 48;
				local206++;
			}
		} catch (@Pc(292) Exception local292) {
		}
		this.anInt3434 = local208;
		local208 = 0;
		local206 = Static623.aString115.indexOf(95, 4) + 1;
		try {
			while (Static623.aString115.length() > local206) {
				local214 = Static623.aString115.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local208 = local214 + local208 * 10 - 48;
				local206++;
			}
		} catch (@Pc(332) Exception local332) {
		}
		if (arg1.aBoolean739) {
			this.aBoolean258 = false;
		} else {
			this.aBoolean258 = true;
		}
		this.anInt3438 = local208;
		this.anInt3425 = Static514.anInt9425;
		if (this.anInt3441 <= 3) {
			this.anInt3431 = 0;
		} else {
			this.anInt3431 = Static597.anInt10516;
		}
		try {
			@Pc(363) int[] local363 = HardwareInfo.getCPUInfo();
			if (local363 != null && local363.length == 7) {
				this.anInt3430 = local363[3];
				this.anInt3429 = local363[4];
				this.anInt3424 = local363[2];
				this.anInt3433 = local363[5];
				this.anInt3436 = local363[6];
			}
		} catch (@Pc(396) Throwable local396) {
			this.anInt3436 = 0;
		}
		if (this.aString31 == null) {
			this.aString31 = "";
		}
		if (this.aString30 == null) {
			this.aString30 = "";
		}
		if (this.aString29 == null) {
			this.aString29 = "";
		}
		if (this.aString32 == null) {
			this.aString32 = "";
		}
		this.method3133();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	private void method3133() {
		if (this.aString30.length() > 40) {
			this.aString30 = this.aString30.substring(0, 40);
		}
		if (this.aString32.length() > 40) {
			this.aString32 = this.aString32.substring(0, 40);
		}
		if (this.aString31.length() > 10) {
			this.aString31 = this.aString31.substring(0, 10);
		}
		if (this.aString29.length() > 10) {
			this.aString29 = this.aString29.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
	public int method3134() {
		@Pc(12) int local12 = Static611.method9089(this.aString30) + 23;
		@Pc(19) int local19 = local12 + Static611.method9089(this.aString32);
		@Pc(26) int local26 = local19 + Static611.method9089(this.aString31);
		return local26 + Static611.method9089(this.aString29);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!cea;)V")
	public void method3135(@OriginalArg(1) Class2_Sub11 arg0) {
		arg0.method8374(5);
		arg0.method8374(this.anInt3439);
		arg0.method8374(this.aBoolean259 ? 1 : 0);
		arg0.method8374(this.anInt3428);
		arg0.method8374(this.anInt3427);
		arg0.method8374(this.anInt3441);
		arg0.method8374(this.anInt3434);
		arg0.method8374(this.anInt3438);
		arg0.method8374(this.aBoolean258 ? 1 : 0);
		arg0.method8333(this.anInt3425);
		arg0.method8374(this.anInt3431);
		arg0.method8336(this.anInt3436);
		arg0.method8333(this.anInt3424);
		arg0.method8374(this.anInt3430);
		arg0.method8374(this.anInt3429);
		arg0.method8374(this.anInt3433);
		arg0.method8382(this.aString30);
		arg0.method8382(this.aString32);
		arg0.method8382(this.aString31);
		arg0.method8382(this.aString29);
		arg0.method8374(this.anInt3435);
		arg0.method8333(this.anInt3442);
	}
}

import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!jja", name = "i", descriptor = "I")
	private int anInt4351;

	@OriginalMember(owner = "client!jja", name = "k", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!jja", name = "l", descriptor = "I")
	private int anInt4353;

	@OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
	private int anInt4354;

	@OriginalMember(owner = "client!jja", name = "n", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!jja", name = "o", descriptor = "I")
	private int anInt4355;

	@OriginalMember(owner = "client!jja", name = "q", descriptor = "I")
	private int anInt4357;

	@OriginalMember(owner = "client!jja", name = "r", descriptor = "I")
	private int anInt4358;

	@OriginalMember(owner = "client!jja", name = "s", descriptor = "I")
	private int anInt4359;

	@OriginalMember(owner = "client!jja", name = "t", descriptor = "I")
	private int anInt4360;

	@OriginalMember(owner = "client!jja", name = "u", descriptor = "Ljava/lang/String;")
	private String aString39;

	@OriginalMember(owner = "client!jja", name = "v", descriptor = "I")
	private int anInt4361;

	@OriginalMember(owner = "client!jja", name = "w", descriptor = "I")
	private int anInt4362;

	@OriginalMember(owner = "client!jja", name = "x", descriptor = "I")
	private int anInt4363;

	@OriginalMember(owner = "client!jja", name = "A", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!jja", name = "B", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!jja", name = "D", descriptor = "I")
	private int anInt4366;

	@OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
	private int anInt4367;

	@OriginalMember(owner = "client!jja", name = "F", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
	private int anInt4368;

	@OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
	public int anInt4369;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(ZLclient!kj;)V")
	public Class5_Sub30(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class202 arg1) {
		if (Static308.aString53.startsWith("win")) {
			this.anInt4355 = 1;
		} else if (Static308.aString53.startsWith("mac")) {
			this.anInt4355 = 2;
		} else if (Static308.aString53.startsWith("linux")) {
			this.anInt4355 = 3;
		} else {
			this.anInt4355 = 4;
		}
		if (Static308.aString52.startsWith("amd64") || Static308.aString52.startsWith("x86_64")) {
			this.aBoolean288 = true;
		} else {
			this.aBoolean288 = false;
		}
		if (this.anInt4355 == 1) {
			if (Static308.aString51.indexOf("4.0") != -1) {
				this.anInt4362 = 1;
			} else if (Static308.aString51.indexOf("4.1") != -1) {
				this.anInt4362 = 2;
			} else if (Static308.aString51.indexOf("4.9") != -1) {
				this.anInt4362 = 3;
			} else if (Static308.aString51.indexOf("5.0") != -1) {
				this.anInt4362 = 4;
			} else if (Static308.aString51.indexOf("5.1") != -1) {
				this.anInt4362 = 5;
			} else if (Static308.aString51.indexOf("6.0") != -1) {
				this.anInt4362 = 6;
			} else if (Static308.aString51.indexOf("6.1") != -1) {
				this.anInt4362 = 7;
			}
		} else if (this.anInt4355 == 2) {
			if (Static308.aString51.indexOf("10.4") != -1) {
				this.anInt4362 = 20;
			} else if (Static308.aString51.indexOf("10.5") != -1) {
				this.anInt4362 = 21;
			} else if (Static308.aString51.indexOf("10.6") != -1) {
				this.anInt4362 = 22;
			}
		}
		if (Static308.aString50.toLowerCase().indexOf("sun") != -1) {
			this.anInt4358 = 1;
		} else if (Static308.aString50.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4358 = 2;
		} else if (Static308.aString50.toLowerCase().indexOf("apple") == -1) {
			this.anInt4358 = 4;
		} else {
			this.anInt4358 = 3;
		}
		@Pc(182) int local182 = 2;
		@Pc(184) int local184 = 0;
		@Pc(189) char local189;
		try {
			while (local182 < Static308.aString46.length()) {
				local189 = Static308.aString46.charAt(local182);
				if (local189 < '0' || local189 > '9') {
					break;
				}
				local184 = local184 * 10 + local189 - 48;
				local182++;
			}
		} catch (@Pc(215) Exception local215) {
		}
		this.anInt4354 = local184;
		local182 = Static308.aString46.indexOf(46, 2) + 1;
		local184 = 0;
		try {
			while (Static308.aString46.length() > local182) {
				local189 = Static308.aString46.charAt(local182);
				if (local189 < '0' || local189 > '9') {
					break;
				}
				local184 = local184 * 10 + local189 - 48;
				local182++;
			}
		} catch (@Pc(261) Exception local261) {
		}
		this.anInt4363 = local184;
		local182 = Static308.aString46.indexOf(95, 4) + 1;
		local184 = 0;
		try {
			while (Static308.aString46.length() > local182) {
				local189 = Static308.aString46.charAt(local182);
				if (local189 < '0' || local189 > '9') {
					break;
				}
				local184 = local189 + local184 * 10 - 48;
				local182++;
			}
		} catch (@Pc(300) Exception local300) {
		}
		if (arg1.aBoolean384) {
			this.aBoolean289 = false;
		} else {
			this.aBoolean289 = true;
		}
		if (this.anInt4354 > 3) {
			this.anInt4361 = Static346.anInt6205;
		} else {
			this.anInt4361 = 0;
		}
		this.anInt4360 = local184;
		this.anInt4359 = Static126.anInt2180;
		try {
			@Pc(331) int[] local331 = HardwareInfo.getCPUInfo();
			if (local331 != null && local331.length == 7) {
				this.anInt4369 = local331[6];
				this.anInt4366 = local331[3];
				this.anInt4367 = local331[5];
				this.anInt4353 = local331[2];
				this.anInt4368 = local331[4];
			}
		} catch (@Pc(366) Throwable local366) {
			this.anInt4369 = 0;
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
		if (this.aString38 == null) {
			this.aString38 = "";
		}
		this.method3858();
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)I")
	public int method3856() {
		@Pc(12) int local12 = Static307.method4717(this.aString39) + 23;
		@Pc(19) int local19 = local12 + Static307.method4717(this.aString38);
		@Pc(34) int local34 = local19 + Static307.method4717(this.aString40);
		return local34 + Static307.method4717(this.aString41);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method3857(@OriginalArg(0) Class5_Sub15 arg0) {
		arg0.method3651(5);
		arg0.method3651(this.anInt4355);
		arg0.method3651(this.aBoolean288 ? 1 : 0);
		arg0.method3651(this.anInt4362);
		arg0.method3651(this.anInt4358);
		arg0.method3651(this.anInt4354);
		arg0.method3651(this.anInt4363);
		arg0.method3651(this.anInt4360);
		arg0.method3651(this.aBoolean289 ? 1 : 0);
		arg0.method3660(this.anInt4359);
		arg0.method3651(this.anInt4361);
		arg0.method3676(this.anInt4369);
		arg0.method3660(this.anInt4353);
		arg0.method3651(this.anInt4366);
		arg0.method3651(this.anInt4368);
		arg0.method3651(this.anInt4367);
		arg0.method3639(this.aString39);
		arg0.method3639(this.aString38);
		arg0.method3639(this.aString40);
		arg0.method3639(this.aString41);
		arg0.method3651(this.anInt4357);
		arg0.method3660(this.anInt4351);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
	private void method3858() {
		if (this.aString39.length() > 40) {
			this.aString39 = this.aString39.substring(0, 40);
		}
		if (this.aString38.length() > 40) {
			this.aString38 = this.aString38.substring(0, 40);
		}
		if (this.aString40.length() > 10) {
			this.aString40 = this.aString40.substring(0, 10);
		}
		if (this.aString41.length() > 10) {
			this.aString41 = this.aString41.substring(0, 10);
		}
	}
}

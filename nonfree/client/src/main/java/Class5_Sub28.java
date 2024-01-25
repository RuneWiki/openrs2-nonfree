import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	private int anInt5479;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private int anInt5481;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	private int anInt5483;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Ljava/lang/String;")
	private String aString85;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	private int anInt5487;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	private int anInt5488;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	private int anInt5489;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Ljava/lang/String;")
	private String aString86;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	private int anInt5491;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	private int anInt5492;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
	private int anInt5493;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	private int anInt5494;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public int anInt5496;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class5_Sub28() {
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ZLclient!kk;)V")
	public Class5_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class192 arg1) {
		if (Static295.aString75.startsWith("win")) {
			this.anInt5483 = 1;
		} else if (Static295.aString75.startsWith("mac")) {
			this.anInt5483 = 2;
		} else if (Static295.aString75.startsWith("linux")) {
			this.anInt5483 = 3;
		} else {
			this.anInt5483 = 4;
		}
		if (Static295.aString74.startsWith("amd64") || Static295.aString74.startsWith("x86_64")) {
			this.aBoolean467 = true;
		} else {
			this.aBoolean467 = false;
		}
		if (this.anInt5483 == 1) {
			if (Static295.aString76.indexOf("4.0") != -1) {
				this.anInt5487 = 1;
			} else if (Static295.aString76.indexOf("4.1") != -1) {
				this.anInt5487 = 2;
			} else if (Static295.aString76.indexOf("4.9") != -1) {
				this.anInt5487 = 3;
			} else if (Static295.aString76.indexOf("5.0") != -1) {
				this.anInt5487 = 4;
			} else if (Static295.aString76.indexOf("5.1") != -1) {
				this.anInt5487 = 5;
			} else if (Static295.aString76.indexOf("6.0") != -1) {
				this.anInt5487 = 6;
			} else if (Static295.aString76.indexOf("6.1") != -1) {
				this.anInt5487 = 7;
			}
		} else if (this.anInt5483 == 2) {
			if (Static295.aString76.indexOf("10.4") != -1) {
				this.anInt5487 = 20;
			} else if (Static295.aString76.indexOf("10.5") != -1) {
				this.anInt5487 = 21;
			} else if (Static295.aString76.indexOf("10.6") != -1) {
				this.anInt5487 = 22;
			}
		}
		if (Static295.aString77.toLowerCase().indexOf("sun") != -1) {
			this.anInt5488 = 1;
		} else if (Static295.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5488 = 2;
		} else if (Static295.aString77.toLowerCase().indexOf("apple") == -1) {
			this.anInt5488 = 4;
		} else {
			this.anInt5488 = 3;
		}
		@Pc(202) int local202 = 2;
		@Pc(204) int local204 = 0;
		@Pc(210) char local210;
		try {
			while (Static295.aString73.length() > local202) {
				local210 = Static295.aString73.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local202++;
				local204 = local210 + local204 * 10 - 48;
			}
		} catch (@Pc(233) Exception local233) {
		}
		this.anInt5494 = local204;
		local202 = Static295.aString73.indexOf(46, 2) + 1;
		local204 = 0;
		try {
			while (Static295.aString73.length() > local202) {
				local210 = Static295.aString73.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local202++;
				local204 = local204 * 10 + local210 - 48;
			}
		} catch (@Pc(274) Exception local274) {
		}
		this.anInt5478 = local204;
		local204 = 0;
		local202 = Static295.aString73.indexOf(95, 4) + 1;
		try {
			while (Static295.aString73.length() > local202) {
				local210 = Static295.aString73.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local210 + local204 * 10 - 48;
				local202++;
			}
		} catch (@Pc(321) Exception local321) {
		}
		if (this.anInt5494 > 3) {
			this.anInt5493 = Static209.anInt3631;
		} else {
			this.anInt5493 = 0;
		}
		this.anInt5491 = Static125.anInt2059;
		this.anInt5489 = local204;
		if (arg1.aBoolean389) {
			this.aBoolean466 = false;
		} else {
			this.aBoolean466 = true;
		}
		try {
			@Pc(354) int[] local354 = HardwareInfo.getCPUInfo();
			if (local354 != null && local354.length == 7) {
				this.anInt5481 = local354[4];
				this.anInt5486 = local354[2];
				this.anInt5479 = local354[3];
				this.anInt5496 = local354[6];
				this.anInt5492 = local354[5];
			}
		} catch (@Pc(389) Throwable local389) {
			this.anInt5496 = 0;
		}
		if (this.aString84 == null) {
			this.aString84 = "";
		}
		if (this.aString87 == null) {
			this.aString87 = "";
		}
		if (this.aString86 == null) {
			this.aString86 = "";
		}
		if (this.aString85 == null) {
			this.aString85 = "";
		}
		this.method4944();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method4943(@OriginalArg(0) Class5_Sub12 arg0) {
		arg0.method8647(5);
		arg0.method8647(this.anInt5483);
		arg0.method8647(this.aBoolean467 ? 1 : 0);
		arg0.method8647(this.anInt5487);
		arg0.method8647(this.anInt5488);
		arg0.method8647(this.anInt5494);
		arg0.method8647(this.anInt5478);
		arg0.method8647(this.anInt5489);
		arg0.method8647(this.aBoolean466 ? 1 : 0);
		arg0.method8655(this.anInt5491);
		arg0.method8647(this.anInt5493);
		arg0.method8621(this.anInt5496);
		arg0.method8655(this.anInt5486);
		arg0.method8647(this.anInt5479);
		arg0.method8647(this.anInt5481);
		arg0.method8647(this.anInt5492);
		arg0.method8656(this.aString84);
		arg0.method8656(this.aString85);
		arg0.method8656(this.aString87);
		arg0.method8656(this.aString86);
		arg0.method8647(this.anInt5477);
		arg0.method8655(this.anInt5485);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	private void method4944() {
		if (this.aString84.length() > 40) {
			this.aString84 = this.aString84.substring(0, 40);
		}
		if (this.aString85.length() > 40) {
			this.aString85 = this.aString85.substring(0, 40);
		}
		if (this.aString87.length() > 10) {
			this.aString87 = this.aString87.substring(0, 10);
		}
		if (this.aString86.length() > 10) {
			this.aString86 = this.aString86.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	public int method4945() {
		@Pc(12) int local12 = Static469.method6880(this.aString84) + 23;
		@Pc(24) int local24 = local12 + Static469.method6880(this.aString85);
		@Pc(31) int local31 = local24 + Static469.method6880(this.aString87);
		return local31 + Static469.method6880(this.aString86);
	}
}

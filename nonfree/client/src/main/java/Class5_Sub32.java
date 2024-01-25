import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!lja", name = "B", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!lja", name = "M", descriptor = "I")
	public int anInt5616;

	@OriginalMember(owner = "client!lja", name = "s", descriptor = "I")
	private int anInt5617;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
	private int anInt5618;

	@OriginalMember(owner = "client!lja", name = "N", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
	public int anInt5619;

	@OriginalMember(owner = "client!lja", name = "v", descriptor = "I")
	private int anInt5620;

	@OriginalMember(owner = "client!lja", name = "n", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!lja", name = "t", descriptor = "I")
	private int anInt5621;

	@OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
	private int anInt5624;

	@OriginalMember(owner = "client!lja", name = "C", descriptor = "I")
	private int anInt5625;

	@OriginalMember(owner = "client!lja", name = "J", descriptor = "I")
	private int anInt5626;

	@OriginalMember(owner = "client!lja", name = "E", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!lja", name = "F", descriptor = "I")
	private int anInt5627;

	@OriginalMember(owner = "client!lja", name = "q", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
	private int anInt5629;

	@OriginalMember(owner = "client!lja", name = "L", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!lja", name = "x", descriptor = "I")
	private int anInt5632;

	@OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
	public int anInt5633;

	@OriginalMember(owner = "client!lja", name = "z", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!lja", name = "w", descriptor = "I")
	private int anInt5634;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "()V")
	private Class5_Sub32() {
	}

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(ZLclient!tga;)V")
	public Class5_Sub32(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class349 arg1) {
		if (Static576.aString103.startsWith("win")) {
			this.anInt5617 = 1;
		} else if (Static576.aString103.startsWith("mac")) {
			this.anInt5617 = 2;
		} else if (Static576.aString103.startsWith("linux")) {
			this.anInt5617 = 3;
		} else {
			this.anInt5617 = 4;
		}
		if (Static576.aString109.startsWith("amd64") || Static576.aString109.startsWith("x86_64")) {
			this.aBoolean372 = true;
		} else {
			this.aBoolean372 = false;
		}
		if (this.anInt5617 == 1) {
			if (Static576.aString104.indexOf("4.0") != -1) {
				this.anInt5625 = 1;
			} else if (Static576.aString104.indexOf("4.1") != -1) {
				this.anInt5625 = 2;
			} else if (Static576.aString104.indexOf("4.9") != -1) {
				this.anInt5625 = 3;
			} else if (Static576.aString104.indexOf("5.0") != -1) {
				this.anInt5625 = 4;
			} else if (Static576.aString104.indexOf("5.1") != -1) {
				this.anInt5625 = 5;
			} else if (Static576.aString104.indexOf("6.0") != -1) {
				this.anInt5625 = 6;
			} else if (Static576.aString104.indexOf("6.1") != -1) {
				this.anInt5625 = 7;
			}
		} else if (this.anInt5617 == 2) {
			if (Static576.aString104.indexOf("10.4") != -1) {
				this.anInt5625 = 20;
			} else if (Static576.aString104.indexOf("10.5") != -1) {
				this.anInt5625 = 21;
			} else if (Static576.aString104.indexOf("10.6") != -1) {
				this.anInt5625 = 22;
			}
		}
		if (Static576.aString110.toLowerCase().indexOf("sun") != -1) {
			this.anInt5618 = 1;
		} else if (Static576.aString110.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5618 = 2;
		} else if (Static576.aString110.toLowerCase().indexOf("apple") == -1) {
			this.anInt5618 = 4;
		} else {
			this.anInt5618 = 3;
		}
		@Pc(313) int local313 = 2;
		@Pc(315) int local315 = 0;
		@Pc(321) char local321;
		try {
			while (Static576.aString107.length() > local313) {
				local321 = Static576.aString107.charAt(local313);
				if (local321 < '0' || local321 > '9') {
					break;
				}
				local315 = local321 + local315 * 10 - 48;
				local313++;
			}
		} catch (@Pc(350) Exception local350) {
		}
		this.anInt5633 = local315;
		local313 = Static576.aString107.indexOf(46, 2) + 1;
		local315 = 0;
		try {
			while (local313 < Static576.aString107.length()) {
				local321 = Static576.aString107.charAt(local313);
				if (local321 < '0' || local321 > '9') {
					break;
				}
				local315 = local321 + local315 * 10 - 48;
				local313++;
			}
		} catch (@Pc(405) Exception local405) {
		}
		this.anInt5620 = local315;
		local315 = 0;
		local313 = Static576.aString107.indexOf(95, 4) + 1;
		try {
			while (local313 < Static576.aString107.length()) {
				local321 = Static576.aString107.charAt(local313);
				if (local321 < '0' || local321 > '9') {
					break;
				}
				local313++;
				local315 = local321 + local315 * 10 - 48;
			}
		} catch (@Pc(452) Exception local452) {
		}
		if (arg1.aBoolean601) {
			this.aBoolean373 = false;
		} else {
			this.aBoolean373 = true;
		}
		this.anInt5634 = Static21.anInt299;
		if (this.anInt5633 > 3) {
			this.anInt5624 = Static348.anInt5747;
		} else {
			this.anInt5624 = 0;
		}
		this.anInt5616 = local315;
		try {
			@Pc(493) int[] local493 = HardwareInfo.getCPUInfo();
			if (local493 != null && local493.length == 7) {
				this.anInt5626 = local493[4];
				this.anInt5619 = local493[6];
				this.anInt5629 = local493[3];
				this.anInt5632 = local493[2];
				this.anInt5628 = local493[5];
			}
		} catch (@Pc(528) Throwable local528) {
			this.anInt5619 = 0;
		}
		if (this.aString65 == null) {
			this.aString65 = "";
		}
		if (this.aString66 == null) {
			this.aString66 = "";
		}
		if (this.aString64 == null) {
			this.aString64 = "";
		}
		if (this.aString63 == null) {
			this.aString63 = "";
		}
		this.method5055();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILclient!wq;)V")
	public void method5050(@OriginalArg(1) Class5_Sub36 arg0) {
		arg0.method7324(5);
		arg0.method7324(this.anInt5617);
		arg0.method7324(this.aBoolean372 ? 1 : 0);
		arg0.method7324(this.anInt5625);
		arg0.method7324(this.anInt5618);
		arg0.method7324(this.anInt5633);
		arg0.method7324(this.anInt5620);
		arg0.method7324(this.anInt5616);
		arg0.method7324(this.aBoolean373 ? 1 : 0);
		arg0.method7296(this.anInt5634);
		arg0.method7324(this.anInt5624);
		arg0.method7317(this.anInt5619);
		arg0.method7296(this.anInt5632);
		arg0.method7324(this.anInt5629);
		arg0.method7324(this.anInt5626);
		arg0.method7324(this.anInt5628);
		arg0.method7278(this.aString63);
		arg0.method7278(this.aString64);
		arg0.method7278(this.aString66);
		arg0.method7278(this.aString65);
		arg0.method7324(this.anInt5627);
		arg0.method7296(this.anInt5621);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)I")
	public int method5053() {
		@Pc(12) int local12 = Static171.method4817(this.aString63) + 23;
		@Pc(19) int local19 = local12 + Static171.method4817(this.aString64);
		@Pc(26) int local26 = local19 + Static171.method4817(this.aString66);
		return local26 + Static171.method4817(this.aString65);
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)V")
	private void method5055() {
		if (this.aString63.length() > 40) {
			this.aString63 = this.aString63.substring(0, 40);
		}
		if (this.aString64.length() > 40) {
			this.aString64 = this.aString64.substring(0, 40);
		}
		if (this.aString66.length() > 10) {
			this.aString66 = this.aString66.substring(0, 10);
		}
		if (this.aString65.length() > 10) {
			this.aString65 = this.aString65.substring(0, 10);
		}
	}
}

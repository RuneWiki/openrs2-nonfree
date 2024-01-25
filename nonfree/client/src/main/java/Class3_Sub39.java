import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!lja", name = "F", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!lja", name = "D", descriptor = "I")
	private int anInt5857;

	@OriginalMember(owner = "client!lja", name = "m", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!lja", name = "j", descriptor = "Z")
	private boolean aBoolean377;

	@OriginalMember(owner = "client!lja", name = "G", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
	public int anInt5861;

	@OriginalMember(owner = "client!lja", name = "x", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!lja", name = "i", descriptor = "I")
	private int anInt5863;

	@OriginalMember(owner = "client!lja", name = "t", descriptor = "I")
	private int anInt5864;

	@OriginalMember(owner = "client!lja", name = "u", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "client!lja", name = "z", descriptor = "I")
	public int anInt5866;

	@OriginalMember(owner = "client!lja", name = "A", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!lja", name = "w", descriptor = "I")
	private int anInt5867;

	@OriginalMember(owner = "client!lja", name = "C", descriptor = "I")
	private int anInt5869;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
	private int anInt5870;

	@OriginalMember(owner = "client!lja", name = "J", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!lja", name = "k", descriptor = "I")
	private int anInt5871;

	@OriginalMember(owner = "client!lja", name = "H", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
	private int anInt5875;

	@OriginalMember(owner = "client!lja", name = "s", descriptor = "I")
	private int anInt5876;

	@OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
	private int anInt5877;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "()V")
	private Class3_Sub39() {
	}

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(ZLclient!br;)V")
	public Class3_Sub39(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class47 arg1) {
		if (Static60.aString26.startsWith("win")) {
			this.anInt5869 = 1;
		} else if (Static60.aString26.startsWith("mac")) {
			this.anInt5869 = 2;
		} else if (Static60.aString26.startsWith("linux")) {
			this.anInt5869 = 3;
		} else {
			this.anInt5869 = 4;
		}
		if (Static60.aString25.startsWith("amd64") || Static60.aString25.startsWith("x86_64")) {
			this.aBoolean377 = true;
		} else {
			this.aBoolean377 = false;
		}
		if (this.anInt5869 == 1) {
			if (Static60.aString24.indexOf("4.0") != -1) {
				this.anInt5870 = 1;
			} else if (Static60.aString24.indexOf("4.1") != -1) {
				this.anInt5870 = 2;
			} else if (Static60.aString24.indexOf("4.9") != -1) {
				this.anInt5870 = 3;
			} else if (Static60.aString24.indexOf("5.0") != -1) {
				this.anInt5870 = 4;
			} else if (Static60.aString24.indexOf("5.1") != -1) {
				this.anInt5870 = 5;
			} else if (Static60.aString24.indexOf("6.0") != -1) {
				this.anInt5870 = 6;
			} else if (Static60.aString24.indexOf("6.1") != -1) {
				this.anInt5870 = 7;
			}
		} else if (this.anInt5869 == 2) {
			if (Static60.aString24.indexOf("10.4") != -1) {
				this.anInt5870 = 20;
			} else if (Static60.aString24.indexOf("10.5") != -1) {
				this.anInt5870 = 21;
			} else if (Static60.aString24.indexOf("10.6") != -1) {
				this.anInt5870 = 22;
			} else if (Static60.aString24.indexOf("10.7") != -1) {
				this.anInt5870 = 23;
			}
		}
		if (Static60.aString27.toLowerCase().indexOf("sun") != -1) {
			this.anInt5867 = 1;
		} else if (Static60.aString27.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5867 = 2;
		} else if (Static60.aString27.toLowerCase().indexOf("apple") == -1) {
			this.anInt5867 = 4;
		} else {
			this.anInt5867 = 3;
		}
		@Pc(330) int local330 = 2;
		@Pc(332) int local332 = 0;
		@Pc(338) char local338;
		try {
			while (local330 < Static60.aString23.length()) {
				local338 = Static60.aString23.charAt(local330);
				if (local338 < '0' || local338 > '9') {
					break;
				}
				local332 = local332 * 10 + local338 - 48;
				local330++;
			}
		} catch (@Pc(371) Exception local371) {
		}
		this.anInt5866 = local332;
		local330 = Static60.aString23.indexOf(46, 2) + 1;
		local332 = 0;
		try {
			while (local330 < Static60.aString23.length()) {
				local338 = Static60.aString23.charAt(local330);
				if (local338 < '0' || local338 > '9') {
					break;
				}
				local332 = local338 + local332 * 10 - 48;
				local330++;
			}
		} catch (@Pc(419) Exception local419) {
		}
		this.anInt5863 = local332;
		local330 = Static60.aString23.indexOf(95, 4) + 1;
		local332 = 0;
		try {
			while (local330 < Static60.aString23.length()) {
				local338 = Static60.aString23.charAt(local330);
				if (local338 < '0' || local338 > '9') {
					break;
				}
				local330++;
				local332 = local338 + local332 * 10 - '0';
			}
		} catch (@Pc(469) Exception local469) {
		}
		if (this.anInt5866 > 3) {
			this.anInt5877 = Static325.anInt5291;
		} else {
			this.anInt5877 = 0;
		}
		this.anInt5860 = local332;
		this.anInt5872 = Static7.anInt229;
		if (arg1.aBoolean105) {
			this.aBoolean378 = false;
		} else {
			this.aBoolean378 = true;
		}
		try {
			@Pc(510) int[] local510 = HardwareInfo.getCPUInfo();
			if (local510 != null && local510.length == 7) {
				this.anInt5861 = local510[6];
				this.anInt5871 = local510[3];
				this.anInt5862 = local510[5];
				this.anInt5857 = local510[4];
				this.anInt5864 = local510[2];
			}
		} catch (@Pc(545) Throwable local545) {
			this.anInt5861 = 0;
		}
		if (this.aString74 == null) {
			this.aString74 = "";
		}
		if (this.aString76 == null) {
			this.aString76 = "";
		}
		if (this.aString75 == null) {
			this.aString75 = "";
		}
		if (this.aString73 == null) {
			this.aString73 = "";
		}
		this.method5122();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)V")
	private void method5122() {
		if (this.aString76.length() > 40) {
			this.aString76 = this.aString76.substring(0, 40);
		}
		if (this.aString75.length() > 40) {
			this.aString75 = this.aString75.substring(0, 40);
		}
		if (this.aString73.length() > 10) {
			this.aString73 = this.aString73.substring(0, 10);
		}
		if (this.aString74.length() > 10) {
			this.aString74 = this.aString74.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)I")
	public int method5124() {
		@Pc(22) int local22 = Static279.method3939(this.aString76) + 23;
		@Pc(29) int local29 = local22 + Static279.method3939(this.aString75);
		@Pc(36) int local36 = local29 + Static279.method3939(this.aString73);
		return local36 + Static279.method3939(this.aString74);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method5125(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method2065(5);
		arg0.method2065(this.anInt5869);
		arg0.method2065(this.aBoolean377 ? 1 : 0);
		arg0.method2065(this.anInt5870);
		arg0.method2065(this.anInt5867);
		arg0.method2065(this.anInt5866);
		arg0.method2065(this.anInt5863);
		arg0.method2065(this.anInt5860);
		arg0.method2065(this.aBoolean378 ? 1 : 0);
		arg0.method2032(this.anInt5872);
		arg0.method2065(this.anInt5877);
		arg0.method2045(this.anInt5861);
		arg0.method2032(this.anInt5864);
		arg0.method2065(this.anInt5871);
		arg0.method2065(this.anInt5857);
		arg0.method2065(this.anInt5862);
		arg0.method2043(this.aString76);
		arg0.method2043(this.aString75);
		arg0.method2043(this.aString73);
		arg0.method2043(this.aString74);
		arg0.method2065(this.anInt5876);
		arg0.method2032(this.anInt5875);
	}
}
